package Java;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "naga sudheer";
        String temp = s;
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        if(rev.equals(temp)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
