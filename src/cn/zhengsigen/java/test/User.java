package cn.zhengsigen.java.test;

import java.sql.Date;

public class User {

	private int id;
	private String telNumber;
	private String idNumber;
	private String name;
	private String passwd;
	private String payPasswd;
	private String bankCard;
	private double money;
	private Date createTime;
	private Date updateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getPayPasswd() {
		return payPasswd;
	}
	public void setPayPasswd(String payPasswd) {
		this.payPasswd = payPasswd;
	}
	public String getBankCard() {
		return bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public User(int id, String telNumber, String idNumber, String name, String passwd, String payPasswd,
			String bankCard, double money, Date createTime, Date updateTime) {
		super();
		this.id = id;
		this.telNumber = telNumber;
		this.idNumber = idNumber;
		this.name = name;
		this.passwd = passwd;
		this.payPasswd = payPasswd;
		this.bankCard = bankCard;
		this.money = money;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", telNumber=" + telNumber + ", idNumber=" + idNumber + ", name=" + name + ", passwd="
				+ passwd + ", payPasswd=" + payPasswd + ", bankCard=" + bankCard + ", money=" + money + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}
	
	
	

}
