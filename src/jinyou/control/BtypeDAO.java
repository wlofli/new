package jinyou.control;

import jinyou.model.Btype;

public class BtypeDAO extends HibernateBaseDAO{
	
	public Btype btypeLoad(int btType){
		 return (Btype) this.getSession().get(Btype.class,btType);
	 }
	 
	 public void btypeAdd(Btype a){
		 this.getSession().save(a);
	 }
	 
	 public void btypeModify(Btype a){
		 this.getSession().update(a);
	 }
	 
	 public void btypeRemove(Btype a){
		 this.getSession().delete(a);
	 }

}
