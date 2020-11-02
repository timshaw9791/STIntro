package cn.wzvtc.softwaretechintro.phase01;

/**
 * 保存位utf-8,
 * javac -encoding GBK ./src/cn/wzvtc/softwaretechintro/phase01/CharacterDemo.java
 *  会报错，留意错误。
 *  而-encoding UTF-8 不会
 *  java -cp ./src/ cn.wzvtc.softwaretechintro.phase01.CharacterDemo
 */
public class CharacterDemo {

    public static void main(String[] args) {
        char c='}';
        int d=(int)c;
        char e='我';

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println((int)e);
    }
}
