package EX_03_Literals;

public class Lab033_Literals {
    public static void main(String[] args) {
        int age =65; //decimal system - base 10
        // binary literals
        int binary_num = 0b1010; // In decimal system this is 10

        // octal base -> 8 -> in decimal it is 65
        int octal = 0101;

        //Hexadecimal literals - 16
        int hex = 0Xface; // in decimal this is 64206

        System.out.println(binary_num);
        System.out.println(octal);
        System.out.println(hex);
        // base 16 color combination are in hex - #28a745
    }
}
