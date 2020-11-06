package cn.wzvtc.softwaretechintro.phase01;

import java.math.BigDecimal;

/**
 * 整数范围
 */
public class FloatPrecision {

    public static void main(String[] args) {
        float a =1.1f;
        float b =2.2f;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("a+b="+(a+b));
        BigDecimal a1=new BigDecimal(String.valueOf(1.1f));
        BigDecimal b1=new BigDecimal(String.valueOf(2.2f));
        System.out.println("a1+b1="+a1.add(b1).doubleValue());

        float x=16777215f;
        float y=16777216f;
        float z=16777217f;
        System.out.println("x==y?"+(x==y));
        System.out.println("y==Z?"+(x==z));


        System.out.println(33554428f==33554429f);
        System.out.println(33554428f==33554427f);






    }
}
