package jinyou.action.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.mapping.Value;



import jinyou.control.ProductDAO;
import jinyou.model.Product;

public class ProductAction {
	private Map<String, Object> dataMap;
	private Integer productid;//��Ʒid
	private Integer salerid;//�̼�id
	private Float price;//��Ʒ�۸�
	private Integer pleftcnt;//��Ʒ����
	private Integer producttype;//��Ʒ����
	private String pdetail;//��Ʒ����
	private Product product;
	
	
	
	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getPleftcnt() {
		return pleftcnt;
	}

	public void setPleftcnt(Integer pleftcnt) {
		this.pleftcnt = pleftcnt;
	}

	public Integer getProducttype() {
		return producttype;
	}

	public void setProducttype(Integer producttype) {
		this.producttype = producttype;
	}

	public String getPdetail() {
		return pdetail;
	}

	public void setPdetail(String pdetail) {
		this.pdetail = pdetail;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public Integer getSalerid() {
		return salerid;
	}

	public void setSalerid(Integer salerid) {
		this.salerid = salerid;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductAction(){
		dataMap = new HashMap<String, Object>();
		
	}
	
	//���ز�Ʒ����
	public String prddtl(){
		System.out.println(new Date());
		
		Product pdt = new Product();
		ProductDAO dao = new ProductDAO();
		dao.getSession().clear();
		pdt = dao.productLoad(productid);
		System.out.println(pdt.getPLeftcnt());
		dataMap.clear();
		dataMap.put("product", pdt);
		dataMap.put("success", true);
		
		return "suc";
	}
	
	//�����̻���Ʒ�б�
	public String busprds(){
		System.out.println(new Date());
		List<Product>  plist = new ArrayList<Product>();
		ProductDAO dao = new ProductDAO();
		dao.getSession().clear();
		plist =dao.busprolist(salerid);
		dataMap.clear();
		dataMap.put("productlist", plist);
		dataMap.put("success", true);
		return "suc";
	}

	//������Ʒ
	
	
	
	public static void main(String[] args){
		ProductAction pAction = new ProductAction();
		pAction.setSalerid(2);
		List<Product> pList = new ArrayList<Product>();
		ProductDAO dao = new ProductDAO();
		pList= dao.busprolist(2);
		
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).getPProductid());
			
		}
		
		
	}

	
	
	
}
