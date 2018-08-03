package com.jd.login.controller;

import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by huyanxia on 2018/1/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class TestCharterFlight {

    @Test
    public void calender() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, 0, 1, 0, 0, 0);
        System.out.println(calendar.getTimeInMillis());
    }

    @Test
    public void getTablePostFix(){
        //获取活动的年份
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(1495627200000l);
        String endTime = simpleDateFormat.format(date);
        String year = endTime.substring(0,4);
        System.out.println(year);
        String mouth = endTime.substring(5,7);
        System.out.println(mouth);
        if(Integer.parseInt(mouth) <= 6){
            System.out.println(year + "06");
        }
        System.out.println(year + "12");
        Date date1 = new Date();
        System.out.println(date1.getTime());
    }

    @Test
    public void test() {
        TestCharterFlight testCharterFlight = new TestCharterFlight();
        Integer begin = null;
        Integer end = 7;

        System.out.println(testCharterFlight.initLimitPersonNum(begin,end));

        if("".equals(testCharterFlight.initLimitPersonNum(begin,end))){
            System.out.println("返回空字符串");
        }

        Integer time = 72;
        System.out.println(testCharterFlight.initSlowIssueText(time));

        if("".equals(testCharterFlight.initSlowIssueText(time))){
            System.out.println("返回空字符串");
        }

        System.out.println(testCharterFlight.initSlowRefundText());

        if("".equals(testCharterFlight.initSlowRefundText())) {
            System.out.println("返回空字符串");
        }

        Integer isSupport = new Integer(1);
        String classType = "4";
        Double mile = new Double(5);
        System.out.println(getMile(isSupport, classType, mile));

        Integer max = new Integer(9);
        Integer min = new Integer(1);

        System.out.println(initLimitPersonNum(max,min));
        String jsonFlight = "{\n" +
                "\t\"oldminPrice\": 0,\n" +
                "\t\"depTerminal\": \"T3\",\n" +
                "\t\"minDiscount\": 0,\n" +
                "\t\"earningLevel\": 0,\n" +
                "\t\"asr\": false,\n" +
                "\t\"sourceId\": \"661726\",\n" +
                "\t\"arrCity\": \"HFE\",\n" +
                "\t\"childfee\": 0,\n" +
                "\t\"flightNo\": \"ZH9899\",\n" +
                "\t\"planeStyle\": \"320\",\n" +
                "\t\"arrTime\": \"0025\",\n" +
                "\t\"codeShare\": false,\n" +
                "\t\"arrDate\": \"2018-02-05\",\n" +
                "\t\"depTime\": \"2215\",\n" +
                "\t\"depDate\": \"2018-02-04\",\n" +
                "\t\"isStop\": \"0\",\n" +
                "\t\"airways\": \"ZH\",\n" +
                "\t\"depAirdrome\": \"宝安机场\",\n" +
                "\t\"depCity\": \"SZX\",\n" +
                "\t\"exsitsActivity\": false,\n" +
                "\t\"fee\": 0,\n" +
                "\t\"tax\": 50,\n" +
                "\t\"arrAirdrome\": \"新桥机场\",\n" +
                "\t\"originalMinPrice\": 0,\n" +
                "\t\"arrTerminal\": \"机场\",\n" +
                "\t\"fullPrice\": 1240,\n" +
                "\t\"bingoClassInfoList\": [{\n" +
                "\t\t\"airCompanyFlag\": true,\n" +
                "\t\t\"activityId\": 0,\n" +
                "\t\t\"infantVenderPrice\": 0,\n" +
                "\t\t\"policyId\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQSp/WJesbrOPuaxFl82q79w==\",\n" +
                "\t\t\"rfId\": 0,\n" +
                "\t\t\"netChildPrice\": 0,\n" +
                "\t\t\"agentFee\": 0.0,\n" +
                "\t\t\"promotionReducePrice\": 0,\n" +
                "\t\t\"fareItemId\": \"jdselfbspZHZH98992018-02-04F\",\n" +
                "\t\t\"discount\": 250,\n" +
                "\t\t\"fee\": 0,\n" +
                "\t\t\"subsidy\": 0,\n" +
                "\t\t\"childSeatCode\": \"F\",\n" +
                "\t\t\"price\": 0,\n" +
                "\t\t\"originalPrice\": 3100,\n" +
                "\t\t\"infantSalePrice\": 0,\n" +
                "\t\t\"newMinPrice\": 0,\n" +
                "\t\t\"oilTax\": 0,\n" +
                "\t\t\"classLevel\": \"F\",\n" +
                "\t\t\"zvItemId\": 0,\n" +
                "\t\t\"customerId\": 0,\n" +
                "\t\t\"maxPassengerNum\": 0,\n" +
                "\t\t\"childOilTax\": 0,\n" +
                "\t\t\"childVenderPrice\": 1550,\n" +
                "\t\t\"sortPrice\": 0,\n" +
                "\t\t\"minPassengerNum\": 0,\n" +
                "\t\t\"rtDiscount\": 0,\n" +
                "\t\t\"fcClassType\": \"5\",\n" +
                "\t\t\"classNoCn\": \"\",\n" +
                "\t\t\"zvItemIdGo\": 0,\n" +
                "\t\t\"promotionBeans\": 0,\n" +
                "\t\t\"skuId\": 0,\n" +
                "\t\t\"agentFeeGo\": 0.0,\n" +
                "\t\t\"venderPrice\": 3100,\n" +
                "\t\t\"oldDiscount\": 0,\n" +
                "\t\t\"promotionPrice\": 0.0,\n" +
                "\t\t\"fullPrice\": 1240,\n" +
                "\t\t\"discountFlag\": false,\n" +
                "\t\t\"luggallow\": \"\",\n" +
                "\t\t\"childPrice\": 0,\n" +
                "\t\t\"avItemTax\": 0,\n" +
                "\t\t\"deficitPrice\": 3100,\n" +
                "\t\t\"resetPolicy\": false,\n" +
                "\t\t\"uniqueKey\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQSp/WJesbrOPuaxFl82q79w==\",\n" +
                "\t\t\"sourceId\": \"661726\",\n" +
                "\t\t\"refundFeeFormulaId\": 0,\n" +
                "\t\t\"classNo\": \"F\",\n" +
                "\t\t\"pat\": false,\n" +
                "\t\t\"iOilTax\": 0,\n" +
                "\t\t\"seatNum\": \"6\",\n" +
                "\t\t\"oldprice\": 0,\n" +
                "\t\t\"productCode\": \"\",\n" +
                "\t\t\"netPrice\": 0,\n" +
                "\t\t\"childSalePrice\": 0,\n" +
                "\t\t\"reducePrice\": 0,\n" +
                "\t\t\"exsitsActivity\": false\n" +
                "\t}, {\n" +
                "\t\t\"airCompanyFlag\": true,\n" +
                "\t\t\"activityId\": 0,\n" +
                "\t\t\"infantVenderPrice\": 0,\n" +
                "\t\t\"policyId\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQL5O7RthR+czuaxFl82q79w==\",\n" +
                "\t\t\"rfId\": 0,\n" +
                "\t\t\"netChildPrice\": 0,\n" +
                "\t\t\"agentFee\": 0.0,\n" +
                "\t\t\"promotionReducePrice\": 0,\n" +
                "\t\t\"fareItemId\": \"jdselfbspZHZH98992018-02-04C\",\n" +
                "\t\t\"discount\": 240,\n" +
                "\t\t\"fee\": 0,\n" +
                "\t\t\"subsidy\": 0,\n" +
                "\t\t\"childSeatCode\": \"C\",\n" +
                "\t\t\"price\": 0,\n" +
                "\t\t\"originalPrice\": 2980,\n" +
                "\t\t\"infantSalePrice\": 0,\n" +
                "\t\t\"newMinPrice\": 0,\n" +
                "\t\t\"oilTax\": 0,\n" +
                "\t\t\"classLevel\": \"C\",\n" +
                "\t\t\"zvItemId\": 0,\n" +
                "\t\t\"customerId\": 0,\n" +
                "\t\t\"maxPassengerNum\": 0,\n" +
                "\t\t\"childOilTax\": 0,\n" +
                "\t\t\"childVenderPrice\": 1490,\n" +
                "\t\t\"sortPrice\": 0,\n" +
                "\t\t\"minPassengerNum\": 0,\n" +
                "\t\t\"rtDiscount\": 0,\n" +
                "\t\t\"fcClassType\": \"5\",\n" +
                "\t\t\"classNoCn\": \"\",\n" +
                "\t\t\"zvItemIdGo\": 0,\n" +
                "\t\t\"promotionBeans\": 0,\n" +
                "\t\t\"skuId\": 0,\n" +
                "\t\t\"agentFeeGo\": 0.0,\n" +
                "\t\t\"venderPrice\": 2980,\n" +
                "\t\t\"oldDiscount\": 0,\n" +
                "\t\t\"promotionPrice\": 0.0,\n" +
                "\t\t\"fullPrice\": 1240,\n" +
                "\t\t\"discountFlag\": false,\n" +
                "\t\t\"luggallow\": \"\",\n" +
                "\t\t\"childPrice\": 0,\n" +
                "\t\t\"avItemTax\": 0,\n" +
                "\t\t\"deficitPrice\": 2980,\n" +
                "\t\t\"resetPolicy\": false,\n" +
                "\t\t\"uniqueKey\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQL5O7RthR+czuaxFl82q79w==\",\n" +
                "\t\t\"sourceId\": \"661726\",\n" +
                "\t\t\"refundFeeFormulaId\": 0,\n" +
                "\t\t\"classNo\": \"C\",\n" +
                "\t\t\"pat\": false,\n" +
                "\t\t\"iOilTax\": 0,\n" +
                "\t\t\"seatNum\": \"2\",\n" +
                "\t\t\"oldprice\": 0,\n" +
                "\t\t\"productCode\": \"\",\n" +
                "\t\t\"netPrice\": 0,\n" +
                "\t\t\"childSalePrice\": 0,\n" +
                "\t\t\"reducePrice\": 0,\n" +
                "\t\t\"exsitsActivity\": false\n" +
                "\t}, {\n" +
                "\t\t\"airCompanyFlag\": true,\n" +
                "\t\t\"activityId\": 0,\n" +
                "\t\t\"infantVenderPrice\": 0,\n" +
                "\t\t\"policyId\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQ0UENkdxWb2buaxFl82q79w==\",\n" +
                "\t\t\"rfId\": 0,\n" +
                "\t\t\"netChildPrice\": 0,\n" +
                "\t\t\"agentFee\": 0.0,\n" +
                "\t\t\"promotionReducePrice\": 0,\n" +
                "\t\t\"fareItemId\": \"jdselfbspZHZH98992018-02-04M\",\n" +
                "\t\t\"discount\": 96,\n" +
                "\t\t\"fee\": 0,\n" +
                "\t\t\"subsidy\": 0,\n" +
                "\t\t\"childSeatCode\": \"Y\",\n" +
                "\t\t\"price\": 0,\n" +
                "\t\t\"originalPrice\": 1190,\n" +
                "\t\t\"infantSalePrice\": 0,\n" +
                "\t\t\"newMinPrice\": 0,\n" +
                "\t\t\"oilTax\": 0,\n" +
                "\t\t\"classLevel\": \"Y\",\n" +
                "\t\t\"zvItemId\": 0,\n" +
                "\t\t\"customerId\": 0,\n" +
                "\t\t\"maxPassengerNum\": 0,\n" +
                "\t\t\"childOilTax\": 0,\n" +
                "\t\t\"childVenderPrice\": 620,\n" +
                "\t\t\"sortPrice\": 0,\n" +
                "\t\t\"minPassengerNum\": 0,\n" +
                "\t\t\"rtDiscount\": 0,\n" +
                "\t\t\"fcClassType\": \"5\",\n" +
                "\t\t\"classNoCn\": \"\",\n" +
                "\t\t\"zvItemIdGo\": 0,\n" +
                "\t\t\"promotionBeans\": 0,\n" +
                "\t\t\"skuId\": 0,\n" +
                "\t\t\"agentFeeGo\": 0.0,\n" +
                "\t\t\"venderPrice\": 1190,\n" +
                "\t\t\"oldDiscount\": 0,\n" +
                "\t\t\"promotionPrice\": 0.0,\n" +
                "\t\t\"fullPrice\": 1240,\n" +
                "\t\t\"discountFlag\": false,\n" +
                "\t\t\"luggallow\": \"\",\n" +
                "\t\t\"childPrice\": 0,\n" +
                "\t\t\"avItemTax\": 0,\n" +
                "\t\t\"deficitPrice\": 1190,\n" +
                "\t\t\"resetPolicy\": false,\n" +
                "\t\t\"uniqueKey\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQ0UENkdxWb2buaxFl82q79w==\",\n" +
                "\t\t\"sourceId\": \"661726\",\n" +
                "\t\t\"refundFeeFormulaId\": 0,\n" +
                "\t\t\"classNo\": \"M\",\n" +
                "\t\t\"pat\": false,\n" +
                "\t\t\"iOilTax\": 0,\n" +
                "\t\t\"seatNum\": \"A\",\n" +
                "\t\t\"oldprice\": 0,\n" +
                "\t\t\"productCode\": \"\",\n" +
                "\t\t\"netPrice\": 0,\n" +
                "\t\t\"childSalePrice\": 0,\n" +
                "\t\t\"reducePrice\": 0,\n" +
                "\t\t\"exsitsActivity\": false\n" +
                "\t}, {\n" +
                "\t\t\"airCompanyFlag\": true,\n" +
                "\t\t\"activityId\": 0,\n" +
                "\t\t\"infantVenderPrice\": 0,\n" +
                "\t\t\"policyId\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQpv8z2L3W34nuaxFl82q79w==\",\n" +
                "\t\t\"rfId\": 0,\n" +
                "\t\t\"netChildPrice\": 0,\n" +
                "\t\t\"agentFee\": 0.0,\n" +
                "\t\t\"promotionReducePrice\": 0,\n" +
                "\t\t\"fareItemId\": \"jdselfbspZHZH98992018-02-04H\",\n" +
                "\t\t\"discount\": 81,\n" +
                "\t\t\"fee\": 0,\n" +
                "\t\t\"subsidy\": 0,\n" +
                "\t\t\"childSeatCode\": \"Y\",\n" +
                "\t\t\"price\": 0,\n" +
                "\t\t\"originalPrice\": 1000,\n" +
                "\t\t\"infantSalePrice\": 0,\n" +
                "\t\t\"newMinPrice\": 0,\n" +
                "\t\t\"oilTax\": 0,\n" +
                "\t\t\"classLevel\": \"Y\",\n" +
                "\t\t\"zvItemId\": 0,\n" +
                "\t\t\"customerId\": 0,\n" +
                "\t\t\"maxPassengerNum\": 0,\n" +
                "\t\t\"childOilTax\": 0,\n" +
                "\t\t\"childVenderPrice\": 620,\n" +
                "\t\t\"sortPrice\": 0,\n" +
                "\t\t\"minPassengerNum\": 0,\n" +
                "\t\t\"rtDiscount\": 0,\n" +
                "\t\t\"fcClassType\": \"5\",\n" +
                "\t\t\"classNoCn\": \"\",\n" +
                "\t\t\"zvItemIdGo\": 0,\n" +
                "\t\t\"promotionBeans\": 0,\n" +
                "\t\t\"skuId\": 0,\n" +
                "\t\t\"agentFeeGo\": 0.0,\n" +
                "\t\t\"venderPrice\": 1000,\n" +
                "\t\t\"oldDiscount\": 0,\n" +
                "\t\t\"promotionPrice\": 0.0,\n" +
                "\t\t\"fullPrice\": 1240,\n" +
                "\t\t\"discountFlag\": false,\n" +
                "\t\t\"luggallow\": \"\",\n" +
                "\t\t\"childPrice\": 0,\n" +
                "\t\t\"avItemTax\": 0,\n" +
                "\t\t\"deficitPrice\": 1000,\n" +
                "\t\t\"resetPolicy\": false,\n" +
                "\t\t\"uniqueKey\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQpv8z2L3W34nuaxFl82q79w==\",\n" +
                "\t\t\"sourceId\": \"661726\",\n" +
                "\t\t\"refundFeeFormulaId\": 0,\n" +
                "\t\t\"classNo\": \"H\",\n" +
                "\t\t\"pat\": false,\n" +
                "\t\t\"iOilTax\": 0,\n" +
                "\t\t\"seatNum\": \"A\",\n" +
                "\t\t\"oldprice\": 0,\n" +
                "\t\t\"productCode\": \"\",\n" +
                "\t\t\"netPrice\": 0,\n" +
                "\t\t\"childSalePrice\": 0,\n" +
                "\t\t\"reducePrice\": 0,\n" +
                "\t\t\"exsitsActivity\": false\n" +
                "\t}, {\n" +
                "\t\t\"airCompanyFlag\": true,\n" +
                "\t\t\"activityId\": 0,\n" +
                "\t\t\"infantVenderPrice\": 0,\n" +
                "\t\t\"policyId\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQy40pO0Np5b/uaxFl82q79w==\",\n" +
                "\t\t\"rfId\": 0,\n" +
                "\t\t\"netChildPrice\": 0,\n" +
                "\t\t\"agentFee\": 0.0,\n" +
                "\t\t\"promotionReducePrice\": 0,\n" +
                "\t\t\"fareItemId\": \"jdselfbspZHZH98992018-02-04U\",\n" +
                "\t\t\"discount\": 86,\n" +
                "\t\t\"fee\": 0,\n" +
                "\t\t\"subsidy\": 0,\n" +
                "\t\t\"childSeatCode\": \"Y\",\n" +
                "\t\t\"price\": 0,\n" +
                "\t\t\"originalPrice\": 1070,\n" +
                "\t\t\"infantSalePrice\": 0,\n" +
                "\t\t\"newMinPrice\": 0,\n" +
                "\t\t\"oilTax\": 0,\n" +
                "\t\t\"classLevel\": \"Y\",\n" +
                "\t\t\"zvItemId\": 0,\n" +
                "\t\t\"customerId\": 0,\n" +
                "\t\t\"maxPassengerNum\": 0,\n" +
                "\t\t\"childOilTax\": 0,\n" +
                "\t\t\"childVenderPrice\": 620,\n" +
                "\t\t\"sortPrice\": 0,\n" +
                "\t\t\"minPassengerNum\": 0,\n" +
                "\t\t\"rtDiscount\": 0,\n" +
                "\t\t\"fcClassType\": \"5\",\n" +
                "\t\t\"classNoCn\": \"\",\n" +
                "\t\t\"zvItemIdGo\": 0,\n" +
                "\t\t\"promotionBeans\": 0,\n" +
                "\t\t\"skuId\": 0,\n" +
                "\t\t\"agentFeeGo\": 0.0,\n" +
                "\t\t\"venderPrice\": 1070,\n" +
                "\t\t\"oldDiscount\": 0,\n" +
                "\t\t\"promotionPrice\": 0.0,\n" +
                "\t\t\"fullPrice\": 1240,\n" +
                "\t\t\"discountFlag\": false,\n" +
                "\t\t\"luggallow\": \"\",\n" +
                "\t\t\"childPrice\": 0,\n" +
                "\t\t\"avItemTax\": 0,\n" +
                "\t\t\"deficitPrice\": 1070,\n" +
                "\t\t\"resetPolicy\": false,\n" +
                "\t\t\"uniqueKey\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQy40pO0Np5b/uaxFl82q79w==\",\n" +
                "\t\t\"sourceId\": \"661726\",\n" +
                "\t\t\"refundFeeFormulaId\": 0,\n" +
                "\t\t\"classNo\": \"U\",\n" +
                "\t\t\"pat\": false,\n" +
                "\t\t\"iOilTax\": 0,\n" +
                "\t\t\"seatNum\": \"A\",\n" +
                "\t\t\"oldprice\": 0,\n" +
                "\t\t\"productCode\": \"\",\n" +
                "\t\t\"netPrice\": 0,\n" +
                "\t\t\"childSalePrice\": 0,\n" +
                "\t\t\"reducePrice\": 0,\n" +
                "\t\t\"exsitsActivity\": false\n" +
                "\t}, {\n" +
                "\t\t\"airCompanyFlag\": true,\n" +
                "\t\t\"activityId\": 0,\n" +
                "\t\t\"infantVenderPrice\": 0,\n" +
                "\t\t\"policyId\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQ9Rp/VJ4NrDTuaxFl82q79w==\",\n" +
                "\t\t\"rfId\": 0,\n" +
                "\t\t\"netChildPrice\": 0,\n" +
                "\t\t\"agentFee\": 0.0,\n" +
                "\t\t\"promotionReducePrice\": 0,\n" +
                "\t\t\"fareItemId\": \"jdselfbspZHZH98992018-02-04Y\",\n" +
                "\t\t\"discount\": 100,\n" +
                "\t\t\"fee\": 0,\n" +
                "\t\t\"subsidy\": 0,\n" +
                "\t\t\"childSeatCode\": \"Y\",\n" +
                "\t\t\"price\": 0,\n" +
                "\t\t\"originalPrice\": 1240,\n" +
                "\t\t\"infantSalePrice\": 0,\n" +
                "\t\t\"newMinPrice\": 0,\n" +
                "\t\t\"oilTax\": 0,\n" +
                "\t\t\"classLevel\": \"Y\",\n" +
                "\t\t\"zvItemId\": 0,\n" +
                "\t\t\"customerId\": 0,\n" +
                "\t\t\"maxPassengerNum\": 0,\n" +
                "\t\t\"childOilTax\": 0,\n" +
                "\t\t\"childVenderPrice\": 620,\n" +
                "\t\t\"sortPrice\": 0,\n" +
                "\t\t\"minPassengerNum\": 0,\n" +
                "\t\t\"rtDiscount\": 0,\n" +
                "\t\t\"fcClassType\": \"5\",\n" +
                "\t\t\"classNoCn\": \"\",\n" +
                "\t\t\"zvItemIdGo\": 0,\n" +
                "\t\t\"promotionBeans\": 0,\n" +
                "\t\t\"skuId\": 0,\n" +
                "\t\t\"agentFeeGo\": 0.0,\n" +
                "\t\t\"venderPrice\": 1240,\n" +
                "\t\t\"oldDiscount\": 0,\n" +
                "\t\t\"promotionPrice\": 0.0,\n" +
                "\t\t\"fullPrice\": 1240,\n" +
                "\t\t\"discountFlag\": false,\n" +
                "\t\t\"luggallow\": \"\",\n" +
                "\t\t\"childPrice\": 0,\n" +
                "\t\t\"avItemTax\": 0,\n" +
                "\t\t\"deficitPrice\": 1240,\n" +
                "\t\t\"resetPolicy\": false,\n" +
                "\t\t\"uniqueKey\": \"v/UmAGQoE1+A3k+c8S1V75wUyW4oMfSQ9Rp/VJ4NrDTuaxFl82q79w==\",\n" +
                "\t\t\"sourceId\": \"661726\",\n" +
                "\t\t\"refundFeeFormulaId\": 0,\n" +
                "\t\t\"classNo\": \"Y\",\n" +
                "\t\t\"pat\": false,\n" +
                "\t\t\"iOilTax\": 0,\n" +
                "\t\t\"seatNum\": \"A\",\n" +
                "\t\t\"oldprice\": 0,\n" +
                "\t\t\"productCode\": \"\",\n" +
                "\t\t\"netPrice\": 0,\n" +
                "\t\t\"childSalePrice\": 0,\n" +
                "\t\t\"reducePrice\": 0,\n" +
                "\t\t\"exsitsActivity\": false\n" +
                "\t}],\n" +
                "\t\"airwaysCn\": \"深圳航空\",\n" +
                "\t\"minPrice\": 0,\n" +
                "\t\"discountCN\": \"0\"\n" +
                "}";

        try{
            JSONObject jsonObject = JSONObject.fromObject(jsonFlight);
            Map<String,Class> map = new HashMap<String,Class>();
            map.put("bingoClassInfoList", FlightClassInfo.class);
            FlightInfo flightInfo = (FlightInfo) JSONObject.toBean(jsonObject, FlightInfo.class, map);
            List<FlightInfo> flights = new ArrayList<FlightInfo>();
            flights.add(flightInfo);
            filterCharterFlight(flights);
            System.out.println(flights.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private String initLimitAgeText(Integer limitAgeBegin, Integer limitAgeEnd) {
        StringBuilder text = new StringBuilder();

        if(null==limitAgeBegin)

            return text.toString();

        if(null==limitAgeEnd)
            return text.toString();

        text.append("此优惠产品仅限");

        text.append(limitAgeBegin.intValue());

        text.append("岁-");

        text.append(limitAgeEnd.intValue());

        text.append("岁的旅客使用");

        return text.toString();
    }

    //预定人数限制浮层文案
    private String initLimitOrderText(Integer limitOrderMixNum, Integer limitOrderMaxNum) {
        StringBuilder text = new StringBuilder();

        if(null==limitOrderMixNum)
            return text.toString();

        if(null==limitOrderMaxNum)
            return text.toString();

        text.append(limitOrderMixNum.intValue());
        text.append("-");
        text.append(limitOrderMaxNum.intValue());
        text.append("人同时购买可享受此价格");

        return text.toString();
    }
    //出票慢浮层文案
    /*private String initSlowIssueText(Integer limitTicketTime){
        StringBuilder text = new StringBuilder();
        if(limitTicketTime == null){
            return text.toString();
        }

        int limitTime = limitTicketTime.intValue();
        text.append("特殊产品出票慢，航班起飞前");
        if(limitTime >= 72){
            text.append(limitTime/24);
            text.append("天出票，支付成功后保障出行");
        }else{
            text.append(limitTime);
            text.append("小时出票，支付成功后保障出行");
        }

        return text.toString();
    }*/

    private String initSlowIssueText(Integer limitTicketTime){
        StringBuilder text = new StringBuilder();
        if(limitTicketTime == null){
            return text.toString();
        }

        int limitTime = limitTicketTime.intValue();
        text.append("特殊产品出票慢，航班起飞前");
        if(limitTime >= 24){
            text.append(limitTime/24);
            text.append("天");
            int limitHour = limitTime%24;
            if(limitHour != 0){
                text.append(limitHour);
                text.append("小时");
            }
            text.append("出票，支付成功后保障出行");
        }else{
            text.append(limitTime);
            text.append("小时出票，支付成功后保障出行");
        }

        return text.toString();
    }
    //退票慢浮层文案
    private String initSlowRefundText(){
        StringBuilder text = new StringBuilder();
        text.append("特殊产品，退票审核需3-5天，请耐心等待");
        return text.toString();
    }
    //预定人数限制打标
    private String initLimitPersonNum(Integer limitOrderMixNum, Integer limitOrderMaxNum){
        StringBuilder text = new StringBuilder();

        if(null==limitOrderMixNum)
            return text.toString();

        if(null==limitOrderMaxNum)
            return text.toString();

        text.append("限");
        text.append(limitOrderMixNum.intValue());
        text.append("-");
        text.append(limitOrderMaxNum.intValue());
        text.append("人购票");

        return text.toString();
    }
    public Double getMile(Integer isSupportIntegral, String fcClassType, Double mile){
        if(((isSupportIntegral == null) && !"5".equals(fcClassType) || ((isSupportIntegral != null) && "1".equals(isSupportIntegral.toString())))){
            return mile;
        }
        return null;
    }

    private void filterCharterFlight(List<FlightInfo> flights) throws Exception {

        if (CollectionUtils.isEmpty(flights)) {
            return;
        }

       // System.out.println(flights.get(0).getBingoClassInfoList());
        //过滤包机切位的航班
        Iterator<FlightInfo> fIterator = flights.iterator();
        while (fIterator.hasNext()) {
            FlightInfo flight = fIterator.next();

            FlightClassInfo flightClassInfo = flight.getBingoClassInfoList().get(0);
            if (!CollectionUtils.isEmpty(flight.getBingoClassInfoList())) {
                Iterator<FlightClassInfo> cIterator = flight.getBingoClassInfoList().iterator();

                while (cIterator.hasNext()) {
                   // System.out.println(cIterator.next());
                    FlightClassInfo classInfo = cIterator.next();

                    //包机切位的seatType为5
                    if ( "5".equals(classInfo.getFcClassType())) {
                        {
                            cIterator.remove();
                        }
                    }
                }

                if (CollectionUtils.isEmpty(flight.getBingoClassInfoList())) {
                    fIterator.remove();
                }
            }
        }
    }
}
