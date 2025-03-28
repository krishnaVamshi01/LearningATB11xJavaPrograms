package EX_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SBF {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pawan ");
        stringBuffer.append("Kalyan");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);

    }
}
