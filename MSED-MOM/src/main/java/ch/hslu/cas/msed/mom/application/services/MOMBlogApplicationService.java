package ch.hslu.cas.msed.mom.application.services;

import ch.hslu.cas.msed.mom.domain.dtos.MOMBlogDTO;
import ch.hslu.cas.msed.mom.domain.services.MOMBlogDomainService;
import ch.hslu.cas.msed.mom.infrastructure.gateways.MOMMessageBusGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MOMBlogApplicationService
{
    private static final Logger logger = LoggerFactory.getLogger(MOMBlogApplicationService.class);

    private MOMMessageBusGateway busGateway;
    private MOMBlogDomainService blogService;

    @Autowired
    public MOMBlogApplicationService(MOMMessageBusGateway busGateway, MOMBlogDomainService blogService)
    {
        this.busGateway = busGateway;
        this.blogService = blogService;
    }

    public List<MOMBlogDTO> getAll(int userId)
    {
        // Todo: Implement Authentication-Service-Check: isAuthorized(userId)
        return this.blogService.getAll();
    }

    public MOMBlogDTO getById(int id, int userId)
    {
        // Todo: Implement Authentication-Service-Check: isAuthorized(userId)
        return this.blogService.getById(id);
    }
}