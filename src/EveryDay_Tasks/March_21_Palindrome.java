package EveryDay_Tasks;

public class March_21_Palindrome {
    public static void main(String[] args) {
//        Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)

                // Input string to check if it's a palindrome
                String name = "racecar";

                // Call revStr() function to reverse the string
                String reversed = revStr(name);

                // Compare the original and reversed strings
                if (name.equals(reversed)) {
                    System.out.println(name + " is a Palindrome");
                } else {
                    System.out.println(name + " is not a Palindrome");
                }
            }

            // Function to reverse a string using charAt()
            public static String revStr(String str) {
                String reversed = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    reversed += str.charAt(i); // Get characters from last to first
                }
                return reversed; // Return the reversed string
            }
        }

