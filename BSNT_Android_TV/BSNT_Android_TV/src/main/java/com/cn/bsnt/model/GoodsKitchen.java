package com.cn.bsnt.model;

/** 厨房用品 */
public class GoodsKitchen { //

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
	/** 包装尺寸 */
	private String packSiz;
	/** 毛重 */
	private String tvRoughWeight;
	/** 件数 */
	private String numberCase;
	/** 图案 */
	private String packSize;
	/** 茶餐具工艺 */
	private String teaTablewareProcess;
	/** 风格 */
	private String Style;
	/** 价格区间 */
	private String PriceSection;
	/** 适用人数 */
	private String ApplyNumber;
	/** 材质 */
	private String Texrure;
	/** 产地 */
	private String ProductArea;
	/** 主图来源 */
	private String MasterMapSource;
	/** 餐具型号 */
	private String TablewareModel;
	/** 包装体积 */
	private String PackVolume;
	/** 是否有盖 */
	private String booleanSeal;
	/** 直径 */
	private String diameter;
	/** 适用对象 */
	private String applyObject;
	/** 特点 */
	private String feature;
	/** 锅盖类型 */
	private String PotCoverType;
	/** 锅盖直径尺寸值 */
	private String PotCoverDiameterSize;
	/** 深度 */
	private String depth;
	/** 容量 */
	private String capacity;
	/** 层数 */
	private String numberPlies;
	/** 锅底类型 */
	private String bottomPanType;
	/** 刀尖角度 */
	private String bladeAngle;
	/** 刃长 */
	private String bladeLength;
	/** 是否开刃 */
	private String booleanOpenBlade;
	/** 煲种类 */
	private String potType;
	/** 是否有赠品 */
	private String booleanGift;
	/** 出厂价 */
	private String firstCost;

