package jinyou.action.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jinyou.control.BusinessDAO;
import jinyou.model.Business;

public class BusinessAction {
	private Business business;
	private Integer id;//商户id
	private Double lat;//用户纬度
	private Double log;//用户经度
	private Map<String, Object> dataMap; 
	
	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLog() {
		return log;
	}

	public void setLog(Double log) {
		this.log = log;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public BusinessAction(){
		dataMap = new HashMap<String, Object>();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	//根据ID获取商户
	public String bsload(){
		System.out.println(new Date());
		dataMap.clear();
		Business bus = new Business();
		BusinessDAO dao = new BusinessDAO();
		dao.getSession().clear();
		bus = dao.businessLoad(id);
		dataMap.put("business", bus);
		dataMap.put("sucess", true);	
		return"suc";
	}
	
	//返回用户附近的商户
	public String bslist(){
		System.out.println(lat);
		System.out.println(log);
		System.out.println(new Date());
		dataMap.clear();
		List<Business> buslist =new ArrayList<Business>();
		BusinessDAO dao = new BusinessDAO();
		buslist=dao.businessNearList(lat, log);
		for (int i = 0; i < buslist.size(); i++) {
			System.out.println(buslist.get(i).getBSalername());
			
		}
		dataMap.put("buslist", buslist);
		dataMap.put("success", true);
		
		return "suc";
	}
	
	
	public static void main(String[] args){
		BusinessAction bAction =new BusinessAction();
	
		bAction.bslist();
		
		
	}

	

}
