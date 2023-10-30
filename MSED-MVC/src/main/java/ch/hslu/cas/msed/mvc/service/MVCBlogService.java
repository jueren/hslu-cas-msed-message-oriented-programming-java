package ch.hslu.cas.msed.mvc.service;

import ch.hslu.cas.msed.mvc.model.MVCAuthRepository;
import ch.hslu.cas.msed.mvc.model.MVCBlogDTO;
import ch.hslu.cas.msed.mvc.model.MVCBlogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MVCBlogService
{
    private static final Logger logger = LoggerFactory.getLogger(MVCBlogService.class);

    private MVCAuthService authService;
    private MVCFileService fileService;
    private MVCBlogRepository blogRepository;

    @Autowired
    public MVCBlogService(MVCAuthService authService,
                          MVCFileService fileService,
                          MVCBlogRepository blogRepository)
    {
        this.authService = authService;
        this.fileService = fileService;
        this.blogRepository = blogRepository;
    }

    public List<MVCBlogDTO> getAll(int userId)
    {
        if(this.authService.isAuthorized(userId))
        {
            List<MVCBlogDTO> result = this.blogRepository.getAll();
            List<MVCBlogDTO> enrichedResult = new ArrayList<>();

            for (MVCBlogDTO item : result)
            {
                // Todo: Improve using getAll()-Method for authService
                item.Creator = this.authService.getById(item.CreatedBy);

                // Todo: Improve using getAll()-Method for fileService
                item.Image = this.fileService.getById(item.ImageId);
                enrichedResult.add(item);
            }

            return enrichedResult;
        }
        else
        {
            return new ArrayList<MVCBlogDTO>();
        }
    }

    public MVCBlogDTO getById(int id, int userId)
    {
        if(this.authService.isAuthorized(userId))
        {
            MVCBlogDTO item = this.blogRepository.getById(id);

            item.Creator = this.authService.getById(item.CreatedBy);
            item.Image = this.fileService.getById(item.ImageId);

            return item;
        }
        else
        {
            return new MVCBlogDTO();
        }
    }
}