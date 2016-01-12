package com.cn.bsnt.model;

/** ������Ʒ */
public class GoodsOutdoorGoods {
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
	/** ������ */
	private String firstCost;
	/** ���� */
	private String artNumber;
	/** ���� */
	private String texture;
	/** ���� */
	private String productiongArea;
	/** �˶�������Ŀ */
	private String sportsOutdoorProject;
	/** �Ƿ��ˮ */
	private String booleanWaterproof;
	/** ��������ʱ�� */
	private String continuousLightTime;
	/** ������� */
	private String irradiationDistance;
	/** ͷ������ */
	private String filletType;
	/** �������� */
	private String bulbKind;
	/** ��ع�� */
	private String cellStandard;
	/** ���� */
	private String weight;
	/** ���˷�ˮָ�� */
	private String outsideTentWaterproofIndex;
	/** ֧�ܲ��� */
	private String holderTexture;
	/** ���˲��� */
	private String outsideTentTexture;
	/** ֧�ܳŸ�ֱ�� */
	private String holderJackstayDiamater;
	/** ֧�ܳŸ� */
	private String holderJackstay;
	/** �۸����� */
	private String priceSection;
	/** �������� */
	private String ratioType;
	/** ��߱��� */
	private String maxMultiples;
	/** ���� */
	private String function;
	/** ʹ�÷�ʽ */
	private String useWay;
	/** ��λ */
	private String tapPosition;
	/** ʹ��ʱ�� */
	private String useTime;
	/** ���û��� */
	private String applyEnvironment;
	/** ������� */
	private String maxHeightLuminance;
	/** �Ƿ�ɵ��� */
	private String booleanFocus;
	/** ���� */
	private String length;
	/** �Ƿ�ɳ�� */
	private String booleanElectricize;
	/** ������ */
	private String maxGunshot;
	/** �����С */
	private String tentSize;
	/** ����ṹ */
	private String tentStructure;
	/** ���� */
	private String setUpSituation;
	/** չ���ߴ� */
	private String unfoldSize;
	/** ���ü��� */
	private String applySeason;
	/** �ռ�ṹ */
	private String tentSpaceStructure;
	/** �ʵײ��� */
	private String tentLowTexture;
	/** �ʵ׷�ˮָ�� */
	private String tentLowWaterproofIndex;
	/** �������� */
	private String applyNumberPeople;
	/** ��� */
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
