package EveryDay_Tasks;

public class March14th_Traingle_Classifier {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 20;
        if(a==b && b==c){
            System.out.println("it is a "+" equilateral Triangle");

        } else if (a==b ||b==c ||a==c) {
            System.out.println("it is a"+" isosceles Triangle");
        }
        else {
            System.out.println("it is a "+" scalene Triangle");
        }
    }
}
