package ch.hslu.cas.msed.mvc.service;

import ch.hslu.cas.msed.mvc.model.MVCAuthDTO;
import ch.hslu.cas.msed.mvc.model.MVCAuthRepository;
import ch.hslu.cas.msed.mvc.model.MVCFileDTO;
import ch.hslu.cas.msed.mvc.model.MVCFileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MVCFileService
{
    private static final Logger logger = LoggerFactory.getLogger(MVCFileService.class);

    private MVCFileRepository fileRepository;

    @Autowired
    public MVCFileService(MVCFileRepository fileRepository)
    {
        this.fileRepository = fileRepository;
    }

    public MVCFileDTO getById(int id)
    {
        return this.fileRepository.getById(id);
    }
}