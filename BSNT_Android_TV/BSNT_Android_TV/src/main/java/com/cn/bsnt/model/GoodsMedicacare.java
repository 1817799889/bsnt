package com.cn.bsnt.model;

/** 医疗保健*/
public class GoodsMedicacare {
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
	/** 产地 */
	private String productionArea;
	/** 功能 */
	private String function;
	/** 型号 */
	private String model;
	/** 增值服务 */
	private String appreciation;
	/** 疾病 */
	private String disease;
	/** 症状 */
	private String symptom;
	/** 适用人群 */
	private String applyThrong;
	/** 适用部位 */
	private String applyPart;
	/** 选购热点 */
	private String chooseHotspot;
	/** 按摩手法 */
	private String massageManipulation;
	/** 外观形状 */
	private String apparentShape;
	/** 控制方式 */
	private String controlWay;
	/** 按摩头个数 */
	private String massageHeadNumber;
	/** 电源方式 */
	private String powerWay;
	/** 理疗方式分类 */
	private String therapyWayClassiFication;
	/** 按摩原理 */
	private String massagePrincipie;
	/** 身体护理部位 */
	private String careBodyParts;
	/** 护具种类 */
	private String protectiveClothing;
	/** 运动户外项目 */
	private String sportsOutdoorProject;
	/** 是否商品同款 */
	private String BooleaAameShopping;
	/** 排水方式 */
	private String drainageMethEd;
	/** 是否有提手装置 */
	private String booleanHandleDevice;
	/** 水位高度 */
	private String waterStageHeight;
	/** 是否带药盒装置 */
	private String booleanMedicineBox;
	/** 是否带防水盖装置 */
	private String booleanWaterproofCoverDevice;
	/** 是否带移动滚轮 */
	private String booleanShiftingRoller;
	/** 售后服务 */
	private String afterSaleService;
	/** 功率 */
	private String power;
	/** 款式 */
	private String style;
	/** 货号 */
	private String artNumber;
	/** 孔数 */
	private String holeCount;
	/** 形状 */
	private String shape;
	/** 温炙器类型 */
	private String wenApparatusType;
	/** 适用场景 */
	private String applySence;

