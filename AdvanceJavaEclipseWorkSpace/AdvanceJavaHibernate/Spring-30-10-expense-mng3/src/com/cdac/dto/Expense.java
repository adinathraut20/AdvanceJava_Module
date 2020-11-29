package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Expense")
public class Expense {

	@Id
	@GeneratedValue
	@Column(name="exp_id")
	private int expenseId;
	@Column(name="item_name")
	private String itemName;
	@Column(name="price")
	private float price;
	@Column(name="purchaseDate")
	private String purchaseDate;
	public int getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", itemName=" + itemName + ", price=" + price + ", purchaseDate="
				+ purchaseDate + "]";
	}
	

}
