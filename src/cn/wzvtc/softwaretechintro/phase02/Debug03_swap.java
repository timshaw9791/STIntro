package cn.wzvtc.softwaretechintro.phase02;

public class Debug03_swap {
    public static void main(String[] args) {
        int a=3,b=5;
        System.out.println("a="+a);
        System.out.println("b="+b);

        //TODO  请输入代码交换ab两个数
        int t=a;
        a=b;
        b=t;
        swap(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    //TODO  请提取交换ab两个数的函数swap
    public static void swap(int a,int b){
        int t=a;
        a=b;
        b=t;
    }

}
