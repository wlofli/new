package jinyou.model;

// Generated 2014-10-16 15:43:31 by Hibernate Tools 3.2.2.GA

import java.util.Date;

/**
 * Records generated by hbm2java
 */
public class Records implements java.io.Serializable {

	private Integer ROrderid;
	private Integer RBuyer;
	private Integer RProductid;
	private String RUuid;
	private Date ROrdertime;
	private Date RCompletetime;

	public Records() {
	}

	public Records(Integer RBuyer, Integer RProductid, String RUuid,
			Date ROrdertime, Date RCompletetime) {
		this.RBuyer = RBuyer;
		this.RProductid = RProductid;
		this.RUuid = RUuid;
		this.ROrdertime = ROrdertime;
		this.RCompletetime = RCompletetime;
	}

	public Integer getROrderid() {
		return this.ROrderid;
	}

	public void setROrderid(Integer ROrderid) {
		this.ROrderid = ROrderid;
	}

	public Integer getRBuyer() {
		return this.RBuyer;
	}

	public void setRBuyer(Integer RBuyer) {
		this.RBuyer = RBuyer;
	}

	public Integer getRProductid() {
		return this.RProductid;
	}

	public void setRProductid(Integer RProductid) {
		this.RProductid = RProductid;
	}

	public String getRUuid() {
		return this.RUuid;
	}

	public void setRUuid(String RUuid) {
		this.RUuid = RUuid;
	}

	public Date getROrdertime() {
		return this.ROrdertime;
	}

	public void setROrdertime(Date ROrdertime) {
		this.ROrdertime = ROrdertime;
	}

	public Date getRCompletetime() {
		return this.RCompletetime;
	}

	public void setRCompletetime(Date RCompletetime) {
		this.RCompletetime = RCompletetime;
	}

}
