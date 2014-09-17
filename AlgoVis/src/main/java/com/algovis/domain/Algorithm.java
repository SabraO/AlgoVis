package com.algovis.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ALGORITHM")
public class Algorithm implements Serializable{
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SEQUENCE")
	private String sequence;
	
	@Column(name = "KEYWORD_PER")
	private Integer keyword_per;
	
	@Column(name = "COMPARISON_PER")
	private Integer comparison_per;
	
	@Column(name = "OPERATOR_PER")
	private Integer operator_per;
	
	@Column(name = "INSIGNIFICANT_PER")
	private Integer insignificant_per;
	
	@Column(name = "STRUCTURE_TYPE")
	private String structure_type;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSequence() {
		return sequence;
	}

	public Integer getKeyword_per() {
		return keyword_per;
	}

	public Integer getComparison_per() {
		return comparison_per;
	}

	public Integer getOperator_per() {
		return operator_per;
	}

	public Integer getInsignificant_per() {
		return insignificant_per;
	}

	public String getStructure_type() {
		return structure_type;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public void setKeyword_per(Integer keyword_per) {
		this.keyword_per = keyword_per;
	}

	public void setComparison_per(Integer comparison_per) {
		this.comparison_per = comparison_per;
	}

	public void setOperator_per(Integer operator_per) {
		this.operator_per = operator_per;
	}

	public void setInsignificant_per(Integer insignificant_per) {
		this.insignificant_per = insignificant_per;
	}

	public void setStructure_type(String structure_type) {
		this.structure_type = structure_type;
	}
	
	
}
