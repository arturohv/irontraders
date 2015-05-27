/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.personTypes;

import models.persons.PersonTypeModel;
import entities.PersonType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import models.HibernateUtil;

/**
 *
 * @author arturohv
 */
public class PersonTypeController {
    private PersonTypeModel oPersonTypeModel = new PersonTypeModel();
     
    
    
    public List<PersonType> Listar(){
        List<PersonType> lista = (List<PersonType>) this.oPersonTypeModel.findAll();
        return lista;        
    }
    
    public String Crear(PersonType data) throws Exception{
        try {
            this.oPersonTypeModel.create(data);
            return "";
        } catch (Exception e) {
            
            return e.getMessage();
        }
    }
    
    public String Eliminar(int id) throws Exception{
        
        try {
            PersonType data = this.oPersonTypeModel.find(id);
            this.oPersonTypeModel.delete(data);
            return "";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public String Editar(PersonType dataEdit){
         try {
            PersonType data = this.oPersonTypeModel.find(dataEdit.getId());
            data.setPersonTypeName(dataEdit.getPersonTypeName());
            this.oPersonTypeModel.update(data);           
            return "";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public List<PersonType> ConsultarPorNombre(String pNombre){
        pNombre = pNombre + '%';
        //Prep work
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();        
        
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from PersonType where personTypeName like :nombre ");
        query.setParameter("nombre", pNombre);
        List<PersonType> personTypeList = query.list();
        tx.commit();
        sessionFactory.close();
        return personTypeList;  
    }
}
