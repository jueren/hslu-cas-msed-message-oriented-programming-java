package ch.hslu.cas.msed.mom.domain.services;

import ch.hslu.cas.msed.mom.domain.dtos.MOMAuthDTO;
import ch.hslu.cas.msed.mom.domain.repositories.MOMAuthRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MOMAuthDomainService
{
    private static final Logger logger = LoggerFactory.getLogger(MOMAuthDomainService.class);
    private MOMAuthRepository authRepository;

    @Autowired
    public MOMAuthDomainService(MOMAuthRepository authRepository)
    {
        this.authRepository = authRepository;
    }

    public MOMAuthDTO getById(int id)
    {
        return this.authRepository.getById(id);
    }

    public Boolean isAuthorized(int userId)
    {
        return authRepository.getById(userId).Status > 0;
    }
}