package com.cn.bsnt.model;
   /**汽车用品*/
public class GoodsAutoAppliance {
	/** 用品ID*/
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
	/**座垫风格*/
	private String seatingWasherStyle;
	/**主要表层材质*/
	private String surfacelayerMetal;
	/**组合形式*/
	private String combiningForm;
	/**图案*/
	private String desiqn;
	/**车内饰品分类*/
	private String carGarnishSort;
	/**拍照像素*/
	private String photoPixel;
	/**镜头数量*/
	private String sceneNumber;
	/**核心数*/
	private String coreNumber;
	/**输出功率*/
	private String outputPower;
	/**是否带USB*/
	private String iffasciaUSB;
	/**电源方式*/
	private String electricalSourceFashion;
	/**缸体规格*/
	private String blockSpec;
	/**重量*/
	private String heft;
	/**气压流量*/
	private String airpressureFlux;
	/**传感器位置*/
	private String sensorPlace;
	/**功能*/
	private String function;
	/**静音指标*/
	private String muteIndex;
	/**工作原理*/
	private String principleOf;
	/**操作系统*/
	private String operatingSystem;
	/**地图类型*/
	private String mapstyle;
	/**轮胎类型*/
	private String tyreSpec;
	/**汽车轮胎速度级别*/
	private String autotyrePaceLevel;
	/**胎面宽度*/
	private String treadWidth;
	/**隔热率*/
	private String heatinsulation;
	/**汽车类型*/
	private String carlampstyle;
	/*是否原装**/
	private String iforiginalbinding;
	/**轮毂尺寸*/
	private String hubsize;
	/**偏距*/
	private String setover;
	/**直径*/
	private String diameter;
	/**孔距*/
	private String pitch;
	/**防冻液类型*/
	private String antifreezeStyle;
	/**冰点*/
	private String freezingPoint;
	/**车蜡类型*/
	private String carWaxStyle;
	/**物理形态*/
	private String physicsShape;
	/**接口材料*/
	private String interfaceStuff;
	/**喷头材料*/
	private String sprayerStuff;
	/**水枪水花类型*/
	private String squirtqunSprayStyle;
	/**枪身材质*/
	private String gunSpearStuff;
	/**手柄类型*/
	private String handleStylesh;
	public GoodsAutoAppliance() {
		// TODO Auto-generated constructor stub
	}
	public GoodsAutoAppliance(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String firstCost, String seatingWasherStyle,
			String surfacelayerMetal, String combiningForm, String desiqn,
			String carGarnishSort, String photoPixel, String sceneNumber,
			String coreNumber, String outputPower, String iffasciaUSB,
			String electricalSourceFashion, String blockSpec, String heft,
			String airpressureFlux, String sensorPlace, String function,
			String muteIndex, String principleOf, String operatingSystem,
			String mapstyle, String tyreSpec, String autotyrePaceLevel,
			String treadWidth, String heatinsulation, String carlampstyle,
			String iforiginalbinding, String hubsize, String setover,
			String diameter, String pitch, String antifreezeStyle,
			String freezingPoint, String carWaxStyle, String physicsShape,
			String interfaceStuff, String sprayerStuff,
			String squirtqunSprayStyle, String gunSpearStuff,
			String handleStylesh) {

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
		this.seatingWasherStyle = seatingWasherStyle;
		this.surfacelayerMetal = surfacelayerMetal;
		this.combiningForm = combiningForm;
		this.desiqn = desiqn;
		this.carGarnishSort = carGarnishSort;
		this.photoPixel = photoPixel;
		this.sceneNumber = sceneNumber;
		this.coreNumber = coreNumber;
		this.outputPower = outputPower;
		this.iffasciaUSB = iffasciaUSB;
		this.electricalSourceFashion = electricalSourceFashion;
		this.blockSpec = blockSpec;
		this.heft = heft;
		this.airpressureFlux = airpressureFlux;
		this.sensorPlace = sensorPlace;
		this.function = function;
		this.muteIndex = muteIndex;
		this.principleOf = principleOf;
		this.operatingSystem = operatingSystem;
		this.mapstyle = mapstyle;
		this.tyreSpec = tyreSpec;
		this.autotyrePaceLevel = autotyrePaceLevel;
		this.treadWidth = treadWidth;
		this.heatinsulation = heatinsulation;
		this.carlampstyle = carlampstyle;
		this.iforiginalbinding = iforiginalbinding;
		this.hubsize = hubsize;
		this.setover = setover;
		this.diameter = diameter;
		this.pitch = pitch;
		this.antifreezeStyle = antifreezeStyle;
		this.freezingPoint = freezingPoint;
		this.carWaxStyle = carWaxStyle;
		this.physicsShape = physicsShape;
		this.interfaceStuff = interfaceStuff;
		this.sprayerStuff = sprayerStuff;
		this.squirtqunSprayStyle = squirtqunSprayStyle;
		this.gunSpearStuff = gunSpearStuff;
		this.handleStylesh = handleStylesh;
	}


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


