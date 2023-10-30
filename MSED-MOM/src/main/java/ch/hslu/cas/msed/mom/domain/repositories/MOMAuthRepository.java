package ch.hslu.cas.msed.mom.domain.repositories;

import ch.hslu.cas.msed.mom.domain.dtos.MOMAuthDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MOMAuthRepository
{
    private static final Logger logger = LoggerFactory.getLogger(MOMAuthRepository.class);

    private List<MOMAuthDTO> collection = new ArrayList<MOMAuthDTO>();

    @Autowired
    public MOMAuthRepository()
    {
        this.collection.add(new MOMAuthDTO(1, "Username 1", "Password 1", 1));
        this.collection.add(new MOMAuthDTO(2, "Username 2", "Password 2", 1));
        this.collection.add(new MOMAuthDTO(3, "Username 3", "Password 3", 1));
    }

    public List<MOMAuthDTO> getAll()
    {
        return this.collection;
    }

    public MOMAuthDTO getById(int id)
    {
        // FP :-)
        return this.collection.stream().filter(x -> x.Id == id).findFirst().orElse(null);
    }
}