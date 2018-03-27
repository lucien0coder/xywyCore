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

/**
 * 记录会员添加的家庭关系记录
 */
@Entity
@Table(name = "wy_family_relation_record")
public class FamilyRelationRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "record_id", unique = true, nullable = false, length = 20)
	private long recordId;
	
	@JoinColumn(name="lead_id",nullable = false)
	@OneToOne
	private Associator lead;
	
	@JoinColumn(name="relation_id",nullable = false)
	@ManyToOne
	private FamilyRelation relation;
	
	@Column(name = "t_name", length = 20)
	private String tName;
	
	@Column(name = "t_phone", length = 20)
	private String tPhone;
	
	@Column(name = "t_ID", length=255)
	private String tID;
	
	@JoinColumn(name="t_associator_id")
	@ManyToOne
	private Associator tAssociator;
	
	@Column(name = "status", length = 5, nullable = false)
	private int status = 0;

	public long getRecordId() {
		return recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	public Associator getLead() {
		return lead;
	}

	public void setLead(Associator lead) {
		this.lead = lead;
	}

	public FamilyRelation getRelation() {
		return relation;
	}

	public void setRelation(FamilyRelation relation) {
		this.relation = relation;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettPhone() {
		return tPhone;
	}

	public void settPhone(String tPhone) {
		this.tPhone = tPhone;
	}

	public String gettID() {
		return tID;
	}

	public void settID(String tID) {
		this.tID = tID;
	}

	public Associator gettAssociator() {
		return tAssociator;
	}

	public void settAssociator(Associator tAssociator) {
		this.tAssociator = tAssociator;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public String toString(){
		return "FamilyRelationRecord [recordId="+recordId
				+", lead="+lead+", relation="+relation
				+", tName="+tName+", tPhone="+tPhone
				+", tAssociator="+tAssociator
				+", status="+status+"]";
	}
}
