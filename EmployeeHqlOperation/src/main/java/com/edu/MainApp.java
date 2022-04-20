package com.edu;

import java.util.Iterator;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		
	
		
		
		Configuration conn=new Configuration().configure().addAnnotatedClass(EmployeeHql.class);	
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
		SessionFactory sf=conn.buildSessionFactory(reg);
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		/*EmployeeHql emp1 = new EmployeeHql(1,"kalai",24000,"karaikal",100);
		sess.save(emp1);
		EmployeeHql emp2 = new EmployeeHql(2,"jeeva",23000,"Madhurai",100);
		sess.save(emp2);
		EmployeeHql emp3 = new EmployeeHql(3,"arul",67500,"pondicherry",700);
		sess.save(emp3);
		EmployeeHql emp4 = new EmployeeHql(4,"mari",67543,"Thiruvarur",500);
		sess.save(emp4);
		EmployeeHql emp5 = new EmployeeHql(5,"rahul",90876,"ram",800);
		sess.save(emp5);*/
		 //get record based on id
       /* EmployeeHql r=(EmployeeHql) sess.get(EmployeeHql.class,1);
       System.out.println(r);
        System.out.println("emp id="+r.getEid()+"name="+r.getName()+"salary"+r.getSalary()+"address"+r.getAddress()+"deptno="+r.getAddress());
       *///Retrieve all records
		/*org.hibernate.Query q=sess.createQuery("from EmployeeHql");  //select * from tablename
		 
		//from nameoftheclass
              
           List l=q.list();  
           System.out.println(l);
           Iterator<EmployeeHql> it=l.iterator();
           while(it.hasNext()) {
        	 EmployeeHql r=it.next();
        	 System.out.println("emp id="+r.getEid()+" name="+r.getName()+" Salary="+r.getSalary()+" address="+r.getAddress()+" deptno="+r.getDeptno());
           }*/
		
		
		
		//update record
		       /* org.hibernate.Query q=sess.createQuery("update EmployeeHql set salary=:s where eid=:i");
				q.setParameter("s", 29800);
				q.setParameter("i",3);
				
				int i=q.executeUpdate();
				if(i>0) {
					System.out.println("Record is updated");
				}
				else {
					 System.out.println("Not updated");
				}*/
		
		//update record
	        /*org.hibernate.Query q=sess.createQuery("update EmployeeHql set name=:n where eid=:i");
			q.setParameter("n", "keerthiga");
			q.setParameter("i",3);
			
			int i=q.executeUpdate();
			if(i>0) {
				System.out.println("Record is updated");
			}
			else {
				 System.out.println("Not updated");
			}*/
		//delete record
			/*	org.hibernate.Query q=sess.createQuery("delete EmployeeHql  where eid=:i");
				
				q.setParameter("i",5);
				
				int i=q.executeUpdate();
				if(i>0) {
					System.out.println("Record is delete");
				}
				else {
					 System.out.println("not delete");
				}*/
        //min ,max, sum avg
org.hibernate.Query s=sess.createQuery("select sum(salary) from EmployeeHql");
		List sl=s.list();
		System.out.println("total sal="+sl.get(0));
		
	 org.hibernate.Query s1=sess.createQuery("select min(salary) from EmployeeHql");
		List m=s1.list();
		System.out.println("total sal="+m.get(0));
		
		org.hibernate.Query s2=sess.createQuery("select avg(salary) from EmployeeHql");
		List a=s2.list();
		System.out.println("total sal="+a.get(0));
		
		 org.hibernate.Query s3=sess.createQuery("select max(salary) from EmployeeHql");
			List m1=s3.list();
			System.out.println("total sal="+m1.get(0));
			
		
        tx.commit();
        sess.close();


        
}
}