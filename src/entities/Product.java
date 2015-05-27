package entities;
// Generated 19/05/2015 04:34:31 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name="product"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames={"barcode", "internal_code"}) 
)
public class Product  implements java.io.Serializable {


     private int id;
     private MeasureUnit measureUnit;
     private ProductType productType;
     private TaxGroup taxGroup;
     private String barcode;
     private String internalCode;
     private String modelNumber;
     private String productName;
     private String description;
     private BigDecimal costPrice;
     private Boolean isActive;
     private Boolean isVisible;
     private Set<ProductImages> productImageses = new HashSet<ProductImages>(0);
     private Set<Inventory> inventories = new HashSet<Inventory>(0);
     private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);
     private Set<StockLevelProduct> stockLevelProducts = new HashSet<StockLevelProduct>(0);
     private Set<PriceListProduct> priceListProducts = new HashSet<PriceListProduct>(0);
     private Set<ProductClassification> productClassifications = new HashSet<ProductClassification>(0);

    public Product() {
    }

	
    public Product(int id, MeasureUnit measureUnit, ProductType productType, TaxGroup taxGroup, String productName, BigDecimal costPrice) {
        this.id = id;
        this.measureUnit = measureUnit;
        this.productType = productType;
        this.taxGroup = taxGroup;
        this.productName = productName;
        this.costPrice = costPrice;
    }
    public Product(int id, MeasureUnit measureUnit, ProductType productType, TaxGroup taxGroup, String barcode, String internalCode, String modelNumber, String productName, String description, BigDecimal costPrice, Boolean isActive, Boolean isVisible, Set<ProductImages> productImageses, Set<Inventory> inventories, Set<OrderDetail> orderDetails, Set<StockLevelProduct> stockLevelProducts, Set<PriceListProduct> priceListProducts, Set<ProductClassification> productClassifications) {
       this.id = id;
       this.measureUnit = measureUnit;
       this.productType = productType;
       this.taxGroup = taxGroup;
       this.barcode = barcode;
       this.internalCode = internalCode;
       this.modelNumber = modelNumber;
       this.productName = productName;
       this.description = description;
       this.costPrice = costPrice;
       this.isActive = isActive;
       this.isVisible = isVisible;
       this.productImageses = productImageses;
       this.inventories = inventories;
       this.orderDetails = orderDetails;
       this.stockLevelProducts = stockLevelProducts;
       this.priceListProducts = priceListProducts;
       this.productClassifications = productClassifications;
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
    @JoinColumn(name="measure_unit_id", nullable=false)
    public MeasureUnit getMeasureUnit() {
        return this.measureUnit;
    }
    
    public void setMeasureUnit(MeasureUnit measureUnit) {
        this.measureUnit = measureUnit;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_type_id", nullable=false)
    public ProductType getProductType() {
        return this.productType;
    }
    
    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="tax_group_id", nullable=false)
    public TaxGroup getTaxGroup() {
        return this.taxGroup;
    }
    
    public void setTaxGroup(TaxGroup taxGroup) {
        this.taxGroup = taxGroup;
    }

    
    @Column(name="barcode", length=40)
    public String getBarcode() {
        return this.barcode;
    }
    
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    
    @Column(name="internal_code", length=40)
    public String getInternalCode() {
        return this.internalCode;
    }
    
    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    
    @Column(name="model_number", length=40)
    public String getModelNumber() {
        return this.modelNumber;
    }
    
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    
    @Column(name="product_name", nullable=false, length=60)
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    
    @Column(name="description")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="cost_price", nullable=false, scale=4)
    public BigDecimal getCostPrice() {
        return this.costPrice;
    }
    
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    
    @Column(name="is_active")
    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    
    @Column(name="is_visible")
    public Boolean getIsVisible() {
        return this.isVisible;
    }
    
    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set<ProductImages> getProductImageses() {
        return this.productImageses;
    }
    
    public void setProductImageses(Set<ProductImages> productImageses) {
        this.productImageses = productImageses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set<Inventory> getInventories() {
        return this.inventories;
    }
    
    public void setInventories(Set<Inventory> inventories) {
        this.inventories = inventories;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set<OrderDetail> getOrderDetails() {
        return this.orderDetails;
    }
    
    public void setOrderDetails(Set<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set<StockLevelProduct> getStockLevelProducts() {
        return this.stockLevelProducts;
    }
    
    public void setStockLevelProducts(Set<StockLevelProduct> stockLevelProducts) {
        this.stockLevelProducts = stockLevelProducts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set<PriceListProduct> getPriceListProducts() {
        return this.priceListProducts;
    }
    
    public void setPriceListProducts(Set<PriceListProduct> priceListProducts) {
        this.priceListProducts = priceListProducts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set<ProductClassification> getProductClassifications() {
        return this.productClassifications;
    }
    
    public void setProductClassifications(Set<ProductClassification> productClassifications) {
        this.productClassifications = productClassifications;
    }




}


