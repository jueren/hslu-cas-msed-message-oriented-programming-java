package ch.hslu.cas.msed.mom.domain.services;

import ch.hslu.cas.msed.mom.domain.dtos.MOMFileDTO;
import ch.hslu.cas.msed.mom.domain.repositories.MOMFileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MOMFileDomainService
{
    private static final Logger logger = LoggerFactory.getLogger(MOMFileDomainService.class);

    private MOMFileRepository fileRepository;

    @Autowired
    public MOMFileDomainService(MOMFileRepository fileRepository)
    {
        this.fileRepository = fileRepository;
    }

    public MOMFileDTO getById(int id)
    {
        return this.fileRepository.getById(id);
    }
}