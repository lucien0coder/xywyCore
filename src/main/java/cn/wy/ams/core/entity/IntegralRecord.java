package cn.wy.ams.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 记录会员添加的家庭关系记录
 */
@Entity
@Table(name = "wy_integral_record")
public class IntegralRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "record_id", unique = true, nullable = false, length = 20)
	private long recordId;
	
	@JoinColumn(name="associator_id",nullable = false)
	@ManyToOne
	private Associator associator;
	
	@Column(name = "type", length = 5, nullable = false)
	private int type;
	
	@Column(name = "number", length = 11, nullable = false)
	private int number = 0;
	
	@Column(name = "place", length = 255)
	private String plac;
	
	@JoinColumn(name="agent_employee_id")
	@ManyToOne
	private Employee agentEmployee;
	
	@Column(name = "create_time")
	private Date createTime;
	
	@Column(name = "overdue_time")
	private Date overdueTime;

	public long getRecordId() {
		return recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	public Associator getAssociator() {
		return associator;
	}

	public void setAssociator(Associator associator) {
		this.associator = associator;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPlac() {
		return plac;
	}

	public void setPlac(String plac) {
		this.plac = plac;
	}

	public Employee getAgentEmployee() {
		return agentEmployee;
	}

	public void setAgentEmployee(Employee agentEmployee) {
		this.agentEmployee = agentEmployee;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getOverdueTime() {
		return overdueTime;
	}

	public void setOverdueTime(Date overdueTime) {
		this.overdueTime = overdueTime;
	}
	
	public String toString(){
		return "IntegralRecord [recordId="+recordId
				+", associator="+associator
				+", number="+number
				+", plac="+plac
				+", agentEmployee="+agentEmployee
				+", createTime="+createTime
				+", overdueTime="+overdueTime
				+", type="+type+"]";
	}
}
