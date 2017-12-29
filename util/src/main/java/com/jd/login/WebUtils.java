package com.jd.login;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
/**
 * Created by huyanxia on 2017/8/10.
 * 将页面的请求转换为formbean
 */
public class WebUtils {
    public static <T> T   request2Bean(HttpServletRequest request,Class<T> clazz){
        try{
            T bean = clazz.newInstance();
            Enumeration<String>e = request.getParameterNames();
            while (e.hasMoreElements()){
                String name = e.nextElement();
                String value = null;
                value = (String)request.getParameter(name);//注意：不能写错啦，一开始写成“name”，结果导致错误
                //因为formbean中birthday是Date型的，而通过request.getParameter()得到的参数都是String类型的，
                // 所以需要转换为date型的，单独BeanUtils.setProperty(Object bean, String name, Object value)
                if("birthday".equals(name)){
                    //两种日期转化方法，当然还有DateUtils和JDK8中的DateTimeFormater
                    if(!("".equals(value) )){
                        DateLocaleConverter dateLocaleConverter = new DateLocaleConverter();
                        BeanUtils.setProperty(bean,name,dateLocaleConverter.convert(value));
                    /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    BeanUtils.setProperty(bean,name,simpleDateFormat.parse(value));*/
                    }
                }else{
                    BeanUtils.setProperty(bean,name,value);//必须表单提交中的name与formbean中的name一致，否则不会被设置
                }
            }
            return bean;//返回的bean是RegisterFormBean的对象，所以bean的属性中，有从表单中设置过来的，没设置的则按照原来的值（如：errors）
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
