import java.util.Scanner;

public class practice {
    static int res =-1;
    static int binarySearch(int n,int[] a,int t){
        int left,right,mid;
        left=0;
        right=n-1;
            while(left<=right){
                mid =(left+right)/2;
                if(a[mid]>t){
                    right =mid-1;
                    res = a[mid];
                }
                else
                    left =mid+1;
            }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.print(binarySearch(n,a,t));
    }
}


