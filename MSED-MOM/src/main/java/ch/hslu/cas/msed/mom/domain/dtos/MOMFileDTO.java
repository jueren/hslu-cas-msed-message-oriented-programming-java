package ch.hslu.cas.msed.mom.domain.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MOMFileDTO implements Serializable
{
    public int                     Id;
    public String                  FileName;
    public String                  FileType;
    public LocalDateTime           CreatedOn;
    public int                     CreatedBy;
    public MOMAuthDTO Creator;

    public LocalDateTime           ModifiedOn;
    public int                     ModifiedBy;
    public MOMAuthDTO Modificator;

    public LocalDateTime           DeletedOn;
    public int                     DeletedBy;
    public MOMAuthDTO Destroyer;


    public MOMFileDTO(int Id, String FileName, String FileType, int CreatedBy, int ModifiedBy, int DeletedBy)
    {
        this.Id = Id;
        this.FileName = FileName;
        this.FileType = FileType;
        this.CreatedBy = CreatedBy;
        this.ModifiedBy = ModifiedBy;
        this.DeletedBy = DeletedBy;
    }

    public MOMFileDTO() {}
}