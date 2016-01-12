package com.cn.bsnt.model;

/** 手机 */
public class GoodsMobilePhone {
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
	/** 运行内存 */
	private String runRam;
	/** 机身存储 */
	private String phoneMemory;
	/** 像素 */
	private String pxel;
	/** 核心数 */
	private String coreNumber;
	/** 分辨率 */
	private String sharpnessSeparation;
	/** 操作系统 */
	private String os;
	/** 电池容量 */
	private String batteryCapacity;
	/** 款式 */
	private String style;
	/** 是否智能手机 */
	private String booleanSmartphone;
	/** 手机类型 */
	private String phoneType;
	/** 键盘类型 */
	private String keyboardType;
	/** 重量 */
	private String weight;
	/** 厚度 */
	private String thickness;
	/** CPU型号 */
	private String CPUType;
	/** 附加功能 */
	private String additionFunction;
	/** 网络模式 */
	private String networkModel;
	/** 储存功能 */
	private String storageFunction;
	/** 网络类型 */
	private String networkType;
	/** 最大储存扩展 */
	private String maxStorageExtensions;
	/** 摄像头类型 */
	private String camearType;
	/** SIM卡规格 */
	private String SIMStandard;
	/** 屏幕材质 */
	private String screenTexture;
	/** 屏幕类型 */
	private String screenType;
	/** 机身尺寸 */
	private String fuselageSize;
	/** 是否支持音乐播放 */
	private String BooleanMusicPlay;
	/** 是否支持视屏播放 */
	private String booleanVideoPlay;
	/** 是否支持JAVA */
	private String BooleanJava;
	/** 是否支持铃声 */
	private String booleanRingingSound;
	/** 副摄像头 */
	private String secondCamera;
	/** 传感器类型 */
	private String senseOrganType;
	/** 是否支持闪光灯 */
	private String booleanFlashlight;
	/** 是否支持连拍功能 */
	private String booleanContinuousFunction;
	/** 变焦模式 */
	private String zoomMode;
	/** 是否支持拍摄场景 */
	private String booleanShootScene;
	/** 是否支持闹钟 */
	private String booleanAlarmClock;
	/** 是否支持录音 */
	private String booleanRecord;
	/** 是否支持计算器 */
	private String booleanCounter;
	/** 是否支持GSP */
	private String booleanGSP;
	/** 是否支持WIFI */
	private String booleanWIFI;
	/** 是否支持蓝牙 */
	private String booleanBluetooth;
	/** 是否支持无线AP */
	private String booleanWirelessAp;
	/** 数据线接口 */
	private String USB;
	/** 电池类型 */
	private String batteryType;
	/** 通话时间 */
	private String callTime;
	/** 待机时间 */
	private String waitTime;
	/** 是否支持重力感应 */
	private String booleanGravitySensor;
	/** 是否支持光线传感器 */
	private String booleanLightSenseOrgan;
	/**距离感应*/
	private String booleanDistanceReaction;
	/** 出厂价 */
	private String firstCost;

	public GoodsMobilePhone() {
		
		// TODO Auto-generated constructor stub
	}
	
