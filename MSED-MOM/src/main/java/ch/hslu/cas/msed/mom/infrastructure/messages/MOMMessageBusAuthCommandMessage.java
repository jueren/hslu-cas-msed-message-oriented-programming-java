package ch.hslu.cas.msed.mom.infrastructure.messages;

import ch.hslu.cas.msed.mom.domain.dtos.MOMFileDTO;

import java.util.ArrayList;
import java.util.List;

public class MOMMessageBusAuthCommandMessage extends MOMMessageBusAuthMessage
{
    public String Action;

    public MOMFileDTO DataItem;
    public Boolean Result;

    public List<String> SuccessMessages = new ArrayList<>();
    public List<String> WarningMessages = new ArrayList<>();;
    public List<String> ErrorMessages = new ArrayList<>();;
}