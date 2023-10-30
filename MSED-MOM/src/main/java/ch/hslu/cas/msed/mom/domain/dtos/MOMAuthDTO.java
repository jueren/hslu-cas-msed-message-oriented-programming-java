package ch.hslu.cas.msed.mom.domain.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class MOMAuthDTO implements Serializable
{
    public int                     Id;
    public String                  UserName;
    public String                  Password;

    public List<String>            Claims;

    public int                     Status;

    public LocalDateTime           CreatedOn;
    public LocalDateTime           ModifiedOn;
    public LocalDateTime           DeletedOn;

    public MOMAuthDTO(){}

    public MOMAuthDTO(int Id, String UserName, String Password, int Status)
    {
        this.Id = Id;
        this.UserName = UserName;
        this.Password = Password;
        this.Status = Status;
    }
}