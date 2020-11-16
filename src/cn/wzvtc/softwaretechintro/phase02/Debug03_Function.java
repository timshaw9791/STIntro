package cn.wzvtc.softwaretechintro.phase02;

import java.util.Scanner;

public class Debug03_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        int result = (int) n == n ? (int) n : 0;
        System.out.println(result);
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void printSum(int a,int b){
        System.out.println(a+b);
    }


}


