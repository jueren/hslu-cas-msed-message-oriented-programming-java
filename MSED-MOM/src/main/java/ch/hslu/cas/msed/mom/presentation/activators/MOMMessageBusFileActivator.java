package ch.hslu.cas.msed.mom.presentation.activators;

import ch.hslu.cas.msed.mom.domain.services.MOMFileDomainService;
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
public class MOMMessageBusFileActivator
{
    private final MOMFileDomainService fileService;

    private static final Logger logger = LoggerFactory.getLogger(MOMMessageBusFileActivator.class);

    @Autowired
    public MOMMessageBusFileActivator(MOMFileDomainService fileService)
    {
        this.fileService = fileService;
    }

    @ServiceActivator(inputChannel = "ch.hslu.cas.msed.mom.filecommandchannel")
    public MOMMessageBusFileCommandMessage handle(MOMMessageBusFileCommandMessage message)
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

    @ServiceActivator(inputChannel = "ch.hslu.cas.msed.mom.filequerychannel")
    public MOMMessageBusFileQueryMessage handle(MOMMessageBusFileQueryMessage message)
    {
        switch(message.Action)
        {
            case "GET_BY_ID" :
            {
                message.ResponseDTO = this.fileService.getById(message.FileId);
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