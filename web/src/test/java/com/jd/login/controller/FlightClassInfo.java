package com.jd.login.controller;

/**
 * Created by huyanxia on 2018/1/25.
 */
import java.io.Serializable;
import java.util.List;

public class FlightClassInfo implements Serializable {

    private static final long serialVersionUID = 2932213372331900441L;

    public String c;

    public double agentFee;

    public double agentFeeGo;

    public long avItemTax;

    public String basicCabinRef;

    public long childOilTax;

    public long childPrice;

    public String childfarebasis;

    public String classNo;

    public String classNoCn;

    public String classLevel;//仓位等级 1 经济舱 2 头等 3 商务

    public long customerId;

    public int discount;

    public String childSeatCode;// 儿童舱位
    /**
     * 是否直降
     */
    public boolean discountFlag;

    /**
     * 直降类型
     */
    public String discountType;

    /**
     * 政策id
     */
    public String discountId;               //国航、深航PC优惠码将作为记录PC码的使用情况，保存到:air_flight_info_extend_new#extend_content

    public String fareItemId = "";

    public String fareItemIdforTMC;

    public String fareItemType;

    public String fareOfficeNo;

    public String fareReference;

    public String fareType;

    public String fareTypeforTMC;

    public String fcClassType;

    //婴儿燃油
    public long iOilTax;

    public String label;

    public long netChildPrice;

    public long netPrice;

    public long newMinPrice;

    public long oilTax;

    public int oldDiscount;

    public long oldprice;

    public boolean pat;

    /**
     * 商家成本价格
     */
    public long venderPrice;

    /**
     * 京东成本价
     */
    public long price;

    /**
     * 商家儿童成本价格
     */
    public long childVenderPrice;

    /**
     * 京东儿童销售价
     */
    public long childSalePrice;

    /**
     * 原始价格
     */
    public long originalPrice;

    public String privilegeType;

    public int rtDiscount;

    public String seatCodeEX;

    public String seatNum;

    public String selfDiscountInfoId;

    public String ySeatNum;

    public int zvItemId;

    public int zvItemIdGo;

    public long fullPrice;

    /**
     * 促销ID,多个以分号隔开
     */
    public String promotionId;

    /**
     * 促销金额
     */
    public double promotionPrice;

    /**
     * 返点
     */
    public String commisionPoint;

    /**
     * 返现 可以是正负值，正值表示给客人返现，负值表示留钱
     */
    public String commisionMoney;

    /**
     * 出票工作时间
     */
    public String workTime;

    /**
     * 废票时间
     */
    public String vtWorkTime;

    /**
     * 政策ID
     */
    public String policyId;

    /**
     * 商家ID
     */
    public String sourceId;

    // 航空公司航班数据标示
    public boolean airCompanyFlag;

    /**
     * 航空公司的产品代码
     */
    public String productCode = "";

    private String beforeDiscount;//优惠券折扣
    private String afterDiscount; //优惠后折扣
    private String ticketProvisions;//退改签规定

    private String childDiscount;//儿童折扣

    /**
     * 国航的行程ID
     */
    private String tripId;  //行程ID
    private String index;   //

    /**
     * 携程产品新增
     */
    private String productId;        //产品id
   // private SaleTypeEnum saleType;   //销售类型
    private String pid;               //PID,携程方指定查询接口增加
    //private BillTypeEnum billType;   //行程单报销凭证
    private String realSubClass;    //真实子舱位代码
    private int minPassengerNum;   //最少成行人数
    private int maxPassengerNum;   //最多成行人数
    //private List<TravelerCategoryEnum> applicableTravelerCategorys; //允许销售乘客类型列表
    private List<String> acceptableIDCardTypes; //允许下单证件类型列表
    private String passengerAgeLimit;      // 年龄限制（格式：13-23,60-90)
   // private ProductTypeEnum productType;    //价格类型
    //private ProductAttributeEnum productAttribute;  //产品类型
    private boolean isResetPolicy;         //是否替换了退改签
    private String refundRule;             // 退票规定
    private String changeRule;             //改期规定
    private String endorseRule;            //签转规定
    private int refundFeeFormulaId;        //退票费id
    private int fee;      //机场建设税
    private String uniqueKey="" ;  //产品唯一key
    private int subsidy;   //飞享金
    private String bookingClass; //预定舱位
    // 添加于2016-05-12
    private String luggallow;   //行李额
    private String mealInfo;    //餐食
    private String policyCategory;//政策类型
    //是否命中促销
    private boolean exsitsActivity;
    //促销立减价
    private long promotionReducePrice;
    //活动id
    private long activityId;
    //skuid
    private long skuId;
    //rfId
    private long rfId;
    //仅供排序使用
    private long sortPrice;
    //活动类型
    private String activityUserType;
    //政策备注
    private String policyComment;
    //政策来源类型 1-TTS直连  2-TTS政策上传
    private Integer policySourceType;

