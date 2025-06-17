public class variables {
    int rollNo=22;
    int x=20;
    int y = x+1;

    void display() {
        int a;
        a=20;
        System.out.println("roll no is: " + rollNo);
        System.out.println("value: " + a);
    }
    public static void main(String[] args){
        variables obj = new variables();
        System.out.println();
        obj.display();
    }
}
