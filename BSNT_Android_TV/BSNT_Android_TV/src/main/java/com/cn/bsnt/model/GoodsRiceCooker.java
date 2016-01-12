package com.cn.bsnt.model;

/** 电饭煲 */
public class GoodsRiceCooker {
	/** 编号 */
	private int id;
	/** 名称 */
	private String Name;
	/** 价格 */
	private double price;
	/** 型号 */
	private String type;
	/** 颜色 */
	private String color;
	/** 尺寸 */
	private String size;
	/** 品牌 */
	private String brand;
	/** 库存 */
	private String count;
	/** 月销量 */
	private String monthSales;
	/** 总销量 */
	private String totalSales;
	/** 描述 */
	private String desc;
	/** 类型 */
	private String mold;
	/** 功率 */
	private String power;
	/** 内胆材质 */
	private String innerTankTexture;
	/** 电压 */
	private String voltage;
	/** 加热方式 */
	private String warmType;
	/** 外形尺寸 */
	private String shapeSize;
	/** 外形 */
	private String shape;
	/** 出厂价 */
	private String firstCost;

	public GoodsRiceCooker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsRiceCooker(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc, String mold,
			String power, String innerTankTexture, String voltage,
			String warmType, String shapeSize, String shape, String firstCost) {
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
		this.mold = mold;
		this.power = power;
		this.innerTankTexture = innerTankTexture;
		this.voltage = voltage;
		this.warmType = warmType;
		this.shapeSize = shapeSize;
		this.shape = shape;
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

	public String getMold() {
		return mold;
	}

	public void setMold(String mold) {
		this.mold = mold;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getInnerTankTexture() {
		return innerTankTexture;
	}

	public void setInnerTankTexture(String innerTankTexture) {
		this.innerTankTexture = innerTankTexture;
	}

	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	public String getWarmType() {
		return warmType;
	}

	public void setWarmType(String warmType) {
		this.warmType = warmType;
	}

	public String getShapeSize() {
		return shapeSize;
	}

	public void setShapeSize(String shapeSize) {
		this.shapeSize = shapeSize;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFirstCost() {
		return firstCost;
	}

	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}

	@Override
	public String toString() {
		return "GoodsRiceCooker [id=" + id + ", Name=" + Name + ", price="
				+ price + ", type=" + type + ", color=" + color + ", size="
				+ size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", mold=" + mold + ", power=" + power
				+ ", innerTankTexture=" + innerTankTexture + ", voltage="
				+ voltage + ", warmType=" + warmType + ", shapeSize="
				+ shapeSize + ", shape=" + shape + ", firstCost=" + firstCost
				+ "]";
	}

}
