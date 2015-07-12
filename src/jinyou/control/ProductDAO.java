package jinyou.control;

import java.util.List;

import jinyou.model.Product;

public class ProductDAO extends HibernateBaseDAO{
	
	public Product productLoad(int PProductid){
		 return (Product) this.getSession().get(Product.class,PProductid);
	 }
	 
	 public void productAdd(Product a){
		 this.getSession().save(a);
	 }
	 
	 public void productModify(Product a){
		 this.getSession().update(a);
	 }
	 
	 public void productRemove(Product a){
		 this.getSession().delete(a);
	 }
	 
	 
	 
	 public List<Product> busprolist(Integer salerid){
		 return (List<Product>) this.qry(" from Product where BSalerid='"+salerid+"'");
	 }

}
