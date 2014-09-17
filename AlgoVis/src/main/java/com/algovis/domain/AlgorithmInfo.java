package com.algovis.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ALGORITHM_INFO")
public class AlgorithmInfo implements Serializable{
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ANALYSIS")
	private String analysis;
	
	@Column(name = "PSEUDO")
	private String pseudo;
	
	@Column(name = "VARIANT")
	private String variant;
	
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAnalysis() {
		return analysis;
	}

	public String getPseudo() {
		return pseudo;
	}

	public String getVariant() {
		return variant;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	
}
