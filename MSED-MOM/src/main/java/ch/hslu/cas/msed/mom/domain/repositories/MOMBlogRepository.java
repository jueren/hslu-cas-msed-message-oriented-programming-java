package ch.hslu.cas.msed.mom.domain.repositories;

import ch.hslu.cas.msed.mom.domain.dtos.MOMBlogDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MOMBlogRepository
{
    private static final Logger logger = LoggerFactory.getLogger(MOMBlogRepository.class);

    private List<MOMBlogDTO> collection = new ArrayList<MOMBlogDTO>();

    @Autowired
    public MOMBlogRepository()
    {
        this.collection.add(new MOMBlogDTO(1, 1, "Title Blog 1", "Description Blog 1", "Content Blog 1", 1, 0, 0));
        this.collection.add(new MOMBlogDTO(2, 2, "Title Blog 2", "Description Blog 2", "Content Blog 2", 1, 0, 0));
        this.collection.add(new MOMBlogDTO(3, 3, "Title Blog 3", "Description Blog 3", "Content Blog 3", 1, 0, 0));
        this.collection.add(new MOMBlogDTO(4, 4, "Title Blog 4", "Description Blog 4", "Content Blog 4", 2, 0, 0));
        this.collection.add(new MOMBlogDTO(5, 5, "Title Blog 5", "Description Blog 5", "Content Blog 5", 2, 0, 0));
        this.collection.add(new MOMBlogDTO(6, 6, "Title Blog 6", "Description Blog 6", "Content Blog 6", 2, 0, 0));
        this.collection.add(new MOMBlogDTO(7, 7, "Title Blog 7", "Description Blog 7", "Content Blog 7", 3, 0, 0));
    }

    public List<MOMBlogDTO> getAll()
    {
        return this.collection;
    }

    public MOMBlogDTO getById(int id)
    {
        // FP :-)
        return this.collection.stream().filter(x -> x.Id == id).findFirst().orElse(null);
    }
}