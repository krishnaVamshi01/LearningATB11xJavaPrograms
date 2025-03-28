package EveryDay_Tasks;

public class March_21_Count_Vowels_Consonents {
    public static void main(String[] args) {
//         Count vowels(a,e,i,o,u) and consonants in a String. → pramod, → vowels - 2, consonants - 4

        String name = "Krishna Vamshi";

        // Convert to lowercase (to handle uppercase letters)
        name = name.toLowerCase();

        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);  // Get each character

//            // Check if the character is a letter before proceeding
//            if (Character.isLetter(ch)) {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;  // If it's not a vowel, it's a consonant
                }
            }

        // Print the results
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
