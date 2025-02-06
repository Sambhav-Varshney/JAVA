public class PalindromeCheck {
    public static void main(String[] args) {
        String s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String s = "A man, a plan, a canal: Panama";
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Is palindrome? " + s.equals(reversed));
    }
}