	public String getSeatingWasherStyle() {
		return seatingWasherStyle;
	}


	public void setSeatingWasherStyle(String seatingWasherStyle) {
		this.seatingWasherStyle = seatingWasherStyle;
	}


	public String getSurfacelayerMetal() {
		return surfacelayerMetal;
	}


	public void setSurfacelayerMetal(String surfacelayerMetal) {
		this.surfacelayerMetal = surfacelayerMetal;
	}


	public String getCombiningForm() {
		return combiningForm;
	}


	public void setCombiningForm(String combiningForm) {
		this.combiningForm = combiningForm;
	}


	public String getDesiqn() {
		return desiqn;
	}


	public void setDesiqn(String desiqn) {
		this.desiqn = desiqn;
	}


	public String getCarGarnishSort() {
		return carGarnishSort;
	}


	public void setCarGarnishSort(String carGarnishSort) {
		this.carGarnishSort = carGarnishSort;
	}


	public String getPhotoPixel() {
		return photoPixel;
	}


	public void setPhotoPixel(String photoPixel) {
		this.photoPixel = photoPixel;
	}


	public String getSceneNumber() {
		return sceneNumber;
	}


	public void setSceneNumber(String sceneNumber) {
		this.sceneNumber = sceneNumber;
	}


	public String getCoreNumber() {
		return coreNumber;
	}


	public void setCoreNumber(String coreNumber) {
		this.coreNumber = coreNumber;
	}


	public String getOutputPower() {
		return outputPower;
	}


	public void setOutputPower(String outputPower) {
		this.outputPower = outputPower;
	}


	public String getIffasciaUSB() {
		return iffasciaUSB;
	}


	public void setIffasciaUSB(String iffasciaUSB) {
		this.iffasciaUSB = iffasciaUSB;
	}


	public String getElectricalSourceFashion() {
		return electricalSourceFashion;
	}


	public void setElectricalSourceFashion(String electricalSourceFashion) {
		this.electricalSourceFashion = electricalSourceFashion;
	}


	public String getBlockSpec() {
		return blockSpec;
	}


	public void setBlockSpec(String blockSpec) {
		this.blockSpec = blockSpec;
	}


	public String getHeft() {
		return heft;
	}


	public void setHeft(String heft) {
		this.heft = heft;
	}


	public String getAirpressureFlux() {
		return airpressureFlux;
	}


	public void setAirpressureFlux(String airpressureFlux) {
		this.airpressureFlux = airpressureFlux;
	}


	public String getSensorPlace() {
		return sensorPlace;
	}


	public void setSensorPlace(String sensorPlace) {
		this.sensorPlace = sensorPlace;
	}


	public String getFunction() {
		return function;
	}


	public void setFunction(String function) {
		this.function = function;
	}


	public String getMuteIndex() {
		return muteIndex;
	}


	public void setMuteIndex(String muteIndex) {
		this.muteIndex = muteIndex;
	}


	public String getPrincipleOf() {
		return principleOf;
	}


	public void setPrincipleOf(String principleOf) {
		this.principleOf = principleOf;
	}


	public String getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	public String getMapstyle() {
		return mapstyle;
	}


	public void setMapstyle(String mapstyle) {
		this.mapstyle = mapstyle;
	}


	public String getTyreSpec() {
		return tyreSpec;
	}


	public void setTyreSpec(String tyreSpec) {
		this.tyreSpec = tyreSpec;
	}


	public String getAutotyrePaceLevel() {
		return autotyrePaceLevel;
	}


	public void setAutotyrePaceLevel(String autotyrePaceLevel) {
		this.autotyrePaceLevel = autotyrePaceLevel;
	}


	public String getTreadWidth() {
		return treadWidth;
	}


	public void setTreadWidth(String treadWidth) {
		this.treadWidth = treadWidth;
	}


	public String getHeatinsulation() {
		return heatinsulation;
	}


	public void setHeatinsulation(String heatinsulation) {
		this.heatinsulation = heatinsulation;
	}


	public String getCarlampstyle() {
		return carlampstyle;
	}


	public void setCarlampstyle(String carlampstyle) {
		this.carlampstyle = carlampstyle;
	}


