package cn.wy.ams.core.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 线下店后台系统信息
 */
@Entity
@PrimaryKeyJoinColumn(name = "system_id")
@Table(name = "wy_store_admin_system")
public class StoreAdminSystem extends SystemInfo {
	@JoinColumn(name="store_id",nullable = false)
	@OneToOne
	private PhysicalStore store;
	
	@JoinColumn(name = "creater")
	@ManyToOne
	private AreaModuleSystemAdmin creater;
	
	public PhysicalStore getStore() {
		return store;
	}

	public void setStore(PhysicalStore store) {
		this.store = store;
	}

	public AreaModuleSystemAdmin getCreater() {
		return creater;
	}

	public void setCreater(AreaModuleSystemAdmin creater) {
		this.creater = creater;
	}

	public String toString(){
		return "StoreAdminSystem [systemId="+this.getSystemId()
				+", name="+this.getName()+", store="+store
				+", createTime=" + this.getCreateTime()
				+", status="+this.getStatus()+", creater="+creater+"]";
	}
}