	public GoodsMedicacare() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsMedicacare(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String firstCost, String productionArea, String function,
			String model, String appreciation, String disease, String symptom,
			String applyThrong, String applyPart, String chooseHotspot,
			String massageManipulation, String apparentShape,
			String controlWay, String massageHeadNumber, String powerWay,
			String therapyWayClassiFication, String massagePrincipie,
			String careBodyParts, String protectiveClothing,
			String sportsOutdoorProject, String booleaAameShopping,
			String drainageMethEd, String booleanHandleDevice,
			String waterStageHeight, String booleanMedicineBox,
			String booleanWaterproofCoverDevice, String booleanShiftingRoller,
			String afterSaleService, String power, String style,
			String artNumber, String holeCount, String shape,
			String wenApparatusType, String applySence) {

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
		this.productionArea = productionArea;
		this.function = function;
		this.model = model;
		this.appreciation = appreciation;
		this.disease = disease;
		this.symptom = symptom;
		this.applyThrong = applyThrong;
		this.applyPart = applyPart;
		this.chooseHotspot = chooseHotspot;
		this.massageManipulation = massageManipulation;
		this.apparentShape = apparentShape;
		this.controlWay = controlWay;
		this.massageHeadNumber = massageHeadNumber;
		this.powerWay = powerWay;
		this.therapyWayClassiFication = therapyWayClassiFication;
		this.massagePrincipie = massagePrincipie;
		this.careBodyParts = careBodyParts;
		this.protectiveClothing = protectiveClothing;
		this.sportsOutdoorProject = sportsOutdoorProject;
		BooleaAameShopping = booleaAameShopping;
		this.drainageMethEd = drainageMethEd;
		this.booleanHandleDevice = booleanHandleDevice;
		this.waterStageHeight = waterStageHeight;
		this.booleanMedicineBox = booleanMedicineBox;
		this.booleanWaterproofCoverDevice = booleanWaterproofCoverDevice;
		this.booleanShiftingRoller = booleanShiftingRoller;
		this.afterSaleService = afterSaleService;
		this.power = power;
		this.style = style;
		this.artNumber = artNumber;
		this.holeCount = holeCount;
		this.shape = shape;
		this.wenApparatusType = wenApparatusType;
		this.applySence = applySence;
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

	public String getProductionArea() {
		return productionArea;
	}

	public void setProductionArea(String productionArea) {
		this.productionArea = productionArea;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAppreciation() {
		return appreciation;
	}

	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getApplyThrong() {
		return applyThrong;
	}

	public void setApplyThrong(String applyThrong) {
		this.applyThrong = applyThrong;
	}

	public String getApplyPart() {
		return applyPart;
	}

	public void setApplyPart(String applyPart) {
		this.applyPart = applyPart;
	}

	public String getChooseHotspot() {
		return chooseHotspot;
	}

	public void setChooseHotspot(String chooseHotspot) {
		this.chooseHotspot = chooseHotspot;
	}

	public String getMassageManipulation() {
		return massageManipulation;
	}

	public void setMassageManipulation(String massageManipulation) {
		this.massageManipulation = massageManipulation;
	}

	public String getApparentShape() {
		return apparentShape;
	}

	public void setApparentShape(String apparentShape) {
		this.apparentShape = apparentShape;
	}

	public String getControlWay() {
		return controlWay;
	}

	public void setControlWay(String controlWay) {
		this.controlWay = controlWay;
	}

	public String getMassageHeadNumber() {
		return massageHeadNumber;
	}

	public void setMassageHeadNumber(String massageHeadNumber) {
		this.massageHeadNumber = massageHeadNumber;
	}

	public String getPowerWay() {
		return powerWay;
	}

	public void setPowerWay(String powerWay) {
		this.powerWay = powerWay;
	}

	public String getTherapyWayClassiFication() {
		return therapyWayClassiFication;
	}

	public void setTherapyWayClassiFication(String therapyWayClassiFication) {
		this.therapyWayClassiFication = therapyWayClassiFication;
	}

	public String getMassagePrincipie() {
		return massagePrincipie;
	}

	public void setMassagePrincipie(String massagePrincipie) {
		this.massagePrincipie = massagePrincipie;
	}

	public String getCareBodyParts() {
		return careBodyParts;
	}

	public void setCareBodyParts(String careBodyParts) {
		this.careBodyParts = careBodyParts;
	}

	public String getProtectiveClothing() {
		return protectiveClothing;
	}

	public void setProtectiveClothing(String protectiveClothing) {
		this.protectiveClothing = protectiveClothing;
	}

	public String getSportsOutdoorProject() {
		return sportsOutdoorProject;
	}

	public void setSportsOutdoorProject(String sportsOutdoorProject) {
		this.sportsOutdoorProject = sportsOutdoorProject;
	}

	public String getBooleaAameShopping() {
		return BooleaAameShopping;
	}

	public void setBooleaAameShopping(String booleaAameShopping) {
		BooleaAameShopping = booleaAameShopping;
	}

	public String getDrainageMethEd() {
		return drainageMethEd;
	}

	public void setDrainageMethEd(String drainageMethEd) {
		this.drainageMethEd = drainageMethEd;
	}

	public String getBooleanHandleDevice() {
		return booleanHandleDevice;
	}

	public void setBooleanHandleDevice(String booleanHandleDevice) {
		this.booleanHandleDevice = booleanHandleDevice;
	}

	public String getWaterStageHeight() {
		return waterStageHeight;
	}

	public void setWaterStageHeight(String waterStageHeight) {
		this.waterStageHeight = waterStageHeight;
	}

	public String getBooleanMedicineBox() {
		return booleanMedicineBox;
	}

	public void setBooleanMedicineBox(String booleanMedicineBox) {
		this.booleanMedicineBox = booleanMedicineBox;
	}

	public String getBooleanWaterproofCoverDevice() {
		return booleanWaterproofCoverDevice;
	}

	public void setBooleanWaterproofCoverDevice(
			String booleanWaterproofCoverDevice) {
		this.booleanWaterproofCoverDevice = booleanWaterproofCoverDevice;
	}

	public String getBooleanShiftingRoller() {
		return booleanShiftingRoller;
	}

	public void setBooleanShiftingRoller(String booleanShiftingRoller) {
		this.booleanShiftingRoller = booleanShiftingRoller;
	}

	public String getAfterSaleService() {
		return afterSaleService;
	}

	public void setAfterSaleService(String afterSaleService) {
		this.afterSaleService = afterSaleService;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getArtNumber() {
		return artNumber;
	}

	public void setArtNumber(String artNumber) {
		this.artNumber = artNumber;
	}

	public String getHoleCount() {
		return holeCount;
	}

	public void setHoleCount(String holeCount) {
		this.holeCount = holeCount;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getWenApparatusType() {
		return wenApparatusType;
	}

	public void setWenApparatusType(String wenApparatusType) {
		this.wenApparatusType = wenApparatusType;
	}

	public String getApplySence() {
		return applySence;
	}

	public void setApplySence(String applySence) {
		this.applySence = applySence;
	}

	@Override
	public String toString() {
		return "GoodsMedicacare [id=" + id + ", Name=" + Name + ", price="
				+ price + ", type=" + type + ", color=" + color + ", size="
				+ size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", firstCost=" + firstCost
				+ ", productionArea=" + productionArea + ", function="
				+ function + ", model=" + model + ", appreciation="
				+ appreciation + ", disease=" + disease + ", symptom="
				+ symptom + ", applyThrong=" + applyThrong + ", applyPart="
				+ applyPart + ", chooseHotspot=" + chooseHotspot
				+ ", massageManipulation=" + massageManipulation
				+ ", apparentShape=" + apparentShape + ", controlWay="
				+ controlWay + ", massageHeadNumber=" + massageHeadNumber
				+ ", powerWay=" + powerWay + ", therapyWayClassiFication="
				+ therapyWayClassiFication + ", massagePrincipie="
				+ massagePrincipie + ", careBodyParts=" + careBodyParts
				+ ", protectiveClothing=" + protectiveClothing
				+ ", sportsOutdoorProject=" + sportsOutdoorProject
				+ ", BooleaAameShopping=" + BooleaAameShopping
				+ ", drainageMethEd=" + drainageMethEd
				+ ", booleanHandleDevice=" + booleanHandleDevice
				+ ", waterStageHeight=" + waterStageHeight
				+ ", booleanMedicineBox=" + booleanMedicineBox
				+ ", booleanWaterproofCoverDevice="
				+ booleanWaterproofCoverDevice + ", booleanShiftingRoller="
				+ booleanShiftingRoller + ", afterSaleService="
				+ afterSaleService + ", power=" + power + ", style=" + style
				+ ", artNumber=" + artNumber + ", holeCount=" + holeCount
				+ ", shape=" + shape + ", wenApparatusType=" + wenApparatusType
				+ ", applySence=" + applySence + "]";
	}

}
