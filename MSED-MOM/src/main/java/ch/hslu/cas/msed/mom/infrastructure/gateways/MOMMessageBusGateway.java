package ch.hslu.cas.msed.mom.infrastructure.gateways;

import ch.hslu.cas.msed.mom.domain.dtos.MOMAuthDTO;
import ch.hslu.cas.msed.mom.domain.dtos.MOMFileDTO;
import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusAuthQueryMessage;
import ch.hslu.cas.msed.mom.infrastructure.messages.MOMMessageBusFileQueryMessage;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class MOMMessageBusGateway
{
    private MOMMessageBusGatewayInterface bus;

    public MOMMessageBusGateway(MOMMessageBusGatewayInterface bus)
    {
        this.bus = bus;
    }

    public MOMFileDTO getFileById(int id)
    {
        MOMMessageBusFileQueryMessage msg = new MOMMessageBusFileQueryMessage();
        msg.FileId = id;
        msg.Action = "GET_BY_ID"; // Todo: Use Enum

        MOMMessageBusFileQueryMessage msgResponse = (MOMMessageBusFileQueryMessage) this.bus.send(msg);
        return msgResponse.ResponseDTO;
    }

    public MOMAuthDTO getUserById(int id)
    {
        MOMMessageBusAuthQueryMessage msg = new MOMMessageBusAuthQueryMessage();
        msg.UserId = id;
        msg.Action = "GET_BY_ID"; // Todo: Use Enum

        MOMMessageBusAuthQueryMessage msgResponse = (MOMMessageBusAuthQueryMessage) this.bus.send(msg);
        return msgResponse.ResponseDTO;
    }
}
