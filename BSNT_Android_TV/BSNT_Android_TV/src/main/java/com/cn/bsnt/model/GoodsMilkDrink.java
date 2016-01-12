package com.cn.bsnt.model;

/** ţ������ */
public class GoodsMilkDrink {
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
	/** ��װ��ʽ */
	private String packWay;
	/** ���� */
	private String woeksInitials;
	/** ��ַ */
	private String factorySite;
	/** ������ϵ�绰 */
	private String factoryPhone;
	/** ������ */
	private String firstCost;
	/** ���ϱ� */
	private String burdeSheet;
	/** ���ط��� */
	private String storeWay;
	/** ������ */
	private String expiratoinDate;
	/** ʳƷ��Ӽ� */
	private String foodAdditives;
	/** ������ */
	private String netContent;
	/** ϵ�� */
	private String seriecs;
	/** �Ƿ��� */
	private String privatencludeSugar;
	/** ���� */
	private String prpductArea;
	/** ���� */
	private String kind;
	/** �Ƿ�ʳ */
	private String booleanInstant;
	/** �������� */
	private String productDate;
	/** ԭ�ϳɷ� */
	private String materialElement;
	/** ��ζ */
	private String taste;
	/** �ײͷ��� */
	private String comboWeight;
	/** �ײ����� */
	private String comboCycle;
	/** ����Ƶ�� */
	private String distributionFrequency;
	/** ��װ���� */
	private String packageKind;
	/** ���ö��� */
	private String applyObject;
	/** ʳƷ���� */
	private String foodProcess;
	/** �ز�Ʒ�� */
	private String specialtyCategory;

	

	public GoodsMilkDrink(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc, String packWay,
			String woeksInitials, String factorySite, String factoryPhone,
			String firstCost, String burdeSheet, String storeWay,
			String expiratoinDate, String foodAdditives, String netContent,
			String seriecs, String privatencludeSugar, String prpductArea,
			String kind, String booleanInstant, String productDate,
			String materialElement, String taste, String comboWeight,
			String comboCycle, String distributionFrequency,
			String packageKind, String applyObject, String foodProcess,
			String specialtyCategory) {
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
		this.packWay = packWay;
		this.woeksInitials = woeksInitials;
		this.factorySite = factorySite;
		this.factoryPhone = factoryPhone;
		this.firstCost = firstCost;
		this.burdeSheet = burdeSheet;
		this.storeWay = storeWay;
		this.expiratoinDate = expiratoinDate;
		this.foodAdditives = foodAdditives;
		this.netContent = netContent;
		this.seriecs = seriecs;
		this.privatencludeSugar = privatencludeSugar;
		this.prpductArea = prpductArea;
		this.kind = kind;
		this.booleanInstant = booleanInstant;
		this.productDate = productDate;
		this.materialElement = materialElement;
		this.taste = taste;
		this.comboWeight = comboWeight;
		this.comboCycle = comboCycle;
		this.distributionFrequency = distributionFrequency;
		this.packageKind = packageKind;
		this.applyObject = applyObject;
		this.foodProcess = foodProcess;
		this.specialtyCategory = specialtyCategory;
	}

	public GoodsMilkDrink() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getPackWay() {
		return packWay;
	}

	public void setPackWay(String packWay) {
		this.packWay = packWay;
	}

	public String getWoeksInitials() {
		return woeksInitials;
	}

	public void setWoeksInitials(String woeksInitials) {
		this.woeksInitials = woeksInitials;
	}

	public String getFactorySite() {
		return factorySite;
	}

	public void setFactorySite(String factorySite) {
		this.factorySite = factorySite;
	}

	public String getFactoryPhone() {
		return factoryPhone;
	}

	public void setFactoryPhone(String factoryPhone) {
		this.factoryPhone = factoryPhone;
	}

