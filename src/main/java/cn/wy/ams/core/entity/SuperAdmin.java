package cn.wy.ams.core.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 系统管理员
 *
 */
@Entity
@Table(name = "wy_superadmin")
@PrimaryKeyJoinColumn(name = "admin_id")
public class SuperAdmin extends AdminInfo {
	
}
