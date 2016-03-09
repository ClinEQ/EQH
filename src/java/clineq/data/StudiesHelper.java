/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clineq.data;

import clineq.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author a03538
 */
public class StudiesHelper {
    Session session = null;

    public StudiesHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }  
    
public List getAllStuides() {
    List<Studies> studiesList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Stuides");
        studiesList = (List<Studies>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return studiesList;
}


}