    /**
     * 促销方式集合
     * Map<促销类型,促销对象>
     */
    //public Map<Integer, SaleDiscount> saleDiscountMap;

    /**
     * 当前舱位的促销信息
     */
    //public PromotionInfo promotionInfo;

    //是否极速出退票 0：非极速出退票、1：仅极速出票、2：仅极速退票、3：极速出退票
    private String isFastTicket;

    private Integer limitAgeBegin;

    private Integer limitAgeEnd;

    private String limitCert;

    private Integer deliveryType;

    //返豆数量
    private long promotionBeans;

    //婴儿商家成本价
    public long infantVenderPrice;

    //婴儿销售价
    public long infantSalePrice;

    //婴儿舱位
    public String infantSeatCode;
    //大客户编码
    private String customCode;

    //最晚出票时限，单位：小时
    private Integer limitTicketTime;

    //最小预定人数限制
    private Integer limitOrderMixNum;

    //最大预订人数限制
    private Integer limitOrderMaxNum;

    //是否支持常旅客积分 0-否，1-是
    private Integer isSupportIntegral;

    public FlightClassInfo() {

    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public double getAgentFee() {
        return agentFee;
    }

    public void setAgentFee(double agentFee) {
        this.agentFee = agentFee;
    }

    public double getAgentFeeGo() {
        return agentFeeGo;
    }

    public void setAgentFeeGo(double agentFeeGo) {
        this.agentFeeGo = agentFeeGo;
    }

    public long getAvItemTax() {
        return avItemTax;
    }

    public void setAvItemTax(long avItemTax) {
        this.avItemTax = avItemTax;
    }

    public String getBasicCabinRef() {
        return basicCabinRef;
    }

    public void setBasicCabinRef(String basicCabinRef) {
        this.basicCabinRef = basicCabinRef;
    }

    public long getChildOilTax() {
        return childOilTax;
    }

    public void setChildOilTax(long childOilTax) {
        this.childOilTax = childOilTax;
    }

    public long getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(long childPrice) {
        this.childPrice = childPrice;
    }

    public String getChildfarebasis() {
        return childfarebasis;
    }

    public void setChildfarebasis(String childfarebasis) {
        this.childfarebasis = childfarebasis;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getClassNoCn() {
        return classNoCn;
    }

    public void setClassNoCn(String classNoCn) {
        this.classNoCn = classNoCn;
    }

    public String getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public boolean isDiscountFlag() {
        return discountFlag;
    }

    public void setDiscountFlag(boolean discountFlag) {
        this.discountFlag = discountFlag;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public String getFareItemId() {
        return fareItemId;
    }

    public void setFareItemId(String fareItemId) {
        this.fareItemId = fareItemId;
    }

    public String getFareItemIdforTMC() {
        return fareItemIdforTMC;
    }

    public void setFareItemIdforTMC(String fareItemIdforTMC) {
        this.fareItemIdforTMC = fareItemIdforTMC;
    }

    public String getFareItemType() {
        return fareItemType;
    }

    public void setFareItemType(String fareItemType) {
        this.fareItemType = fareItemType;
    }

    public String getFareOfficeNo() {
        return fareOfficeNo;
    }

    public void setFareOfficeNo(String fareOfficeNo) {
        this.fareOfficeNo = fareOfficeNo;
    }

    public String getFareReference() {
        return fareReference;
    }

    public void setFareReference(String fareReference) {
        this.fareReference = fareReference;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    public String getFareTypeforTMC() {
        return fareTypeforTMC;
    }

    public void setFareTypeforTMC(String fareTypeforTMC) {
        this.fareTypeforTMC = fareTypeforTMC;
    }

    public String getFcClassType() {
        return fcClassType;
    }

    public void setFcClassType(String fcClassType) {
        this.fcClassType = fcClassType;
    }

    public long getiOilTax() {
        return iOilTax;
    }

    public void setiOilTax(long iOilTax) {
        this.iOilTax = iOilTax;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public long getNetChildPrice() {
        return netChildPrice;
    }

    public void setNetChildPrice(long netChildPrice) {
        this.netChildPrice = netChildPrice;
    }

    public long getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(long netPrice) {
        this.netPrice = netPrice;
    }

    public long getNewMinPrice() {
        return newMinPrice;
    }

    public void setNewMinPrice(long newMinPrice) {
        this.newMinPrice = newMinPrice;
    }

    public long getOilTax() {
        return oilTax;
    }

    public void setOilTax(long oilTax) {
        this.oilTax = oilTax;
    }

    public int getOldDiscount() {
        return oldDiscount;
    }

    public void setOldDiscount(int oldDiscount) {
        this.oldDiscount = oldDiscount;
    }

    public long getOldprice() {
        return oldprice;
    }

    public void setOldprice(long oldprice) {
        this.oldprice = oldprice;
    }

    public boolean isPat() {
        return pat;
    }

    public void setPat(boolean pat) {
        this.pat = pat;
    }

    public long getVenderPrice() {
        return venderPrice;
    }

    public void setVenderPrice(long venderPrice) {
        this.venderPrice = venderPrice;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getChildVenderPrice() {
        return childVenderPrice;
    }

    public void setChildVenderPrice(long childVenderPrice) {
        this.childVenderPrice = childVenderPrice;
    }

    public long getChildSalePrice() {
        return childSalePrice;
    }

    public void setChildSalePrice(long childSalePrice) {
        this.childSalePrice = childSalePrice;
    }

    public long getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(long originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    public int getRtDiscount() {
        return rtDiscount;
    }

    public void setRtDiscount(int rtDiscount) {
        this.rtDiscount = rtDiscount;
    }

    public String getSeatCodeEX() {
        return seatCodeEX;
    }

    public void setSeatCodeEX(String seatCodeEX) {
        this.seatCodeEX = seatCodeEX;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public String getSelfDiscountInfoId() {
        return selfDiscountInfoId;
    }

    public void setSelfDiscountInfoId(String selfDiscountInfoId) {
        this.selfDiscountInfoId = selfDiscountInfoId;
    }

    public String getySeatNum() {
        return ySeatNum;
    }

    public void setySeatNum(String ySeatNum) {
        this.ySeatNum = ySeatNum;
    }

    public int getZvItemId() {
        return zvItemId;
    }

    public void setZvItemId(int zvItemId) {
        this.zvItemId = zvItemId;
    }

    public int getZvItemIdGo() {
        return zvItemIdGo;
    }

    public void setZvItemIdGo(int zvItemIdGo) {
        this.zvItemIdGo = zvItemIdGo;
    }

    public long getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(long fullPrice) {
        this.fullPrice = fullPrice;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public double getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(double promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public String getCommisionPoint() {
        return commisionPoint;
    }

    public void setCommisionPoint(String commisionPoint) {
        this.commisionPoint = commisionPoint;
    }

    public String getCommisionMoney() {
        return commisionMoney;
    }

    public void setCommisionMoney(String commisionMoney) {
        this.commisionMoney = commisionMoney;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getVtWorkTime() {
        return vtWorkTime;
    }

    public void setVtWorkTime(String vtWorkTime) {
        this.vtWorkTime = vtWorkTime;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

   /* public Map<Integer, SaleDiscount> getSaleDiscountMap() {
        return saleDiscountMap;
    }

    public void setSaleDiscountMap(Map<Integer, SaleDiscount> saleDiscountMap) {
        this.saleDiscountMap = saleDiscountMap;
    }

    public PromotionInfo getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(PromotionInfo promotionInfo) {
        this.promotionInfo = promotionInfo;
    }*/

    public boolean isAirCompanyFlag() {
        return airCompanyFlag;
    }

    public void setAirCompanyFlag(boolean airCompanyFlag) {
        this.airCompanyFlag = airCompanyFlag;
    }

    public String getBeforeDiscount() {
        return beforeDiscount;
    }

    public void setBeforeDiscount(String beforeDiscount) {
        this.beforeDiscount = beforeDiscount;
    }

    public String getAfterDiscount() {
        return afterDiscount;
    }

    public void setAfterDiscount(String afterDiscount) {
        this.afterDiscount = afterDiscount;
    }

    public String getTicketProvisions() {
        return ticketProvisions;
    }

    public void setTicketProvisions(String ticketProvisions) {
        this.ticketProvisions = ticketProvisions;
    }

    public String getChildSeatCode() {
        return childSeatCode;
    }

    public void setChildSeatCode(String childSeatCode) {
        this.childSeatCode = childSeatCode;
    }

    public String getChildDiscount() {
        return childDiscount;
    }

    public void setChildDiscount(String childDiscount) {
        this.childDiscount = childDiscount;
    }


    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

   /* public SaleTypeEnum getSaleType() {
        return saleType;
    }

    public void setSaleType(SaleTypeEnum saleType) {
        this.saleType = saleType;
    }*/

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    /*public BillTypeEnum getBillType() {
        return billType;
    }

    public void setBillType(BillTypeEnum billType) {
        this.billType = billType;
    }*/

    public String getRealSubClass() {
        return realSubClass;
    }

    public void setRealSubClass(String realSubClass) {
        this.realSubClass = realSubClass;
    }

    public int getMinPassengerNum() {
        return minPassengerNum;
    }

    public void setMinPassengerNum(int minPassengerNum) {
        this.minPassengerNum = minPassengerNum;
    }

    public int getMaxPassengerNum() {
        return maxPassengerNum;
    }

    public void setMaxPassengerNum(int maxPassengerNum) {
        this.maxPassengerNum = maxPassengerNum;
    }

  /*  public List<TravelerCategoryEnum> getApplicableTravelerCategorys() {
        return applicableTravelerCategorys;
    }

    public void setApplicableTravelerCategorys(List<TravelerCategoryEnum> applicableTravelerCategorys) {
        this.applicableTravelerCategorys = applicableTravelerCategorys;
    }*/

    public List<String> getAcceptableIDCardTypes() {
        return acceptableIDCardTypes;
    }

    public void setAcceptableIDCardTypes(List<String> acceptableIDCardTypes) {
        this.acceptableIDCardTypes = acceptableIDCardTypes;
    }

    public String getPassengerAgeLimit() {
        return passengerAgeLimit;
    }

    public void setPassengerAgeLimit(String passengerAgeLimit) {
        this.passengerAgeLimit = passengerAgeLimit;
    }

   /* public ProductTypeEnum getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
    }

    public ProductAttributeEnum getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(ProductAttributeEnum productAttribute) {
        this.productAttribute = productAttribute;
    }
*/
    public boolean isResetPolicy() {
        return isResetPolicy;
    }

    public void setIsResetPolicy(boolean isResetPolicy) {
        this.isResetPolicy = isResetPolicy;
    }

    public String getRefundRule() {
        return refundRule;
    }

    public void setRefundRule(String refundRule) {
        this.refundRule = refundRule;
    }

    public String getChangeRule() {
        return changeRule;
    }

    public void setChangeRule(String changeRule) {
        this.changeRule = changeRule;
    }

    public String getEndorseRule() {
        return endorseRule;
    }

    public void setEndorseRule(String endorseRule) {
        this.endorseRule = endorseRule;
    }

    public int getRefundFeeFormulaId() {
        return refundFeeFormulaId;
    }

    public void setRefundFeeFormulaId(int refundFeeFormulaID) {
        this.refundFeeFormulaId = refundFeeFormulaID;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public int getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(int subsidy) {
        this.subsidy = subsidy;
    }

    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    public String getLuggallow() {
        return luggallow;
    }

    public void setLuggallow(String luggallow) {
        this.luggallow = luggallow;
    }

    public String getMealInfo() {
        return mealInfo;
    }

    public void setMealInfo(String mealInfo) {
        this.mealInfo = mealInfo;
    }

    public String getPolicyCategory() {
        return policyCategory;
    }

    public void setPolicyCategory(String policyCategory) {
        this.policyCategory = policyCategory;
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

    public long getPromotionReducePrice() {
        return promotionReducePrice;
    }

    public void setPromotionReducePrice(long promotionReducePrice) {
        this.promotionReducePrice = promotionReducePrice;
    }

    public long getActivityId() {
        return activityId;
    }

    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public long getRfId() {
        return rfId;
    }

    public void setRfId(long rfId) {
        this.rfId = rfId;
    }

    public void setSortPrice(long sortPrice) {
        this.sortPrice=sortPrice;
    }

    public long getSortPrice() {
        return sortPrice;
    }

    /**
     * <pre>
     * 排序价格字段
     *
     * 描述
     * 1.舱位有促销活动用时比较促销价和京东售价
     * </pre>
     * */
    public long calculateSortPrice(){
        if(isExsitsActivity()){
            return promotionReducePrice<price?promotionReducePrice:price;
        }
        return price;
    }

    /**
     * <pre>
     * 亏损金额
     *
     * 描述
     * 	1.商家成本价-促销价
     * </pre>
     * */
    public long getDeficitPrice(){
        return this.venderPrice-this.promotionReducePrice;
    }

    /**
     * <pre>
     * 立减金额
     *
     * 描述
     * 1.京东售价-促销价
     * </pre>
     * */
    public long getReducePrice(){
        return price-getSortPrice();
    }

    public void setResetPolicy(boolean isResetPolicy) {
        this.isResetPolicy = isResetPolicy;
    }

    public String getIsFastTicket() {
        return isFastTicket;
    }

    public void setIsFastTicket(String isFastTicket) {
        this.isFastTicket = isFastTicket;
    }

    public String getLimitCert() {
        return limitCert;
    }

    public void setLimitCert(String limitCert) {
        this.limitCert = limitCert;
    }

    public String getPolicyComment() {
        return policyComment;
    }

    public void setPolicyComment(String policyComment) {
        this.policyComment = policyComment;
    }

    public Integer getPolicySourceType() {
        return policySourceType;
    }

    public void setPolicySourceType(Integer policySourceType) {
        this.policySourceType = policySourceType;
    }

    public Integer getLimitAgeBegin() {
        return limitAgeBegin;
    }

    public void setLimitAgeBegin(Integer limitAgeBegin) {
        this.limitAgeBegin = limitAgeBegin;
    }

    public Integer getLimitAgeEnd() {
        return limitAgeEnd;
    }

    public void setLimitAgeEnd(Integer limitAgeEnd) {
        this.limitAgeEnd = limitAgeEnd;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }


    public long getPromotionBeans() {
        return promotionBeans;
    }

    public void setPromotionBeans(long promotionBeans) {
        this.promotionBeans = promotionBeans;
    }

    public String getInfantSeatCode() {
        return infantSeatCode;
    }

    public void setInfantSeatCode(String infantSeatCode) {
        this.infantSeatCode = infantSeatCode;
    }

    public long getInfantVenderPrice() {
        return infantVenderPrice;
    }

    public void setInfantVenderPrice(long infantVenderPrice) {
        this.infantVenderPrice = infantVenderPrice;
    }

    public long getInfantSalePrice() {
        return infantSalePrice;
    }

    public void setInfantSalePrice(long infantSalePrice) {
        this.infantSalePrice = infantSalePrice;
    }

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public Integer getLimitTicketTime() {
        return limitTicketTime;
    }

    public void setLimitTicketTime(Integer limitTicketTime) {
        this.limitTicketTime = limitTicketTime;
    }

    public Integer getLimitOrderMixNum() {
        return limitOrderMixNum;
    }

    public void setLimitOrderMixNum(Integer limitOrderMixNum) {
        this.limitOrderMixNum = limitOrderMixNum;
    }

    public Integer getLimitOrderMaxNum() {
        return limitOrderMaxNum;
    }

    public void setLimitOrderMaxNum(Integer limitOrderMaxNum) {
        this.limitOrderMaxNum = limitOrderMaxNum;
    }

    public Integer getIsSupportIntegral() {
        return isSupportIntegral;
    }

    public void setIsSupportIntegral(Integer isSupportIntegral) {
        this.isSupportIntegral = isSupportIntegral;
    }



}
