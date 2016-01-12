package com.cn.bsnt.model;

/** ���� */
public class GoodsIcebox {
	/** ������ */
	private int Id;
	/** ���� */
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
	/** ���� */
	private String mold;
	/** ���Žṹ */
	private String structure;
	/** ��ѹ/Ƶ�� */
	private String uF;
	/** ���ŷ�ʽ */
	private String openDoorType;
	/** ����ݻ� */
	private String max_v;
	/** �䶳���ݻ� */
	private String freezing_chamber_v;
	/** ������� */
	private String panel_type;
	/** �䶳���� */
	private String refrigerationType;
	/** ��˪���� */
	private String defrostType;
	/** ��ת�� */
	private String revolveVoiceDb;
	/** ����� */
	private String defrostDose;
	/** ��Ʒ���� */
	private String productWeight;
	/** �ĵ��� */
	private String powerConsumption;
	/** �Ƿ���˪ */
	private String booleanNoRime;
	/** ���·�ʽ */
	private String heatType;
	/** ��Ч�ȼ� */
	private String eei;
	/** ������ */
	private String firstCost;

	

	public GoodsIcebox() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsIcebox(int id, String name, double price, String type,
			String color, String size, String brand, String count,
			String monthSales, String totalSales, String desc, String mold,
			String structure, String uF, String openDoorType, String max_v,
			String freezing_chamber_v, String panel_type,
			String refrigerationType, String defrostType,
			String revolveVoiceDb, String defrostDose, String productWeight,
			String powerConsumption, String booleanNoRime, String heatType,
			String eei, String firstCost) {
		Id = id;
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
		this.mold = mold;
		this.structure = structure;
		this.uF = uF;
		this.openDoorType = openDoorType;
		this.max_v = max_v;
		this.freezing_chamber_v = freezing_chamber_v;
		this.panel_type = panel_type;
		this.refrigerationType = refrigerationType;
		this.defrostType = defrostType;
		this.revolveVoiceDb = revolveVoiceDb;
		this.defrostDose = defrostDose;
		this.productWeight = productWeight;
		this.powerConsumption = powerConsumption;
		this.booleanNoRime = booleanNoRime;
		this.heatType = heatType;
		this.eei = eei;
		this.firstCost = firstCost;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getMold() {
		return mold;
	}

	public void setMold(String mold) {
		this.mold = mold;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getuF() {
		return uF;
	}

	public void setuF(String uF) {
		this.uF = uF;
	}

	public String getOpenDoorType() {
		return openDoorType;
	}

	public void setOpenDoorType(String openDoorType) {
		this.openDoorType = openDoorType;
	}

	public String getMax_v() {
		return max_v;
	}

	public void setMax_v(String max_v) {
		this.max_v = max_v;
	}

	public String getFreezing_chamber_v() {
		return freezing_chamber_v;
	}

	public void setFreezing_chamber_v(String freezing_chamber_v) {
		this.freezing_chamber_v = freezing_chamber_v;
	}

	public String getPanel_type() {
		return panel_type;
	}

	public void setPanel_type(String panel_type) {
		this.panel_type = panel_type;
	}

	public String getRefrigerationType() {
		return refrigerationType;
	}

	public void setRefrigerationType(String refrigerationType) {
		this.refrigerationType = refrigerationType;
	}

	public String getDefrostType() {
		return defrostType;
	}

	public void setDefrostType(String defrostType) {
		this.defrostType = defrostType;
	}

	public String getRevolveVoiceDb() {
		return revolveVoiceDb;
	}

	public void setRevolveVoiceDb(String revolveVoiceDb) {
		this.revolveVoiceDb = revolveVoiceDb;
	}

	public String getDefrostDose() {
		return defrostDose;
	}

	public void setDefrostDose(String defrostDose) {
		this.defrostDose = defrostDose;
	}

	public String getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}

	public String getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(String powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getBooleanNoRime() {
		return booleanNoRime;
	}

	public void setBooleanNoRime(String booleanNoRime) {
		this.booleanNoRime = booleanNoRime;
	}

	public String getHeatType() {
		return heatType;
	}

	public void setHeatType(String heatType) {
		this.heatType = heatType;
	}

	public String getEei() {
		return eei;
	}

	public void setEei(String eei) {
		this.eei = eei;
	}

	public String getFirstCost() {
		return firstCost;
	}

	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}

	@Override
	public String toString() {
		return "Goods_Icebox [Id=" + Id + ", name=" + name + ", price=" + price
				+ ", type=" + type + ", color=" + color + ", size=" + size
				+ ", brand=" + brand + ", count=" + count + ", monthSales="
				+ monthSales + ", totalSales=" + totalSales + ", desc=" + desc
				+ ", mold=" + mold + ", structure=" + structure + ", uF=" + uF
				+ ", openDoorType=" + openDoorType + ", max_v=" + max_v
				+ ", freezing_chamber_v=" + freezing_chamber_v
				+ ", panel_type=" + panel_type + ", refrigerationType="
				+ refrigerationType + ", defrostType=" + defrostType
				+ ", revolveVoiceDb=" + revolveVoiceDb + ", defrostDose="
				+ defrostDose + ", productWeight=" + productWeight
				+ ", powerConsumption=" + powerConsumption + ", booleanNoRime="
				+ booleanNoRime + ", heatType=" + heatType + ", eei=" + eei
				+ ", firstCost=" + firstCost + "]";
	}

}