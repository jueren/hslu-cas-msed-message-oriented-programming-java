package ch.hslu.cas.msed.mvc.model;

import java.io.ObjectInputFilter;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class MVCAuthDTO implements Serializable
{
    public int                     Id;
    public String                  UserName;
    public String                  Password;

    public List<String>            Claims;

    public int                     Status;

    public LocalDateTime           CreatedOn;
    public LocalDateTime           ModifiedOn;
    public LocalDateTime           DeletedOn;

    public MVCAuthDTO(int Id, String UserName, String Password, int Status)
    {
        this.Id = Id;
        this.UserName = UserName;
        this.Password = Password;
        this.Status = Status;
    }
}