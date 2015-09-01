package com.SpringTest.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringTest.Service.UserService;
import com.SpringTest.model.User;
import com.SpringTest.util.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;


	/*public boolean exists(User u) throws Exception{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		int count = (int) s.createQuery("select count(*) from User u where u.username= :username").setString("username", u.getName()).uniqueResult();
		s.getTransaction().commit();
		if(count>0) return true;
		else return false;
	}
	
	public boolean add(User u) throws Exception{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		int count = (int) s.createQuery("select count(*) from User u where u.username= :username").setString("username", u.getName()).uniqueResult();
		s.getTransaction().commit();
		if(count>0) return true;
		else return false;
	}*/

public class LoginController extends ActionSupport implements ServletRequestAware, ServletResponseAware, ServletContextAware{
	
	private HttpServletRequest request;
	private ServletContext servletContext;
    private HttpServletResponse response;    

    public void setServletRequest(HttpServletRequest req) {
        this.request=req;
    }

    public void setServletResponse(HttpServletResponse res) {
        this.response=res;
    }

    public void setServletContext(ServletContext ser) {
        this.servletContext=ser;
    }
	
	public String Login() {
		/*UserService service = new UserService();
		service.controllerCalltoAddaUser(null);
		System.out.println("login");
		return "success";
		HttpServletRequest request;*/
		
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService service = (UserService)ctx.getBean("userService");
		User u = new User();
		u.setName(null);
		u.setPassword(null);
		u.setName("zhangsan");
		u.setPassword("zhangsan");*/
		/*service.add(u);*/
		return SUCCESS;
	}
}
