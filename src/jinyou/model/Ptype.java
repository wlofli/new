package jinyou.model;

// Generated 2014-10-13 10:39:52 by Hibernate Tools 3.2.2.GA

/**
 * Ptype generated by hbm2java
 */
public class Ptype implements java.io.Serializable {

	private int ptType;
	private String ptName;
	private String ptStay;

	public Ptype() {
	}

	public Ptype(int ptType) {
		this.ptType = ptType;
	}

	public Ptype(int ptType, String ptName, String ptStay) {
		this.ptType = ptType;
		this.ptName = ptName;
		this.ptStay = ptStay;
	}

	public int getPtType() {
		return this.ptType;
	}

	public void setPtType(int ptType) {
		this.ptType = ptType;
	}

	public String getPtName() {
		return this.ptName;
	}

	public void setPtName(String ptName) {
		this.ptName = ptName;
	}

	public String getPtStay() {
		return this.ptStay;
	}

	public void setPtStay(String ptStay) {
		this.ptStay = ptStay;
	}

}
