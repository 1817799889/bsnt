package com.cn.bsnt.model;

/** 办公文具 */
public class GoodsOfficeStationary {
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
	/** 供纸方式 */
	private String paperSupply;
	/** 售后服务 */
	private String afterSaleService;
	/** 打印机类型 */
	private String printerType;
	/** 电源电压 */
	private String supplyVoltage;
	/** 是否支持自动双面打印 */
	private String booleanAutomaticDepleexPrinting;
	/** 打印速度 */
	private String printerSpeed;
	/** 接口类型 */
	private String portType;
	/** 型号 */
	private String model;
	/** 重量 */
	private String weight;
	/** 使用场景 */
	private String applySence;
	/** 是否支持网络打印 */
	private String booleanNetworkPrinter;
	/** 变焦倍数 */
	private String zoomMultiple;
	/** 最高分辨率 */
	private String maxResolution;
	/** 光源类型 */
	private String lightResourceType;
	/** 灯泡功率 */
	private String bulbPower;
	/** 投影尺寸 */
	private String projectionSize;
	/** 亮度 */
	private String luminance;
	/** 投影机类别 */
	private String projectionKind;
	/** 投影方式 */
	private String projectionWay;
	/** 光学分辨率 */
	private String opticalResolution;
	/** 投影技术 */
	private String projectionTechnique;
	/** 硒鼓结构 */
	private String drumUnitStructure;
	/** HP机型 */
	private String HPType;
	/** HP硒鼓/粉盒型号 */
	private String HPDrumUnt;
	/** 幅面 */
	private String breadth;
	/** 包装数量 */
	private String packageNumber;
	/** 复印速度 */
	private String copySpeed;
	/** 功能 */
	private String function;
	/** 产品类型 */
	private String productType;
	/** 耗材类型 */
	private String consumableType;
	/** 系列 */
	private String series;
	/** 扫面分辨率 */
	private String scanningResolution;
	/** 传真分辨率 */
	private String faxResolution;
	/** 最大复印数 */
	private String maxCopyNumber;
	/** 传真速度 */
	private String faxSpeed;
	/** 传真类型 */
	private String faxType;
	/** 记事本分类 */
	private String notepadClassify;
	/** 封面硬度 */
	private String coverHardness;
	/** 装订方式 */
	private String bookbindingWay;
	/** 复古 */
	private String style;
	/** 书写粗细 */
	private String writeThickness;
	/** 笔芯颜色 */
	private String cartridgeColour;
	/** 支数 */
	private String number;
	/** 是否可定制 */
	private String booleanCustomization;
	/** 材质 */
	private String texture;
	/** 外箱箱体尺寸 */
	private String cartonBoxSize;
	/** 门的款式 */
	private String doorStyle;
	/** 保险箱类型 */
	private String strongboxType;
	/** 内存容量 */
	private String memaryCapacity;
	/** 续航时间 */
	private String enduranceTime;
	/** 屏幕尺寸 */
	private String screenSize;
	/** 外形尺寸 */
	private String appearanceSize;
	/** 是否触摸屏 */
	private String booleanTouchScreen;
	/** 屏幕材质 */
	private String screenTexture;
	/** 操作系统 */
	private String os;
	/** 录音功能 */
	private String recordFunction;
	/** 产品接口 */
	private String productionPort;
	/** 屏幕色彩 */
	private String screenColors;
	/** 屏幕保护 */
	private String screenType;
	/** 电池信息 */
	private String batteryInfo;
	/** 文本格式 */
	private String textFormatting;
	/** 上墨方式 */
	private String inkWay;
	/** 笔尖成分 */
	private String ponPointElement;
	/** 笔尖种类 */
	private String ponPointKind;
	/** 笔芯硬度 */
	private String cartridgeHardness;
	/** 用途 */
	private String use;
	/** 屏幕最大显示位数 */
	private String screenMaxShowPlaces;
	/** 是否可再冲墨水 */
	private String booleanRefillInk;
	/** 是否双头 */
	private String BooleanDoubleHead;

