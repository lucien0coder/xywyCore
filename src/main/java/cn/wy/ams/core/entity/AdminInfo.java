package cn.wy.ams.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * 婉约后台系统管理员
 */
@Entity
@Table(name = "wy_admin_info")
@Inheritance(strategy = InheritanceType.JOINED)
public class AdminInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "admin_id", length = 20)
	private int adminId;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "account", length = 50, nullable = false)
	private String account;
	
	@Column(name = "phone", length = 20)
	private String phone;
	
	@Column(name = "password", nullable = false, length = 255)
	private String password;
	
	@Column(name = "email", length = 50)
	private String email;
	
	@Column(name = "create_time")
	private Date createTime;
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String toString(){
		return "ModuleSystemAdmin [adminId="+adminId
				+ ", account=" + account
				+ ", phone=" + phone
				+ ", email=" + email
				+", name="+name+"]";
	}
}
