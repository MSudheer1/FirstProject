package Exception;

public class CustumExceptionExp1 {
    public void getValidate(int age) throws InvalidAgeException {
        if (age > 18) {
            System.out.println("Eligibe for Voting");
        } else {
            throw new InvalidAgeException("Not Eligible for Voting");
        }
    }

    public static void main(String[] args) {
        CustumExceptionExp1 ce = new CustumExceptionExp1();
        try {
            ce.getValidate(25);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMsg());
        }
    }
}