	public String getIforiginalbinding() {
		return iforiginalbinding;
	}


	public void setIforiginalbinding(String iforiginalbinding) {
		this.iforiginalbinding = iforiginalbinding;
	}


	public String getHubsize() {
		return hubsize;
	}


	public void setHubsize(String hubsize) {
		this.hubsize = hubsize;
	}


	public String getSetover() {
		return setover;
	}


	public void setSetover(String setover) {
		this.setover = setover;
	}


	public String getDiameter() {
		return diameter;
	}


	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}


	public String getPitch() {
		return pitch;
	}


	public void setPitch(String pitch) {
		this.pitch = pitch;
	}


	public String getAntifreezeStyle() {
		return antifreezeStyle;
	}


	public void setAntifreezeStyle(String antifreezeStyle) {
		this.antifreezeStyle = antifreezeStyle;
	}


	public String getFreezingPoint() {
		return freezingPoint;
	}


	public void setFreezingPoint(String freezingPoint) {
		this.freezingPoint = freezingPoint;
	}


	public String getCarWaxStyle() {
		return carWaxStyle;
	}


	public void setCarWaxStyle(String carWaxStyle) {
		this.carWaxStyle = carWaxStyle;
	}


	public String getPhysicsShape() {
		return physicsShape;
	}


	public void setPhysicsShape(String physicsShape) {
		this.physicsShape = physicsShape;
	}


	public String getInterfaceStuff() {
		return interfaceStuff;
	}


	public void setInterfaceStuff(String interfaceStuff) {
		this.interfaceStuff = interfaceStuff;
	}


	public String getSprayerStuff() {
		return sprayerStuff;
	}


	public void setSprayerStuff(String sprayerStuff) {
		this.sprayerStuff = sprayerStuff;
	}


	public String getSquirtqunSprayStyle() {
		return squirtqunSprayStyle;
	}


	public void setSquirtqunSprayStyle(String squirtqunSprayStyle) {
		this.squirtqunSprayStyle = squirtqunSprayStyle;
	}


	public String getGunSpearStuff() {
		return gunSpearStuff;
	}


	public void setGunSpearStuff(String gunSpearStuff) {
		this.gunSpearStuff = gunSpearStuff;
	}


	public String getHandleStylesh() {
		return handleStylesh;
	}


	public void setHandleStylesh(String handleStylesh) {
		this.handleStylesh = handleStylesh;
	}


	@Override
	public String toString() {
		return "GoodsAutoAppliance [id=" + id + ", name=" + name + ", price="
				+ price + ", type=" + type + ", color=" + color + ", size="
				+ size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", firstCost=" + firstCost
				+ ", seatingWasherStyle=" + seatingWasherStyle
				+ ", surfacelayerMetal=" + surfacelayerMetal
				+ ", combiningForm=" + combiningForm + ", desiqn=" + desiqn
				+ ", carGarnishSort=" + carGarnishSort + ", photoPixel="
				+ photoPixel + ", sceneNumber=" + sceneNumber + ", coreNumber="
				+ coreNumber + ", outputPower=" + outputPower
				+ ", iffasciaUSB=" + iffasciaUSB + ", electricalSourceFashion="
				+ electricalSourceFashion + ", blockSpec=" + blockSpec
				+ ", heft=" + heft + ", airpressureFlux=" + airpressureFlux
				+ ", sensorPlace=" + sensorPlace + ", function=" + function
				+ ", muteIndex=" + muteIndex + ", principleOf=" + principleOf
				+ ", operatingSystem=" + operatingSystem + ", mapstyle="
				+ mapstyle + ", tyreSpec=" + tyreSpec + ", autotyrePaceLevel="
				+ autotyrePaceLevel + ", treadWidth=" + treadWidth
				+ ", heatinsulation=" + heatinsulation + ", carlampstyle="
				+ carlampstyle + ", iforiginalbinding=" + iforiginalbinding
				+ ", hubsize=" + hubsize + ", setover=" + setover
				+ ", diameter=" + diameter + ", pitch=" + pitch
				+ ", antifreezeStyle=" + antifreezeStyle + ", freezingPoint="
				+ freezingPoint + ", carWaxStyle=" + carWaxStyle
				+ ", physicsShape=" + physicsShape + ", interfaceStuff="
				+ interfaceStuff + ", sprayerStuff=" + sprayerStuff
				+ ", squirtqunSprayStyle=" + squirtqunSprayStyle
				+ ", gunSpearStuff=" + gunSpearStuff + ", handleStylesh="
				+ handleStylesh + "]";
	}
	
	
	
}
