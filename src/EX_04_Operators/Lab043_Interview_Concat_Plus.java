package EX_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        int a =10;
        int b =20;

        String first_name = "krishna";
        String last_name = "vamshi";

        System.out.println(first_name+last_name + a+b);

        System.out.println(a+b+first_name+last_name);

        System.out.println(first_name+last_name + (a+b)); // // BODMAS - Bracket of Div, mul, add, sub
    }
}
