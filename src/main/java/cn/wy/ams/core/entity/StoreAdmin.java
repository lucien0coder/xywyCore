package cn.wy.ams.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 婉约线下店后台管理员
 */
@Entity
@Table(name="wy_store_admin")
public class StoreAdmin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "admin_id", unique = true, nullable = false, length = 20)
	private long adminId;
	
	@JoinColumn(name="employee_id",nullable = false)
	@OneToOne
	private Employee employee;
	
	@JoinColumn(name="creater",nullable = false)
	@ManyToOne
	private ModuleSystemAdmin creater;

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ModuleSystemAdmin getCreater() {
		return creater;
	}

	public void setCreater(ModuleSystemAdmin creater) {
		this.creater = creater;
	}
	
	public String toString(){
		return "StoreAdmin [adminId="+adminId+", employee="+employee
				+", creater="+creater+"]";
	}
}
