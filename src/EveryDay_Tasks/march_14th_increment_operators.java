package EveryDay_Tasks;

public class march_14th_increment_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 24;
        System.out.println(++a + a++ + a++);
// a = 10;       ++a , a++ , a++
//               11 , 11+1 , 12+1
//              (++a + a++ + a++) => 11+11+12 => 34
        System.out.println(a);
//              12+1=13
        System.out.println(++b + b++ + b++);
//  b = 24;       ++b , b++ , b++
//                25, 25+1 , 26+1
//              (++b + b++ + b++) => 25+25+26 => 76

        System.out.println(b);
//        26+1=> 27
    }
}