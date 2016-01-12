package com.cn.bsnt.model;

/** 户外用品 */
public class GoodsOutdoorGoods {
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
	/** 出厂价 */
	private String firstCost;
	/** 货号 */
	private String artNumber;
	/** 材质 */
	private String texture;
	/** 产地 */
	private String productiongArea;
	/** 运动户外项目 */
	private String sportsOutdoorProject;
	/** 是否防水 */
	private String booleanWaterproof;
	/** 连续照明时间 */
	private String continuousLightTime;
	/** 照射距离 */
	private String irradiationDistance;
	/** 头带类型 */
	private String filletType;
	/** 灯泡种类 */
	private String bulbKind;
	/** 电池规格 */
	private String cellStandard;
	/** 重量 */
	private String weight;
	/** 外账防水指数 */
	private String outsideTentWaterproofIndex;
	/** 支架材质 */
	private String holderTexture;
	/** 外账材质 */
	private String outsideTentTexture;
	/** 支架撑杆直径 */
	private String holderJackstayDiamater;
	/** 支架撑杆 */
	private String holderJackstay;
	/** 价格区间 */
	private String priceSection;
	/** 倍率类型 */
	private String ratioType;
	/** 最高倍数 */
	private String maxMultiples;
	/** 功能 */
	private String function;
	/** 使用方式 */
	private String useWay;
	/** 档位 */
	private String tapPosition;
	/** 使用时间 */
	private String useTime;
	/** 适用环境 */
	private String applyEnvironment;
	/** 最高亮度 */
	private String maxHeightLuminance;
	/** 是否可调焦 */
	private String booleanFocus;
	/** 长度 */
	private String length;
	/** 是否可充电 */
	private String booleanElectricize;
	/** 最大射程 */
	private String maxGunshot;
	/** 帐篷大小 */
	private String tentSize;
	/** 帐篷结构 */
	private String tentStructure;
	/** 搭建情况 */
	private String setUpSituation;
	/** 展开尺寸 */
	private String unfoldSize;
	/** 适用季节 */
	private String applySeason;
	/** 空间结构 */
	private String tentSpaceStructure;
	/** 帐底材质 */
	private String tentLowTexture;
	/** 帐底防水指数 */
	private String tentLowWaterproofIndex;
	/** 适用人数 */
	private String applyNumberPeople;
	/** 规格 */
	private String standard;

