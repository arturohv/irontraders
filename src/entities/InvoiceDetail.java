package entities;
// Generated 19/05/2015 04:34:31 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * InvoiceDetail generated by hbm2java
 */
@Entity
@Table(name="invoice_detail"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames={"invoice_id", "order_detail_id"}) 
)
public class InvoiceDetail  implements java.io.Serializable {


     private int id;
     private InvoiceHeader invoiceHeader;
     private OrderDetail orderDetail;

    public InvoiceDetail() {
    }

    public InvoiceDetail(int id, InvoiceHeader invoiceHeader, OrderDetail orderDetail) {
       this.id = id;
       this.invoiceHeader = invoiceHeader;
       this.orderDetail = orderDetail;
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
    @JoinColumn(name="invoice_id", nullable=false)
    public InvoiceHeader getInvoiceHeader() {
        return this.invoiceHeader;
    }
    
    public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="order_detail_id", nullable=false)
    public OrderDetail getOrderDetail() {
        return this.orderDetail;
    }
    
    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }




}


