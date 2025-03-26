package EveryDay_Tasks;

public class march14_Decrement_Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;

        System.out.println((--a) + (a++) + (a--));

        // 19 + 19+1 + 20-1
        // 19+19+20 => 58
        System.out.println(a);
        // 20-1 => 19

        System.out.println((--b) + (b++) + (b--));

        // 14+14+1+15-1
        // 14+14+15 => 43
        System.out.println(b);
        // 15-1 => 14
    }
}
