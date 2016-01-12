package com.cn.bsnt.model;
/** 电脑 */
public class GoodsComputer {
	/** 电脑ID */
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
	/** 笔记本CPU*/
	private String cpu;
	/** 固态硬盘*/
	private String ssd;
	/** 硬盘容量*/
	private String gb;
	/** 显存容量*/
	private String mb;
	/** 显卡类型*/
	private String videoCardType;
	/** 适用场景*/
	private String sence; 
	/** 内存容量*/
	private String memoryCapacity; 
	/** 屏幕比例*/
	private String screenColumn; 
	/** 处理器主频*/
	private String ghz;
	/** 重量*/
	private String weight;
	/** 内存类型*/
	private String ddrii; 
	/** 最大内存容量*/
	private String maxMemoryCapacity;
	/** 光驱类型*/
	private String cdDriverType; 
	/** 锂电池电芯数量*/
	private String lithiumIonBatteryNumber;
	/** 操作系统*/
	private String os; 
	/** 分辨率*/
	private String sharpnessSeparation; 
	/** 是否触摸屏*/
	private String booleanTouchScreen; 
	/** 是否超级本*/
	private String booleanUitrabook;
	/** 屏幕类型*/
	private String screenType; 
	/** 平均亮度*/
	private String averageBrightness; 
	/** 黑白响应时间*/
	private String blackWhiteResponseTime;
	/** 灰阶响应时间*/
	private String grayLevelResponseTime;
	/** 适用场景*/
	private String applySence; 
	/** 点距*/
	private String dotPitch; 
	/** 垂直可视角度*/
	private String verticalViewingAngle; 
	/** 背光类型*/
	private String backLightType; 
	/** 色彩数*/
	private String colourType; 
	/** 是否再带音响*/
	private String booleanSound;
	/** 接口类型*/
	private String portType; 
	/** 水平可视角度*/
	private String levelViewingAngle; 
	/** 包装体积*/
	private String packagingVolumn;
	/** 屏幕尺寸*/
	private String screenSize; 
	/** 硬盘转速*/
	private String hardDiskSpeed; 
	/** 成色*/
	private String condition; 
	/** 台式机*/
	private String desktopComputerType; 
	/** 摄像机类型*/
	private String cameraType;
	/** 能效等级*/
	private String energyEfficiencyLevel;
	/** 适用品牌*/
	private String applyBrand; 
	/** 声卡类型*/
	private String soundCardType;
	/** 售后服务*/
	private String afterSaleService; 
	/** 显示器类型*/
	private String displayerType; 
	/** 同城服务*/
	private String sameCityService; 
	/** 电池容量*/
	private String batteryCapacity; 
	/** 核心数量*/
	private String coreNumber; 
	/** 是否4G*/
	private String boolean4g; 
	/** 是否支持蓝牙*/
	private String booleanBluetooth;
	/** 附加功能*/
	private String additionFunction; 
	/** 续航时间*/
	private String enduranceTime; 
	/** 存贮类型*/
	private String storageType;
	/** 产品类型*/
	private String productType; 
	/** 前置摄像头像素*/
	private String prepositionCameraPixel;
	/** 后置摄像头像素*/
	private String postpositionCameraPixel;
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
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getSsd() {
		return ssd;
	}
	public void setSsd(String ssd) {
		this.ssd = ssd;
	}
	public String getGb() {
		return gb;
	}
	public void setGb(String gb) {
		this.gb = gb;
	}
	public String getMb() {
		return mb;
	}
	public void setMb(String mb) {
		this.mb = mb;
	}
	public String getVideoCardType() {
		return videoCardType;
	}
	public void setVideoCardType(String videoCardType) {
		this.videoCardType = videoCardType;
	}
	public String getSence() {
		return sence;
	}
	public void setSence(String sence) {
		this.sence = sence;
	}
	public String getMemoryCapacity() {
		return memoryCapacity;
	}
	public void setMemoryCapacity(String memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}
	public String getScreenColumn() {
		return screenColumn;
	}
	public void setScreenColumn(String screenColumn) {
		this.screenColumn = screenColumn;
	}
	public String getGhz() {
		return ghz;
	}
	public void setGhz(String ghz) {
		this.ghz = ghz;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDdrii() {
		return ddrii;
	}
	public void setDdrii(String ddrii) {
		this.ddrii = ddrii;
	}
	public String getMaxMemoryCapacity() {
		return maxMemoryCapacity;
	}
	public void setMaxMemoryCapacity(String maxMemoryCapacity) {
		this.maxMemoryCapacity = maxMemoryCapacity;
	}
	public String getCdDriverType() {
		return cdDriverType;
	}
	public void setCdDriverType(String cdDriverType) {
		this.cdDriverType = cdDriverType;
	}
	public String getLithiumIonBatteryNumber() {
		return lithiumIonBatteryNumber;
	}
	public void setLithiumIonBatteryNumber(String lithiumIonBatteryNumber) {
		this.lithiumIonBatteryNumber = lithiumIonBatteryNumber;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getSharpnessSeparation() {
		return sharpnessSeparation;
	}
	public void setSharpnessSeparation(String sharpnessSeparation) {
		this.sharpnessSeparation = sharpnessSeparation;
	}
	public String getBooleanTouchScreen() {
		return booleanTouchScreen;
	}
	public void setBooleanTouchScreen(String booleanTouchScreen) {
		this.booleanTouchScreen = booleanTouchScreen;
	}
	public String getBooleanUitrabook() {
		return booleanUitrabook;
	}
	public void setBooleanUitrabook(String booleanUitrabook) {
		this.booleanUitrabook = booleanUitrabook;
	}
	public String getScreenType() {
		return screenType;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public String getAverageBrightness() {
		return averageBrightness;
	}
	public void setAverageBrightness(String averageBrightness) {
		this.averageBrightness = averageBrightness;
	}
	public String getBlackWhiteResponseTime() {
		return blackWhiteResponseTime;
	}
	public void setBlackWhiteResponseTime(String blackWhiteResponseTime) {
		this.blackWhiteResponseTime = blackWhiteResponseTime;
	}
	public String getGrayLevelResponseTime() {
		return grayLevelResponseTime;
	}
	public void setGrayLevelResponseTime(String grayLevelResponseTime) {
		this.grayLevelResponseTime = grayLevelResponseTime;
	}
	public String getApplySence() {
		return applySence;
	}
	public void setApplySence(String applySence) {
		this.applySence = applySence;
	}
	public String getDotPitch() {
		return dotPitch;
	}
	public void setDotPitch(String dotPitch) {
		this.dotPitch = dotPitch;
	}
	public String getVerticalViewingAngle() {
		return verticalViewingAngle;
	}
	public void setVerticalViewingAngle(String verticalViewingAngle) {
		this.verticalViewingAngle = verticalViewingAngle;
	}
	public String getBackLightType() {
		return backLightType;
	}
	public void setBackLightType(String backLightType) {
		this.backLightType = backLightType;
	}
	public String getColourType() {
		return colourType;
	}
	public void setColourType(String colourType) {
		this.colourType = colourType;
	}
	public String getBooleanSound() {
		return booleanSound;
	}
	public void setBooleanSound(String booleanSound) {
		this.booleanSound = booleanSound;
	}
	public String getPortType() {
		return portType;
	}
	public void setPortType(String portType) {
		this.portType = portType;
	}
	public String getLevelViewingAngle() {
		return levelViewingAngle;
	}
	public void setLevelViewingAngle(String levelViewingAngle) {
		this.levelViewingAngle = levelViewingAngle;
	}
	public String getPackagingVolumn() {
		return packagingVolumn;
	}
	public void setPackagingVolumn(String packagingVolumn) {
		this.packagingVolumn = packagingVolumn;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getHardDiskSpeed() {
		return hardDiskSpeed;
	}
	public void setHardDiskSpeed(String hardDiskSpeed) {
		this.hardDiskSpeed = hardDiskSpeed;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getDesktopComputerType() {
		return desktopComputerType;
	}
	public void setDesktopComputerType(String desktopComputerType) {
		this.desktopComputerType = desktopComputerType;
	}
	public String getCameraType() {
		return cameraType;
	}
	public void setCameraType(String cameraType) {
		this.cameraType = cameraType;
	}
	public String getEnergyEfficiencyLevel() {
		return energyEfficiencyLevel;
	}
	public void setEnergyEfficiencyLevel(String energyEfficiencyLevel) {
		this.energyEfficiencyLevel = energyEfficiencyLevel;
	}
	public String getApplyBrand() {
		return applyBrand;
	}
	public void setApplyBrand(String applyBrand) {
		this.applyBrand = applyBrand;
	}
	public String getSoundCardType() {
		return soundCardType;
	}
	public void setSoundCardType(String soundCardType) {
		this.soundCardType = soundCardType;
	}
	public String getAfterSaleService() {
		return afterSaleService;
	}
	public void setAfterSaleService(String afterSaleService) {
		this.afterSaleService = afterSaleService;
	}
	public String getDisplayerType() {
		return displayerType;
	}
	public void setDisplayerType(String displayerType) {
		this.displayerType = displayerType;
	}
	public String getSameCityService() {
		return sameCityService;
	}
	public void setSameCityService(String sameCityService) {
		this.sameCityService = sameCityService;
	}
	public String getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public String getCoreNumber() {
		return coreNumber;
	}
	public void setCoreNumber(String coreNumber) {
		this.coreNumber = coreNumber;
	}
	public String getBoolean4g() {
		return boolean4g;
	}
	public void setBoolean4g(String boolean4g) {
		this.boolean4g = boolean4g;
	}
	public String getBooleanBluetooth() {
		return booleanBluetooth;
	}
	public void setBooleanBluetooth(String booleanBluetooth) {
		this.booleanBluetooth = booleanBluetooth;
	}
	public String getAdditionFunction() {
		return additionFunction;
	}
	public void setAdditionFunction(String additionFunction) {
		this.additionFunction = additionFunction;
	}
	public String getEnduranceTime() {
		return enduranceTime;
	}
	public void setEnduranceTime(String enduranceTime) {
		this.enduranceTime = enduranceTime;
	}
	public String getStorageType() {
		return storageType;
	}
	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getPrepositionCameraPixel() {
		return prepositionCameraPixel;
	}
	public void setPrepositionCameraPixel(String prepositionCameraPixel) {
		this.prepositionCameraPixel = prepositionCameraPixel;
	}
	public String getPostpositionCameraPixel() {
		return postpositionCameraPixel;
	}
	public void setPostpositionCameraPixel(String postpositionCameraPixel) {
		this.postpositionCameraPixel = postpositionCameraPixel;
	}
	public GoodsComputer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsComputer(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String cpu, String ssd, String gb, String mb,
			String videoCardType, String sence, String memoryCapacity,
			String screenColumn, String ghz, String weight, String ddrii,
			String maxMemoryCapacity, String cdDriverType,
			String lithiumIonBatteryNumber, String os,
			String sharpnessSeparation, String booleanTouchScreen,
			String booleanUitrabook, String screenType,
			String averageBrightness, String blackWhiteResponseTime,
			String grayLevelResponseTime, String applySence, String dotPitch,
			String verticalViewingAngle, String backLightType,
			String colourType, String booleanSound, String portType,
			String levelViewingAngle, String packagingVolumn,
			String screenSize, String hardDiskSpeed, String condition,
			String desktopComputerType, String cameraType,
			String energyEfficiencyLevel, String applyBrand,
			String soundCardType, String afterSaleService,
			String displayerType, String sameCityService,
			String batteryCapacity, String coreNumber, String boolean4g,
			String booleanBluetooth, String additionFunction,
			String enduranceTime, String storageType, String productType,
			String prepositionCameraPixel, String postpositionCameraPixel,String firstCost) {
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
		this.cpu = cpu;
		this.ssd = ssd;
		this.gb = gb;
		this.mb = mb;
		this.videoCardType = videoCardType;
		this.sence = sence;
		this.memoryCapacity = memoryCapacity;
		this.screenColumn = screenColumn;
		this.ghz = ghz;
		this.weight = weight;
		this.ddrii = ddrii;
		this.maxMemoryCapacity = maxMemoryCapacity;
		this.cdDriverType = cdDriverType;
		this.lithiumIonBatteryNumber = lithiumIonBatteryNumber;
		this.os = os;
		this.sharpnessSeparation = sharpnessSeparation;
		this.booleanTouchScreen = booleanTouchScreen;
		this.booleanUitrabook = booleanUitrabook;
		this.screenType = screenType;
		this.averageBrightness = averageBrightness;
		this.blackWhiteResponseTime = blackWhiteResponseTime;
		this.grayLevelResponseTime = grayLevelResponseTime;
		this.applySence = applySence;
		this.dotPitch = dotPitch;
		this.verticalViewingAngle = verticalViewingAngle;
		this.backLightType = backLightType;
		this.colourType = colourType;
		this.booleanSound = booleanSound;
		this.portType = portType;
		this.levelViewingAngle = levelViewingAngle;
		this.packagingVolumn = packagingVolumn;
		this.screenSize = screenSize;
		this.hardDiskSpeed = hardDiskSpeed;
		this.condition = condition;
		this.desktopComputerType = desktopComputerType;
		this.cameraType = cameraType;
		this.energyEfficiencyLevel = energyEfficiencyLevel;
		this.applyBrand = applyBrand;
		this.soundCardType = soundCardType;
		this.afterSaleService = afterSaleService;
		this.displayerType = displayerType;
		this.sameCityService = sameCityService;
		this.batteryCapacity = batteryCapacity;
		this.coreNumber = coreNumber;
		this.boolean4g = boolean4g;
		this.booleanBluetooth = booleanBluetooth;
		this.additionFunction = additionFunction;
		this.enduranceTime = enduranceTime;
		this.storageType = storageType;
		this.productType = productType;
		this.prepositionCameraPixel = prepositionCameraPixel;
		this.postpositionCameraPixel = postpositionCameraPixel;
	}
	
	

}
