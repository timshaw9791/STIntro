package cn.wzvtc.softwaretechintro.phase02;

public class Debug04_Callstack {
    public static void main(String[] args) {
        int n=10;
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*n;
        }
        System.out.println(result);
    }
}
