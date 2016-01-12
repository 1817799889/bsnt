package com.cn.bsnt.model;

/*母婴用品**/
public class GoodsMotherBabyProduct {
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
	/** 适用年龄 */
	private String applyAge;
	/** 价格区间 */
	private String priceSection;
	/** 承重 */
	private String loadBearing;
	/** 材质 */
	private String texture;
	/** 出厂价 */
	private String firstCost;
	/** 功能 */
	private String function;
	/** 规格 */
	private String standard;
	/** 电源方式 */
	private String powerWay;
	/** 是否防水 */
	private String booleanWaterproof;
	/** 系列 */
	private String series;
	/** 容量 */
	private String capacity;
	/** 奶瓶是否带柄 */
	private String feeserBooleanHandle;
	/** 口径大小 */
	private String caliberSize;
	/** 形状 */
	private String shape;
	/** 款式 */
	private String pattern;
	/** 背带方式 */
	private String strapsWay;
	/** 检测标准 */
	private String testStaNdard;
	/** 适合体重 */
	private String applyWeight;
	/** 安装方式 */
	private String installWay;
	/** 人体固定方式 */
	private String peopleFixationWay;
	/** 适用性别 */
	private String applySex;
	/** 尿不湿品类 */
	private String diaperCategory;
	/** 电玩车类型 */
	private String videoCarType;
	/** 是否有导购视屏 */
	private String booleanShoppingView;
	/** 驱动类型 */
	private String driverType;
	/** 货号 */
	private String artNo;
	/** 手推 */
	private String booleanHandPush;
	/** 有无储物篮 */
	private String booleanStorageBasket;
	/** 有无遮阳 */
	private String BooleanSunshade;
	/** 车轮类型 */
	private String wheelType;
	/** 车轮个数 */
	private String wheelNumber;
	/** 套餐类型 */
	private String comboType;
	/** 玩具类型 */
	private String toyType;
	/** 产品品类 */
	private String productType;
	/** 外观造型 */
	private String appearanceMolding;
	/** 是否遥控 */
	private String booleanRemoteControl;
	/** 高度 */
	private String high;
	/** 填充物 */
	private String filler;
	/** 玩偶种类 */
	private String dollType;
	/** 是否可拆洗 */
	private String BooleanWashable;
	/** 用途 */
	private String use;
	/** 厚薄 */
	private String thickness;
	/** 适用季节 */
	private String applySeason;
	/** 卫生巾表层 */
	private String sanitartNapkinSurface;
	/** 适用对象 */
	private String applyObject;
	/** 待产包类型 */
	private String expectantPackageType;
	/** 面料 */
	private String linging;

