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

import cn.wy.ams.core.constant.EmployeeConstant;

/**
 * 婉约员工
 */
@Entity
@Table(name="wy_employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id", unique = true, nullable = false, length = 20)
	private long employeeId;
	
	@Column(name = "postion", length = 20)
	private String postion;
	
	@JoinColumn(name="store_id",nullable = false)
	@ManyToOne
	private PhysicalStore store;
	
	@Column(name = "employee_status", nullable=false, length=5)
	private int employeeStatus = EmployeeConstant.Status.NORMAL.value();
	
	@JoinColumn(name="associator_id",nullable = false)
	@OneToOne
	private Associator associator;
	
	@JoinColumn(name="creater",nullable = false)
	@ManyToOne
	private StoreAdmin creater;

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}

	public PhysicalStore getStore() {
		return store;
	}

	public void setStore(PhysicalStore store) {
		this.store = store;
	}

	public int getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(int employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public Associator getAssociator() {
		return associator;
	}

	public void setAssociator(Associator associator) {
		this.associator = associator;
	}
	
	public StoreAdmin getCreater() {
		return creater;
	}

	public void setCreater(StoreAdmin creater) {
		this.creater = creater;
	}

	public String toString(){
		return "Employee [employeeId="+employeeId
				+", postion="+postion
				+", store="+store
				+"employeeStatus="+employeeStatus
				+"associator="+associator
				+", creater="+creater+"]";
	}
}
