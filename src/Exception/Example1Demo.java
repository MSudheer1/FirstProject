package Exception;

public class Example1Demo {
    public static void main(String[] args) {
        Example1 obj = new Example1();
        try {
            obj.division(10,0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
