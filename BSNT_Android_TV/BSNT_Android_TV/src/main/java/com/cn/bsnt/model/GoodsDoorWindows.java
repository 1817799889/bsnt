package com.cn.bsnt.model;
/** �Ŵ�װ��*/
public class GoodsDoorWindows {
	/** �Ŵ�װ��ID */
	private int id;
	/** ����*/
	private String name;
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
	/** ������ */
	private String firstCost;
	/** ����*/
	private String texture;
	/** ���湤��*/
	private String facingProcess;
	/** ���Ϸ�ʽ*/
	private String openCloseWay;
	/** �Ƽ۵�λ*/
	private String chargeUnit;
	/** �Ű����*/
	private String doorSheetTexture;
	/** �߿����*/
	private String borderTexture;
	/** ��������*/
	private String GlassType;
	/** ͬ�Ƿ���*/
	private String sameCityService;
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
	public String getTexture() {
		return texture;
	}
	public void setTexture(String texture) {
		this.texture = texture;
	}
	public String getFacingProcess() {
		return facingProcess;
	}
	public void setFacingProcess(String facingProcess) {
		this.facingProcess = facingProcess;
	}
	public String getOpenCloseWay() {
		return openCloseWay;
	}
	public void setOpenCloseWay(String openCloseWay) {
		this.openCloseWay = openCloseWay;
	}
	public String getChargeUnit() {
		return chargeUnit;
	}
	public void setChargeUnit(String chargeUnit) {
		this.chargeUnit = chargeUnit;
	}
	public String getDoorSheetTexture() {
		return doorSheetTexture;
	}
	public void setDoorSheetTexture(String doorSheetTexture) {
		this.doorSheetTexture = doorSheetTexture;
	}
	public String getBorderTexture() {
		return borderTexture;
	}
	public void setBorderTexture(String borderTexture) {
		this.borderTexture = borderTexture;
	}
	public String getGlassType() {
		return GlassType;
	}
	public void setGlassType(String glassType) {
		GlassType = glassType;
	}
	public String getSameCityService() {
		return sameCityService;
	}
	public void setSameCityService(String sameCityService) {
		this.sameCityService = sameCityService;
	}
	public GoodsDoorWindows() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsDoorWindows(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc,
			String firstCost, String texture, String facingProcess,
			String openCloseWay, String chargeUnit, String doorSheetTexture,
			String borderTexture, String glassType, String sameCityService) {
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
		this.texture = texture;
		this.facingProcess = facingProcess;
		this.openCloseWay = openCloseWay;
		this.chargeUnit = chargeUnit;
		this.doorSheetTexture = doorSheetTexture;
		this.borderTexture = borderTexture;
		GlassType = glassType;
		this.sameCityService = sameCityService;
	}
	
	
}
