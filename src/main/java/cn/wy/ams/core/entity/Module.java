package cn.wy.ams.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 婉约业务板块记录表
 */
@Entity
@Table(name = "wy_module")
public class Module {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tid", unique = true, nullable = false, length = 11)
	private int tId;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	
	@Column(name = "one_code", nullable = false, length = 4)
	private String oneCode;
	
	@Column(name = "six_code", nullable = false, length = 10)
	private String sixCode;

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOneCode() {
		return oneCode;
	}

	public void setOneCode(String oneCode) {
		this.oneCode = oneCode;
	}

	public String getSixCode() {
		return sixCode;
	}

	public void setSixCode(String sixCode) {
		this.sixCode = sixCode;
	}
	
	public String toString(){
		return "Module[tId="+tId+", name="+name+", oneCode="+oneCode
				+", sixCode="+sixCode+"]";
	}
}
