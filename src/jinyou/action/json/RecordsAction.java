package jinyou.action.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.opensymphony.xwork2.ActionContext;

import jinyou.control.ProductDAO;
import jinyou.control.RecordsDAO;
import jinyou.model.Product;
import jinyou.model.Records;

public class RecordsAction {
	
	private Map<String, Object> dataMap;
	private Records records;
	private Integer buyer;//买家id
	private Integer productid;
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
	public Records getRecords() {
		return records;
	}
	public void setRecords(Records records) {
		this.records = records;
	}
	public Integer getBuyer() {
		return buyer;
	}
	public void setBuyer(Integer buyer) {
		this.buyer = buyer;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	
	public RecordsAction(){
		dataMap = new HashMap<String, Object>();
	}
	//下单 商品剩余--；
	public String rcdadd(){
		dataMap.clear();
		Product pdt = new Product();
		RecordsDAO dao  = new RecordsDAO();
		Records rds = new Records();
		ProductDAO dao2 = new ProductDAO();
		rds.setRBuyer(buyer);
		rds.setRProductid(productid);
		rds.setROrdertime(new Date());
		rds.setRUuid(UUID.randomUUID().toString().replaceAll("-", ""));
		try {
			dao.getSession().clear();
			dao2.getSession().clear();
			dao.beginThransaction();	
			pdt= dao2.productLoad(productid);
			if(pdt.getPLeftcnt()<1){
				System.out.println("库存不足");
				dataMap.put("success", false);
				dataMap.put("error", "库存不足");
				return "suc";
			}
			else{
				dao.recordsAdd(rds);	
				pdt.setPLeftcnt(pdt.getPLeftcnt()-1);
				dao2.productModify(pdt);
				System.out.println("下单成功");
				dao.commitThransaction();
			}			
		} catch (Exception e) {
			System.out.println("下单失败");
			dao.rollbackThransaction();
			dataMap.put("success", false);
			dataMap.put("error", "下单失败");
			return "suc";			
			// TODO: handle exception
		}
		dataMap.put("records", rds);
		dataMap.put("success", true);
		return "suc";
	}
	
	//获取下单列表 参数 buyer id
	public String rcdlist(){
		dataMap.clear();
		List<Records> rList = new ArrayList<Records>();
		RecordsDAO dao = new RecordsDAO();
		
		rList = dao.recList(buyer); 
		dataMap.put("reclist", rList);
		dataMap.put("success", true);
		return "suc";
	}
	public static void main(String[] args){
		RecordsAction rAction = new RecordsAction();
		rAction.setBuyer(1);
		rAction.setProductid(2);
		rAction.rcdadd();
	}
}
