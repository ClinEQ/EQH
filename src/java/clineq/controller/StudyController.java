/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clineq.controller;

import clineq.util.HibernateUtil;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/**
 *
 * @author a03538
 */
public class StudyController implements Controller{



    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsrl) throws Exception {
        ModelAndView mv = new ModelAndView("study/study");
        String out = "study page";
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            List result = session.createQuery("from Studies").list();
            mv.addObject("studies",result);
            session.getTransaction().commit();
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
        mv.addObject("message",out);
        return mv;
    }


    
}