	public GoodsMobilePhone(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc, String runRam,
			String phoneMemory, String pxel, String coreNumber,
			String sharpnessSeparation, String os, String batteryCapacity,
			String style, String booleanSmartphone, String phoneType,
			String keyboardType, String weight, String thickness,
			String cPUType, String additionFunction, String networkModel,
			String storageFunction, String networkType,
			String maxStorageExtensions, String camearType, String sIMStandard,
			String screenTexture, String screenType, String fuselageSize,
			String booleanMusicPlay, String booleanVideoPlay,
			String booleanJava, String booleanRingingSound,
			String secondCamera, String senseOrganType,
			String booleanFlashlight, String booleanContinuousFunction,
			String zoomMode, String booleanShootScene,
			String booleanAlarmClock, String booleanRecord,
			String booleanCounter, String booleanGSP, String booleanWIFI,
			String booleanBluetooth, String booleanWirelessAp, String uSB,
			String batteryType, String callTime, String waitTime,
			String booleanGravitySensor, String booleanLightSenseOrgan,
			String booleanDistanceReaction, String firstCost) {
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
		this.runRam = runRam;
		this.phoneMemory = phoneMemory;
		this.pxel = pxel;
		this.coreNumber = coreNumber;
		this.sharpnessSeparation = sharpnessSeparation;
		this.os = os;
		this.batteryCapacity = batteryCapacity;
		this.style = style;
		this.booleanSmartphone = booleanSmartphone;
		this.phoneType = phoneType;
		this.keyboardType = keyboardType;
		this.weight = weight;
		this.thickness = thickness;
		CPUType = cPUType;
		this.additionFunction = additionFunction;
		this.networkModel = networkModel;
		this.storageFunction = storageFunction;
		this.networkType = networkType;
		this.maxStorageExtensions = maxStorageExtensions;
		this.camearType = camearType;
		SIMStandard = sIMStandard;
		this.screenTexture = screenTexture;
		this.screenType = screenType;
		this.fuselageSize = fuselageSize;
		BooleanMusicPlay = booleanMusicPlay;
		this.booleanVideoPlay = booleanVideoPlay;
		BooleanJava = booleanJava;
		this.booleanRingingSound = booleanRingingSound;
		this.secondCamera = secondCamera;
		this.senseOrganType = senseOrganType;
		this.booleanFlashlight = booleanFlashlight;
		this.booleanContinuousFunction = booleanContinuousFunction;
		this.zoomMode = zoomMode;
		this.booleanShootScene = booleanShootScene;
		this.booleanAlarmClock = booleanAlarmClock;
		this.booleanRecord = booleanRecord;
		this.booleanCounter = booleanCounter;
		this.booleanGSP = booleanGSP;
		this.booleanWIFI = booleanWIFI;
		this.booleanBluetooth = booleanBluetooth;
		this.booleanWirelessAp = booleanWirelessAp;
		USB = uSB;
		this.batteryType = batteryType;
		this.callTime = callTime;
		this.waitTime = waitTime;
		this.booleanGravitySensor = booleanGravitySensor;
		this.booleanLightSenseOrgan = booleanLightSenseOrgan;
		this.booleanDistanceReaction = booleanDistanceReaction;
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

	public String getRunRam() {
		return runRam;
	}

	public void setRunRam(String runRam) {
		this.runRam = runRam;
	}

	public String getPhoneMemory() {
		return phoneMemory;
	}

	public void setPhoneMemory(String phoneMemory) {
		this.phoneMemory = phoneMemory;
	}

	public String getPxel() {
		return pxel;
	}

	public void setPxel(String pxel) {
		this.pxel = pxel;
	}

	public String getCoreNumber() {
		return coreNumber;
	}

	public void setCoreNumber(String coreNumber) {
		this.coreNumber = coreNumber;
	}

	public String getSharpnessSeparation() {
		return sharpnessSeparation;
	}

	public void setSharpnessSeparation(String sharpnessSeparation) {
		this.sharpnessSeparation = sharpnessSeparation;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getBooleanSmartphone() {
		return booleanSmartphone;
	}

	public void setBooleanSmartphone(String booleanSmartphone) {
		this.booleanSmartphone = booleanSmartphone;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getKeyboardType() {
		return keyboardType;
	}

	public void setKeyboardType(String keyboardType) {
		this.keyboardType = keyboardType;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getThickness() {
		return thickness;
	}

	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	public String getCPUType() {
		return CPUType;
	}

	public void setCPUType(String cPUType) {
		CPUType = cPUType;
	}

	public String getAdditionFunction() {
		return additionFunction;
	}

	public void setAdditionFunction(String additionFunction) {
		this.additionFunction = additionFunction;
	}

	public String getNetworkModel() {
		return networkModel;
	}

	public void setNetworkModel(String networkModel) {
		this.networkModel = networkModel;
	}

	public String getStorageFunction() {
		return storageFunction;
	}

	public void setStorageFunction(String storageFunction) {
		this.storageFunction = storageFunction;
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getMaxStorageExtensions() {
		return maxStorageExtensions;
	}

	public void setMaxStorageExtensions(String maxStorageExtensions) {
		this.maxStorageExtensions = maxStorageExtensions;
	}

	public String getCamearType() {
		return camearType;
	}

	public void setCamearType(String camearType) {
		this.camearType = camearType;
	}

	public String getSIMStandard() {
		return SIMStandard;
	}

	public void setSIMStandard(String sIMStandard) {
		SIMStandard = sIMStandard;
	}

	public String getScreenTexture() {
		return screenTexture;
	}

	public void setScreenTexture(String screenTexture) {
		this.screenTexture = screenTexture;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public String getFuselageSize() {
		return fuselageSize;
	}

	public void setFuselageSize(String fuselageSize) {
		this.fuselageSize = fuselageSize;
	}

	public String getBooleanMusicPlay() {
		return BooleanMusicPlay;
	}

	public void setBooleanMusicPlay(String booleanMusicPlay) {
		BooleanMusicPlay = booleanMusicPlay;
	}

	public String getBooleanVideoPlay() {
		return booleanVideoPlay;
	}

	public void setBooleanVideoPlay(String booleanVideoPlay) {
		this.booleanVideoPlay = booleanVideoPlay;
	}

	public String getBooleanJava() {
		return BooleanJava;
	}

	public void setBooleanJava(String booleanJava) {
		BooleanJava = booleanJava;
	}

	public String getBooleanRingingSound() {
		return booleanRingingSound;
	}

	public void setBooleanRingingSound(String booleanRingingSound) {
		this.booleanRingingSound = booleanRingingSound;
	}

	public String getSecondCamera() {
		return secondCamera;
	}

	public void setSecondCamera(String secondCamera) {
		this.secondCamera = secondCamera;
	}

	public String getSenseOrganType() {
		return senseOrganType;
	}

	public void setSenseOrganType(String senseOrganType) {
		this.senseOrganType = senseOrganType;
	}

	public String getBooleanFlashlight() {
		return booleanFlashlight;
	}

	public void setBooleanFlashlight(String booleanFlashlight) {
		this.booleanFlashlight = booleanFlashlight;
	}

	public String getBooleanContinuousFunction() {
		return booleanContinuousFunction;
	}

	public void setBooleanContinuousFunction(String booleanContinuousFunction) {
		this.booleanContinuousFunction = booleanContinuousFunction;
	}

	public String getZoomMode() {
		return zoomMode;
	}

	public void setZoomMode(String zoomMode) {
		this.zoomMode = zoomMode;
	}

	public String getBooleanShootScene() {
		return booleanShootScene;
	}

	public void setBooleanShootScene(String booleanShootScene) {
		this.booleanShootScene = booleanShootScene;
	}

	public String getBooleanAlarmClock() {
		return booleanAlarmClock;
	}

	public void setBooleanAlarmClock(String booleanAlarmClock) {
		this.booleanAlarmClock = booleanAlarmClock;
	}

	public String getBooleanRecord() {
		return booleanRecord;
	}

	public void setBooleanRecord(String booleanRecord) {
		this.booleanRecord = booleanRecord;
	}

	public String getBooleanCounter() {
		return booleanCounter;
	}

	public void setBooleanCounter(String booleanCounter) {
		this.booleanCounter = booleanCounter;
	}

	public String getBooleanGSP() {
		return booleanGSP;
	}

	public void setBooleanGSP(String booleanGSP) {
		this.booleanGSP = booleanGSP;
	}

	public String getBooleanWIFI() {
		return booleanWIFI;
	}

	public void setBooleanWIFI(String booleanWIFI) {
		this.booleanWIFI = booleanWIFI;
	}

	public String getBooleanBluetooth() {
		return booleanBluetooth;
	}

	public void setBooleanBluetooth(String booleanBluetooth) {
		this.booleanBluetooth = booleanBluetooth;
	}

	public String getBooleanWirelessAp() {
		return booleanWirelessAp;
	}

	public void setBooleanWirelessAp(String booleanWirelessAp) {
		this.booleanWirelessAp = booleanWirelessAp;
	}

	public String getUSB() {
		return USB;
	}

	public void setUSB(String uSB) {
		USB = uSB;
	}

	public String getBatteryType() {
		return batteryType;
	}

	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}

	public String getCallTime() {
		return callTime;
	}

	public void setCallTime(String callTime) {
		this.callTime = callTime;
	}

	public String getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(String waitTime) {
		this.waitTime = waitTime;
	}

	public String getBooleanGravitySensor() {
		return booleanGravitySensor;
	}

	public void setBooleanGravitySensor(String booleanGravitySensor) {
		this.booleanGravitySensor = booleanGravitySensor;
	}

	public String getBooleanDistanceReaction() {
		return booleanDistanceReaction;
	}

	public void setBooleanDistanceReaction(String booleanDistanceReaction) {
		this.booleanDistanceReaction = booleanDistanceReaction;
	}

	public String getFirstCost() {
		return firstCost;
	}

	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}

	public String getBooleanLightSenseOrgan() {
		return booleanLightSenseOrgan;
	}

	public void setBooleanLightSenseOrgan(String booleanLightSenseOrgan) {
		this.booleanLightSenseOrgan = booleanLightSenseOrgan;
	}

	@Override
	public String toString() {
		return "GoodsMobilePhone [id=" + id + ", Name=" + Name + ", price="
				+ price + ", type=" + type + ", color=" + color + ", size="
				+ size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", runRam=" + runRam + ", phoneMemory="
				+ phoneMemory + ", pxel=" + pxel + ", coreNumber=" + coreNumber
				+ ", sharpnessSeparation=" + sharpnessSeparation + ", os=" + os
				+ ", batteryCapacity=" + batteryCapacity + ", style=" + style
				+ ", booleanSmartphone=" + booleanSmartphone + ", phoneType="
				+ phoneType + ", keyboardType=" + keyboardType + ", weight="
				+ weight + ", thickness=" + thickness + ", CPUType=" + CPUType
				+ ", additionFunction=" + additionFunction + ", networkModel="
				+ networkModel + ", storageFunction=" + storageFunction
				+ ", networkType=" + networkType + ", maxStorageExtensions="
				+ maxStorageExtensions + ", camearType=" + camearType
				+ ", SIMStandard=" + SIMStandard + ", screenTexture="
				+ screenTexture + ", screenType=" + screenType
				+ ", fuselageSize=" + fuselageSize + ", BooleanMusicPlay="
				+ BooleanMusicPlay + ", booleanVideoPlay=" + booleanVideoPlay
				+ ", BooleanJava=" + BooleanJava + ", booleanRingingSound="
				+ booleanRingingSound + ", secondCamera=" + secondCamera
				+ ", senseOrganType=" + senseOrganType + ", booleanFlashlight="
				+ booleanFlashlight + ", booleanContinuousFunction="
				+ booleanContinuousFunction + ", zoomMode=" + zoomMode
				+ ", booleanShootScene=" + booleanShootScene
				+ ", booleanAlarmClock=" + booleanAlarmClock
				+ ", booleanRecord=" + booleanRecord + ", booleanCounter="
				+ booleanCounter + ", booleanGSP=" + booleanGSP
				+ ", booleanWIFI=" + booleanWIFI + ", booleanBluetooth="
				+ booleanBluetooth + ", booleanWirelessAp=" + booleanWirelessAp
				+ ", USB=" + USB + ", batteryType=" + batteryType
				+ ", callTime=" + callTime + ", waitTime=" + waitTime
				+ ", booleanGravitySensor=" + booleanGravitySensor
				+ ", booleanLightSenseOrgan=" + booleanLightSenseOrgan
				+ ", booleanDistanceReaction=" + booleanDistanceReaction
				+ ", firstCost=" + firstCost + "]";
	}



}
