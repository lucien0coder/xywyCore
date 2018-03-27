package cn.wy.ams.core.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 婉约各领域总管理后台系统管理员
 */
@Entity
@PrimaryKeyJoinColumn(name = "admin_id")
@Table(name = "wy_module_system_admin")
public class ModuleSystemAdmin extends AdminInfo{
	@JoinColumn(name = "module_id")
	@ManyToOne
	private Module module;
	
	@JoinColumn(name = "system_id")
	@ManyToOne
	private ModuleSystem system;
	
	@JoinColumn(name = "creater")
	@ManyToOne
	private SuperAdmin creater;
	
	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public ModuleSystem getSystem() {
		return system;
	}

	public void setSystem(ModuleSystem system) {
		this.system = system;
	}

	public SuperAdmin getCreater() {
		return creater;
	}

	public void setCreater(SuperAdmin creater) {
		this.creater = creater;
	}

	public String toString(){
		return "ModuleSystemAdmin [adminId="+this.getAdminId()
				+ ", account=" + this.getAccount()
				+ ", phone=" + this.getPhone()
				+ ", email=" + this.getEmail()
				+", name="+this.getName()+", module="+module
				+", createTime="+this.getCreateTime()
				+", system="+system
				+", creater="+creater+"]";
	}
}
