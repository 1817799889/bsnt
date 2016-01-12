package com.cn.bsnt.model;
/**电视*/
public class GoodsTv {

	/**电视id*/
	private int tvId;
	/**电视名称*/
	private String tvName;
	/**电视价格*/
	private double tvPrice;
	/**电视型号*/
	private String tvType;
	/**电视颜色*/
	private String tvColor;
	/**电视尺寸*/
	private String tvSize;
	/**电视品牌*/
	private String tvBrand;
	/**电视库存*/
	private String tvCount;
	/**电视月销量*/
	private String tvMonthSales;
	/**电视总销量*/
	private String tvTotalSales;
	/**电视描述*/
	private String tvdesc;
	/**电视分辨率*/
	private String tvResolutionRadio;
	/**3D类型*/
	private String tv3dType;
	/**电视能效等级*/
	private String tvEel;
	/**电视操作系统*/
	private String tvMacOs;
	/**电视网络连接方式*/
	private String tvInternetConnectWay;
	/**电视屏幕比例*/
	private String tvScanScale;
	/**电视类型*/
	private String tvMold;
	/**电视视频显示格式*/
	private String tvVideoFormat;
	/**电视背光灯类型*/
	private String tvBackightType;
	/**电视扫描方式*/
	private String tvScanningMode;
	/**视接收制式电*/
	private String tvNtsc;
	/**电视HDMI接口数量*/
	private String tvHdmi;
	/**电视接口类型*/
	private String tvPortType;
	/**电视净重（不含底座）*/
	private String tvNetNoBelow;
	/**电视净重（含底座）*/
	private String tvNetHavaBelow;
	/**电视包装尺寸*/
	private String tvPackSize;
	/**电视含边框屏幕尺寸*/
	private String tvIncludeRimSize;
	/**电视毛重*/
	private String tvRoughWeight;
	/**电视主机尺寸*/
	private String tvMainSize;
	/**电视包装尺寸*/
	private String tvWrap1;
	private String tvWrap2;
	private String tvWrap3;
	private String tvWrap4;
	private String tvWrap5;
	private String tvWrap6;
	private String tvWrap7;
	/**出厂价*/
	private String firstCost;
	public GoodsTv() {
		// TODO Auto-generated constructor stub
	}
	public GoodsTv(int tvId, String tvName, double tvPrice, String tvType,
			String tvColor, String tvSize, String tvBrand, String tvCount,
			String tvMonthSales, String tvTotalSales, String tvdesc,
			String tvResolutionRadio, String tv3dType, String tvEel,
			String tvMacOs, String tvInternetConnectWay, String tvScanScale,
			String tvMold, String tvVideoFormat, String tvBackightType,
			String tvScanningMode, String tvNtsc, String tvHdmi,
			String tvPortType, String tvNetNoBelow, String tvNetHavaBelow,
			String tvPackSize, String tvIncludeRimSize, String tvRoughWeight,
			String tvMainSize, String tvWrap1, String tvWrap2, String tvWrap3,
			String tvWrap4, String tvWrap5, String tvWrap6, String tvWrap7,
			String firstCost) {
		this.tvId = tvId;
		this.tvName = tvName;
		this.tvPrice = tvPrice;
		this.tvType = tvType;
		this.tvColor = tvColor;
		this.tvSize = tvSize;
		this.tvBrand = tvBrand;
		this.tvCount = tvCount;
		this.tvMonthSales = tvMonthSales;
		this.tvTotalSales = tvTotalSales;
		this.tvdesc = tvdesc;
		this.tvResolutionRadio = tvResolutionRadio;
		this.tv3dType = tv3dType;
		this.tvEel = tvEel;
		this.tvMacOs = tvMacOs;
		this.tvInternetConnectWay = tvInternetConnectWay;
		this.tvScanScale = tvScanScale;
		this.tvMold = tvMold;
		this.tvVideoFormat = tvVideoFormat;
		this.tvBackightType = tvBackightType;
		this.tvScanningMode = tvScanningMode;
		this.tvNtsc = tvNtsc;
		this.tvHdmi = tvHdmi;
		this.tvPortType = tvPortType;
		this.tvNetNoBelow = tvNetNoBelow;
		this.tvNetHavaBelow = tvNetHavaBelow;
		this.tvPackSize = tvPackSize;
		this.tvIncludeRimSize = tvIncludeRimSize;
		this.tvRoughWeight = tvRoughWeight;
		this.tvMainSize = tvMainSize;
		this.tvWrap1 = tvWrap1;
		this.tvWrap2 = tvWrap2;
		this.tvWrap3 = tvWrap3;
		this.tvWrap4 = tvWrap4;
		this.tvWrap5 = tvWrap5;
		this.tvWrap6 = tvWrap6;
		this.tvWrap7 = tvWrap7;
		this.firstCost = firstCost;
	}
	public int getTvId() {
		return tvId;
	}
	public void setTvId(int tvId) {
		this.tvId = tvId;
	}
	public String getTvName() {
		return tvName;
	}
	public void setTvName(String tvName) {
		this.tvName = tvName;
	}
	public double getTvPrice() {
		return tvPrice;
	}
	public void setTvPrice(double tvPrice) {
		this.tvPrice = tvPrice;
	}
	public String getTvType() {
		return tvType;
	}
	public void setTvType(String tvType) {
		this.tvType = tvType;
	}
	public String getTvColor() {
		return tvColor;
	}
	public void setTvColor(String tvColor) {
		this.tvColor = tvColor;
	}
	public String getTvSize() {
		return tvSize;
	}
	public void setTvSize(String tvSize) {
		this.tvSize = tvSize;
	}
	public String getTvBrand() {
		return tvBrand;
	}
	public void setTvBrand(String tvBrand) {
		this.tvBrand = tvBrand;
	}
	public String getTvCount() {
		return tvCount;
	}
	public void setTvCount(String tvCount) {
		this.tvCount = tvCount;
	}
	public String getTvMonthSales() {
		return tvMonthSales;
	}
	public void setTvMonthSales(String tvMonthSales) {
		this.tvMonthSales = tvMonthSales;
	}
	public String getTvTotalSales() {
		return tvTotalSales;
	}
	public void setTvTotalSales(String tvTotalSales) {
		this.tvTotalSales = tvTotalSales;
	}
	public String getTvdesc() {
		return tvdesc;
	}
	public void setTvdesc(String tvdesc) {
		this.tvdesc = tvdesc;
	}
	public String getTvResolutionRadio() {
		return tvResolutionRadio;
	}
	public void setTvResolutionRadio(String tvResolutionRadio) {
		this.tvResolutionRadio = tvResolutionRadio;
	}
	public String getTv3dType() {
		return tv3dType;
	}
	public void setTv3dType(String tv3dType) {
		this.tv3dType = tv3dType;
	}
	public String getTvEel() {
		return tvEel;
	}
	public void setTvEel(String tvEel) {
		this.tvEel = tvEel;
	}
	public String getTvMacOs() {
		return tvMacOs;
	}
	public void setTvMacOs(String tvMacOs) {
		this.tvMacOs = tvMacOs;
	}
	public String getTvInternetConnectWay() {
		return tvInternetConnectWay;
	}
	public void setTvInternetConnectWay(String tvInternetConnectWay) {
		this.tvInternetConnectWay = tvInternetConnectWay;
	}
	public String getTvScanScale() {
		return tvScanScale;
	}
	public void setTvScanScale(String tvScanScale) {
		this.tvScanScale = tvScanScale;
	}
	public String getTvMold() {
		return tvMold;
	}
	public void setTvMold(String tvMold) {
		this.tvMold = tvMold;
	}
	public String getTvVideoFormat() {
		return tvVideoFormat;
	}
	public void setTvVideoFormat(String tvVideoFormat) {
		this.tvVideoFormat = tvVideoFormat;
	}
	public String getTvBackightType() {
		return tvBackightType;
	}
	public void setTvBackightType(String tvBackightType) {
		this.tvBackightType = tvBackightType;
	}
	public String getTvScanningMode() {
		return tvScanningMode;
	}
	public void setTvScanningMode(String tvScanningMode) {
		this.tvScanningMode = tvScanningMode;
	}
	public String getTvNtsc() {
		return tvNtsc;
	}
	public void setTvNtsc(String tvNtsc) {
		this.tvNtsc = tvNtsc;
	}
	public String getTvHdmi() {
		return tvHdmi;
	}
	public void setTvHdmi(String tvHdmi) {
		this.tvHdmi = tvHdmi;
	}
	public String getTvPortType() {
		return tvPortType;
	}
	public void setTvPortType(String tvPortType) {
		this.tvPortType = tvPortType;
	}
	public String getTvNetNoBelow() {
		return tvNetNoBelow;
	}
	public void setTvNetNoBelow(String tvNetNoBelow) {
		this.tvNetNoBelow = tvNetNoBelow;
	}
	public String getTvNetHavaBelow() {
		return tvNetHavaBelow;
	}
	public void setTvNetHavaBelow(String tvNetHavaBelow) {
		this.tvNetHavaBelow = tvNetHavaBelow;
	}
	public String getTvPackSize() {
		return tvPackSize;
	}
	public void setTvPackSize(String tvPackSize) {
		this.tvPackSize = tvPackSize;
	}
	public String getTvIncludeRimSize() {
		return tvIncludeRimSize;
	}
	public void setTvIncludeRimSize(String tvIncludeRimSize) {
		this.tvIncludeRimSize = tvIncludeRimSize;
	}
	public String getTvRoughWeight() {
		return tvRoughWeight;
	}
	public void setTvRoughWeight(String tvRoughWeight) {
		this.tvRoughWeight = tvRoughWeight;
	}
	public String getTvMainSize() {
		return tvMainSize;
	}
	public void setTvMainSize(String tvMainSize) {
		this.tvMainSize = tvMainSize;
	}
	public String getTvWrap1() {
		return tvWrap1;
	}
	public void setTvWrap1(String tvWrap1) {
		this.tvWrap1 = tvWrap1;
	}
	public String getTvWrap2() {
		return tvWrap2;
	}
	public void setTvWrap2(String tvWrap2) {
		this.tvWrap2 = tvWrap2;
	}
	public String getTvWrap3() {
		return tvWrap3;
	}
	public void setTvWrap3(String tvWrap3) {
		this.tvWrap3 = tvWrap3;
	}
	public String getTvWrap4() {
		return tvWrap4;
	}
	public void setTvWrap4(String tvWrap4) {
		this.tvWrap4 = tvWrap4;
	}
	public String getTvWrap5() {
		return tvWrap5;
	}
	public void setTvWrap5(String tvWrap5) {
		this.tvWrap5 = tvWrap5;
	}
	public String getTvWrap6() {
		return tvWrap6;
	}
	public void setTvWrap6(String tvWrap6) {
		this.tvWrap6 = tvWrap6;
	}
	public String getTvWrap7() {
		return tvWrap7;
	}
	public void setTvWrap7(String tvWrap7) {
		this.tvWrap7 = tvWrap7;
	}
	public String getFirstCost() {
		return firstCost;
	}
	public void setFirstCost(String firstCost) {
		this.firstCost = firstCost;
	}
	@Override
	public String toString() {
		return "GoodsTv [tvId=" + tvId + ", tvName=" + tvName + ", tvPrice="
				+ tvPrice + ", tvType=" + tvType + ", tvColor=" + tvColor
				+ ", tvSize=" + tvSize + ", tvBrand=" + tvBrand + ", tvCount="
				+ tvCount + ", tvMonthSales=" + tvMonthSales
				+ ", tvTotalSales=" + tvTotalSales + ", tvdesc=" + tvdesc
				+ ", tvResolutionRadio=" + tvResolutionRadio + ", tv3dType="
				+ tv3dType + ", tvEel=" + tvEel + ", tvMacOs=" + tvMacOs
				+ ", tvInternetConnectWay=" + tvInternetConnectWay
				+ ", tvScanScale=" + tvScanScale + ", tvMold=" + tvMold
				+ ", tvVideoFormat=" + tvVideoFormat + ", tvBackightType="
				+ tvBackightType + ", tvScanningMode=" + tvScanningMode
				+ ", tvNtsc=" + tvNtsc + ", tvHdmi=" + tvHdmi + ", tvPortType="
				+ tvPortType + ", tvNetNoBelow=" + tvNetNoBelow
				+ ", tvNetHavaBelow=" + tvNetHavaBelow + ", tvPackSize="
				+ tvPackSize + ", tvIncludeRimSize=" + tvIncludeRimSize
				+ ", tvRoughWeight=" + tvRoughWeight + ", tvMainSize="
				+ tvMainSize + ", tvWrap1=" + tvWrap1 + ", tvWrap2=" + tvWrap2
				+ ", tvWrap3=" + tvWrap3 + ", tvWrap4=" + tvWrap4
				+ ", tvWrap5=" + tvWrap5 + ", tvWrap6=" + tvWrap6
				+ ", tvWrap7=" + tvWrap7 + ", firstCost=" + firstCost + "]";
	}
	
}
