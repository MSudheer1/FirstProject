import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter byte value: ");
        byte num1 = scanner.nextByte();
        System.out.println("Enter short value: ");
        short num2 = scanner.nextShort();
        System.out.println("Enter int value: ");
        int num3 = scanner.nextInt();
        System.out.println("Enter long value: ");
        long num4 = scanner.nextLong();
        System.out.println("Enter float value: ");
        float num5 = scanner.nextFloat();
        System.out.println("Enter double value: ");
        double num6 = scanner.nextDouble();
        System.out.println("Enter boolean value: ");
        boolean num7 = scanner.nextBoolean();
        System.out.println("given byte value: "+num1);
        System.out.println("given short value: "+num2);
        System.out.println("given int value: "+num3);
        System.out.println("given long value: "+num4);
        System.out.println("given float value: "+num5);
        System.out.println("given double value: "+num6);
        System.out.println("given boolean value: "+num7);

    }
}
