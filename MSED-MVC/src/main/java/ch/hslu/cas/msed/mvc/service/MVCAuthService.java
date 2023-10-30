package ch.hslu.cas.msed.mvc.service;

import ch.hslu.cas.msed.mvc.model.MVCAuthDTO;
import ch.hslu.cas.msed.mvc.model.MVCAuthRepository;
import ch.hslu.cas.msed.mvc.model.MVCBlogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MVCAuthService
{
    private static final Logger logger = LoggerFactory.getLogger(MVCAuthService.class);
    private MVCAuthRepository authRepository;

    @Autowired
    public MVCAuthService(MVCAuthRepository authRepository)
    {
        this.authRepository = authRepository;
    }

    public MVCAuthDTO getById(int id)
    {
        return this.authRepository.getById(id);
    }

    public Boolean isAuthorized(int userId)
    {
        return authRepository.getById(userId).Status > 0;
    }
}