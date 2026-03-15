package Arrays;

import java.util.Scanner;

public class MovingZeros {

    public void movingZeros(int[] arr) {
        int n=arr.length;
        int k=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                k=i;
                break;
            }
        }

        if(k==-1){
            return;
        }

        for(int i=k+1;i<n;i++){
            if(arr[k]!=arr[i]){
                arr[k]=(arr[i]+arr[k])-(arr[i]=arr[k]);
                k++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

    }
}
