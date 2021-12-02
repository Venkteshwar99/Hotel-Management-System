package com.Manager.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Inventory {

	@Id
	private int inventoryId;
	private String invType;
	private String invName;
	private String invStock;
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getInvType() {
		return invType;
	}
	public void setInvType(String invType) {
		this.invType = invType;
	}
	public String getInvName() {
		return invName;
	}
	public void setInvName(String invName) {
		this.invName = invName;
	}
	public String getInvStock() {
		return invStock;
	}
	public void setInvStock(String invStock) {
		this.invStock = invStock;
	}
	public Inventory(int inventoryId, String invType, String invName, String invStock) {
		super();
		this.inventoryId = inventoryId;
		this.invType = invType;
		this.invName = invName;
		this.invStock = invStock;
	}
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
