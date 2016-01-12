package com.cn.bsnt.model;
/** 健身器材ID */
public class GoodsFitnessEquipment {
	/** 健身器材*/
	private int id;
	/** 名称*/
	private String name;
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
	/** 出厂价 */
	private String firstCost;
	/** 货号*/
	private String artNumber;
	/** 适用人数*/
	private String applyNumberPeople;
	/** 健身器材分类*/
	private String fitnessEquipent;
	/** 适用对象*/
	private String applyObject;
	/** 健身效果选择*/
	private String fitnessEffectChoice;
	/** 是否商场同款*/
	private String booleanSameShopping;
	/** 教学模式*/
	private String teachingPattern;
	/** 腕力器类型*/
	private String powerWristType;
	/** 单双杠类型*/
	private String firstsdType;
	/** 哑铃分类*/
	private String dumbbell; 
	/** 拉力器类型*/
	private String wallPulley;
	/** 跑步机类型*/
	private String treadmillType;
	/** 售后服务*/
	private String afterSaleService;
	/** 心率测试*/
	private String hreatRateTest;
	/** 是否可折叠*/
	private String booleanFold;	
	/** 驱动类型*/
	private String driverType;
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
	public String getArtNumber() {
		return artNumber;
	}
	public void setArtNumber(String artNumber) {
		this.artNumber = artNumber;
	}
	public String getApplyNumberPeople() {
		return applyNumberPeople;
	}
	public void setApplyNumberPeople(String applyNumberPeople) {
		this.applyNumberPeople = applyNumberPeople;
	}
	public String getFitnessEquipent() {
		return fitnessEquipent;
	}
	public void setFitnessEquipent(String fitnessEquipent) {
		this.fitnessEquipent = fitnessEquipent;
	}
	public String getApplyObject() {
		return applyObject;
	}
	public void setApplyObject(String applyObject) {
		this.applyObject = applyObject;
	}
	public String getFitnessEffectChoice() {
		return fitnessEffectChoice;
	}
	public void setFitnessEffectChoice(String fitnessEffectChoice) {
		this.fitnessEffectChoice = fitnessEffectChoice;
	}
	public String getBooleanSameShopping() {
		return booleanSameShopping;
	}
	public void setBooleanSameShopping(String booleanSameShopping) {
		this.booleanSameShopping = booleanSameShopping;
	}
	public String getTeachingPattern() {
		return teachingPattern;
	}
	public void setTeachingPattern(String teachingPattern) {
		this.teachingPattern = teachingPattern;
	}
	public String getPowerWristType() {
		return powerWristType;
	}
	public void setPowerWristType(String powerWristType) {
		this.powerWristType = powerWristType;
	}
	public String getFirstsdType() {
		return firstsdType;
	}
	public void setFirstsdType(String firstsdType) {
		this.firstsdType = firstsdType;
	}
	public String getDumbbell() {
		return dumbbell;
	}
	public void setDumbbell(String dumbbell) {
		this.dumbbell = dumbbell;
	}
	public String getWallPulley() {
		return wallPulley;
	}
	public void setWallPulley(String wallPulley) {
		this.wallPulley = wallPulley;
	}
	public String getTreadmillType() {
		return treadmillType;
	}
	public void setTreadmillType(String treadmillType) {
		this.treadmillType = treadmillType;
	}
	public String getAfterSaleService() {
		return afterSaleService;
	}
	public void setAfterSaleService(String afterSaleService) {
		this.afterSaleService = afterSaleService;
	}
	public String getHreatRateTest() {
		return hreatRateTest;
	}
	public void setHreatRateTest(String hreatRateTest) {
		this.hreatRateTest = hreatRateTest;
	}
	public String getBooleanFold() {
		return booleanFold;
	}
	public void setBooleanFold(String booleanFold) {
		this.booleanFold = booleanFold;
	}
	public String getDriverType() {
		return driverType;
	}
	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}
	public GoodsFitnessEquipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsFitnessEquipment(int id, String name, double price,
			String type, String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String firstCost, String artNumber, String applyNumberPeople,
			String fitnessEquipent, String applyObject,
			String fitnessEffectChoice, String booleanSameShopping,
			String teachingPattern, String powerWristType, String firstsdType,
			String dumbbell, String wallPulley, String treadmillType,
			String afterSaleService, String hreatRateTest, String booleanFold,
			String driverType) {
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
		this.artNumber = artNumber;
		this.applyNumberPeople = applyNumberPeople;
		this.fitnessEquipent = fitnessEquipent;
		this.applyObject = applyObject;
		this.fitnessEffectChoice = fitnessEffectChoice;
		this.booleanSameShopping = booleanSameShopping;
		this.teachingPattern = teachingPattern;
		this.powerWristType = powerWristType;
		this.firstsdType = firstsdType;
		this.dumbbell = dumbbell;
		this.wallPulley = wallPulley;
		this.treadmillType = treadmillType;
		this.afterSaleService = afterSaleService;
		this.hreatRateTest = hreatRateTest;
		this.booleanFold = booleanFold;
		this.driverType = driverType;
	}
	
	

}
