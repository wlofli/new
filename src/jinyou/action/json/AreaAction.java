package jinyou.action.json;

import java.util.HashMap;
import java.util.Map;



import jinyou.control.AreaDAO;
import jinyou.model.Area;

public class AreaAction {
	
	private Map<String, Object> dataMap; 
	private Area area;
	
	public AreaAction(){
		dataMap = new HashMap<String, Object>();
	}
	
	public String areaget(){
		Area area = new Area();
		AreaDAO dao = new AreaDAO();
		dao.getSession().clear();
		area = dao.areaLoad(1);
		System.out.println(area.getALatbottom());
		System.out.println(area.getALongbottom());
		dataMap.clear();
		dataMap.put("area", area);		
		return"suc";
	}
	

	public static void main(String[] args){	
		AreaAction action = new AreaAction();
		//action.areaget();
		Area area = new Area();
		AreaDAO dao = new  AreaDAO();
		area.setAId(5);
		area.setALatbottom(123.321654);
		area.setALatleft(-123.001);
		dao.beginThransaction();
		dao.areaAdd(area);
		dao.commitThransaction();
		System.out.println(87);		
	}
	
	
	

}
