package jinyou.control;

import jinyou.model.Area;





public class AreaDAO extends HibernateBaseDAO{
	 public Area areaLoad(int AId){
		 return (Area) this.getSession().get(Area.class,AId);
	 }
	 
	 public void areaAdd(Area a){
		 this.getSession().save(a);
	 }
	 
	 public void areaModify(Area a){
		 this.getSession().update(a);
	 }
	 
	 public void areaRemove(Area a){
		 this.getSession().delete(a);
	 }
	 
	 

}
