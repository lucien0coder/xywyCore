package cn.wy.ams.core.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 婉约各行政区各领域管理后台系统
 */
@Entity
@PrimaryKeyJoinColumn(name = "system_id")
@Table(name = "wy_area_module_system")
public class AreaModuleSystem extends SystemInfo {
	
	@JoinColumn(name="module_id")
	@ManyToOne
	private Module module;
	
	@JoinColumn(name = "creater")
	@ManyToOne
	private ModuleSystemAdmin creater;
	
	@JoinColumn(name = "area_id")
	@ManyToOne
	private Areas area;

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public ModuleSystemAdmin getCreater() {
		return creater;
	}

	public void setCreater(ModuleSystemAdmin creater) {
		this.creater = creater;
	}

	public String toString(){
		return "ModuleSystem [systemId="+ this.getSystemId()
				+", name="+this.getName()+", module="+module
				+", status="+this.getStatus() + ", area="+area
				+", creater="+creater+"]";
	}
}
