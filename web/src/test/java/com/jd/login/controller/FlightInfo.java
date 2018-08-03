package com.jd.login.controller;

/**
 * Created by huyanxia on 2018/1/25.
 */

import java.io.Serializable;
import java.util.List;

public class FlightInfo implements Serializable {

    private static final long serialVersionUID = 8604216922911620556L;
    /**
     * 航班信息属性
     */
    public String airways;

    public String airwaysCn;

    public String arrAirdrome;

    public String arrCity;

    public String arrCityCn;

    public String arrDate;

    public String arrTerminal;

    public String arrTime;

    public boolean asr;

    public String carrier;

    public String carrierCn;

    public long childfee;

    public List<FlightClassInfo> bingoClassInfoList;

    public String depAirdrome;

    public String depCity;

    public String depCityCn;

    public String depDate;

    public String depTerminal;

    public String depTime;

    public String discountCN;

    public int earningLevel;

    public String earningTitle;

    public String eticket;

    public long fee;

    public String flightNo;

    public long fullPrice;

    public boolean codeShare;

    public String isStop;

    public FlightClassInfo bingoLeastClassInfo;

    public String meal;

    public String milage;

    public int minDiscount;

    public long minPrice;

    /**
     * 原始最低价格
     */
    public long originalMinPrice;

    public long oldminPrice;

    public String planeStyle;

    public String shareFlightNo;

    public long tax;

    /**
     * 商家ID
     */
    public String sourceId;

    private String flightDataFlag;// 航班数据标示
    //是否命中促销
    private boolean exsitsActivity;
    //促销针对的用户类型
    private String activityUserType;

    //实际承运航班号
    private String carrierFlightNo;

    /**
     * 婴儿票基建费
     */
    private Long infantBuildFee;

    /**
     * 婴儿票燃油费
     */
    private Long infantOilTax;

