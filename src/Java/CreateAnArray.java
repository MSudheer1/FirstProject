package Java;

public class CreateAnArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0]=10;
        array1[1]=20;
        array1[2]=30;
        array1[3]=40;
        array1[4]=50;
        for(int i =0;i<array1.length-1;i++){
            System.out.println(array1[1]);
        }
        String[] array2 = new String[10];
        array2[0] = "Sudheer";
        array2[1] = "Varun";
        array2[2] = "Yaswanth";
        array2[3] = "Manoj";
        array2[4] = null;
        for(int i= 0;i<=array2.length-1;i++){
            System.out.println(array2[i]);
        }
        boolean[] array3 = {true,false,true,false};
        for(int i= 0;i<=array3.length-1;i++){
            System.out.println(array3[i]);
        }
        float[] array4 = {1.0f,1.11f,1.23f,8.98f};
        for(int i= 0;i<=array4.length-1;i++){
            System.out.println(array4[i]);
        }
    }

}
