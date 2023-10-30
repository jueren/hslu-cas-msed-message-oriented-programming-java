package ch.hslu.cas.msed.mom.infrastructure.routers;

import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusAuthCommandMessage;
import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusAuthQueryMessage;
import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusFileCommandMessage;
import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusFileQueryMessage;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Router;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.Message;

@Configuration
@EnableIntegration
public class MOMMessageBusAuthRouter
{
    @Router(inputChannel = "ch.hslu.cas.msed.mom.authchannel")
    public String Route(Message<?> message)
    {
        if(message.getPayload() instanceof MOMMessageBusAuthQueryMessage)
        {
            return "ch.hslu.cas.msed.mom.authquerychannel";
        }
        else if(message.getPayload() instanceof MOMMessageBusAuthCommandMessage)
        {
            return "ch.hslu.cas.msed.mom.authcommandchannel";
        }
        else
        {
            // fell through
            return "";
        }
    }
}