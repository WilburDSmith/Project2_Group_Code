/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.supplierstock.domain;

/**
 *
 * @author Alizwa Solibanzi
 */
public class Stock 
{
	//Creating attributes for the stock
	private int StockId;
	private String StockName;
	private String StockType;
	private String  StockDescription;
	private String StockQuantity;
	private String StockLocation;
	
	
	public Stock(int StockId, String StockName, 
		String StockType, String StockDescription, String StockQuantity ,String StockLocation) {
		this.StockId = StockId;
		this.StockName = StockName;
		this.StockType = StockType;
		this.StockDescription = StockDescription;
		this.StockQuantity = StockQuantity;
		this.StockLocation = StockLocation;
	}
	public Stock()
	{
		
	}

	public int getStockId() {
		return StockId;
	}

	public void setStockId(int StockId) {
		this.StockId = StockId;
	}

	public String getStockName() {
		return StockName;
	}

	public void setStockName(String StockName) {
		this.StockName = StockName;
	}

	public String getStockType() {
		return StockType;
	}

	public void setStockType(String StockType) {
		this.StockType = StockType;
	}

	public String getStockDescription() {
		return StockDescription;
	}

	public void setStockDescription(String StockDescription) {
		this.StockDescription = StockDescription;
	}

	public String getStockLocation() {
		return StockLocation;
	}

	public void setStockLocation(String StockLocation) {
		this.StockLocation = StockLocation;
	}

	public String getStockQuantity() {
		return StockQuantity;
	}

	public void setStockQuantity(String StockQuantity) {
		this.StockQuantity = StockQuantity;
	}

	@Override
	public String toString() {
		return "Stock{" + "StockId=" + StockId + ", StockName=" + StockName + ", StockType=" + StockType + ", StockDescription=" + StockDescription + ", StockLocation=" + StockLocation + ", StockQuantity=" + StockQuantity + '}';
	}
	
}
