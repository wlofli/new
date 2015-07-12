package jinyou.control;

import jinyou.model.Ptype;

public class PtypeDAO extends HibernateBaseDAO{
	
	public Ptype ptypeLoad(int ptType){
		 return (Ptype) this.getSession().get(Ptype.class,ptType);
	 }
	 
	 public void ptypeAdd(Ptype a){
		 this.getSession().save(a);
	 }
	 
	 public void ptypeModify(Ptype a){
		 this.getSession().update(a);
	 }
	 
	 public void ptypeRemove(Ptype a){
		 this.getSession().delete(a);
	 }

}
