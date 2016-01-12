package com.cn.bsnt.model;

/** �������� */
public class GoodsOtherElectricAppliance {
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
	/** ���� */
	private String shape;
	/** ��Ч�ȼ� */
	private String eel;
	/** ���� */
	private String power;
	/** ë�� */
	private String roughWeight;
	/** ʹ����� */
	private String useArea;
	/** ֱ�� */
	private String dia;
	/** ��λ */
	private String gears;
	/** �������� */
	private String coutrolType;
	/** ���� */
	private String texture;
	/** ���·�ʽ */
	private String attemperationType;
	/** ���ȷ�ʽ */
	private String warmType;
	/** �����ٶ� */
	private String warmSpeed;
	/** ���� */
	private String function;
	/** ��ʽ */
	private String style;
	/** �������� */
	private String capacityType;
	/** ������ */
	private String firstCost;

	public GoodsOtherElectricAppliance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsOtherElectricAppliance(int id, String name, double price,
			String type, String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc, String shape,
			String eel, String power, String roughWeight, String useArea,
			String dia, String gears, String coutrolType, String texture,
			String attemperationType, String warmType, String warmSpeed,
			String function, String style, String capacityType, String firstCost) {
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
		this.shape = shape;
		this.eel = eel;
		this.power = power;
		this.roughWeight = roughWeight;
		this.useArea = useArea;
		this.dia = dia;
		this.gears = gears;
		this.coutrolType = coutrolType;
		this.texture = texture;
		this.attemperationType = attemperationType;
		this.warmType = warmType;
		this.warmSpeed = warmSpeed;
		this.function = function;
		this.style = style;
		this.capacityType = capacityType;
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

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getEel() {
		return eel;
	}

	public void setEel(String eel) {
		this.eel = eel;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getRoughWeight() {
		return roughWeight;
	}

	public void setRoughWeight(String roughWeight) {
		this.roughWeight = roughWeight;
	}

	public String getUseArea() {
		return useArea;
	}

	public void setUseArea(String useArea) {
		this.useArea = useArea;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getGears() {
		return gears;
	}

	public void setGears(String gears) {
		this.gears = gears;
	}

	public String getCoutrolType() {
		return coutrolType;
	}

	public void setCoutrolType(String coutrolType) {
		this.coutrolType = coutrolType;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getAttemperationType() {
		return attemperationType;
	}

	public void setAttemperationType(String attemperationType) {
		this.attemperationType = attemperationType;
	}

	public String getWarmType() {
		return warmType;
	}

	public void setWarmType(String warmType) {
		this.warmType = warmType;
	}

	public String getWarmSpeed() {
		return warmSpeed;
	}

	public void setWarmSpeed(String warmSpeed) {
		this.warmSpeed = warmSpeed;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getCapacityType() {
		return capacityType;
	}

	public void setCapacityType(String capacityType) {
		this.capacityType = capacityType;
	}

	public String getFirstCost() {
		return firstCost;
	}

	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}

	@Override
	public String toString() {
		return "GoodsOtherElectricAppliance [id=" + id + ", Name=" + Name
				+ ", price=" + price + ", type=" + type + ", color=" + color
				+ ", size=" + size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", shape=" + shape + ", eel=" + eel
				+ ", power=" + power + ", roughWeight=" + roughWeight
				+ ", useArea=" + useArea + ", dia=" + dia + ", gears=" + gears
				+ ", coutrolType=" + coutrolType + ", texture=" + texture
				+ ", attemperationType=" + attemperationType + ", warmType="
				+ warmType + ", warmSpeed=" + warmSpeed + ", function="
				+ function + ", style=" + style + ", capacityType="
				+ capacityType + ", firstCost=" + firstCost + "]";
	}

}
