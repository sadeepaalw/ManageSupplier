package com.supplier.manager.MainApp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Supplier {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer SupId;
	@Column(name = "name")
	private String SupName;
	@Column(name = "contact")
	private int SupContact;
	@Column(name = "company")
	private String SupCompany;

	public int getSupId() {
		return SupId;
	}

	public void setSupId(int supId) {
		SupId = supId;
	}

	public String getSupName() {
		return SupName;
	}

	public void setSupName(String supName) {
		SupName = supName;
	}

	public int getSupContact() {
		return SupContact;
	}

	public void setSupContact(int supContact) {
		SupContact = supContact;
	}

	public String getSupCompany() {
		return SupCompany;
	}

	public void setSupCompany(String supCompany) {
		SupCompany = supCompany;
	}

	@Override
	public String toString() {
		return "Supplier [SupId=" + SupId + ", SupName=" + SupName + ", SupContact=" + SupContact + ", SupCompany="
				+ SupCompany + "]";
	}

}
