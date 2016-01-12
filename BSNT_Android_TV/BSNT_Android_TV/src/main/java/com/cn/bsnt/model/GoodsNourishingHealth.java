package com.cn.bsnt.model;

/** 滋补养生 */
public class GoodsNourishingHealth {
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
	/** 包装方式 */
	private String packWay;
	/** 厂址 */
	private String factorySite;
	/** 厂家联系电话 */
	private String factoryPhone;
	/** 配料表 */
	private String burdenSheet;
	/** 出厂价 */
	private String firstCost;
	/** 储藏方法 */
	private String storeWay;
	/** 保质期 */
	private String expirationDate;
	/** 食品添加剂 */
	private String foodAdditives;
	/** 包装种类 */
	private String packageKind;
	/** 产地 */
	private String productionPlace;
	/** 重量 */
	private String weight;
	/** 规格 */
	private String standard;
	/** 销售地 */
	private String saleArea;
	/** 包装方式 */
	private String packageWay;
	/** 系列 */
	private String series;
	/** 厂名 */
	private String worksInitials;
	/** 种类 */
	private String kind;
	/** 货号 */
	private String artNumber;
	/** 口味 */
	private String taste;
	/** 特产品类 */
	private String specialtyCateGory;
	/** 食品类型 */
	private String foodType;
	/** 级别 */
	private String level;
	/** 套餐周期 */
	private String comboCycle;
	/** 套餐份量 */
	private String comboWeight;
	/** 适用对象 */
	private String applyObject;
	/** 形状 */
	private String shape;
	/** 品质 */
	private String quality;
	/** 是否是有机食品 */
	private String booleanOrganicFood;
	/** 是否含糖 */
	private String booleanIncludeSugar;

	public GoodsNourishingHealth() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsNourishingHealth(int id, String name, double price,
			String type, String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc, String packWay,
			String factorySite, String factoryPhone, String burdenSheet,
			String firstCost, String storeWay, String expirationDate,
			String foodAdditives, String packageKind, String productionPlace,
			String weight, String standard, String saleArea, String packageWay,
			String series, String worksInitials, String kind, String artNumber,
			String taste, String specialtyCateGory, String foodType,
			String level, String comboCycle, String comboWeight,
			String applyObject, String shape, String quality,
			String booleanOrganicFood, String booleanIncludeSugar) {
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
		this.packWay = packWay;
		this.factorySite = factorySite;
		this.factoryPhone = factoryPhone;
		this.burdenSheet = burdenSheet;
		this.firstCost = firstCost;
		this.storeWay = storeWay;
		this.expirationDate = expirationDate;
		this.foodAdditives = foodAdditives;
		this.packageKind = packageKind;
		this.productionPlace = productionPlace;
		this.weight = weight;
		this.standard = standard;
		this.saleArea = saleArea;
		this.packageWay = packageWay;
		this.series = series;
		this.worksInitials = worksInitials;
		this.kind = kind;
		this.artNumber = artNumber;
		this.taste = taste;
		this.specialtyCateGory = specialtyCateGory;
		this.foodType = foodType;
		this.level = level;
		this.comboCycle = comboCycle;
		this.comboWeight = comboWeight;
		this.applyObject = applyObject;
		this.shape = shape;
		this.quality = quality;
		this.booleanOrganicFood = booleanOrganicFood;
		this.booleanIncludeSugar = booleanIncludeSugar;
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

	public String getPackWay() {
		return packWay;
	}

	public void setPackWay(String packWay) {
		this.packWay = packWay;
	}

	public String getFactorySite() {
		return factorySite;
	}

	public void setFactorySite(String factorySite) {
		this.factorySite = factorySite;
	}

	public String getFactoryPhone() {
		return factoryPhone;
	}

	public void setFactoryPhone(String factoryPhone) {
		this.factoryPhone = factoryPhone;
	}

	public String getBurdenSheet() {
		return burdenSheet;
	}

	public void setBurdenSheet(String burdenSheet) {
		this.burdenSheet = burdenSheet;
	}

	public String getFirstCost() {
		return firstCost;
	}

	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}

	public String getStoreWay() {
		return storeWay;
	}

	public void setStoreWay(String storeWay) {
		this.storeWay = storeWay;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getFoodAdditives() {
		return foodAdditives;
	}

	public void setFoodAdditives(String foodAdditives) {
		this.foodAdditives = foodAdditives;
	}

	public String getPackageKind() {
		return packageKind;
	}

	public void setPackageKind(String packageKind) {
		this.packageKind = packageKind;
	}

	public String getProductionPlace() {
		return productionPlace;
	}

	public void setProductionPlace(String productionPlace) {
		this.productionPlace = productionPlace;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getSaleArea() {
		return saleArea;
	}

	public void setSaleArea(String saleArea) {
		this.saleArea = saleArea;
	}

	public String getPackageWay() {
		return packageWay;
	}

	public void setPackageWay(String packageWay) {
		this.packageWay = packageWay;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getWorksInitials() {
		return worksInitials;
	}

	public void setWorksInitials(String worksInitials) {
		this.worksInitials = worksInitials;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getArtNumber() {
		return artNumber;
	}

	public void setArtNumber(String artNumber) {
		this.artNumber = artNumber;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getSpecialtyCateGory() {
		return specialtyCateGory;
	}

	public void setSpecialtyCateGory(String specialtyCateGory) {
		this.specialtyCateGory = specialtyCateGory;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getComboCycle() {
		return comboCycle;
	}

	public void setComboCycle(String comboCycle) {
		this.comboCycle = comboCycle;
	}

	public String getComboWeight() {
		return comboWeight;
	}

	public void setComboWeight(String comboWeight) {
		this.comboWeight = comboWeight;
	}

	public String getApplyObject() {
		return applyObject;
	}

	public void setApplyObject(String applyObject) {
		this.applyObject = applyObject;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getBooleanOrganicFood() {
		return booleanOrganicFood;
	}

	public void setBooleanOrganicFood(String booleanOrganicFood) {
		this.booleanOrganicFood = booleanOrganicFood;
	}

	public String getBooleanIncludeSugar() {
		return booleanIncludeSugar;
	}

	public void setBooleanIncludeSugar(String booleanIncludeSugar) {
		this.booleanIncludeSugar = booleanIncludeSugar;
	}

	@Override
	public String toString() {
		return "GoodsNourishingHealth [id=" + id + ", Name=" + Name
				+ ", price=" + price + ", type=" + type + ", color=" + color
				+ ", size=" + size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", packWay=" + packWay + ", factorySite="
				+ factorySite + ", factoryPhone=" + factoryPhone
				+ ", burdenSheet=" + burdenSheet + ", firstCost=" + firstCost
				+ ", storeWay=" + storeWay + ", expirationDate="
				+ expirationDate + ", foodAdditives=" + foodAdditives
				+ ", packageKind=" + packageKind + ", productionPlace="
				+ productionPlace + ", weight=" + weight + ", standard="
				+ standard + ", saleArea=" + saleArea + ", packageWay="
				+ packageWay + ", series=" + series + ", worksInitials="
				+ worksInitials + ", kind=" + kind + ", artNumber=" + artNumber
				+ ", taste=" + taste + ", specialtyCateGory="
				+ specialtyCateGory + ", foodType=" + foodType + ", level="
				+ level + ", comboCycle=" + comboCycle + ", comboWeight="
				+ comboWeight + ", applyObject=" + applyObject + ", shape="
				+ shape + ", quality=" + quality + ", booleanOrganicFood="
				+ booleanOrganicFood + ", booleanIncludeSugar="
				+ booleanIncludeSugar + "]";
	}

}
