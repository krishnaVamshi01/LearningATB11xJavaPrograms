package EX_03_Literals;

public class Lab034_charLiterals_Codes {
    public static void main(String[] args) {
        char c10 = 'A';
        //ASCII limited to A -> 65
        char rupees = '₹';

        System.out.println(rupees);

        char my_laugh_smiley = '\u1f60'; // it is smiley symbol :)
        //these are called Unicodes they are available on google to use them

        System.out.println(my_laugh_smiley);
    }
}