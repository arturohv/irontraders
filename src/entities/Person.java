package entities;
// Generated 19/05/2015 04:34:31 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Person generated by hbm2java
 */
@Entity
@Table(name="person"
    ,schema="public"
    , uniqueConstraints = @UniqueConstraint(columnNames="nip") 
)
public class Person  implements java.io.Serializable {


     private int id;
     private PersonType personType;
     private String nip;
     private String firstName;
     private String lastName;
     private Set<PersonPhones> personPhoneses = new HashSet<PersonPhones>(0);
     private User user;
     private Customer customer;
     private Set<PersonAddress> personAddresses = new HashSet<PersonAddress>(0);

    public Person() {
    }

	
    public Person(int id, PersonType personType, String nip, String firstName) {
        this.id = id;
        this.personType = personType;
        this.nip = nip;
        this.firstName = firstName;
    }
    public Person(int id, PersonType personType, String nip, String firstName, String lastName, Set<PersonPhones> personPhoneses, User user, Customer customer, Set<PersonAddress> personAddresses) {
       this.id = id;
       this.personType = personType;
       this.nip = nip;
       this.firstName = firstName;
       this.lastName = lastName;
       this.personPhoneses = personPhoneses;
       this.user = user;
       this.customer = customer;
       this.personAddresses = personAddresses;
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
    @JoinColumn(name="person_type_id", nullable=false)
    public PersonType getPersonType() {
        return this.personType;
    }
    
    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    
    @Column(name="nip", unique=true, nullable=false, length=30)
    public String getNip() {
        return this.nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }

    
    @Column(name="first_name", nullable=false, length=60)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", length=40)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="person")
    public Set<PersonPhones> getPersonPhoneses() {
        return this.personPhoneses;
    }
    
    public void setPersonPhoneses(Set<PersonPhones> personPhoneses) {
        this.personPhoneses = personPhoneses;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="person")
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="person")
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="person")
    public Set<PersonAddress> getPersonAddresses() {
        return this.personAddresses;
    }
    
    public void setPersonAddresses(Set<PersonAddress> personAddresses) {
        this.personAddresses = personAddresses;
    }




}


