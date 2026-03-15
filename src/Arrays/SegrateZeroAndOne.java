package Arrays;

import java.util.Scanner;

public class SegrateZeroAndOne {
    public void segrateZeroAndOne(int[] arr) {
        int start=0, end=arr.length-1;
        while(start<end){
            if(arr[start]==0){
                start++;
            }
            else{
                if(arr[end]==0){
                    arr[start]=(arr[end]+arr[start])+(arr[end]=arr[start]);
                    start++;
                    end--;
                }
                else{
                    end--;
                }
            }
        }
    }
    public static void main(String[] args) {
        SegrateZeroAndOne seg = new SegrateZeroAndOne();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        seg.segrateZeroAndOne(arr);

    }
}
