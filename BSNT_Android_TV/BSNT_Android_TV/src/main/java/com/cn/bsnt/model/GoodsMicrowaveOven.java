package com.cn.bsnt.model;

/** ΢��¯ */
public class GoodsMicrowaveOven {
	/** ��� */
	private int id;
	/** ���� */
	private String Name;
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
	/** �������� */
	private String belownMold;
	/** ���� */
	private String power;
	/** ��⿷�ʽ */
	private String cookingType;
	/** ���ŷ�ʽ */
	private String openDoorType;
	/** ���Ʒ�ʽ */
	private String controlType;
	/** ΢��¯���� */
	private String microwaveType;
	/** ���� */
	private String capacity;
	/** ������ */
	private String firstCost;

	public GoodsMicrowaveOven() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsMicrowaveOven(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String belownMold, String power, String cookingType,
			String openDoorType, String controlType, String microwaveType,
			String capacity, String firstCost) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
		this.type = type;
		this.color = color;
		this.size = size;
		this.brand = brand;
		this.count = count;
		this.monthSales = monthSales;
		this.totalSales = totalSales;
		this.desc = desc;
		this.belownMold = belownMold;
		this.power = power;
		this.cookingType = cookingType;
		this.openDoorType = openDoorType;
		this.controlType = controlType;
		this.microwaveType = microwaveType;
		this.capacity = capacity;
		this.firstCost = firstCost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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

	public String getBelownMold() {
		return belownMold;
	}

	public void setBelownMold(String belownMold) {
		this.belownMold = belownMold;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getCookingType() {
		return cookingType;
	}

	public void setCookingType(String cookingType) {
		this.cookingType = cookingType;
	}

	public String getOpenDoorType() {
		return openDoorType;
	}

	public void setOpenDoorType(String openDoorType) {
		this.openDoorType = openDoorType;
	}

	public String getControlType() {
		return controlType;
	}

	public void setControlType(String controlType) {
		this.controlType = controlType;
	}

	public String getMicrowaveType() {
		return microwaveType;
	}

	public void setMicrowaveType(String microwaveType) {
		this.microwaveType = microwaveType;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getFirstCost() {
		return firstCost;
	}

	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}

	@Override
	public String toString() {
		return "GoodsMicrowaveoven [id=" + id + ", Name=" + Name + ", price="
				+ price + ", type=" + type + ", color=" + color + ", size="
				+ size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", belownMold=" + belownMold + ", power="
				+ power + ", cookingType=" + cookingType + ", openDoorType="
				+ openDoorType + ", controlType=" + controlType
				+ ", microwaveType=" + microwaveType + ", capacity=" + capacity
				+ ", firstCost=" + firstCost + "]";
	}

}
