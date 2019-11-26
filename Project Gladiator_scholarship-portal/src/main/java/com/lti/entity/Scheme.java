package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Scheme {
	
	@Id
	@Column(name="SCHEME_ID")
	private int schemeId;
	
	@Column(name="SCHEME_NAME")
	private String schemeName;
	
	@Column(name="SCHEME_DESCRIPTION")
	private String schemeDescription;

	//@ManyToOne() // fetch=FetchType.LAZY 
//	private ScholarshipApplication scholarshipApp;

	public int getSchemeId() {
		return schemeId;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public String getSchemeDescription() {
		return schemeDescription;
	}

	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public void setSchemeDescription(String schemeDescription) {
		this.schemeDescription = schemeDescription;
	}
}