	public GoodsOfficeStationary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsOfficeStationary(int id, String name, double price,
			String type, String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String firstCost, String paperSupply, String afterSaleService,
			String printerType, String supplyVoltage,
			String booleanAutomaticDepleexPrinting, String printerSpeed,
			String portType, String model, String weight, String applySence,
			String booleanNetworkPrinter, String zoomMultiple,
			String maxResolution, String lightResourceType, String bulbPower,
			String projectionSize, String luminance, String projectionKind,
			String projectionWay, String opticalResolution,
			String projectionTechnique, String drumUnitStructure,
			String hPType, String hPDrumUnt, String breadth,
			String packageNumber, String copySpeed, String function,
			String productType, String consumableType, String series,
			String scanningResolution, String faxResolution,
			String maxCopyNumber, String faxSpeed, String faxType,
			String notepadClassify, String coverHardness,
			String bookbindingWay, String style, String writeThickness,
			String cartridgeColour, String number, String booleanCustomization,
			String texture, String cartonBoxSize, String doorStyle,
			String strongboxType, String memaryCapacity, String enduranceTime,
			String screenSize, String appearanceSize,
			String booleanTouchScreen, String screenTexture, String os,
			String recordFunction, String productionPort, String screenColors,
			String screenType, String batteryInfo, String textFormatting,
			String inkWay, String ponPointElement, String ponPointKind,
			String cartridgeHardness, String use, String screenMaxShowPlaces,
			String booleanRefillInk, String booleanDoubleHead) {

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
		this.paperSupply = paperSupply;
		this.afterSaleService = afterSaleService;
		this.printerType = printerType;
		this.supplyVoltage = supplyVoltage;
		this.booleanAutomaticDepleexPrinting = booleanAutomaticDepleexPrinting;
		this.printerSpeed = printerSpeed;
		this.portType = portType;
		this.model = model;
		this.weight = weight;
		this.applySence = applySence;
		this.booleanNetworkPrinter = booleanNetworkPrinter;
		this.zoomMultiple = zoomMultiple;
		this.maxResolution = maxResolution;
		this.lightResourceType = lightResourceType;
		this.bulbPower = bulbPower;
		this.projectionSize = projectionSize;
		this.luminance = luminance;
		this.projectionKind = projectionKind;
		this.projectionWay = projectionWay;
		this.opticalResolution = opticalResolution;
		this.projectionTechnique = projectionTechnique;
		this.drumUnitStructure = drumUnitStructure;
		HPType = hPType;
		HPDrumUnt = hPDrumUnt;
		this.breadth = breadth;
		this.packageNumber = packageNumber;
		this.copySpeed = copySpeed;
		this.function = function;
		this.productType = productType;
		this.consumableType = consumableType;
		this.series = series;
		this.scanningResolution = scanningResolution;
		this.faxResolution = faxResolution;
		this.maxCopyNumber = maxCopyNumber;
		this.faxSpeed = faxSpeed;
		this.faxType = faxType;
		this.notepadClassify = notepadClassify;
		this.coverHardness = coverHardness;
		this.bookbindingWay = bookbindingWay;
		this.style = style;
		this.writeThickness = writeThickness;
		this.cartridgeColour = cartridgeColour;
		this.number = number;
		this.booleanCustomization = booleanCustomization;
		this.texture = texture;
		this.cartonBoxSize = cartonBoxSize;
		this.doorStyle = doorStyle;
		this.strongboxType = strongboxType;
		this.memaryCapacity = memaryCapacity;
		this.enduranceTime = enduranceTime;
		this.screenSize = screenSize;
		this.appearanceSize = appearanceSize;
		this.booleanTouchScreen = booleanTouchScreen;
		this.screenTexture = screenTexture;
		this.os = os;
		this.recordFunction = recordFunction;
		this.productionPort = productionPort;
		this.screenColors = screenColors;
		this.screenType = screenType;
		this.batteryInfo = batteryInfo;
		this.textFormatting = textFormatting;
		this.inkWay = inkWay;
		this.ponPointElement = ponPointElement;
		this.ponPointKind = ponPointKind;
		this.cartridgeHardness = cartridgeHardness;
		this.use = use;
		this.screenMaxShowPlaces = screenMaxShowPlaces;
		this.booleanRefillInk = booleanRefillInk;
		BooleanDoubleHead = booleanDoubleHead;
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

	public String getPaperSupply() {
		return paperSupply;
	}

	public void setPaperSupply(String paperSupply) {
		this.paperSupply = paperSupply;
	}

	public String getAfterSaleService() {
		return afterSaleService;
	}

	public void setAfterSaleService(String afterSaleService) {
		this.afterSaleService = afterSaleService;
	}

	public String getPrinterType() {
		return printerType;
	}

	public void setPrinterType(String printerType) {
		this.printerType = printerType;
	}

	public String getSupplyVoltage() {
		return supplyVoltage;
	}

	public void setSupplyVoltage(String supplyVoltage) {
		this.supplyVoltage = supplyVoltage;
	}

	public String getBooleanAutomaticDepleexPrinting() {
		return booleanAutomaticDepleexPrinting;
	}

	public void setBooleanAutomaticDepleexPrinting(
			String booleanAutomaticDepleexPrinting) {
		this.booleanAutomaticDepleexPrinting = booleanAutomaticDepleexPrinting;
	}

	public String getPrinterSpeed() {
		return printerSpeed;
	}

	public void setPrinterSpeed(String printerSpeed) {
		this.printerSpeed = printerSpeed;
	}

	public String getPortType() {
		return portType;
	}

	public void setPortType(String portType) {
		this.portType = portType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getApplySence() {
		return applySence;
	}

	public void setApplySence(String applySence) {
		this.applySence = applySence;
	}

	public String getBooleanNetworkPrinter() {
		return booleanNetworkPrinter;
	}

	public void setBooleanNetworkPrinter(String booleanNetworkPrinter) {
		this.booleanNetworkPrinter = booleanNetworkPrinter;
	}

	public String getZoomMultiple() {
		return zoomMultiple;
	}

	public void setZoomMultiple(String zoomMultiple) {
		this.zoomMultiple = zoomMultiple;
	}

	public String getMaxResolution() {
		return maxResolution;
	}

	public void setMaxResolution(String maxResolution) {
		this.maxResolution = maxResolution;
	}

	public String getLightResourceType() {
		return lightResourceType;
	}

	public void setLightResourceType(String lightResourceType) {
		this.lightResourceType = lightResourceType;
	}

	public String getBulbPower() {
		return bulbPower;
	}

	public void setBulbPower(String bulbPower) {
		this.bulbPower = bulbPower;
	}

	public String getProjectionSize() {
		return projectionSize;
	}

	public void setProjectionSize(String projectionSize) {
		this.projectionSize = projectionSize;
	}

	public String getLuminance() {
		return luminance;
	}

	public void setLuminance(String luminance) {
		this.luminance = luminance;
	}

	public String getProjectionKind() {
		return projectionKind;
	}

	public void setProjectionKind(String projectionKind) {
		this.projectionKind = projectionKind;
	}

	public String getProjectionWay() {
		return projectionWay;
	}

	public void setProjectionWay(String projectionWay) {
		this.projectionWay = projectionWay;
	}

	public String getOpticalResolution() {
		return opticalResolution;
	}

	public void setOpticalResolution(String opticalResolution) {
		this.opticalResolution = opticalResolution;
	}

	public String getProjectionTechnique() {
		return projectionTechnique;
	}

	public void setProjectionTechnique(String projectionTechnique) {
		this.projectionTechnique = projectionTechnique;
	}

	public String getDrumUnitStructure() {
		return drumUnitStructure;
	}

	public void setDrumUnitStructure(String drumUnitStructure) {
		this.drumUnitStructure = drumUnitStructure;
	}

	public String getHPType() {
		return HPType;
	}

	public void setHPType(String hPType) {
		HPType = hPType;
	}

	public String getHPDrumUnt() {
		return HPDrumUnt;
	}

	public void setHPDrumUnt(String hPDrumUnt) {
		HPDrumUnt = hPDrumUnt;
	}

	public String getBreadth() {
		return breadth;
	}

	public void setBreadth(String breadth) {
		this.breadth = breadth;
	}

	public String getPackageNumber() {
		return packageNumber;
	}

	public void setPackageNumber(String packageNumber) {
		this.packageNumber = packageNumber;
	}

	public String getCopySpeed() {
		return copySpeed;
	}

	public void setCopySpeed(String copySpeed) {
		this.copySpeed = copySpeed;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getConsumableType() {
		return consumableType;
	}

	public void setConsumableType(String consumableType) {
		this.consumableType = consumableType;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getScanningResolution() {
		return scanningResolution;
	}

	public void setScanningResolution(String scanningResolution) {
		this.scanningResolution = scanningResolution;
	}

	public String getFaxResolution() {
		return faxResolution;
	}

	public void setFaxResolution(String faxResolution) {
		this.faxResolution = faxResolution;
	}

	public String getMaxCopyNumber() {
		return maxCopyNumber;
	}

	public void setMaxCopyNumber(String maxCopyNumber) {
		this.maxCopyNumber = maxCopyNumber;
	}

	public String getFaxSpeed() {
		return faxSpeed;
	}

	public void setFaxSpeed(String faxSpeed) {
		this.faxSpeed = faxSpeed;
	}

	public String getFaxType() {
		return faxType;
	}

	public void setFaxType(String faxType) {
		this.faxType = faxType;
	}

	public String getNotepadClassify() {
		return notepadClassify;
	}

	public void setNotepadClassify(String notepadClassify) {
		this.notepadClassify = notepadClassify;
	}

	public String getCoverHardness() {
		return coverHardness;
	}

	public void setCoverHardness(String coverHardness) {
		this.coverHardness = coverHardness;
	}

	public String getBookbindingWay() {
		return bookbindingWay;
	}

	public void setBookbindingWay(String bookbindingWay) {
		this.bookbindingWay = bookbindingWay;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getWriteThickness() {
		return writeThickness;
	}

	public void setWriteThickness(String writeThickness) {
		this.writeThickness = writeThickness;
	}

	public String getCartridgeColour() {
		return cartridgeColour;
	}

	public void setCartridgeColour(String cartridgeColour) {
		this.cartridgeColour = cartridgeColour;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBooleanCustomization() {
		return booleanCustomization;
	}

	public void setBooleanCustomization(String booleanCustomization) {
		this.booleanCustomization = booleanCustomization;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getCartonBoxSize() {
		return cartonBoxSize;
	}

	public void setCartonBoxSize(String cartonBoxSize) {
		this.cartonBoxSize = cartonBoxSize;
	}

	public String getDoorStyle() {
		return doorStyle;
	}

	public void setDoorStyle(String doorStyle) {
		this.doorStyle = doorStyle;
	}

	public String getStrongboxType() {
		return strongboxType;
	}

	public void setStrongboxType(String strongboxType) {
		this.strongboxType = strongboxType;
	}

	public String getMemaryCapacity() {
		return memaryCapacity;
	}

	public void setMemaryCapacity(String memaryCapacity) {
		this.memaryCapacity = memaryCapacity;
	}

	public String getEnduranceTime() {
		return enduranceTime;
	}

	public void setEnduranceTime(String enduranceTime) {
		this.enduranceTime = enduranceTime;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getAppearanceSize() {
		return appearanceSize;
	}

	public void setAppearanceSize(String appearanceSize) {
		this.appearanceSize = appearanceSize;
	}

	public String getBooleanTouchScreen() {
		return booleanTouchScreen;
	}

	public void setBooleanTouchScreen(String booleanTouchScreen) {
		this.booleanTouchScreen = booleanTouchScreen;
	}

	public String getScreenTexture() {
		return screenTexture;
	}

	public void setScreenTexture(String screenTexture) {
		this.screenTexture = screenTexture;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getRecordFunction() {
		return recordFunction;
	}

	public void setRecordFunction(String recordFunction) {
		this.recordFunction = recordFunction;
	}

	public String getProductionPort() {
		return productionPort;
	}

	public void setProductionPort(String productionPort) {
		this.productionPort = productionPort;
	}

	public String getScreenColors() {
		return screenColors;
	}

	public void setScreenColors(String screenColors) {
		this.screenColors = screenColors;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public String getBatteryInfo() {
		return batteryInfo;
	}

	public void setBatteryInfo(String batteryInfo) {
		this.batteryInfo = batteryInfo;
	}

	public String getTextFormatting() {
		return textFormatting;
	}

	public void setTextFormatting(String textFormatting) {
		this.textFormatting = textFormatting;
	}

	public String getInkWay() {
		return inkWay;
	}

	public void setInkWay(String inkWay) {
		this.inkWay = inkWay;
	}

	public String getPonPointElement() {
		return ponPointElement;
	}

	public void setPonPointElement(String ponPointElement) {
		this.ponPointElement = ponPointElement;
	}

	public String getPonPointKind() {
		return ponPointKind;
	}

	public void setPonPointKind(String ponPointKind) {
		this.ponPointKind = ponPointKind;
	}

	public String getCartridgeHardness() {
		return cartridgeHardness;
	}

	public void setCartridgeHardness(String cartridgeHardness) {
		this.cartridgeHardness = cartridgeHardness;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getScreenMaxShowPlaces() {
		return screenMaxShowPlaces;
	}

	public void setScreenMaxShowPlaces(String screenMaxShowPlaces) {
		this.screenMaxShowPlaces = screenMaxShowPlaces;
	}

	public String getBooleanRefillInk() {
		return booleanRefillInk;
	}

	public void setBooleanRefillInk(String booleanRefillInk) {
		this.booleanRefillInk = booleanRefillInk;
	}

	public String getBooleanDoubleHead() {
		return BooleanDoubleHead;
	}

	public void setBooleanDoubleHead(String booleanDoubleHead) {
		BooleanDoubleHead = booleanDoubleHead;
	}

	@Override
	public String toString() {
		return "GoodsOfficeStationary [id=" + id + ", Name=" + Name
				+ ", price=" + price + ", type=" + type + ", color=" + color
				+ ", size=" + size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", firstCost=" + firstCost
				+ ", paperSupply=" + paperSupply + ", afterSaleService="
				+ afterSaleService + ", printerType=" + printerType
				+ ", supplyVoltage=" + supplyVoltage
				+ ", booleanAutomaticDepleexPrinting="
				+ booleanAutomaticDepleexPrinting + ", printerSpeed="
				+ printerSpeed + ", portType=" + portType + ", model=" + model
				+ ", weight=" + weight + ", applySence=" + applySence
				+ ", booleanNetworkPrinter=" + booleanNetworkPrinter
				+ ", zoomMultiple=" + zoomMultiple + ", maxResolution="
				+ maxResolution + ", lightResourceType=" + lightResourceType
				+ ", bulbPower=" + bulbPower + ", projectionSize="
				+ projectionSize + ", luminance=" + luminance
				+ ", projectionKind=" + projectionKind + ", projectionWay="
				+ projectionWay + ", opticalResolution=" + opticalResolution
				+ ", projectionTechnique=" + projectionTechnique
				+ ", drumUnitStructure=" + drumUnitStructure + ", HPType="
				+ HPType + ", HPDrumUnt=" + HPDrumUnt + ", breadth=" + breadth
				+ ", packageNumber=" + packageNumber + ", copySpeed="
				+ copySpeed + ", function=" + function + ", productType="
				+ productType + ", consumableType=" + consumableType
				+ ", series=" + series + ", scanningResolution="
				+ scanningResolution + ", faxResolution=" + faxResolution
				+ ", maxCopyNumber=" + maxCopyNumber + ", faxSpeed=" + faxSpeed
				+ ", faxType=" + faxType + ", notepadClassify="
				+ notepadClassify + ", coverHardness=" + coverHardness
				+ ", bookbindingWay=" + bookbindingWay + ", style=" + style
				+ ", writeThickness=" + writeThickness + ", cartridgeColour="
				+ cartridgeColour + ", number=" + number
				+ ", booleanCustomization=" + booleanCustomization
				+ ", texture=" + texture + ", cartonBoxSize=" + cartonBoxSize
				+ ", doorStyle=" + doorStyle + ", strongboxType="
				+ strongboxType + ", memaryCapacity=" + memaryCapacity
				+ ", enduranceTime=" + enduranceTime + ", screenSize="
				+ screenSize + ", appearanceSize=" + appearanceSize
				+ ", booleanTouchScreen=" + booleanTouchScreen
				+ ", screenTexture=" + screenTexture + ", os=" + os
				+ ", recordFunction=" + recordFunction + ", productionPort="
				+ productionPort + ", screenColors=" + screenColors
				+ ", screenType=" + screenType + ", batteryInfo=" + batteryInfo
				+ ", textFormatting=" + textFormatting + ", inkWay=" + inkWay
				+ ", ponPointElement=" + ponPointElement + ", ponPointKind="
				+ ponPointKind + ", cartridgeHardness=" + cartridgeHardness
				+ ", use=" + use + ", screenMaxShowPlaces="
				+ screenMaxShowPlaces + ", booleanRefillInk="
				+ booleanRefillInk + ", BooleanDoubleHead=" + BooleanDoubleHead
				+ "]";
	}

}
