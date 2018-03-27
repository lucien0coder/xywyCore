package cn.wy.ams.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 家庭关系
 */
@Entity
@Table(name = "family_relation")
public class FamilyRelation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "relation_id", unique = true, nullable = false, length = 11)
	private int relationId;
	
	@Column(name = "relation", length = 20, nullable = false)
	private String relation;

	public int getRelationId() {
		return relationId;
	}

	public void setRelationId(int relationId) {
		this.relationId = relationId;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	public String toString(){
		return "FamilyRelation [relationId="+relationId
				+"relation="+relation+"]";
	}
}
