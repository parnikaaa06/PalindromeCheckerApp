public class PalindromeCheckerApp {

  public static void main(String[] args) {


    String input = "madam";

    // Assume it is palindrome
    boolean isPalindrome = true;


    for (int i = 0; i < input.length() / 2; i++) {

      // Compare characters from both ends
      if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
        isPalindrome = false;
        break;
      }
    }


    System.out.println("Input text: " + input);
    System.out.println("Is it a Palindrome? : " + isPalindrome);
  }
}