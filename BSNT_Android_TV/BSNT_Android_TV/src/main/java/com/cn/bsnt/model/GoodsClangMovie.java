package com.cn.bsnt.model;
/** ����Ӱ�� */
public class GoodsClangMovie {
	/** ����Ӱ��ID */
	private int id;
	/** ����*/
	private String name;
	/** �۸� */
	private double price;
	/** �ͺ� */
	private String type;
	/** ��ɫ */
	private String color;
	/** �ߴ� */
	private String size;
	/** Ʒ�� */
	private String brand;
	/** ��� */
	private String count;
	/** ������ */
	private String monthSales;
	/** ������ */
	private String totalSales;
	/** ���� */
	private String desc;
	/** ������ */
	private String firstCost;
	/** ��װ�ߴ�*/
	private String packSize;
	/** ë��*/
	private String roughWeight; 
	/** ��ɫ*/
	private String condition;
	/** �������*/
	private String boxTexture;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getMonthSales() {
		return monthSales;
	}
	public void setMonthSales(String monthSales) {
		this.monthSales = monthSales;
	}
	public String getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(String totalSales) {
		this.totalSales = totalSales;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getFirstCost() {
		return firstCost;
	}
	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}
	public String getPackSize() {
		return packSize;
	}
	public void setPackSize(String packSize) {
		this.packSize = packSize;
	}
	public String getRoughWeight() {
		return roughWeight;
	}
	public void setRoughWeight(String roughWeight) {
		this.roughWeight = roughWeight;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getBoxTexture() {
		return boxTexture;
	}
	public void setBoxTexture(String boxTexture) {
		this.boxTexture = boxTexture;
	}
	public GoodsClangMovie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsClangMovie(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String firstCost, String packSize, String roughWeight,
			String condition, String boxTexture) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.color = color;
		this.size = size;
		this.brand = brand;
		this.count = count;
		this.monthSales = monthSales;
		this.totalSales = totalSales;
		this.desc = desc;
		this.firstCost = firstCost;
		this.packSize = packSize;
		this.roughWeight = roughWeight;
		this.condition = condition;
		this.boxTexture = boxTexture;
	}
	
}
