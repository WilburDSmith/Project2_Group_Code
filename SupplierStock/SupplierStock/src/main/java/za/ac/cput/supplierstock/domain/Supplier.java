/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.supplierstock.domain;

/**
 *
 * @author Alizwa
 */
public class Supplier 
{
	//Creating attributes for the supplier
	private int SupplierId;
	private String SupplierName;
	private String SupplierPhone;
	private String SupplierEmail;
	private String SupplierAddress;

	public Supplier(int SupplierId, String SupplierName, String SupplierPhone,
		String SupplierEmail, String SupplierAddress) {
		this.SupplierId = SupplierId;
		this.SupplierName = SupplierName;
		this.SupplierPhone = SupplierPhone;
		this.SupplierEmail = SupplierEmail;
		this.SupplierAddress = SupplierAddress;
	}

	public Supplier() 
	{
	}

	

	public int getSupplierId() {
		return SupplierId;
	}

	public void setSupplierId(int SupplierId) {
		this.SupplierId = SupplierId;
	}

	public String getSupplierName() {
		return SupplierName;
	}

	public void setSupplierName(String SupplierName) {
		this.SupplierName = SupplierName;
	}

	public String getSupplierPhone() {
		return SupplierPhone;
	}

	public void setSupplierPhone(String SupplierPhone) {
		this.SupplierPhone = SupplierPhone;
	}

	public String getSupplierEmail() {
		return SupplierEmail;
	}

	public void setSupplierEmail(String SupplierEmail) {
		this.SupplierEmail = SupplierEmail;
	}

	public String getSupplierAddress() {
		return SupplierAddress;
	}

	public void setSupplierAddress(String SupplierAddress) {
		this.SupplierAddress = SupplierAddress;
	}

	@Override
	public String toString() {
		return "Supplier{" + "SupplierId=" + SupplierId + ", SupplierName=" + SupplierName + ", SupplierPhone=" + SupplierPhone + ", SupplierEmail=" + SupplierEmail + ", SupplierAddress=" + SupplierAddress + '}';
	}
	
	
}
