package ch.hslu.cas.msed.mom.domain.repositories;

import ch.hslu.cas.msed.mom.domain.dtos.MOMFileDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MOMFileRepository
{
    private static final Logger logger = LoggerFactory.getLogger(MOMFileRepository.class);

    private List<MOMFileDTO> collection = new ArrayList<MOMFileDTO>();

    @Autowired
    public MOMFileRepository()
    {
        this.collection.add(new MOMFileDTO(1, "Bild Blog 1", "image/jpeg", 1, 0, 0));
        this.collection.add(new MOMFileDTO(2, "Bild Blog 2", "image/jpeg", 1, 0, 0));
        this.collection.add(new MOMFileDTO(3, "Bild Blog 3", "image/jpeg", 1, 0, 0));
        this.collection.add(new MOMFileDTO(4, "Bild Blog 4", "image/jpeg", 2, 0, 0));
        this.collection.add(new MOMFileDTO(5, "Bild Blog 5", "image/jpeg", 2, 0, 0));
        this.collection.add(new MOMFileDTO(6, "Bild Blog 6", "image/png", 2, 0, 0));
        this.collection.add(new MOMFileDTO(7, "Bild Blog 7", "image/png", 3, 0, 0));
    }

    public List<MOMFileDTO> getAll()
    {
        return this.collection;
    }

    public MOMFileDTO getById(int id)
    {
        // FP :-)
        return this.collection.stream().filter(x -> x.Id == id).findFirst().orElse(null);
    }
}