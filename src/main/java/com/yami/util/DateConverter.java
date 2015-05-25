package com.yami.util;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by hackcoder on 2015/5/22.
 */
public class DateConverter extends DefaultTypeConverter {
    private static final DateFormat[] ACCEPT_DATE_FORMATS = {
            new SimpleDateFormat("MM/dd/yyyy"),
            new SimpleDateFormat("dd/MM/yyyy"),
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("yyyy/MM/dd") }; //֧��ת�������ڸ�ʽ

    @Override
    public Object convertValue(Map context, Object value, Class toType) {
        if (toType == Date.class) {  //�������������ύʱ������String to Date��ת��
            Date date = null;
            String dateString = null;
            String[] params = (String[])value;
            dateString = params[0];//��ȡ���ڵ��ַ���
            for (DateFormat format : ACCEPT_DATE_FORMATS) {
                try {
                    return format.parse(dateString);//��������֧�ָ�ʽ������ת��
                } catch(Exception e) {
                    continue;
                }
            }
            return null;
        }
        else if (toType == String.class) {   //����������������ʱ������Date to String������ת��
            Date date = (Date)value;
            return new SimpleDateFormat("yyyy-MM-dd").format(date);//����ĸ�ʽ��yyyy-MM-dd
        }

        return null;
    }

    public static void main(String[] args) throws ParseException {
        String str = "05/29/2015";
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.parse(str));
    }
}
