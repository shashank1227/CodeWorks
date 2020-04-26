import java.util.*;
import java.io.*;
public class Bob {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0, max=0;
        int i=0,j=0;
        while(j<M){
            sum+=arr[j];
            j++;
        }
        max=sum;
        while(j<N-1){
            i++;j++;
            sum+=arr[j];
            sum-=arr[i-1];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}