package com.cn.bsnt.model;
    /** ũ����е*/
public class GoodsAgriculturesMachinery {
	/** ũ����еID*/
	private int id;
	/** ����*/
	private String name;
	/** �۸�*/
	private double price;
	/** �ͺ�*/
	private String type;
	/** ��ɫ*/
	private String color;
	/** �ߴ�*/
	private String size;
	/** Ʒ��*/
	private String brand;
	/** ���*/
	private String count;
	/** ������*/
	private String monthSales;
	/** ������*/
	private String totalSales;
	/** ����*/
	private String desc;
	/** ������*/
	private String firstCost;
	/** ũ������*/
	private String agriculturalMachineryType;
	/** �Ƿ�ɶ���*/
	private String booleanCustomize;
	/** ������ҵ*/
	private String applyTradde;
	/** �Զ����̶�*/
	private String automationDegree;
	/** ���ö���*/
	private String applyObject;
	/** ����*/
	private String texture;
	/** ��������*/
	private String powerType;
	/** ������̬*/
	private String fertilizerForm;
	/** ����*/
	private String artNumber;
	/** ���û���*/
	private String applyEnvironment;
	/** ����*/
	private String seaSale;
	/** ��ϸ����*/
	private String fineSeaSale;
	/** ��ˮ��ֳ*/
	private String seaculture;
	/** ˮ��ɱ������*/
	private String waterSterillzation;
	/** ��������*/
	private String productionDate;
	
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
	public String getAgriculturalMachineryType() {
		return agriculturalMachineryType;
	}
	public void setAgriculturalMachineryType(String agriculturalMachineryType) {
		this.agriculturalMachineryType = agriculturalMachineryType;
	}
	public String getBooleanCustomize() {
		return booleanCustomize;
	}
	public void setBooleanCustomize(String booleanCustomize) {
		this.booleanCustomize = booleanCustomize;
	}
	public String getApplyTradde() {
		return applyTradde;
	}
	public void setApplyTradde(String applyTradde) {
		this.applyTradde = applyTradde;
	}
	public String getAutomationDegree() {
		return automationDegree;
	}
	public void setAutomationDegree(String automationDegree) {
		this.automationDegree = automationDegree;
	}
	public String getApplyObject() {
		return applyObject;
	}
	public void setApplyObject(String applyObject) {
		this.applyObject = applyObject;
	}
	public String getTexture() {
		return texture;
	}
	public void setTexture(String texture) {
		this.texture = texture;
	}
	public String getPowerType() {
		return powerType;
	}
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}
	public String getFertilizerForm() {
		return fertilizerForm;
	}
	public void setFertilizerForm(String fertilizerForm) {
		this.fertilizerForm = fertilizerForm;
	}
	public String getArtNumber() {
		return artNumber;
	}
	public void setArtNumber(String artNumber) {
		this.artNumber = artNumber;
	}
	public String getApplyEnvironment() {
		return applyEnvironment;
	}
	public void setApplyEnvironment(String applyEnvironment) {
		this.applyEnvironment = applyEnvironment;
	}
	public String getSeaSale() {
		return seaSale;
	}
	public void setSeaSale(String seaSale) {
		this.seaSale = seaSale;
	}
	public String getFineSeaSale() {
		return fineSeaSale;
	}
	public void setFineSeaSale(String fineSeaSale) {
		this.fineSeaSale = fineSeaSale;
	}
	public String getSeaculture() {
		return seaculture;
	}
	public void setSeaculture(String seaculture) {
		this.seaculture = seaculture;
	}
	public String getWaterSterillzation() {
		return waterSterillzation;
	}
	public void setWaterSterillzation(String waterSterillzation) {
		this.waterSterillzation = waterSterillzation;
	}
	public String getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	public GoodsAgriculturesMachinery() {
		super();
		 //TODO Auto-generated constructor stub
	}
	public GoodsAgriculturesMachinery(int id, String name, double price,
			String type, String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String firstCost, String agriculturalMachineryType,
			String booleanCustomize, String applyTradde,
			String automationDegree, String applyObject, String texture,
			String powerType, String fertilizerForm, String artNumber,
			String applyEnvironment, String seaSale, String fineSeaSale,
			String seaculture, String waterSterillzation, String productionDate) {
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
		this.agriculturalMachineryType = agriculturalMachineryType;
		this.booleanCustomize = booleanCustomize;
		this.applyTradde = applyTradde;
		this.automationDegree = automationDegree;
		this.applyObject = applyObject;
		this.texture = texture;
		this.powerType = powerType;
		this.fertilizerForm = fertilizerForm;
		this.artNumber = artNumber;
		this.applyEnvironment = applyEnvironment;
		this.seaSale = seaSale;
		this.fineSeaSale = fineSeaSale;
		this.seaculture = seaculture;
		this.waterSterillzation = waterSterillzation;
		this.productionDate = productionDate;
	}
    
    
    
    
	 

}
