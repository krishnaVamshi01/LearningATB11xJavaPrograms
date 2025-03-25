package EX_03_Literals;

public class Lab035_Non_Primitive_Literals {
    public static void main(String[] args) {
        // Primitive Data type - Defined by java guys
        //max, min -> size is defined

        byte b =10;// 1 byte -> 8 bits
        int age = 65; // 4 bytes --> 32 Bits

        //Non-primitive (defined by user), reference Data types
        // no size  --> no max or min defined
        //Byte - 8, bits
        String name = "Krishna"; // String here is a bunch of characters
        int[] arrays_of_items = new int[10];
//        arr is non-primitive (reference type) → Java prints a memory reference, not the elements.
//        2. Understanding [I@6f496d9f
//[I → Integer Array (I stands for int).
//@6f496d9f → Memory hashcode (not the actual address).
//Java does not print array elements directly.

//        System.out.println(arrays_of_items); When printed this out put was [I@6f496d9f

        // String, Arrays, Classes, enum etc..
        System.out.println(name);
        System.out.println(arrays_of_items);

    }
}
