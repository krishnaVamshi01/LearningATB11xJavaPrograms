package EveryDay_Tasks.Tasks_5_April;

public class CheckAlphabet {
    // 11) Check if a Character is an Alphabet

    public static void main(String[] args) {
        char ch = 'A';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println(ch + " is an Alphabet");
        else
            System.out.println(ch + " is not an Alphabet");
    }
}

