package Exception;

public class NullPointerExceptionExp1 {
//    static String s;
//    static  String s1;
    public static void main(String[] args) {
        String[] s ={"A","B","C"};
        for(int i=0;i<=3;i++){
            System.out.println(s[i]);
        }
        int x =10;
        switch (x){
            default :
                System.out.println("A");
            case 10:
                System.out.println("B");

        }
       // try{
//int i=1;
//do{
//    while (++i<3){
//        System.out.println(++i);
//    }
//}
//while (++i<10);
//            System.out.println(s+s1);
//            if(++i<3){
//                System.out.println("A");
//        }
//        {
//            System.out.println("B");
//        }
//        System.out.println("C");
       // }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("Exception handled");
//        }
    }
}