	public String getFirstCost() {
		return firstCost;
	}

	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}

	public String getBurdeSheet() {
		return burdeSheet;
	}

	public void setBurdeSheet(String burdeSheet) {
		this.burdeSheet = burdeSheet;
	}

	public String getStoreWay() {
		return storeWay;
	}

	public void setStoreWay(String storeWay) {
		this.storeWay = storeWay;
	}

	public String getExpiratoinDate() {
		return expiratoinDate;
	}

	public void setExpiratoinDate(String expiratoinDate) {
		this.expiratoinDate = expiratoinDate;
	}

	public String getFoodAdditives() {
		return foodAdditives;
	}

	public void setFoodAdditives(String foodAdditives) {
		this.foodAdditives = foodAdditives;
	}

	public String getNetContent() {
		return netContent;
	}

	public void setNetContent(String netContent) {
		this.netContent = netContent;
	}

	public String getSeriecs() {
		return seriecs;
	}

	public void setSeriecs(String seriecs) {
		this.seriecs = seriecs;
	}

	public String getPrivatencludeSugar() {
		return privatencludeSugar;
	}

	public void setPrivatencludeSugar(String privatencludeSugar) {
		this.privatencludeSugar = privatencludeSugar;
	}

	public String getPrpductArea() {
		return prpductArea;
	}

	public void setPrpductArea(String prpductArea) {
		this.prpductArea = prpductArea;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getBooleanInstant() {
		return booleanInstant;
	}

	public void setBooleanInstant(String booleanInstant) {
		this.booleanInstant = booleanInstant;
	}

	public String getProductDate() {
		return productDate;
	}

	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}

	public String getMaterialElement() {
		return materialElement;
	}

	public void setMaterialElement(String materialElement) {
		this.materialElement = materialElement;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getComboWeight() {
		return comboWeight;
	}

	public void setComboWeight(String comboWeight) {
		this.comboWeight = comboWeight;
	}

	public String getComboCycle() {
		return comboCycle;
	}

	public void setComboCycle(String comboCycle) {
		this.comboCycle = comboCycle;
	}

	public String getDistributionFrequency() {
		return distributionFrequency;
	}

	public void setDistributionFrequency(String distributionFrequency) {
		this.distributionFrequency = distributionFrequency;
	}

	public String getPackageKind() {
		return packageKind;
	}

	public void setPackageKind(String packageKind) {
		this.packageKind = packageKind;
	}

	public String getApplyObject() {
		return applyObject;
	}

	public void setApplyObject(String applyObject) {
		this.applyObject = applyObject;
	}

	public String getFoodProcess() {
		return foodProcess;
	}

	public void setFoodProcess(String foodProcess) {
		this.foodProcess = foodProcess;
	}

	public String getSpecialtyCategory() {
		return specialtyCategory;
	}

	public void setSpecialtyCategory(String specialtyCategory) {
		this.specialtyCategory = specialtyCategory;
	}

	@Override
	public String toString() {
		return "GoodsMilkdrink [id=" + id + ", Name=" + Name + ", price="
				+ price + ", type=" + type + ", color=" + color + ", size="
				+ size + ", brand=" + brand + ", count=" + count
				+ ", monthSales=" + monthSales + ", totalSales=" + totalSales
				+ ", desc=" + desc + ", packWay=" + packWay
				+ ", woeksInitials=" + woeksInitials + ", factorySite="
				+ factorySite + ", factoryPhone=" + factoryPhone
				+ ", firstCost=" + firstCost + ", burdeSheet=" + burdeSheet
				+ ", storeWay=" + storeWay + ", expiratoinDate="
				+ expiratoinDate + ", foodAdditives=" + foodAdditives
				+ ", netContent=" + netContent + ", seriecs=" + seriecs
				+ ", privatencludeSugar=" + privatencludeSugar
				+ ", prpductArea=" + prpductArea + ", kind=" + kind
				+ ", booleanInstant=" + booleanInstant + ", productDate="
				+ productDate + ", materialElement=" + materialElement
				+ ", taste=" + taste + ", comboWeight=" + comboWeight
				+ ", comboCycle=" + comboCycle + ", distributionFrequency="
				+ distributionFrequency + ", packageKind=" + packageKind
				+ ", applyObject=" + applyObject + ", foodProcess="
				+ foodProcess + ", specialtyCategory=" + specialtyCategory
				+ "]";
	}

}
