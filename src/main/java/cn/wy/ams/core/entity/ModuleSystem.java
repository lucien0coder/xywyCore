package cn.wy.ams.core.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 婉约各领域管理后台系统
 */
@Entity
@PrimaryKeyJoinColumn(name = "system_id")
@Table(name = "wy_module_system")
public class ModuleSystem extends SystemInfo {
	
	@JoinColumn(name="module_id")
	@OneToOne
	private Module module;
	
	@JoinColumn(name = "creater")
	@ManyToOne
	private SuperAdmin creater;


	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public SuperAdmin getCreater() {
		return creater;
	}

	public void setCreater(SuperAdmin creater) {
		this.creater = creater;
	}

	public String toString(){
		return "ModuleSystem [systemId="+ this.getSystemId()
				+", name="+this.getName()+", module="+module
				+", status="+this.getStatus()
				+", creater="+creater+"]";
	}
}
