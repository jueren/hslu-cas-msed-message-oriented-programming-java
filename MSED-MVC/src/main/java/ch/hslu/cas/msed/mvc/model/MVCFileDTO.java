package ch.hslu.cas.msed.mvc.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MVCFileDTO implements Serializable
{
    public int                     Id;
    public String                  FileName;
    public String                  FileType;
    public LocalDateTime           CreatedOn;
    public int                     CreatedBy;
    public MVCAuthDTO              Creator;

    public LocalDateTime           ModifiedOn;
    public int                     ModifiedBy;
    public MVCAuthDTO              Modificator;

    public LocalDateTime           DeletedOn;
    public int                     DeletedBy;
    public MVCAuthDTO              Destroyer;


    public MVCFileDTO(int Id, String FileName, String FileType, int CreatedBy, int ModifiedBy, int DeletedBy)
    {
        this.Id = Id;
        this.FileName = FileName;
        this.FileType = FileType;
        this.CreatedBy = CreatedBy;
        this.ModifiedBy = ModifiedBy;
        this.DeletedBy = DeletedBy;
    }
}