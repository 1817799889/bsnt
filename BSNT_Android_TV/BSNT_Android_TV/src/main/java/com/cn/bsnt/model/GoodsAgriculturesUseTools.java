package com.cn.bsnt.model;
/** 农用工具*/
public class GoodsAgriculturesUseTools {
	/** 农用工具ID*/
	private int id;
	/** 名称*/
	private String name;
	/** 价格*/
	private double price;
	/** 型号*/
	private String type; 
	/** 颜色*/
	private String color; 
	/** 尺寸*/
	private String size; 
	/** 品牌*/
	private String brand; 
	/** 库存*/
	private String count; 
	/** 月销量*/
	private String monthSales; 
	/** 总销量*/
	private String totalSales; 
	/** 描述*/
	private String desc; 
	/** 出厂价*/
	private String firstCost; 
	/** 刀尖角度*/
	private String bladeAngle; 
	/** 刀柄材质*/
	private String hiltTexture; 
	/** 刀柄长度*/
	private String hiltLength; 
	/** 刃长*/
	private String bladeLength; 
	/** 形状*/
	private String shape; 
	/** 是否开刃*/
	private String booleanOpenBlade; 
	/** 手柄材质*/
	private String handShnakTexture; 
	/** 是否带锯齿*/
	private String booleanTakeSawtooth; 
	/** 是否可折叠*/
	private String booleanFold; 
	/** 适用行业*/
	private String applyTrade; 
	/** 齿数*/
	private String teethNumber; 
	/** 材质*/
	private String texture; 
	/** 结构*/
	private String structure; 

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

	public String getBladeAngle() {
		return bladeAngle;
	}

	public void setBladeAngle(String bladeAngle) {
		this.bladeAngle = bladeAngle;
	}

	public String getHiltTexture() {
		return hiltTexture;
	}

	public void setHiltTexture(String hiltTexture) {
		this.hiltTexture = hiltTexture;
	}

	public String getHiltLength() {
		return hiltLength;
	}

	public void setHiltLength(String hiltLength) {
		this.hiltLength = hiltLength;
	}

	public String getBladeLength() {
		return bladeLength;
	}

	public void setBladeLength(String bladeLength) {
		this.bladeLength = bladeLength;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getBooleanOpenBlade() {
		return booleanOpenBlade;
	}

	public void setBooleanOpenBlade(String booleanOpenBlade) {
		this.booleanOpenBlade = booleanOpenBlade;
	}

	public String getHandShnakTexture() {
		return handShnakTexture;
	}

	public void setHandShnakTexture(String handShnakTexture) {
		this.handShnakTexture = handShnakTexture;
	}

	public String getBooleanTakeSawtooth() {
		return booleanTakeSawtooth;
	}

	public void setBooleanTakeSawtooth(String booleanTakeSawtooth) {
		this.booleanTakeSawtooth = booleanTakeSawtooth;
	}

	public String getBooleanFold() {
		return booleanFold;
	}

	public void setBooleanFold(String booleanFold) {
		this.booleanFold = booleanFold;
	}

	public String getApplyTrade() {
		return applyTrade;
	}

	public void setApplyTrade(String applyTrade) {
		this.applyTrade = applyTrade;
	}

	public String getTeethNumber() {
		return teethNumber;
	}

	public void setTeethNumber(String teethNumber) {
		this.teethNumber = teethNumber;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public GoodsAgriculturesUseTools() {
		super();
		 //TODO Auto-generated constructor stub
	}

	public GoodsAgriculturesUseTools(int id, String name, double price,
			String type, String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String firstCost, String bladeAngle, String hiltTexture,
			String hiltLength, String bladeLength, String shape,
			String booleanOpenBlade, String handShnakTexture,
			String booleanTakeSawtooth, String booleanFold, String applyTrade,
			String teethNumber, String texture, String structure) {
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
		this.bladeAngle = bladeAngle;
		this.hiltTexture = hiltTexture;
		this.hiltLength = hiltLength;
		this.bladeLength = bladeLength;
		this.shape = shape;
		this.booleanOpenBlade = booleanOpenBlade;
		this.handShnakTexture = handShnakTexture;
		this.booleanTakeSawtooth = booleanTakeSawtooth;
		this.booleanFold = booleanFold;
		this.applyTrade = applyTrade;
		this.teethNumber = teethNumber;
		this.texture = texture;
		this.structure = structure;
	}

}
