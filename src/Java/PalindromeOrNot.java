package Java;

import java.util.Scanner;

public class PalindromeOrNot {

            public static boolean isPalindrome(String str) {
                String reversed = new StringBuilder(str).reverse().toString();
                return str.equals(reversed);
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                if (isPalindrome(input)) {
                    System.out.println(input + " is a palindrome.");
                } else {
                    System.out.println(input + " is not a palindrome.");
                }
            }
        }


