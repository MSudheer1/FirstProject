package Exception;

public class Example2Demo {
    public static void main(String[] args) {
        Example2 obj = new Example2();
        try {
            obj.division(10,0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
