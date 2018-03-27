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
@Table(name = "wy_area_module_system_admin")
@PrimaryKeyJoinColumn(name = "admin_id")
public class AreaModuleSystemAdmin extends AdminInfo {
	
	@JoinColumn(name = "module_id")
	@ManyToOne
	private Module module;
	
	@JoinColumn(name = "system_id")
	@ManyToOne
	private AreaModuleSystem system;
	
	@JoinColumn(name = "area_id")
	@ManyToOne
	private Areas area;
	
	@JoinColumn(name = "creater")
	@ManyToOne
	private ModuleSystemAdmin creater;
	
	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public AreaModuleSystem getSystem() {
		return system;
	}

	public void setSystem(AreaModuleSystem system) {
		this.system = system;
	}

	public Areas getArea() {
		return area;
	}

	public void setArea(Areas area) {
		this.area = area;
	}
	
	public ModuleSystemAdmin getCreater() {
		return creater;
	}

	public void setCreater(ModuleSystemAdmin creater) {
		this.creater = creater;
	}

	public String toString(){
		return "ModuleSystemAdmin [adminId="+this.getAdminId()
				+ ", account=" + this.getAccount()
				+ ", phone=" + this.getPhone()
				+ ", email=" + this.getEmail()
				+", name="+this.getName()+", module="+module
				+", createTime="+this.getCreateTime()+", area="+area
				+", system="+system
				+", creater="+creater+"]";
	}
}
