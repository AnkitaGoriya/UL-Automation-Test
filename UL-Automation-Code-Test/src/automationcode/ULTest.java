package automationcode;

public class ULTest {

    public static boolean starredLetters(String s) {

        //It loops through the characters in the input string 's,' starting from the second character and ending at the second-to-last character.
        // Loop through the string starting from the second character and ending at the second-to-last character
        for (int i = 1; i < s.length() - 1; i++) {
            if (Character.isLetter(s.charAt(i))) {  // Check if the current character is a letter
                // Check if the characters before and after the current letter are "*"
                if (s.charAt(i - 1) != '*' || s.charAt(i + 1) != '*') {
                    return false;
                }
            }
        }

        // If the loop completes without returning false, the string satisfies the requirements
        return true;
    }

    public static void main(String[] args) {

        // This method serves as a place to test the "starredLetters" method with various input strings.
        System.out.println(starredLetters("*a*%=3=*"));   // Output: true
        System.out.println(starredLetters("%*3*b%3"));    // Output: false
        System.out.println(starredLetters("*3*b%3*"));    // Output: false
        System.out.println(starredLetters("*A*B*C*"));    // Output: true
        System.out.println(starredLetters("A%B*C"));      // Output: false
    }
}
