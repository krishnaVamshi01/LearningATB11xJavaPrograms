package EX_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'B';
        char c2 = '@';
        char c3 = '-';
        char c4 = 'A';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; //blank space

        //escape char
        char new_line = '\n';
        char tab = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Krishna\n"+"Vamshi");
        System.out.println("Krishna"+new_line+"Vamshi"); //both gives the same o/p
        System.out.println("Krishna\t"+"Vamshi");
        System.out.println("Krishna"+tab+"Vamshi"); //both does the same
        System.out.println("Krishna\b"+"Vamshi");
        System.out.println("Krishna"+back_space+"Vamshi"); // remove one char from the place where \b is added
        System.out.println("Krishna\r"+ "test"+"Vamshi"); // remove entire string that is present before \r is added
        System.out.println("Krishna"+carriage_return+"Vamshi");
    }
}
