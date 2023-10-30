package ch.hslu.cas.msed.mvc.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MVCAuthRepository
{
    private static final Logger logger = LoggerFactory.getLogger(MVCAuthRepository.class);

    private List<MVCAuthDTO> collection = new ArrayList<MVCAuthDTO>();

    @Autowired
    public MVCAuthRepository()
    {
        this.collection.add(new MVCAuthDTO(1, "Username 1", "Password 1", 1));
        this.collection.add(new MVCAuthDTO(2, "Username 2", "Password 2", 1));
        this.collection.add(new MVCAuthDTO(3, "Username 3", "Password 3", 1));
    }

    public List<MVCAuthDTO> getAll()
    {
        return this.collection;
    }

    public MVCAuthDTO getById(int id)
    {
        // FP :-)
        return this.collection.stream().filter(x -> x.Id == id).findFirst().orElse(null);
    }
}