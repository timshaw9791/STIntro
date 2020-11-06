package cn.wzvtc.softwaretechintro.phase02;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * 最基本的断点，断点控制(Step over,step into\resume,to next breakpoint),调试原理，表达式面板，变量面板
 */
public class SimpleDebug {
    public static void main(String[] args) {
        int x=3,b=5;
        Random random=new Random();
        int r=random.nextInt();
        int sum=sum(r,x);
        System.out.println();
        int f=1;
        for (int i = 1; i <=b; i++) {
            f=f*i;
        }
        System.out.println();
    }

    private static int sum(int r, int x) {
        int result=r+x;
        return result;
    }


}
