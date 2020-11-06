package cn.wzvtc.softwaretechintro;

import java.sql.SQLOutput;
/**
 * TODO 请将该类改为你的全学号,比如我的工号是2012020045，就改为PT2012020045
 */
public class Phase01Test {
    public static void main(String[] args) {
        //准备动作
        long stuno=2012020045L;//TODO 请将你的全学号赋值给stuno
        int low=45;//替换为你的全学号的低位3位，我的是045，则直接用45

        long stuno16=0x77ECFD4DL;//TODO 1 请使用十六进制给studno16赋值，使得输出的数字恰好为你的全学号.
        //A:用计算器就行了
        System.out.println(stuno16);


        float lowfloat=low*1.0f;
        //TODO 2. 请找出另一个浮点数，使得lowfloat==为真，且表面上不同于lowfloat当前的值，
        //A:构造最后的溢出就行了，最小刻度是1/16777216，实在不行就继续加0
        System.out.println(lowfloat==45.0000002682209015f);

        //TODO 3. 已知下述语句会输出我的姓名，请根据所学编码知识，不输入汉字，修改内容，使得输出的是你的姓名。
        //A: 知道有unicode字符集，以及码点的概念，去baidu "unicode 码点 在线"就成了，我都给我名字的示例，你可以核对
        //这个网址行不行？
        System.out.println("\u5218\u7B11\u950B");

        //TODO 4. 输出长整型的最大值和最小值
        //A:知道补码是怎么回事、整型长度是4个字节，直接用计算器都可以；或者直接用Integer.MAX_VALUE也行。
        System.out.println("长整型最大值是:"+Integer.MAX_VALUE);//0x7FFFFFFF;
        System.out.println("长整型最小值是:"+Integer.MIN_VALUE);//0x80000000

        int a=33;
        int b=57;
        //TODO 5 设置c的值，请用位运算符做以下运算：～、&、｜、^中的一个，使得a?c,b?c都能让a,b的二进制位数的最低4为保持不变，其他二进制位边为0；
        //A:算是位运算位的用途之一咯，so easy.
        int c=0x0F;
        System.out.println(a&c);
        System.out.println(b&c);

        int x=123;//01111011
        //TODO 6 合理设置的y的值,并选取适当的位运算符号，将int x=123的高4位取反，低四位保持不变。并输出结果
        //位运算的用途，简直是凑数题：
        int y=0x0F;
        System.out.println(x^y);

        int m=8;
        int n=3;
        System.out.println(m>>1);
        System.out.println(m>>2);
        System.out.println(n<<2);
        System.out.println(n<<1);
        //TODO 7 请根据上述4行归纳说出<<,>>这两个符号的含义
        System.out.println("<<n表示左移n位，n次x2；");
    }


}
