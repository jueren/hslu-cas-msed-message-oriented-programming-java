package ch.hslu.cas.msed.mom.presentation.activators;

import ch.hslu.cas.msed.mom.domain.services.MOMAuthDomainService;
import ch.hslu.cas.msed.mom.domain.services.MOMFileDomainService;
import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusAuthCommandMessage;
import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusAuthQueryMessage;
import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusFileCommandMessage;
import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusFileQueryMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
@MessageEndpoint
public class MOMMessageBusAuthActivator
{
    private final MOMAuthDomainService authService;

    private static final Logger logger = LoggerFactory.getLogger(MOMMessageBusAuthActivator.class);

    @Autowired
    public MOMMessageBusAuthActivator(MOMAuthDomainService authService)
    {
        this.authService = authService;
    }

    @ServiceActivator(inputChannel = "ch.hslu.cas.msed.mom.authcommandchannel")
    public MOMMessageBusAuthCommandMessage handle(MOMMessageBusAuthCommandMessage message)
    {
        switch (message.Action)
        {
            case "CREATE":
            {
                // Todo
                break;
            }
            default:
            {
                break;
            }
        }

        return message;
    }

    @ServiceActivator(inputChannel = "ch.hslu.cas.msed.mom.authquerychannel")
    public MOMMessageBusAuthQueryMessage handle(MOMMessageBusAuthQueryMessage message)
    {
        switch(message.Action)
        {
            case "GET_BY_ID" :
            {
                message.ResponseDTO = this.authService.getById(message.UserId);
                break;
            }
            default:
            {
                break;
            }
        }

        return message;
    }
}