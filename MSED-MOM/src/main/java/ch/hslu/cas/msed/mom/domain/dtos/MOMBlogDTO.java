package ch.hslu.cas.msed.mom.domain.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MOMBlogDTO implements Serializable
{
    public int                     Id;
    public int                     ImageId;
    public MOMFileDTO Image;

    public String                  Title;
    public String                  Description;
    public String                  Content;

    public LocalDateTime           CreatedOn;
    public int                     CreatedBy;
    public MOMAuthDTO              Creator;
    public LocalDateTime           ModifiedOn;
    public MOMAuthDTO              Modificator;
    public int                     ModifiedBy;
    public LocalDateTime           DeletedOn;

    public MOMAuthDTO Destroyer;
    public int                     DeletedBy;



    public MOMBlogDTO() { }
    public MOMBlogDTO(int Id, int ImageId, String Title, String Description, String Content, int CreatedBy, int ModifiedBy, int DeletedBy)
    {
        this.Id = Id;
        this.ImageId = ImageId;
        this.Title = Title;
        this.Description = Description;
        this.Content = Content;
        this.CreatedBy = CreatedBy;
        this.ModifiedBy = ModifiedBy;
        this.DeletedBy = DeletedBy;
    }
}