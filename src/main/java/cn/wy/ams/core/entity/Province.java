package cn.wy.ams.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="province")
@Entity
public class Province implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "province_id", unique = true, nullable = false, length = 11)
	private int provincesId;
	
	@Column(name="province", length=50)
	private String province;
	
	public int getProvincesId() {
		return provincesId;
	}
	public void setProvincesId(int provincesId) {
		this.provincesId = provincesId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String toString(){
		return "Provinces [provincesId="+provincesId+", province="+province+"]";
	}
}
