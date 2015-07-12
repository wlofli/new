package jinyou.action.json;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import jinyou.control.CustomerDAO;
import jinyou.model.Customer;

public class CustomerAction {
	private Customer customer;
	private Map<String, Object> dataMap; 
	private String username; //android �û�����
	private String password;//android ���룻
	private String type;
	
	public Customer getCustomer() {
		return customer;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}


	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	
	
	public CustomerAction(){
		dataMap = new HashMap<String, Object>();
	}
	//����
	public String cstlgn(){
		System.out.println(new Date());
		dataMap.clear();
		if(username.equals("")||username==null||password==null||password.equals("")){
			System.out.println("�û���or����Ϊ��");
			dataMap.put("error", "�û���or����Ϊ��");
			dataMap.put("success", false);
			return "suc";
		}
		Customer ct = new Customer();
		CustomerDAO dao =new CustomerDAO();
		ct= dao.customerLogin(username);
		if(ct==null||!ct.getCPassword().equals(password)){
			System.out.println("�û���or�������");
			dataMap.put("error", "�û���or�������");
			dataMap.put("success", false);
			return "suc";
		}
		customer=ct;
		dataMap.put("customer", customer);
		dataMap.put("success", true);  
        // ���ؽ��  	
		return "suc";
	}


	public static void main(String[] args){
		CustomerAction cAction = new CustomerAction();
		cAction.setUsername("123");
		cAction.setPassword("123");
		cAction.cstlgn();		
		System.out.println(88);
	}
	
	
	

}
