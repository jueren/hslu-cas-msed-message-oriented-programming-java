package ch.hslu.cas.msed.mom.infrastructure.routers;

import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusFileCommandMessage;
import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusFileQueryMessage;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Router;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.Message;

@Configuration
@EnableIntegration
public class MOMMessageBusFileRouter
{
    @Router(inputChannel = "ch.hslu.cas.msed.mom.filechannel")
    public String Route(Message<?> message)
    {
        if(message.getPayload() instanceof MOMMessageBusFileQueryMessage)
        {
            return "ch.hslu.cas.msed.mom.filequerychannel";
        }
        else if(message.getPayload() instanceof MOMMessageBusFileCommandMessage)
        {
            return "ch.hslu.cas.msed.mom.filecommandchannel";
        }
        else
        {
            // fell through
            return "";
        }
    }
}