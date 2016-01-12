package com.cn.bsnt.model;
/**体育用品*/
public class GoodsSportGoods {

	/**体育用品id*/
	private int id;
	/**名称*/
	private String name;
	/**价格*/
	private double price;
	/**型号*/
	private String type;
	/**颜色*/
	private String color;
	/**尺寸*/
	private String size;
	/**品牌*/
	private String brand;
	/**库存*/
	private String count;
	/**月销量*/
	private String monthSales;
	/**总销量*/
	private String totalSales;
	/**描述*/
	private String desc;
	/**出厂价*/
	private String firstCost;
	/**羽毛球打法分类*/
	private String badmintonGameClassication;
	/**拍杆硬度*/
	private String shaftHardness;
	/**拍杆粗细*/
	private String shaftThickness;
	/**材质*/
	private String texture;
	/**重量*/
	private String weight;
	/**适用对象*/
	private String applyObject;
	/**握把大小*/
	private String gripSize;
	/**网球拍拍面分类*/
	private String racquetsFaceClassify;
	/**拍长分类*/
	private String longShotClassification;
	/**形状*/
	private String shape;
	/**球拍硬度*/
	private String racketHardness;
	/**厚度*/
	private String thickness;
	/**系列*/
	private String series;
	/**球分类*/
	private String ballClassification;
	/**规格*/
	private String standard;
	/**货号*/
	private String artNumber;
	/**足球缝线*/
	private String footballStitching;
	/**只数*/
	private String number;
	/**星级*/
	private String startLevel;
	/**套胶类型*/
	private String yasakaType;
	/**握拍方式*/
	private String gripWay;
	public GoodsSportGoods(){
		
	}
	public GoodsSportGoods(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String firstCost, String badmintonGameClassication,
			String shaftHardness, String shaftThickness, String texture,
			String weight, String applyObject, String gripSize,
			String racquetsFaceClassify, String longShotClassification,
			String shape, String racketHardness, String thickness,
			String series, String ballClassification, String standard,
			String artNumber, String footballStitching, String number,
			String startLevel, String yasakaType, String gripWay) {
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
		this.badmintonGameClassication = badmintonGameClassication;
		this.shaftHardness = shaftHardness;
		this.shaftThickness = shaftThickness;
		this.texture = texture;
		this.weight = weight;
		this.applyObject = applyObject;
		this.gripSize = gripSize;
		this.racquetsFaceClassify = racquetsFaceClassify;
		this.longShotClassification = longShotClassification;
		this.shape = shape;
		this.racketHardness = racketHardness;
		this.thickness = thickness;
		this.series = series;
		this.ballClassification = ballClassification;
		this.standard = standard;
		this.artNumber = artNumber;
		this.footballStitching = footballStitching;
		this.number = number;
		this.startLevel = startLevel;
		this.yasakaType = yasakaType;
		this.gripWay = gripWay;
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
	public String getBadmintonGameClassication() {
		return badmintonGameClassication;
	}
	public void setBadmintonGameClassication(String badmintonGameClassication) {
		this.badmintonGameClassication = badmintonGameClassication;
	}
	public String getShaftHardness() {
		return shaftHardness;
	}
	public void setShaftHardness(String shaftHardness) {
		this.shaftHardness = shaftHardness;
	}
	public String getShaftThickness() {
		return shaftThickness;
	}
	public void setShaftThickness(String shaftThickness) {
		this.shaftThickness = shaftThickness;
	}
	public String getTexture() {
		return texture;
	}
	public void setTexture(String texture) {
		this.texture = texture;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getApplyObject() {
		return applyObject;
	}
	public void setApplyObject(String applyObject) {
		this.applyObject = applyObject;
	}
	public String getGripSize() {
		return gripSize;
	}
	public void setGripSize(String gripSize) {
		this.gripSize = gripSize;
	}
	public String getRacquetsFaceClassify() {
		return racquetsFaceClassify;
	}
	public void setRacquetsFaceClassify(String racquetsFaceClassify) {
		this.racquetsFaceClassify = racquetsFaceClassify;
	}
	public String getLongShotClassification() {
		return longShotClassification;
	}
	public void setLongShotClassification(String longShotClassification) {
		this.longShotClassification = longShotClassification;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getRacketHardness() {
		return racketHardness;
	}
	public void setRacketHardness(String racketHardness) {
		this.racketHardness = racketHardness;
	}
	public String getThickness() {
		return thickness;
	}
	public void setThickness(String thickness) {
		this.thickness = thickness;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getBallClassification() {
		return ballClassification;
	}
	public void setBallClassification(String ballClassification) {
		this.ballClassification = ballClassification;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getArtNumber() {
		return artNumber;
	}
	public void setArtNumber(String artNumber) {
		this.artNumber = artNumber;
	}
	public String getFootballStitching() {
		return footballStitching;
	}
	public void setFootballStitching(String footballStitching) {
		this.footballStitching = footballStitching;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStartLevel() {
		return startLevel;
	}
	public void setStartLevel(String startLevel) {
		this.startLevel = startLevel;
	}
	public String getYasakaType() {
		return yasakaType;
	}
	public void setYasakaType(String yasakaType) {
		this.yasakaType = yasakaType;
	}
	public String getGripWay() {
		return gripWay;
	}
	public void setGripWay(String gripWay) {
		this.gripWay = gripWay;
	}
	@Override
	public String toString() {
		return "GoodsSportGoods [id=" + id + ", name=" + name + ", price="
				+ price + ", type=" + type + ", color=" + color + ", size="
				+ size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", firstCost=" + firstCost
				+ ", badmintonGameClassication=" + badmintonGameClassication
				+ ", shaftHardness=" + shaftHardness + ", shaftThickness="
				+ shaftThickness + ", texture=" + texture + ", weight="
				+ weight + ", applyObject=" + applyObject + ", gripSize="
				+ gripSize + ", racquetsFaceClassify=" + racquetsFaceClassify
				+ ", longShotClassification=" + longShotClassification
				+ ", shape=" + shape + ", racketHardness=" + racketHardness
				+ ", thickness=" + thickness + ", series=" + series
				+ ", ballClassification=" + ballClassification + ", standard="
				+ standard + ", artNumber=" + artNumber
				+ ", footballStitching=" + footballStitching + ", number="
				+ number + ", startLevel=" + startLevel + ", yasakaType="
				+ yasakaType + ", gripWay=" + gripWay + "]";
	}
	
}