package EX_06_Ternary_Operator;

public class Lab066_TO_Even_Odd {
    public static void main(String[] args) {
        int num = 10;
        String result = (num%2==0) ? "Even" : "Odd";
        System.out.println(result);

        int a = 20;
        String result2 = (a%2==0) ? "Even" : "Odd";
        System.out.println(result2);
    }
}
