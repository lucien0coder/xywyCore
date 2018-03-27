package cn.wy.ams.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="areas")
@Entity
public class Areas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "area_id", unique = true, nullable = false, length = 11)
	private int areaid;
	
	@JoinColumn(name="city_id")
	@ManyToOne
	private City city;
	
	@Column(name="area", length=50)
	private String area;
	
	@Column(name="area_code", length=5)
	private String areaCode;
	
	public int getAreaid() {
		return areaid;
	}
	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String toString(){
		return "Areas [areaid="+areaid+", area="+area
				+", areaCode="+areaCode+"]";
	}
}
