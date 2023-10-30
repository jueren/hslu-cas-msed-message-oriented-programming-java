package ch.hslu.cas.msed.mom.infrastructure.messages;

import ch.hslu.cas.msed.mom.domain.dtos.MOMAuthDTO;
import ch.hslu.cas.msed.mom.domain.dtos.MOMFileDTO;

import java.util.ArrayList;
import java.util.List;

public class MOMMessageBusAuthQueryMessage extends MOMMessageBusAuthMessage
{
    public String Action;

    public int UserId;
    public MOMAuthDTO ResponseDTO = new MOMAuthDTO();

    public List<Integer> UserIds = new ArrayList<Integer>();
    public List<MOMFileDTO> ResponseDTOs = new ArrayList<MOMFileDTO>();
}