	public GoodsOutdoorGoods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsOutdoorGoods(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String firstCost, String artNumber, String texture,
			String productiongArea, String sportsOutdoorProject,
			String booleanWaterproof, String continuousLightTime,
			String irradiationDistance, String filletType, String bulbKind,
			String cellStandard, String weight,
			String outsideTentWaterproofIndex, String holderTexture,
			String outsideTentTexture, String holderJackstayDiamater,
			String holderJackstay, String priceSection, String ratioType,
			String maxMultiples, String function, String useWay,
			String tapPosition, String useTime, String applyEnvironment,
			String maxHeightLuminance, String booleanFocus, String length,
			String booleanElectricize, String maxGunshot, String tentSize,
			String tentStructure, String setUpSituation, String unfoldSize,
			String applySeason, String tentSpaceStructure,
			String tentLowTexture, String tentLowWaterproofIndex,
			String applyNumberPeople, String standard) {
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
		this.firstCost = firstCost;
		this.artNumber = artNumber;
		this.texture = texture;
		this.productiongArea = productiongArea;
		this.sportsOutdoorProject = sportsOutdoorProject;
		this.booleanWaterproof = booleanWaterproof;
		this.continuousLightTime = continuousLightTime;
		this.irradiationDistance = irradiationDistance;
		this.filletType = filletType;
		this.bulbKind = bulbKind;
		this.cellStandard = cellStandard;
		this.weight = weight;
		this.outsideTentWaterproofIndex = outsideTentWaterproofIndex;
		this.holderTexture = holderTexture;
		this.outsideTentTexture = outsideTentTexture;
		this.holderJackstayDiamater = holderJackstayDiamater;
		this.holderJackstay = holderJackstay;
		this.priceSection = priceSection;
		this.ratioType = ratioType;
		this.maxMultiples = maxMultiples;
		this.function = function;
		this.useWay = useWay;
		this.tapPosition = tapPosition;
		this.useTime = useTime;
		this.applyEnvironment = applyEnvironment;
		this.maxHeightLuminance = maxHeightLuminance;
		this.booleanFocus = booleanFocus;
		this.length = length;
		this.booleanElectricize = booleanElectricize;
		this.maxGunshot = maxGunshot;
		this.tentSize = tentSize;
		this.tentStructure = tentStructure;
		this.setUpSituation = setUpSituation;
		this.unfoldSize = unfoldSize;
		this.applySeason = applySeason;
		this.tentSpaceStructure = tentSpaceStructure;
		this.tentLowTexture = tentLowTexture;
		this.tentLowWaterproofIndex = tentLowWaterproofIndex;
		this.applyNumberPeople = applyNumberPeople;
		this.standard = standard;
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

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getProductiongArea() {
		return productiongArea;
	}

	public void setProductiongArea(String productiongArea) {
		this.productiongArea = productiongArea;
	}

	public String getSportsOutdoorProject() {
		return sportsOutdoorProject;
	}

	public void setSportsOutdoorProject(String sportsOutdoorProject) {
		this.sportsOutdoorProject = sportsOutdoorProject;
	}

	public String getBooleanWaterproof() {
		return booleanWaterproof;
	}

	public void setBooleanWaterproof(String booleanWaterproof) {
		this.booleanWaterproof = booleanWaterproof;
	}

	public String getContinuousLightTime() {
		return continuousLightTime;
	}

	public void setContinuousLightTime(String continuousLightTime) {
		this.continuousLightTime = continuousLightTime;
	}

	public String getIrradiationDistance() {
		return irradiationDistance;
	}

	public void setIrradiationDistance(String irradiationDistance) {
		this.irradiationDistance = irradiationDistance;
	}

	public String getFilletType() {
		return filletType;
	}

	public void setFilletType(String filletType) {
		this.filletType = filletType;
	}

	public String getBulbKind() {
		return bulbKind;
	}

	public void setBulbKind(String bulbKind) {
		this.bulbKind = bulbKind;
	}

	public String getCellStandard() {
		return cellStandard;
	}

	public void setCellStandard(String cellStandard) {
		this.cellStandard = cellStandard;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getOutsideTentWaterproofIndex() {
		return outsideTentWaterproofIndex;
	}

	public void setOutsideTentWaterproofIndex(String outsideTentWaterproofIndex) {
		this.outsideTentWaterproofIndex = outsideTentWaterproofIndex;
	}

	public String getHolderTexture() {
		return holderTexture;
	}

	public void setHolderTexture(String holderTexture) {
		this.holderTexture = holderTexture;
	}

	public String getOutsideTentTexture() {
		return outsideTentTexture;
	}

	public void setOutsideTentTexture(String outsideTentTexture) {
		this.outsideTentTexture = outsideTentTexture;
	}

	public String getHolderJackstayDiamater() {
		return holderJackstayDiamater;
	}

	public void setHolderJackstayDiamater(String holderJackstayDiamater) {
		this.holderJackstayDiamater = holderJackstayDiamater;
	}

	public String getHolderJackstay() {
		return holderJackstay;
	}

	public void setHolderJackstay(String holderJackstay) {
		this.holderJackstay = holderJackstay;
	}

	public String getPriceSection() {
		return priceSection;
	}

	public void setPriceSection(String priceSection) {
		this.priceSection = priceSection;
	}

	public String getRatioType() {
		return ratioType;
	}

	public void setRatioType(String ratioType) {
		this.ratioType = ratioType;
	}

	public String getMaxMultiples() {
		return maxMultiples;
	}

	public void setMaxMultiples(String maxMultiples) {
		this.maxMultiples = maxMultiples;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getUseWay() {
		return useWay;
	}

	public void setUseWay(String useWay) {
		this.useWay = useWay;
	}

	public String getTapPosition() {
		return tapPosition;
	}

	public void setTapPosition(String tapPosition) {
		this.tapPosition = tapPosition;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public String getApplyEnvironment() {
		return applyEnvironment;
	}

	public void setApplyEnvironment(String applyEnvironment) {
		this.applyEnvironment = applyEnvironment;
	}

	public String getMaxHeightLuminance() {
		return maxHeightLuminance;
	}

	public void setMaxHeightLuminance(String maxHeightLuminance) {
		this.maxHeightLuminance = maxHeightLuminance;
	}

	public String getBooleanFocus() {
		return booleanFocus;
	}

	public void setBooleanFocus(String booleanFocus) {
		this.booleanFocus = booleanFocus;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getBooleanElectricize() {
		return booleanElectricize;
	}

	public void setBooleanElectricize(String booleanElectricize) {
		this.booleanElectricize = booleanElectricize;
	}

	public String getMaxGunshot() {
		return maxGunshot;
	}

	public void setMaxGunshot(String maxGunshot) {
		this.maxGunshot = maxGunshot;
	}

	public String getTentSize() {
		return tentSize;
	}

	public void setTentSize(String tentSize) {
		this.tentSize = tentSize;
	}

	public String getTentStructure() {
		return tentStructure;
	}

	public void setTentStructure(String tentStructure) {
		this.tentStructure = tentStructure;
	}

	public String getSetUpSituation() {
		return setUpSituation;
	}

	public void setSetUpSituation(String setUpSituation) {
		this.setUpSituation = setUpSituation;
	}

	public String getUnfoldSize() {
		return unfoldSize;
	}

	public void setUnfoldSize(String unfoldSize) {
		this.unfoldSize = unfoldSize;
	}

	public String getApplySeason() {
		return applySeason;
	}

	public void setApplySeason(String applySeason) {
		this.applySeason = applySeason;
	}

	public String getTentSpaceStructure() {
		return tentSpaceStructure;
	}

	public void setTentSpaceStructure(String tentSpaceStructure) {
		this.tentSpaceStructure = tentSpaceStructure;
	}

	public String getTentLowTexture() {
		return tentLowTexture;
	}

	public void setTentLowTexture(String tentLowTexture) {
		this.tentLowTexture = tentLowTexture;
	}

	public String getTentLowWaterproofIndex() {
		return tentLowWaterproofIndex;
	}

	public void setTentLowWaterproofIndex(String tentLowWaterproofIndex) {
		this.tentLowWaterproofIndex = tentLowWaterproofIndex;
	}

	public String getApplyNumberPeople() {
		return applyNumberPeople;
	}

	public void setApplyNumberPeople(String applyNumberPeople) {
		this.applyNumberPeople = applyNumberPeople;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "GoodsOutdoorGoods [id=" + id + ", Name=" + Name + ", price="
				+ price + ", type=" + type + ", color=" + color + ", size="
				+ size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", firstCost=" + firstCost
				+ ", artNumber=" + artNumber + ", texture=" + texture
				+ ", productiongArea=" + productiongArea
				+ ", sportsOutdoorProject=" + sportsOutdoorProject
				+ ", booleanWaterproof=" + booleanWaterproof
				+ ", continuousLightTime=" + continuousLightTime
				+ ", irradiationDistance=" + irradiationDistance
				+ ", filletType=" + filletType + ", bulbKind=" + bulbKind
				+ ", cellStandard=" + cellStandard + ", weight=" + weight
				+ ", outsideTentWaterproofIndex=" + outsideTentWaterproofIndex
				+ ", holderTexture=" + holderTexture + ", outsideTentTexture="
				+ outsideTentTexture + ", holderJackstayDiamater="
				+ holderJackstayDiamater + ", holderJackstay=" + holderJackstay
				+ ", priceSection=" + priceSection + ", ratioType=" + ratioType
				+ ", maxMultiples=" + maxMultiples + ", function=" + function
				+ ", useWay=" + useWay + ", tapPosition=" + tapPosition
				+ ", useTime=" + useTime + ", applyEnvironment="
				+ applyEnvironment + ", maxHeightLuminance="
				+ maxHeightLuminance + ", booleanFocus=" + booleanFocus
				+ ", length=" + length + ", booleanElectricize="
				+ booleanElectricize + ", maxGunshot=" + maxGunshot
				+ ", tentSize=" + tentSize + ", tentStructure=" + tentStructure
				+ ", setUpSituation=" + setUpSituation + ", unfoldSize="
				+ unfoldSize + ", applySeason=" + applySeason
				+ ", tentSpaceStructure=" + tentSpaceStructure
				+ ", tentLowTexture=" + tentLowTexture
				+ ", tentLowWaterproofIndex=" + tentLowWaterproofIndex
				+ ", applyNumberPeople=" + applyNumberPeople + ", standard="
				+ standard + "]";
	}

}
