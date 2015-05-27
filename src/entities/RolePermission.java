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
 * RolePermission generated by hbm2java
 */
@Entity
@Table(name="role_permission"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames={"role_id", "permission_id"}) 
)
public class RolePermission  implements java.io.Serializable {


     private int id;
     private Permission permission;
     private Role role;

    public RolePermission() {
    }

    public RolePermission(int id, Permission permission, Role role) {
       this.id = id;
       this.permission = permission;
       this.role = role;
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
    @JoinColumn(name="permission_id", nullable=false)
    public Permission getPermission() {
        return this.permission;
    }
    
    public void setPermission(Permission permission) {
        this.permission = permission;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="role_id", nullable=false)
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }




}

