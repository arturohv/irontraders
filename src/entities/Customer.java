package entities;
// Generated 19/05/2015 04:34:31 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name="customer"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="email") 
)
public class Customer  implements java.io.Serializable {


     private int id;
     private Person person;
     private PriceListType priceListType;
     private String email;
     private String company;
     private BigDecimal creditMax;
     private Boolean isActive;
     private Set<OrderHeader> orderHeaders = new HashSet<OrderHeader>(0);
     private Set<InvoiceHeader> invoiceHeaders = new HashSet<InvoiceHeader>(0);

    public Customer() {
    }

	
    public Customer(Person person, PriceListType priceListType, String email) {
        this.person = person;
        this.priceListType = priceListType;
        this.email = email;
    }
    public Customer(Person person, PriceListType priceListType, String email, String company, BigDecimal creditMax, Boolean isActive, Set<OrderHeader> orderHeaders, Set<InvoiceHeader> invoiceHeaders) {
       this.person = person;
       this.priceListType = priceListType;
       this.email = email;
       this.company = company;
       this.creditMax = creditMax;
       this.isActive = isActive;
       this.orderHeaders = orderHeaders;
       this.invoiceHeaders = invoiceHeaders;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="person"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="price_list_type_id", nullable=false)
    public PriceListType getPriceListType() {
        return this.priceListType;
    }
    
    public void setPriceListType(PriceListType priceListType) {
        this.priceListType = priceListType;
    }

    
    @Column(name="email", unique=true, nullable=false, length=60)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="company", length=60)
    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }

    
    @Column(name="credit_max", scale=4)
    public BigDecimal getCreditMax() {
        return this.creditMax;
    }
    
    public void setCreditMax(BigDecimal creditMax) {
        this.creditMax = creditMax;
    }

    
    @Column(name="is_active")
    public Boolean getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="customer")
    public Set<OrderHeader> getOrderHeaders() {
        return this.orderHeaders;
    }
    
    public void setOrderHeaders(Set<OrderHeader> orderHeaders) {
        this.orderHeaders = orderHeaders;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="customer")
    public Set<InvoiceHeader> getInvoiceHeaders() {
        return this.invoiceHeaders;
    }
    
    public void setInvoiceHeaders(Set<InvoiceHeader> invoiceHeaders) {
        this.invoiceHeaders = invoiceHeaders;
    }




}

