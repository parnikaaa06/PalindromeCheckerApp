public class PalindromeCheckerApp {

  public static void main(String[] args) {

    String input = "madam";

    boolean isPalindrome = true;
    for (int i = 0; i < input.length() / 2; i++) {
      if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
        isPalindrome = false;
        break;
      }
    }

    System.out.println("Input text: " + input);
    System.out.println("Is it a Palindrome? : " + isPalindrome);
    String reversed = "";
    for (int i = input.length() - 1; i >= 0; i--) {
      reversed = reversed + input.charAt(i);
    }

    if (input.equals(reversed)) {
      System.out.println("Result: " + input + " is a Palindrome.");
    } else {
      System.out.println("Result: " + input + " is NOT a Palindrome.");
    }
  }
}