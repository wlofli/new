package jinyou.control;

import java.util.List;

import jinyou.model.Records;

public class RecordsDAO extends HibernateBaseDAO{
	
	public Records recordsLoad(int records){
		 return (Records) this.getSession().get(Records.class,records);
	 }
	 
	 public void recordsAdd(Records a){
		 this.getSession().save(a);
	 }
	 
	 public void recordsModify(Records a){
		 this.getSession().update(a);
	 }
	 
	 public void recordsRemove(Records a){
		 this.getSession().delete(a);
	 }
	 
	 public List<Records> recList(Integer buyerid){
		 return (List<Records>) this.qry(" from Records where RBuyer = '"+buyerid+"'");
		 
	 }
	 
	 
	 
	 

}
