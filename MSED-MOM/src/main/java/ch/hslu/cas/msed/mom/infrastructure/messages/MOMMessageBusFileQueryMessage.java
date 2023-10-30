package ch.hslu.cas.msed.mom.infrastructure.messages;

import ch.hslu.cas.msed.mom.domain.dtos.MOMBlogDTO;
import ch.hslu.cas.msed.mom.domain.dtos.MOMFileDTO;

import java.util.ArrayList;
import java.util.List;

public class MOMMessageBusFileQueryMessage extends MOMMessageBusFileMessage
{
    public String Action;

    public int FileId;
    public MOMFileDTO ResponseDTO = new MOMFileDTO();

    public List<Integer> FileIds = new ArrayList<Integer>();
    public List<MOMFileDTO> ResponseDTOs = new ArrayList<MOMFileDTO>();
}