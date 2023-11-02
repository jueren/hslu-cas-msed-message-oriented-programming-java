package ch.hslu.cas.msed.mom.infrastructure.gateways;

import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusMessageInterface;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface MOMMessageBusGatewayInterface
{
    @Gateway(requestChannel = "ch.hslu.cas.msed.mom.internalbuschannel")
    MOMMessageBusMessageInterface send(MOMMessageBusMessageInterface payload);
}
