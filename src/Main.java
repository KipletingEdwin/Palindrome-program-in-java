import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text to check");
        String input = scanner.next();
        String reversedString = "";


        for(int i = input.length() - 1; i>=0; i--) {
            reversedString = reversedString + input.charAt(i);
        }
        if(input.equals(reversedString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}