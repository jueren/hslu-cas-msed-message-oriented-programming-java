package ch.hslu.cas.msed.mom.domain.services;

import ch.hslu.cas.msed.mom.domain.dtos.MOMAuthDTO;
import ch.hslu.cas.msed.mom.domain.dtos.MOMBlogDTO;
import ch.hslu.cas.msed.mom.domain.repositories.MOMBlogRepository;
import ch.hslu.cas.msed.mom.infrastructure.gateways.MOMMessageBusGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MOMBlogDomainService
{
    private static final Logger logger = LoggerFactory.getLogger(MOMBlogDomainService.class);

    private MOMMessageBusGateway gateway;

    private MOMBlogRepository blogRepository;

    @Autowired
    public MOMBlogDomainService(MOMMessageBusGateway gateway, MOMBlogRepository blogRepository)
    {
        this.gateway = gateway;
        this.blogRepository = blogRepository;
    }

    public List<MOMBlogDTO> getAll()
    {
        List<MOMBlogDTO> result = this.blogRepository.getAll();
        List<MOMBlogDTO> enrichedResult = new ArrayList<>();

        for (MOMBlogDTO item : result)
        {
            // Todo: Add Creator
            // item.Creator = new MOMAuthDTO(1, "Test", "Test", 1);
            item.Creator = this.gateway.getUserById(item.CreatedBy);
            // item.Creator = this.authService.getById(item.CreatedBy);
            // Todo: Improve, query multiple items at once
            item.Image = this.gateway.getFileById(item.ImageId);
            enrichedResult.add(item);
        }

        return enrichedResult;
    }

    public MOMBlogDTO getById(int id)
    {
        MOMBlogDTO item = this.blogRepository.getById(id);

        // Todo: Add Creator
        // item.Creator = this.authService.getById(item.CreatedBy);
        item.Image = this.gateway.getFileById(item.ImageId);

        return item;
    }
}