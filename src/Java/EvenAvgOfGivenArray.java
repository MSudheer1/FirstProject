package Java;

import java.util.Scanner;

public class EvenAvgOfGivenArray {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] array = new int[n];
        double sum=0;
        int count=0;
        for(int i = 0;i<n;i++){
            array[i] = scr.nextInt();
        }
        for(int num:array){
            if(num%2==0){
                sum = sum+num;
                count++;
            }
        }
        if(count>0){
            double avarage = sum/n;
            System.out.print("Avarage of Even Numbers: "+avarage );
        }
        else {
            System.out.print("No Even Numbers in the array");
        }
    }
}
