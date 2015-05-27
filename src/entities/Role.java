package entities;
// Generated 19/05/2015 04:34:31 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name="role"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="role_name") 
)
public class Role  implements java.io.Serializable {


     private int id;
     private String roleName;
     private String description;
     private Set<RolePermission> rolePermissions = new HashSet<RolePermission>(0);
     private Set<RoleUser> roleUsers = new HashSet<RoleUser>(0);

    public Role() {
    }

	
    public Role(int id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }
    public Role(int id, String roleName, String description, Set<RolePermission> rolePermissions, Set<RoleUser> roleUsers) {
       this.id = id;
       this.roleName = roleName;
       this.description = description;
       this.rolePermissions = rolePermissions;
       this.roleUsers = roleUsers;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="role_name", unique=true, nullable=false, length=60)
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    
    @Column(name="description")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="role")
    public Set<RolePermission> getRolePermissions() {
        return this.rolePermissions;
    }
    
    public void setRolePermissions(Set<RolePermission> rolePermissions) {
        this.rolePermissions = rolePermissions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="role")
    public Set<RoleUser> getRoleUsers() {
        return this.roleUsers;
    }
    
    public void setRoleUsers(Set<RoleUser> roleUsers) {
        this.roleUsers = roleUsers;
    }




}

