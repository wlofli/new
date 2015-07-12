package jinyou.control;





import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;



import jinyou.model.Customer;




public class CustomerDAO extends HibernateBaseDAO{
	
	 public Customer customerLoad(String CUsername){
		 return (Customer) this.getSession().get(Customer.class, CUsername);
	 }
	 
	 public Customer customerLogin(String a){
		 Query qry= this.getSession().createQuery("from Customer where CUsername='"+a+"'");
		 return (Customer) qry.uniqueResult(); 
	 }
	 
	 
	 public void customerAdd(Customer a){
		 this.getSession().save(a);
	 }
	 
	 public void customerModify(Customer a){
		 this.getSession().update(a);
	 }
	 
	 public void customerRemove(Customer a){
		 this.getSession().delete(a);
	 }
	 
	 
	 
	 
	 public static void main(String[] args){

			CustomerDAO dao=new CustomerDAO();
			Customer ct = new Customer();
		//	ct=dao.CustomerLoad("123");			
								
			ct.setCUserid(1);
			ct.setCUsername("11145645645");
			
			
			dao.beginThransaction();
			dao.customerAdd(ct);
			dao.commitThransaction();
	
			
		}

}
