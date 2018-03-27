package cn.wy.ams.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 城市
 */
@Table(name="city")
@Entity
public class City implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "city_id", unique = true, nullable = false, length = 11)
	private int cityId;
	
	@Column(name="city", length=50)
	private String city;
	
	@JoinColumn(name="province_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Province province;
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	
	public String toString(){
		return "Cities [cityId="+cityId+", city="+city+"]";
	}
}