	public GoodsMotherBabyProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsMotherBabyProduct(int id, String name, double price,
			String type, String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc, String applyAge,
			String priceSection, String loadBearing, String texture,
			String firstCost, String function, String standard,
			String powerWay, String booleanWaterproof, String series,
			String capacity, String feeserBooleanHandle, String caliberSize,
			String shape, String pattern, String strapsWay,
			String testStaNdard, String applyWeight, String installWay,
			String peopleFixationWay, String applySex, String diaperCategory,
			String videoCarType, String booleanShoppingView, String driverType,
			String artNo, String booleanHandPush, String booleanStorageBasket,
			String booleanSunshade, String wheelType, String wheelNumber,
			String comboType, String toyType, String productType,
			String appearanceMolding, String booleanRemoteControl, String high,
			String filler, String dollType, String booleanWashable, String use,
			String thickness, String applySeason, String sanitartNapkinSurface,
			String applyObject, String expectantPackageType, String linging) {

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
		this.applyAge = applyAge;
		this.priceSection = priceSection;
		this.loadBearing = loadBearing;
		this.texture = texture;
		this.firstCost = firstCost;
		this.function = function;
		this.standard = standard;
		this.powerWay = powerWay;
		this.booleanWaterproof = booleanWaterproof;
		this.series = series;
		this.capacity = capacity;
		this.feeserBooleanHandle = feeserBooleanHandle;
		this.caliberSize = caliberSize;
		this.shape = shape;
		this.pattern = pattern;
		this.strapsWay = strapsWay;
		this.testStaNdard = testStaNdard;
		this.applyWeight = applyWeight;
		this.installWay = installWay;
		this.peopleFixationWay = peopleFixationWay;
		this.applySex = applySex;
		this.diaperCategory = diaperCategory;
		this.videoCarType = videoCarType;
		this.booleanShoppingView = booleanShoppingView;
		this.driverType = driverType;
		this.artNo = artNo;
		this.booleanHandPush = booleanHandPush;
		this.booleanStorageBasket = booleanStorageBasket;
		BooleanSunshade = booleanSunshade;
		this.wheelType = wheelType;
		this.wheelNumber = wheelNumber;
		this.comboType = comboType;
		this.toyType = toyType;
		this.productType = productType;
		this.appearanceMolding = appearanceMolding;
		this.booleanRemoteControl = booleanRemoteControl;
		this.high = high;
		this.filler = filler;
		this.dollType = dollType;
		BooleanWashable = booleanWashable;
		this.use = use;
		this.thickness = thickness;
		this.applySeason = applySeason;
		this.sanitartNapkinSurface = sanitartNapkinSurface;
		this.applyObject = applyObject;
		this.expectantPackageType = expectantPackageType;
		this.linging = linging;
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

	public String getApplyAge() {
		return applyAge;
	}

	public void setApplyAge(String applyAge) {
		this.applyAge = applyAge;
	}

	public String getPriceSection() {
		return priceSection;
	}

	public void setPriceSection(String priceSection) {
		this.priceSection = priceSection;
	}

	public String getLoadBearing() {
		return loadBearing;
	}

	public void setLoadBearing(String loadBearing) {
		this.loadBearing = loadBearing;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getFirstCost() {
		return firstCost;
	}

	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getPowerWay() {
		return powerWay;
	}

	public void setPowerWay(String powerWay) {
		this.powerWay = powerWay;
	}

	public String getBooleanWaterproof() {
		return booleanWaterproof;
	}

	public void setBooleanWaterproof(String booleanWaterproof) {
		this.booleanWaterproof = booleanWaterproof;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getFeeserBooleanHandle() {
		return feeserBooleanHandle;
	}

	public void setFeeserBooleanHandle(String feeserBooleanHandle) {
		this.feeserBooleanHandle = feeserBooleanHandle;
	}

	public String getCaliberSize() {
		return caliberSize;
	}

	public void setCaliberSize(String caliberSize) {
		this.caliberSize = caliberSize;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getStrapsWay() {
		return strapsWay;
	}

	public void setStrapsWay(String strapsWay) {
		this.strapsWay = strapsWay;
	}

	public String getTestStaNdard() {
		return testStaNdard;
	}

	public void setTestStaNdard(String testStaNdard) {
		this.testStaNdard = testStaNdard;
	}

	public String getApplyWeight() {
		return applyWeight;
	}

	public void setApplyWeight(String applyWeight) {
		this.applyWeight = applyWeight;
	}

	public String getInstallWay() {
		return installWay;
	}

	public void setInstallWay(String installWay) {
		this.installWay = installWay;
	}

	public String getPeopleFixationWay() {
		return peopleFixationWay;
	}

	public void setPeopleFixationWay(String peopleFixationWay) {
		this.peopleFixationWay = peopleFixationWay;
	}

	public String getApplySex() {
		return applySex;
	}

	public void setApplySex(String applySex) {
		this.applySex = applySex;
	}

	public String getDiaperCategory() {
		return diaperCategory;
	}

	public void setDiaperCategory(String diaperCategory) {
		this.diaperCategory = diaperCategory;
	}

	public String getVideoCarType() {
		return videoCarType;
	}

	public void setVideoCarType(String videoCarType) {
		this.videoCarType = videoCarType;
	}

	public String getBooleanShoppingView() {
		return booleanShoppingView;
	}

	public void setBooleanShoppingView(String booleanShoppingView) {
		this.booleanShoppingView = booleanShoppingView;
	}

	public String getDriverType() {
		return driverType;
	}

	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}

	public String getArtNo() {
		return artNo;
	}

	public void setArtNo(String artNo) {
		this.artNo = artNo;
	}

	public String getBooleanHandPush() {
		return booleanHandPush;
	}

	public void setBooleanHandPush(String booleanHandPush) {
		this.booleanHandPush = booleanHandPush;
	}

	public String getBooleanStorageBasket() {
		return booleanStorageBasket;
	}

	public void setBooleanStorageBasket(String booleanStorageBasket) {
		this.booleanStorageBasket = booleanStorageBasket;
	}

	public String getBooleanSunshade() {
		return BooleanSunshade;
	}

	public void setBooleanSunshade(String booleanSunshade) {
		BooleanSunshade = booleanSunshade;
	}

	public String getWheelType() {
		return wheelType;
	}

	public void setWheelType(String wheelType) {
		this.wheelType = wheelType;
	}

	public String getWheelNumber() {
		return wheelNumber;
	}

	public void setWheelNumber(String wheelNumber) {
		this.wheelNumber = wheelNumber;
	}

	public String getComboType() {
		return comboType;
	}

	public void setComboType(String comboType) {
		this.comboType = comboType;
	}

	public String getToyType() {
		return toyType;
	}

	public void setToyType(String toyType) {
		this.toyType = toyType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getAppearanceMolding() {
		return appearanceMolding;
	}

	public void setAppearanceMolding(String appearanceMolding) {
		this.appearanceMolding = appearanceMolding;
	}

	public String getBooleanRemoteControl() {
		return booleanRemoteControl;
	}

	public void setBooleanRemoteControl(String booleanRemoteControl) {
		this.booleanRemoteControl = booleanRemoteControl;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public String getDollType() {
		return dollType;
	}

	public void setDollType(String dollType) {
		this.dollType = dollType;
	}

	public String getBooleanWashable() {
		return BooleanWashable;
	}

	public void setBooleanWashable(String booleanWashable) {
		BooleanWashable = booleanWashable;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getThickness() {
		return thickness;
	}

	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	public String getApplySeason() {
		return applySeason;
	}

	public void setApplySeason(String applySeason) {
		this.applySeason = applySeason;
	}

	public String getSanitartNapkinSurface() {
		return sanitartNapkinSurface;
	}

	public void setSanitartNapkinSurface(String sanitartNapkinSurface) {
		this.sanitartNapkinSurface = sanitartNapkinSurface;
	}

	public String getApplyObject() {
		return applyObject;
	}

	public void setApplyObject(String applyObject) {
		this.applyObject = applyObject;
	}

	public String getExpectantPackageType() {
		return expectantPackageType;
	}

	public void setExpectantPackageType(String expectantPackageType) {
		this.expectantPackageType = expectantPackageType;
	}

	public String getLinging() {
		return linging;
	}

	public void setLinging(String linging) {
		this.linging = linging;
	}

	@Override
	public String toString() {
		return "GoodsMotherBabyProduct [id=" + id + ", Name=" + Name
				+ ", price=" + price + ", type=" + type + ", color=" + color
				+ ", size=" + size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", applyAge=" + applyAge
				+ ", priceSection=" + priceSection + ", loadBearing="
				+ loadBearing + ", texture=" + texture + ", firstCost="
				+ firstCost + ", function=" + function + ", standard="
				+ standard + ", powerWay=" + powerWay + ", booleanWaterproof="
				+ booleanWaterproof + ", series=" + series + ", capacity="
				+ capacity + ", feeserBooleanHandle=" + feeserBooleanHandle
				+ ", caliberSize=" + caliberSize + ", shape=" + shape
				+ ", pattern=" + pattern + ", strapsWay=" + strapsWay
				+ ", testStaNdard=" + testStaNdard + ", applyWeight="
				+ applyWeight + ", installWay=" + installWay
				+ ", peopleFixationWay=" + peopleFixationWay + ", applySex="
				+ applySex + ", diaperCategory=" + diaperCategory
				+ ", videoCarType=" + videoCarType + ", booleanShoppingView="
				+ booleanShoppingView + ", driverType=" + driverType
				+ ", artNo=" + artNo + ", booleanHandPush=" + booleanHandPush
				+ ", booleanStorageBasket=" + booleanStorageBasket
				+ ", BooleanSunshade=" + BooleanSunshade + ", wheelType="
				+ wheelType + ", wheelNumber=" + wheelNumber + ", comboType="
				+ comboType + ", toyType=" + toyType + ", productType="
				+ productType + ", appearanceMolding=" + appearanceMolding
				+ ", booleanRemoteControl=" + booleanRemoteControl + ", high="
				+ high + ", filler=" + filler + ", dollType=" + dollType
				+ ", BooleanWashable=" + BooleanWashable + ", use=" + use
				+ ", thickness=" + thickness + ", applySeason=" + applySeason
				+ ", sanitartNapkinSurface=" + sanitartNapkinSurface
				+ ", applyObject=" + applyObject + ", expectantPackageType="
				+ expectantPackageType + ", linging=" + linging + "]";
	}

}
