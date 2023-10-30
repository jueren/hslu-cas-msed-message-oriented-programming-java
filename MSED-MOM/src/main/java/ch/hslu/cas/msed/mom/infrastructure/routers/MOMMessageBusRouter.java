package ch.hslu.cas.msed.mom.infrastructure.routers;

import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusAuthMessage;
import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusFileMessage;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Router;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.Message;

@Configuration
@EnableIntegration
public class MOMMessageBusRouter
{
    @Router(inputChannel = "ch.hslu.cas.msed.mom.internalbuschannel")
    public String Route(Message<?> message)
    {
        if(message.getPayload() instanceof MOMMessageBusFileMessage)
        {
            return "ch.hslu.cas.msed.mom.filechannel";
        }
        else if(message.getPayload() instanceof MOMMessageBusAuthMessage)
        {
            return "ch.hslu.cas.msed.mom.authchannel";
        }
        else
        {
            // todo: log / notification ...
            return "";
        }
    }
}