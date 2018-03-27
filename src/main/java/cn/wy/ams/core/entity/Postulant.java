package cn.wy.ams.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 婉约线下店后台管理员
 */
@Entity
@Table(name = "wy_postulant")
public class Postulant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "postulant_id", unique = true, nullable = false, length = 20)
	private long postulantId;
	
	@JoinColumn(name="associator_id",nullable = false)
	@OneToOne
	private Associator associator;
	
	@Column(name = "create_time")
	private Date createTime;
	
	@Column(name = "school_company", length = 255)
	private String schoolCompany;
	
	@Column(name = "highest_education", length = 50)
	private String highestEducation;

	public long getPostulantId() {
		return postulantId;
	}

	public void setPostulantId(long postulantId) {
		this.postulantId = postulantId;
	}

	public Associator getAssociator() {
		return associator;
	}

	public void setAssociator(Associator associator) {
		this.associator = associator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSchoolCompany() {
		return schoolCompany;
	}

	public void setSchoolCompany(String schoolCompany) {
		this.schoolCompany = schoolCompany;
	}

	public String getHighestEducation() {
		return highestEducation;
	}

	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}
	
	public String toString(){
		return "Postulant [postulantId="+postulantId
				+", associator="+associator
				+", createTime="+createTime
				+", schoolCompany="+schoolCompany
				+", highestEducation="+highestEducation
				+"]";
	}
}
