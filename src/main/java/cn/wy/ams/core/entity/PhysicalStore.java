package cn.wy.ams.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cn.wy.ams.core.constant.PhysicalStoreConstant;

/**
 * 婉约线下物理店信息
 */
@Entity
@Table(name = "wy_physical_store")
public class PhysicalStore {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "store_id", unique = true, nullable = false, length = 20)
	private long storeId;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	
	@Column(name = "store_phone", length = 20)
	private String storePhone;
	
	@Column(name = "address", length = 255)
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "area_id", nullable = false)
	private Areas area;
	
	@Column(name = "shopowner", length = 20)
	private String shopowner;
	
	@Column(name = "shopowner_phone", length = 20)
	private String shopownerPhone;
	
	@Column(name = "store_photo", length = 255)
	private String storePhoto;
	
	@Column(name = "business_hours", length = 255)
	private String businessHours;
	
	@JoinColumn(name = "creater")
	@ManyToOne
	private AreaModuleSystemAdmin creater;
	
	@JoinColumn(name = "admin_system_id")
	@OneToOne
	private StoreAdminSystem adminSystem;
	
	@JoinColumn(name = "client_system_id")
	@OneToOne
	private StoreClientSystem clientSystem;
	
	@Column(name = "status", nullable = false, length = 5)
	private int status = PhysicalStoreConstant.Status.NORMAL.value();
	
	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStorePhone() {
		return storePhone;
	}

	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Areas getArea() {
		return area;
	}

	public void setArea(Areas area) {
		this.area = area;
	}

	public String getShopowner() {
		return shopowner;
	}

	public void setShopowner(String shopowner) {
		this.shopowner = shopowner;
	}

	public String getShopownerPhone() {
		return shopownerPhone;
	}

	public void setShopownerPhone(String shopownerPhone) {
		this.shopownerPhone = shopownerPhone;
	}

	public String getStorePhoto() {
		return storePhoto;
	}

	public void setStorePhoto(String storePhoto) {
		this.storePhoto = storePhoto;
	}

	public String getBusinessHours() {
		return businessHours;
	}

	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	public AreaModuleSystemAdmin getCreater() {
		return creater;
	}

	public void setCreater(AreaModuleSystemAdmin creater) {
		this.creater = creater;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public StoreAdminSystem getAdminSystem() {
		return adminSystem;
	}

	public void setAdminSystem(StoreAdminSystem adminSystem) {
		this.adminSystem = adminSystem;
	}

	public StoreClientSystem getClientSystem() {
		return clientSystem;
	}

	public void setClientSystem(StoreClientSystem clientSystem) {
		this.clientSystem = clientSystem;
	}

	public String toString(){
		return "Module[storeId="+storeId+", name="+name
				+", storePhone="+storePhone
				+", address="+address
				+", area="+area
				+", shopowner="+shopowner
				+", shopowner_phone="+shopownerPhone
				+", storePhoto="+storePhoto
				+", businessHours="+businessHours
				+", creater="+creater
				+", status="+status
				+", adminSystem=" + adminSystem
				+", clientSystem="+clientSystem+"]";
	}
}
