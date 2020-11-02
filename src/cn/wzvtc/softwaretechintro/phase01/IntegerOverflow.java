package cn.wzvtc.softwaretechintro.phase01;

public class IntegerOverflow {

        public static void main(String[] args) {
            int a=2147483647;
            System.out.println("a="+a);
            System.out.println("a+1="+(a+1));

            int b=-2147483648;
            System.out.println("b="+b);
            System.out.println("b-1="+(b-1));
            // write your code here

            int c=0x7fffffff;
            System.out.println("c="+c);
            System.out.println("c+1="+(c+1));

            int d=0;//TODO 请使用16进制给此处赋值，使d成为整型中最大的值。
            System.out.println("d="+c);
            System.out.println("d-1="+(d+1));
        }
}
