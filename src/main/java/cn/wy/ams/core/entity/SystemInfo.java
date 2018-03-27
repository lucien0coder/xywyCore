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

import cn.wy.ams.core.constant.ModuleSystemConstant;

/**
 * 婉约管理后台系统信息
 */
@Entity
@Table(name = "wy_system_info")
@Inheritance(strategy = InheritanceType.JOINED)
public class SystemInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "system_id", unique = true, nullable = false, length = 11)
	private int systemId;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "status", length = 5)
	private int status = ModuleSystemConstant.Status.NORMAL.value();
	
	@Column(name = "create_time")
	private Date createTime;
	
	public int getSystemId() {
		return systemId;
	}

	public void setSystemId(int systemId) {
		this.systemId = systemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String toString(){
		return "ModuleSystem [systemId="+systemId
				+", name="+name
				+", createTime="+createTime
				+", status="+status +"]";
	}
}
