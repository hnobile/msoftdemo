package com.business.services.tshirt.model;

import java.util.List;

public class ListInventoryResponse {

	public List<InventoryItem> inventory;

	public List<InventoryItem> getInventory() {
		return inventory;
	}

	public void setInventory(List<InventoryItem> inventory) {
		this.inventory = inventory;
	}
	
}
