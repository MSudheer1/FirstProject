import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        System.out.println("Welcome to child name generator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter father's first half name: ");
        String Fname = scanner.nextLine();
        System.out.println("Enter Mother's second half name: ");
        String Mname = scanner.nextLine();
        String Cname = Fname + Mname;
        System.out.println("Suggested Child Name: " + Cname);
    }
}
