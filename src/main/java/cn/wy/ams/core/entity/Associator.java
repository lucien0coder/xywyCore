package cn.wy.ams.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import cn.wy.ams.core.constant.AssociatorConstant;

/**
 * 婉约会员
 *
 */
@Entity
@Table(name="wy_associator")
public class Associator {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tid", unique = true, nullable = false, length = 20)
	private long tid;
	
	@Column(name = "aid", unique = true, length = 20)
	private String aid;
	
	@Column(name = "nick_name", nullable = false, length = 50)
	private String nickName;
	
	@Column(name = "password", nullable = false, length = 255)
	private String password;
	
	@Column(name = "phone", length = 20)
	private String phone;
	
	@Column(name = "phone_isreal", nullable= false, length = 5)
	private int phoneIsreal = AssociatorConstant.Isreal.NOT_KNOW.value();
	
	@Column(name = "email", length = 50)
	private String email;
	
	@Column(name = "email_isreal", length = 5)
	private int emailIsreal = AssociatorConstant.Isreal.NOT_KNOW.value();
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "name_isreal", length = 5)
	private int nameIsreal = AssociatorConstant.Isreal.NOT_KNOW.value();
	
	@Column(name = "sex", length = 5)
	private int sex;
	
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name = "type", length = 5)
	private int type = AssociatorConstant.Type.PERSONAL.value();
	
	@Column(name = "permanent_address")
	private String permanetAddress;
	
	@Column(name = "work_address")
	private String workAddress;
	
	@Column(name = "ID", length=255)
	private String ID;
	
	@Column(name = "ID_isreal", length = 5)
	private int IDIsreal = AssociatorConstant.Isreal.NOT_KNOW.value();
	
	@Column(name = "create_time")
	private Date createTime;
	
	@Column(name = "integral", length = 11)
	private int integral = 0;

	public long getTid() {
		return tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPhoneIsreal() {
		return phoneIsreal;
	}

	public void setPhoneIsreal(int phoneIsreal) {
		this.phoneIsreal = phoneIsreal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmailIsreal() {
		return emailIsreal;
	}

	public void setEmailIsreal(int emailIsreal) {
		this.emailIsreal = emailIsreal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNameIsreal() {
		return nameIsreal;
	}

	public void setNameIsreal(int nameIsreal) {
		this.nameIsreal = nameIsreal;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getPermanetAddress() {
		return permanetAddress;
	}

	public void setPermanetAddress(String permanetAddress) {
		this.permanetAddress = permanetAddress;
	}

	public String getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getIDIsreal() {
		return IDIsreal;
	}

	public void setIDIsreal(int iDIsreal) {
		IDIsreal = iDIsreal;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}
	
	public String toString(){
		return "Associator [aid="+aid+", nickName="+nickName
				+", name="+name+", type="+type
				+", integral="+integral+", createTime="+createTime+"]";
	}
}
