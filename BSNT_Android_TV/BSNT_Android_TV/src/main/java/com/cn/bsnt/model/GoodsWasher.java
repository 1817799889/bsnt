package com.cn.bsnt.model;
/**洗衣机*/
public class GoodsWasher {
	/**洗衣机id*/
	private int id;
	/**名称*/
	private String Name;
	/**价格*/
	private double price;
	/**型号*/
	private String type;
	/**颜色*/	
	private String color;
	/**尺寸*/
	private String size;
	/**品牌*/
	private String brand;
	/**库存*/
	private String count;
	/**月销量*/
	private String monthSales;
	/**总销量*/
	private String totalSales;
	/**描述*/
	private String desc;
	/**能效等级*/
	private String eel;
	/**类型*/
	private String mold;
	/**洗涤重量*/
	private String washingMount;
	/**功率*/
	private String power;
	/**内筒材质*/
	private String innerTankTexure;
	/**箱体材质*/
	private String tankTexure;
	/**开合方式*/
	private String openCloseType;
	/**使用方式*/
	private String useType;
	/**电机类型*/
	private String dynamoType;
	/**排水方式*/
	private String drainageType;
	/**脱水功率*/
	private String rinedPower;
	/**洗衣流程*/
	private String washFlow;
	/**出厂价*/
	private String firstCost;
	public GoodsWasher() {
		// TODO Auto-generated constructor stub
	}
	public GoodsWasher(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc, String eel,
			String mold, String washingMount, String power,
			String innerTankTexure, String tankTexure, String openCloseType,
			String useType, String dynamoType, String drainageType,
			String rinedPower, String washFlow, String firstCost) {
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
		this.eel = eel;
		this.mold = mold;
		this.washingMount = washingMount;
		this.power = power;
		this.innerTankTexure = innerTankTexure;
		this.tankTexure = tankTexure;
		this.openCloseType = openCloseType;
		this.useType = useType;
		this.dynamoType = dynamoType;
		this.drainageType = drainageType;
		this.rinedPower = rinedPower;
		this.washFlow = washFlow;
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
	public String getEel() {
		return eel;
	}
	public void setEel(String eel) {
		this.eel = eel;
	}
	public String getMold() {
		return mold;
	}
	public void setMold(String mold) {
		this.mold = mold;
	}
	public String getWashingMount() {
		return washingMount;
	}
	public void setWashingMount(String washingMount) {
		this.washingMount = washingMount;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getInnerTankTexure() {
		return innerTankTexure;
	}
	public void setInnerTankTexure(String innerTankTexure) {
		this.innerTankTexure = innerTankTexure;
	}
	public String getTankTexure() {
		return tankTexure;
	}
	public void setTankTexure(String tankTexure) {
		this.tankTexure = tankTexure;
	}
	public String getOpenCloseType() {
		return openCloseType;
	}
	public void setOpenCloseType(String openCloseType) {
		this.openCloseType = openCloseType;
	}
	public String getUseType() {
		return useType;
	}
	public void setUseType(String useType) {
		this.useType = useType;
	}
	public String getDynamoType() {
		return dynamoType;
	}
	public void setDynamoType(String dynamoType) {
		this.dynamoType = dynamoType;
	}
	public String getDrainageType() {
		return drainageType;
	}
	public void setDrainageType(String drainageType) {
		this.drainageType = drainageType;
	}
	public String getRinedPower() {
		return rinedPower;
	}
	public void setRinedPower(String rinedPower) {
		this.rinedPower = rinedPower;
	}
	public String getWashFlow() {
		return washFlow;
	}
	public void setWashFlow(String washFlow) {
		this.washFlow = washFlow;
	}
	public String getFirstCost() {
		return firstCost;
	}
	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}
	@Override
	public String toString() {
		return "GoodsWasher [id=" + id + ", Name=" + Name + ", price=" + price
				+ ", type=" + type + ", color=" + color + ", size=" + size
				+ ", brand=" + brand + ", count=" + count + ", monthSales="
				+ monthSales + ", totalSales=" + totalSales + ", desc=" + desc
				+ ", eel=" + eel + ", mold=" + mold + ", washingMount="
				+ washingMount + ", power=" + power + ", innerTankTexure="
				+ innerTankTexure + ", tankTexure=" + tankTexure
				+ ", openCloseType=" + openCloseType + ", useType=" + useType
				+ ", dynamoType=" + dynamoType + ", drainageType="
				+ drainageType + ", rinedPower=" + rinedPower + ", washFlow="
				+ washFlow + ", firstCost=" + firstCost + "]";
	}
	
	
}