	public GoodsKitchen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsKitchen(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc, String packSiz,
			String tvRoughWeight, String numberCase, String packSize,
			String teaTablewareProcess, String style, String priceSection,
			String applyNumber, String texrure, String productArea,
			String masterMapSource, String tablewareModel, String packVolume,
			String booleanSeal, String diameter, String applyObject,
			String feature, String potCoverType, String potCoverDiameterSize,
			String depth, String capacity, String numberPlies,
			String bottomPanType, String bladeAngle, String bladeLength,
			String booleanOpenBlade, String potType, String booleanGift,
			String firstCost) {

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
		this.packSiz = packSiz;
		this.tvRoughWeight = tvRoughWeight;
		this.numberCase = numberCase;
		this.packSize = packSize;
		this.teaTablewareProcess = teaTablewareProcess;
		Style = style;
		PriceSection = priceSection;
		ApplyNumber = applyNumber;
		Texrure = texrure;
		ProductArea = productArea;
		MasterMapSource = masterMapSource;
		TablewareModel = tablewareModel;
		PackVolume = packVolume;
		this.booleanSeal = booleanSeal;
		this.diameter = diameter;
		this.applyObject = applyObject;
		this.feature = feature;
		PotCoverType = potCoverType;
		PotCoverDiameterSize = potCoverDiameterSize;
		this.depth = depth;
		this.capacity = capacity;
		this.numberPlies = numberPlies;
		this.bottomPanType = bottomPanType;
		this.bladeAngle = bladeAngle;
		this.bladeLength = bladeLength;
		this.booleanOpenBlade = booleanOpenBlade;
		this.potType = potType;
		this.booleanGift = booleanGift;
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

	public String getPackSiz() {
		return packSiz;
	}

	public void setPackSiz(String packSiz) {
		this.packSiz = packSiz;
	}

	public String getTvRoughWeight() {
		return tvRoughWeight;
	}

	public void setTvRoughWeight(String tvRoughWeight) {
		this.tvRoughWeight = tvRoughWeight;
	}

	public String getNumberCase() {
		return numberCase;
	}

	public void setNumberCase(String numberCase) {
		this.numberCase = numberCase;
	}

	public String getPackSize() {
		return packSize;
	}

	public void setPackSize(String packSize) {
		this.packSize = packSize;
	}

	public String getTeaTablewareProcess() {
		return teaTablewareProcess;
	}

	public void setTeaTablewareProcess(String teaTablewareProcess) {
		this.teaTablewareProcess = teaTablewareProcess;
	}

	public String getStyle() {
		return Style;
	}

	public void setStyle(String style) {
		Style = style;
	}

	public String getPriceSection() {
		return PriceSection;
	}

	public void setPriceSection(String priceSection) {
		PriceSection = priceSection;
	}

	public String getApplyNumber() {
		return ApplyNumber;
	}

	public void setApplyNumber(String applyNumber) {
		ApplyNumber = applyNumber;
	}

	public String getTexrure() {
		return Texrure;
	}

	public void setTexrure(String texrure) {
		Texrure = texrure;
	}

	public String getProductArea() {
		return ProductArea;
	}

	public void setProductArea(String productArea) {
		ProductArea = productArea;
	}

	public String getMasterMapSource() {
		return MasterMapSource;
	}

	public void setMasterMapSource(String masterMapSource) {
		MasterMapSource = masterMapSource;
	}

	public String getTablewareModel() {
		return TablewareModel;
	}

	public void setTablewareModel(String tablewareModel) {
		TablewareModel = tablewareModel;
	}

	public String getPackVolume() {
		return PackVolume;
	}

	public void setPackVolume(String packVolume) {
		PackVolume = packVolume;
	}

	public String getBooleanSeal() {
		return booleanSeal;
	}

	public void setBooleanSeal(String booleanSeal) {
		this.booleanSeal = booleanSeal;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getApplyObject() {
		return applyObject;
	}

	public void setApplyObject(String applyObject) {
		this.applyObject = applyObject;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getPotCoverType() {
		return PotCoverType;
	}

	public void setPotCoverType(String potCoverType) {
		PotCoverType = potCoverType;
	}

	public String getPotCoverDiameterSize() {
		return PotCoverDiameterSize;
	}

	public void setPotCoverDiameterSize(String potCoverDiameterSize) {
		PotCoverDiameterSize = potCoverDiameterSize;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getNumberPlies() {
		return numberPlies;
	}

	public void setNumberPlies(String numberPlies) {
		this.numberPlies = numberPlies;
	}

	public String getBottomPanType() {
		return bottomPanType;
	}

	public void setBottomPanType(String bottomPanType) {
		this.bottomPanType = bottomPanType;
	}

	public String getBladeAngle() {
		return bladeAngle;
	}

	public void setBladeAngle(String bladeAngle) {
		this.bladeAngle = bladeAngle;
	}

	public String getBladeLength() {
		return bladeLength;
	}

	public void setBladeLength(String bladeLength) {
		this.bladeLength = bladeLength;
	}

	public String getBooleanOpenBlade() {
		return booleanOpenBlade;
	}

	public void setBooleanOpenBlade(String booleanOpenBlade) {
		this.booleanOpenBlade = booleanOpenBlade;
	}

	public String getPotType() {
		return potType;
	}

	public void setPotType(String potType) {
		this.potType = potType;
	}

	public String getBooleanGift() {
		return booleanGift;
	}

	public void setBooleanGift(String booleanGift) {
		this.booleanGift = booleanGift;
	}

	public String getFirstCost() {
		return firstCost;
	}

	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}

	@Override
	public String toString() {
		return "GoodKitchen [id=" + id + ", Name=" + Name + ", price=" + price
				+ ", type=" + type + ", color=" + color + ", size=" + size
				+ ", brand=" + brand + ", count=" + count + ", monthSales="
				+ monthSales + ", totalSales=" + totalSales + ", desc=" + desc
				+ ", packSiz=" + packSiz + ", tvRoughWeight=" + tvRoughWeight
				+ ", numberCase=" + numberCase + ", packSize=" + packSize
				+ ", teaTablewareProcess=" + teaTablewareProcess + ", Style="
				+ Style + ", PriceSection=" + PriceSection + ", ApplyNumber="
				+ ApplyNumber + ", Texrure=" + Texrure + ", ProductArea="
				+ ProductArea + ", MasterMapSource=" + MasterMapSource
				+ ", TablewareModel=" + TablewareModel + ", PackVolume="
				+ PackVolume + ", booleanSeal=" + booleanSeal + ", diameter="
				+ diameter + ", applyObject=" + applyObject + ", feature="
				+ feature + ", PotCoverType=" + PotCoverType
				+ ", PotCoverDiameterSize=" + PotCoverDiameterSize + ", depth="
				+ depth + ", capacity=" + capacity + ", numberPlies="
				+ numberPlies + ", bottomPanType=" + bottomPanType
				+ ", bladeAngle=" + bladeAngle + ", bladeLength=" + bladeLength
				+ ", booleanOpenBlade=" + booleanOpenBlade + ", potType="
				+ potType + ", booleanGift=" + booleanGift + ", firstCost="
				+ firstCost + "]";
	}

}
