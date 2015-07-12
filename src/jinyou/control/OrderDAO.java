package jinyou.control;

import org.hibernate.criterion.Order;

public class OrderDAO extends HibernateBaseDAO{
	
	public Order orderLoad(int OId){
		 return (Order) this.getSession().get(Order.class,OId);
	 }
	 
	 public void orderAdd(Order a){
		 this.getSession().save(a);
	 }
	 
	 public void orderModify(Order a){
		 this.getSession().update(a);
	 }
	 
	 public void orderRemove(Order a){
		 this.getSession().delete(a);
	 }

}
