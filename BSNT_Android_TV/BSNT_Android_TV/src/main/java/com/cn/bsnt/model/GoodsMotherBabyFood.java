package com.cn.bsnt.model;

/** 母婴食品 */
public class GoodsMotherBabyFood {
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
	/** 婴儿辅食 */
	private String babyBambix;
	/** 试用阶段 */
	private String applyStage;
	/** 包装种类 */
	private String packageKind;
	/** 产地 */
	private String productionPlace;
	/** 重量 */
	private String weight;
	/** 规格 */
	private String standard;
	/** 适用年龄 */
	private String applyAge;
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
	/** 材质 */
	private String texture;
	/** 功效 */
	private String effect;
	/** 货号 */
	private String artNumber;
	/** 是否进口 */
	private String booleanImpor;

	public GoodsMotherBabyFood() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsMotherBabyFood(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc, String packWay,
			String factorySite, String factoryPhone, String burdenSheet,
			String firstCost, String storeWay, String expirationDate,
			String foodAdditives, String babyBambix, String applyStage,
			String packageKind, String productionPlace, String weight,
			String standard, String applyAge, String saleArea,
			String packageWay, String series, String worksInitials,
			String kind, String texture, String effect, String artNumber,
			String booleanImpor) {

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
		this.babyBambix = babyBambix;
		this.applyStage = applyStage;
		this.packageKind = packageKind;
		this.productionPlace = productionPlace;
		this.weight = weight;
		this.standard = standard;
		this.applyAge = applyAge;
		this.saleArea = saleArea;
		this.packageWay = packageWay;
		this.series = series;
		this.worksInitials = worksInitials;
		this.kind = kind;
		this.texture = texture;
		this.effect = effect;
		this.artNumber = artNumber;
		this.booleanImpor = booleanImpor;
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

	public String getBabyBambix() {
		return babyBambix;
	}

	public void setBabyBambix(String babyBambix) {
		this.babyBambix = babyBambix;
	}

	public String getApplyStage() {
		return applyStage;
	}

	public void setApplyStage(String applyStage) {
		this.applyStage = applyStage;
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

	public String getApplyAge() {
		return applyAge;
	}

	public void setApplyAge(String applyAge) {
		this.applyAge = applyAge;
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

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getArtNumber() {
		return artNumber;
	}

	public void setArtNumber(String artNumber) {
		this.artNumber = artNumber;
	}

	public String getBooleanImpor() {
		return booleanImpor;
	}

	public void setBooleanImpor(String booleanImpor) {
		this.booleanImpor = booleanImpor;
	}

	@Override
	public String toString() {
		return "GoodsMotherBabyFood [id=" + id + ", Name=" + Name + ", price="
				+ price + ", type=" + type + ", color=" + color + ", size="
				+ size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", packWay=" + packWay + ", factorySite="
				+ factorySite + ", factoryPhone=" + factoryPhone
				+ ", burdenSheet=" + burdenSheet + ", firstCost=" + firstCost
				+ ", storeWay=" + storeWay + ", expirationDate="
				+ expirationDate + ", foodAdditives=" + foodAdditives
				+ ", babyBambix=" + babyBambix + ", applyStage=" + applyStage
				+ ", packageKind=" + packageKind + ", productionPlace="
				+ productionPlace + ", weight=" + weight + ", standard="
				+ standard + ", applyAge=" + applyAge + ", saleArea="
				+ saleArea + ", packageWay=" + packageWay + ", series="
				+ series + ", worksInitials=" + worksInitials + ", kind="
				+ kind + ", texture=" + texture + ", effect=" + effect
				+ ", artNumber=" + artNumber + ", booleanImpor=" + booleanImpor
				+ "]";
	}

}