    public FlightInfo() {

    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getAirways() {
        return airways;
    }

    public void setAirways(String airways) {
        this.airways = airways;
    }

    public String getAirwaysCn() {
        return airwaysCn;
    }

    public void setAirwaysCn(String airwaysCn) {
        this.airwaysCn = airwaysCn;
    }

    public String getArrAirdrome() {
        return arrAirdrome;
    }

    public void setArrAirdrome(String arrAirdrome) {
        this.arrAirdrome = arrAirdrome;
    }

    public String getArrCity() {
        return arrCity;
    }

    public void setArrCity(String arrCity) {
        this.arrCity = arrCity;
    }

    public String getArrCityCn() {
        return arrCityCn;
    }

    public void setArrCityCn(String arrCityCn) {
        this.arrCityCn = arrCityCn;
    }

    public String getArrDate() {
        return arrDate;
    }

    public void setArrDate(String arrDate) {
        this.arrDate = arrDate;
    }

    public String getArrTerminal() {
        return arrTerminal;
    }

    public void setArrTerminal(String arrTerminal) {
        this.arrTerminal = arrTerminal;
    }

    public String getArrTime() {
        return arrTime;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public boolean isAsr() {
        return asr;
    }

    public void setAsr(boolean asr) {
        this.asr = asr;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrierCn() {
        return carrierCn;
    }

    public void setCarrierCn(String carrierCn) {
        this.carrierCn = carrierCn;
    }

    public long getChildfee() {
        return childfee;
    }

    public void setChildfee(long childfee) {
        this.childfee = childfee;
    }

    public List<FlightClassInfo> getBingoClassInfoList() {
        return bingoClassInfoList;
    }

    public void setBingoClassInfoList(List<FlightClassInfo> bingoClassInfoList) {
        this.bingoClassInfoList = bingoClassInfoList;
    }

    public String getDepAirdrome() {
        return depAirdrome;
    }

    public void setDepAirdrome(String depAirdrome) {
        this.depAirdrome = depAirdrome;
    }

    public String getDepCity() {
        return depCity;
    }

    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }

    public String getDepCityCn() {
        return depCityCn;
    }

    public void setDepCityCn(String depCityCn) {
        this.depCityCn = depCityCn;
    }

    public String getDepDate() {
        return depDate;
    }

    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    public String getDepTerminal() {
        return depTerminal;
    }

    public void setDepTerminal(String depTerminal) {
        this.depTerminal = depTerminal;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getDiscountCN() {
        return discountCN;
    }

    public void setDiscountCN(String discountCN) {
        this.discountCN = discountCN;
    }

    public int getEarningLevel() {
        return earningLevel;
    }

    public void setEarningLevel(int earningLevel) {
        this.earningLevel = earningLevel;
    }

    public String getEarningTitle() {
        return earningTitle;
    }

    public void setEarningTitle(String earningTitle) {
        this.earningTitle = earningTitle;
    }

    public String getEticket() {
        return eticket;
    }

    public void setEticket(String eticket) {
        this.eticket = eticket;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public long getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(long fullPrice) {
        this.fullPrice = fullPrice;
    }

    public boolean isCodeShare() {
        return codeShare;
    }

    public void setCodeShare(boolean codeShare) {
        this.codeShare = codeShare;
    }

    public String getIsStop() {
        return isStop;
    }

    public void setIsStop(String isStop) {
        this.isStop = isStop;
    }

    public FlightClassInfo getBingoLeastClassInfo() {
        return bingoLeastClassInfo;
    }

    public void setBingoLeastClassInfo(FlightClassInfo bingoLeastClassInfo) {
        this.bingoLeastClassInfo = bingoLeastClassInfo;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getMilage() {
        return milage;
    }

    public void setMilage(String milage) {
        this.milage = milage;
    }

    public int getMinDiscount() {
        return minDiscount;
    }

    public void setMinDiscount(int minDiscount) {
        this.minDiscount = minDiscount;
    }

    public long getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(long minPrice) {
        this.minPrice = minPrice;
    }

    public long getOriginalMinPrice() {
        return originalMinPrice;
    }

    public void setOriginalMinPrice(long originalMinPrice) {
        this.originalMinPrice = originalMinPrice;
    }

    public long getOldminPrice() {
        return oldminPrice;
    }

    public void setOldminPrice(long oldminPrice) {
        this.oldminPrice = oldminPrice;
    }

    public String getPlaneStyle() {
        return planeStyle;
    }

    public void setPlaneStyle(String planeStyle) {
        this.planeStyle = planeStyle;
    }

    public String getShareFlightNo() {
        return shareFlightNo;
    }

    public void setShareFlightNo(String shareFlightNo) {
        this.shareFlightNo = shareFlightNo;
    }

    public long getTax() {
        return tax;
    }

    public void setTax(long tax) {
        this.tax = tax;
    }

    public String getFlightDataFlag() {
        return flightDataFlag;
    }

    public void setFlightDataFlag(String flightDataFlag) {
        this.flightDataFlag = flightDataFlag;
    }

    public boolean isExsitsActivity() {
        return exsitsActivity;
    }

    public void setExsitsActivity(boolean exsitsActivity) {
        this.exsitsActivity = exsitsActivity;
    }

    public String getActivityUserType() {
        return activityUserType;
    }

    public void setActivityUserType(String activityUserType) {
        this.activityUserType = activityUserType;
    }

    public String getCarrierFlightNo() {
        return carrierFlightNo;
    }

    public void setCarrierFlightNo(String carrierFlightNo) {
        this.carrierFlightNo = carrierFlightNo;
    }

    public Long getInfantBuildFee() {
        return infantBuildFee;
    }

    public void setInfantBuildFee(Long infantBuildFee) {
        this.infantBuildFee = infantBuildFee;
    }

    public Long getInfantOilTax() {
        return infantOilTax;
    }

    public void setInfantOilTax(Long infantOilTax) {
        this.infantOilTax = infantOilTax;
    }

}

