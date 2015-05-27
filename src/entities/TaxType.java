package entities;
// Generated 19/05/2015 04:34:31 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TaxType generated by hbm2java
 */
@Entity
@Table(name="tax_type"
    ,schema="public"
)
public class TaxType  implements java.io.Serializable {


     private int id;
     private String taxTypeName;
     private BigDecimal percentage;
     private Set<TaxGroup> taxGroups = new HashSet<TaxGroup>(0);

    public TaxType() {
    }

	
    public TaxType(int id, String taxTypeName, BigDecimal percentage) {
        this.id = id;
        this.taxTypeName = taxTypeName;
        this.percentage = percentage;
    }
    public TaxType(int id, String taxTypeName, BigDecimal percentage, Set<TaxGroup> taxGroups) {
       this.id = id;
       this.taxTypeName = taxTypeName;
       this.percentage = percentage;
       this.taxGroups = taxGroups;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="tax_type_name", nullable=false, length=30)
    public String getTaxTypeName() {
        return this.taxTypeName;
    }
    
    public void setTaxTypeName(String taxTypeName) {
        this.taxTypeName = taxTypeName;
    }

    
    @Column(name="percentage", nullable=false, precision=131089, scale=0)
    public BigDecimal getPercentage() {
        return this.percentage;
    }
    
    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="taxType")
    public Set<TaxGroup> getTaxGroups() {
        return this.taxGroups;
    }
    
    public void setTaxGroups(Set<TaxGroup> taxGroups) {
        this.taxGroups = taxGroups;
    }




}


