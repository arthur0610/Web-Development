package edu.zxie0018.model;

public class Good {
	private String goodName;
	private String goodDescrition;
	private int price;
	private int inventory;
	public Good(String goodName, String goodDescrition, int price, int inventory) {
		super();
		this.goodName = goodName;
		this.goodDescrition = goodDescrition;
		this.price = price;
		this.inventory = inventory;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public String getGoodDescrition() {
		return goodDescrition;
	}
	public void setGoodDescrition(String goodDescrition) {
		this.goodDescrition = goodDescrition;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	
	
}
