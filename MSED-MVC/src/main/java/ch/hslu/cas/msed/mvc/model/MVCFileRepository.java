package ch.hslu.cas.msed.mvc.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MVCFileRepository
{
    private static final Logger logger = LoggerFactory.getLogger(MVCFileRepository.class);

    private List<MVCFileDTO> collection = new ArrayList<MVCFileDTO>();

    @Autowired
    public MVCFileRepository()
    {
        this.collection.add(new MVCFileDTO(1, "Bild Blog 1", "image/jpeg", 1, 0, 0));
        this.collection.add(new MVCFileDTO(2, "Bild Blog 2", "image/jpeg", 1, 0, 0));
        this.collection.add(new MVCFileDTO(3, "Bild Blog 3", "image/jpeg", 1, 0, 0));
        this.collection.add(new MVCFileDTO(4, "Bild Blog 4", "image/jpeg", 2, 0, 0));
        this.collection.add(new MVCFileDTO(5, "Bild Blog 5", "image/jpeg", 2, 0, 0));
        this.collection.add(new MVCFileDTO(6, "Bild Blog 6", "image/png", 2, 0, 0));
        this.collection.add(new MVCFileDTO(7, "Bild Blog 7", "image/png", 3, 0, 0));
    }

    public List<MVCFileDTO> getAll()
    {
        return this.collection;
    }

    public MVCFileDTO getById(int id)
    {
        // FP :-)
        return this.collection.stream().filter(x -> x.Id == id).findFirst().orElse(null);
    }
}