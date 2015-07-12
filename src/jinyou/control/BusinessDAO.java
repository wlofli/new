package jinyou.control;

import java.util.List;

import jinyou.model.Business;


public class BusinessDAO extends HibernateBaseDAO{
	public Business businessLoad(int a){
		 return (Business) this.getSession().get(Business.class,a);
	 }
	 
	 public void businessAdd(Business a){
		 this.getSession().save(a);
	 }
	 
	 public void businessModify(Business a){
		 this.getSession().update(a);
	 }
	 
	 public void businessRemove(Business a){
		 this.getSession().delete(a);
	 }
	 
	 
	 
	 public List<Business>  businessNearList(Double lat, Double log){
		 return (List<Business>) this.qry(" FROM Business WHERE ABS('"+lat+"'-BLat)<=0.0001 AND ABS('"+log+"'-BLog)<0.0001  ");
	 }

}
