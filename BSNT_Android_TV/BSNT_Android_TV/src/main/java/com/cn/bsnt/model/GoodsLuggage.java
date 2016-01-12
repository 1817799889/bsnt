package com.cn.bsnt.model;

	/** 箱包 */
	public class GoodsLuggage {
	/** 编号 */
	private int id;
	/** 名称 */
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
	/** 风格 */
	private String style;
	/** 背包方式 */
	private String backpackWay;
	/** 质地 */
	private String grain;
	/** 材料工艺 */
	private String materialProcess;
	/** 提拎部件类型 */
	private String carryComponentType;
	/** 闭合方式 */
	private String closeWay;
	/** 内部结构 */
	private String internalStructure;
	/** 箱包外袋种类 */
	private String luggageOuterBagType;
	/** 流行元素 */
	private String fashionElement;
	/** 箱包硬度 */
	private String luggageHardness;
	/** 是否可折叠 */
	private String booleanFold;
	/** 成色 */
	private String condition;
	/** 适用场景 */
	private String applyScene;
	/** 款式 */
	private String desigh;
	/** 形状 */
	private String shape;
	/** 肩带样式 */
	private String shoulderGirdleStyle;
	/** 里料材质 */
	private String liningTexture;
	/** 是否有扩展层 */
	private String booleanExpendTier;
	/** 适用对象 */
	private String applyObject;
	/** 锁的类型 */
	private String lockType;
	/** 有无拉杆 */
	private String booleanPullRod;
	/** 是否带锁 */
	private String booleanLock;
	/** 滚轮样式 */
	private String trolleyStyle;
	/** 是否配包 */
	private String booleanWithPackage;
	/** 性别 */
	private String sex;
	/** 图案 */
	private String pattern;
	/** 流行款式名称 */
	private String fashionStyleName;
	/** 有无夹层 */
	private String booleanInterlayer;
	/** 防水程度 */
	private String waterproofDegree;
	/** 是否有背部缓冲棉 */
	private String booleanBackBufferCotton;
	/** 皮革材料 */
	private String leatherTexture;
	/** 容纳电脑尺寸 */
	private String accommodateComputerSize;
	/** 出厂价 */
	private String firstCost;

	public GoodsLuggage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsLuggage(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc, String style,
			String backpackWay, String grain, String materialProcess,
			String carryComponentType, String closeWay,
			String internalStructure, String luggageOuterBagType,
			String fashionElement, String luggageHardness, String booleanFold,
			String condition, String applyScene, String desigh, String shape,
			String shoulderGirdleStyle, String liningTexture,
			String booleanExpendTier, String applyObject, String lockType,
			String booleanPullRod, String booleanLock, String trolleyStyle,
			String booleanWithPackage, String sex, String pattern,
			String fashionStyleName, String booleanInterlayer,
			String waterproofDegree, String booleanBackBufferCotton,
			String leatherTexture, String accommodateComputerSize,
			String firstCost) {
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
		this.style = style;
		this.backpackWay = backpackWay;
		this.grain = grain;
		this.materialProcess = materialProcess;
		this.carryComponentType = carryComponentType;
		this.closeWay = closeWay;
		this.internalStructure = internalStructure;
		this.luggageOuterBagType = luggageOuterBagType;
		this.fashionElement = fashionElement;
		this.luggageHardness = luggageHardness;
		this.booleanFold = booleanFold;
		this.condition = condition;
		this.applyScene = applyScene;
		this.desigh = desigh;
		this.shape = shape;
		this.shoulderGirdleStyle = shoulderGirdleStyle;
		this.liningTexture = liningTexture;
		this.booleanExpendTier = booleanExpendTier;
		this.applyObject = applyObject;
		this.lockType = lockType;
		this.booleanPullRod = booleanPullRod;
		this.booleanLock = booleanLock;
		this.trolleyStyle = trolleyStyle;
		this.booleanWithPackage = booleanWithPackage;
		this.sex = sex;
		this.pattern = pattern;
		this.fashionStyleName = fashionStyleName;
		this.booleanInterlayer = booleanInterlayer;
		this.waterproofDegree = waterproofDegree;
		this.booleanBackBufferCotton = booleanBackBufferCotton;
		this.leatherTexture = leatherTexture;
		this.accommodateComputerSize = accommodateComputerSize;
		this.firstCost = firstCost;
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

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getBackpackWay() {
		return backpackWay;
	}

	public void setBackpackWay(String backpackWay) {
		this.backpackWay = backpackWay;
	}

	public String getGrain() {
		return grain;
	}

	public void setGrain(String grain) {
		this.grain = grain;
	}

	public String getMaterialProcess() {
		return materialProcess;
	}

	public void setMaterialProcess(String materialProcess) {
		this.materialProcess = materialProcess;
	}

	public String getCarryComponentType() {
		return carryComponentType;
	}

	public void setCarryComponentType(String carryComponentType) {
		this.carryComponentType = carryComponentType;
	}

	public String getCloseWay() {
		return closeWay;
	}

	public void setCloseWay(String closeWay) {
		this.closeWay = closeWay;
	}

	public String getInternalStructure() {
		return internalStructure;
	}

	public void setInternalStructure(String internalStructure) {
		this.internalStructure = internalStructure;
	}

	public String getLuggageOuterBagType() {
		return luggageOuterBagType;
	}

	public void setLuggageOuterBagType(String luggageOuterBagType) {
		this.luggageOuterBagType = luggageOuterBagType;
	}

	public String getFashionElement() {
		return fashionElement;
	}

	public void setFashionElement(String fashionElement) {
		this.fashionElement = fashionElement;
	}

	public String getLuggageHardness() {
		return luggageHardness;
	}

	public void setLuggageHardness(String luggageHardness) {
		this.luggageHardness = luggageHardness;
	}

	public String getBooleanFold() {
		return booleanFold;
	}

	public void setBooleanFold(String booleanFold) {
		this.booleanFold = booleanFold;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getApplyScene() {
		return applyScene;
	}

	public void setApplyScene(String applyScene) {
		this.applyScene = applyScene;
	}

	public String getDesigh() {
		return desigh;
	}

	public void setDesigh(String desigh) {
		this.desigh = desigh;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getShoulderGirdleStyle() {
		return shoulderGirdleStyle;
	}

	public void setShoulderGirdleStyle(String shoulderGirdleStyle) {
		this.shoulderGirdleStyle = shoulderGirdleStyle;
	}

	public String getLiningTexture() {
		return liningTexture;
	}

	public void setLiningTexture(String liningTexture) {
		this.liningTexture = liningTexture;
	}

	public String getBooleanExpendTier() {
		return booleanExpendTier;
	}

	public void setBooleanExpendTier(String booleanExpendTier) {
		this.booleanExpendTier = booleanExpendTier;
	}

	public String getApplyObject() {
		return applyObject;
	}

	public void setApplyObject(String applyObject) {
		this.applyObject = applyObject;
	}

	public String getLockType() {
		return lockType;
	}

	public void setLockType(String lockType) {
		this.lockType = lockType;
	}

	public String getBooleanPullRod() {
		return booleanPullRod;
	}

	public void setBooleanPullRod(String booleanPullRod) {
		this.booleanPullRod = booleanPullRod;
	}

	public String getBooleanLock() {
		return booleanLock;
	}

	public void setBooleanLock(String booleanLock) {
		this.booleanLock = booleanLock;
	}

	public String getTrolleyStyle() {
		return trolleyStyle;
	}

	public void setTrolleyStyle(String trolleyStyle) {
		this.trolleyStyle = trolleyStyle;
	}

	public String getBooleanWithPackage() {
		return booleanWithPackage;
	}

	public void setBooleanWithPackage(String booleanWithPackage) {
		this.booleanWithPackage = booleanWithPackage;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getFashionStyleName() {
		return fashionStyleName;
	}

	public void setFashionStyleName(String fashionStyleName) {
		this.fashionStyleName = fashionStyleName;
	}

	public String getBooleanInterlayer() {
		return booleanInterlayer;
	}

	public void setBooleanInterlayer(String booleanInterlayer) {
		this.booleanInterlayer = booleanInterlayer;
	}

	public String getWaterproofDegree() {
		return waterproofDegree;
	}

	public void setWaterproofDegree(String waterproofDegree) {
		this.waterproofDegree = waterproofDegree;
	}

	public String getBooleanBackBufferCotton() {
		return booleanBackBufferCotton;
	}

	public void setBooleanBackBufferCotton(String booleanBackBufferCotton) {
		this.booleanBackBufferCotton = booleanBackBufferCotton;
	}

	public String getLeatherTexture() {
		return leatherTexture;
	}

	public void setLeatherTexture(String leatherTexture) {
		this.leatherTexture = leatherTexture;
	}

	public String getAccommodateComputerSize() {
		return accommodateComputerSize;
	}

	public void setAccommodateComputerSize(String accommodateComputerSize) {
		this.accommodateComputerSize = accommodateComputerSize;
	}

	public String getFirstCost() {
		return firstCost;
	}

	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}

	@Override
	public String toString() {
		return "GoodsLuggage [id=" + id + ", name=" + name + ", price=" + price
				+ ", type=" + type + ", color=" + color + ", size=" + size
				+ ", brand=" + brand + ", count=" + count + ", monthSales="
				+ monthSales + ", totalSales=" + totalSales + ", desc=" + desc
				+ ", style=" + style + ", backpackWay=" + backpackWay
				+ ", grain=" + grain + ", materialProcess=" + materialProcess
				+ ", carryComponentType=" + carryComponentType + ", closeWay="
				+ closeWay + ", internalStructure=" + internalStructure
				+ ", luggageOuterBagType=" + luggageOuterBagType
				+ ", fashionElement=" + fashionElement + ", luggageHardness="
				+ luggageHardness + ", booleanFold=" + booleanFold
				+ ", condition=" + condition + ", applyScene=" + applyScene
				+ ", desigh=" + desigh + ", shape=" + shape
				+ ", shoulderGirdleStyle=" + shoulderGirdleStyle
				+ ", liningTexture=" + liningTexture + ", booleanExpendTier="
				+ booleanExpendTier + ", applyObject=" + applyObject
				+ ", lockType=" + lockType + ", booleanPullRod="
				+ booleanPullRod + ", booleanLock=" + booleanLock
				+ ", trolleyStyle=" + trolleyStyle + ", booleanWithPackage="
				+ booleanWithPackage + ", sex=" + sex + ", pattern=" + pattern
				+ ", fashionStyleName=" + fashionStyleName
				+ ", booleanInterlayer=" + booleanInterlayer
				+ ", waterproofDegree=" + waterproofDegree
				+ ", booleanBackBufferCotton=" + booleanBackBufferCotton
				+ ", leatherTexture=" + leatherTexture
				+ ", accommodateComputerSize=" + accommodateComputerSize
				+ ", firstCost=" + firstCost + "]";
	}

}
