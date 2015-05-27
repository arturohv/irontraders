package entities;
// Generated 19/05/2015 04:34:31 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProductImages generated by hbm2java
 */
@Entity
@Table(name="product_images"
    ,schema="public"
)
public class ProductImages  implements java.io.Serializable {


     private int id;
     private Product product;
     private String imageUrl;
     private Boolean isDefault;

    public ProductImages() {
    }

	
    public ProductImages(int id, Product product, String imageUrl) {
        this.id = id;
        this.product = product;
        this.imageUrl = imageUrl;
    }
    public ProductImages(int id, Product product, String imageUrl, Boolean isDefault) {
       this.id = id;
       this.product = product;
       this.imageUrl = imageUrl;
       this.isDefault = isDefault;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id", nullable=false)
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

    
    @Column(name="image_url", nullable=false, length=100)
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    
    @Column(name="is_default")
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }




}


