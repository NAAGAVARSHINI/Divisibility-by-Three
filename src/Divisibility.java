import java.util.Scanner;

public class Divisibility {

    static int divisibility(int[] arr, int n){
        int sum=0;
        for(int i=0; i<n;i++){
            sum+=arr[i]%3;
        }
        if(sum%3==0){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(divisibility(arr, n));
    }
}
