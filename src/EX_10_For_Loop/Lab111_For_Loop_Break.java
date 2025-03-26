package EX_10_For_Loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {
        // break - it is used to come out of the loop

        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                break;

            }


        }
        System.out.println("First loop exited!\n");

        for (int i2 = 0;i2<30 ; i2++){
            if(i2==15){
                break;
            }

        }
        System.out.println("Second loop exited!");
    }

}
