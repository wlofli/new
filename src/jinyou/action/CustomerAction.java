package jinyou.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import jinyou.control.CustomerDAO;

import jinyou.model.Customer;

public class CustomerAction {

	public String customerLoad(){		
		CustomerDAO dao =new CustomerDAO();	
		Customer ct =new Customer();		
		ct = dao.customerLogin("111");
		System.out.println(ct.getCAlias());
		
		return "suc";
	}
	
	public static void main(String[] args){	
		CustomerAction cAction = new CustomerAction();
		cAction.customerLoad();		
		System.out.println(87);		
	}
			
		
		
		
	

}
