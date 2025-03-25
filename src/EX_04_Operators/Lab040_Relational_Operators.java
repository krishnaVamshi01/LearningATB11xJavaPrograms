package EX_04_Operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a>b);
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

        int a1 = 10;
        int b1 = 30;
        boolean c = a1 > b1; // // 10> 30
        System.out.println(c);

        int age_mamitha = 33;
        int age_krishna = 34;
        boolean result = age_krishna >= age_mamitha;
        System.out.println(result);


        // age_krishna > age_mamitha or age_krishna = age_mamitha

    }
}
