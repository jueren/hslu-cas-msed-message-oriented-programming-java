package ch.hslu.cas.msed.mvc.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

public class MVCBlogDTO implements Serializable
{
    public int                     Id;
    public int                     ImageId;
    public MVCFileDTO              Image;

    public String                  Title;
    public String                  Description;
    public String                  Content;

    public LocalDateTime           CreatedOn;
    public int                     CreatedBy;
    public MVCAuthDTO              Creator;
    public LocalDateTime           ModifiedOn;
    public MVCAuthDTO              Modificator;
    public int                     ModifiedBy;
    public LocalDateTime           DeletedOn;

    public MVCAuthDTO              Destroyer;
    public int                     DeletedBy;



    public MVCBlogDTO() { }
    public MVCBlogDTO(int Id, int ImageId, String Title, String Description, String Content, int CreatedBy, int ModifiedBy, int DeletedBy)
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