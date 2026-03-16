package Searching;

import java.util.Scanner;

public class BookAllocation {

    public static int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length)return -1;

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }

        int start=max,end=sum;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            int student=1,page=0;
            for(int i=0;i<arr.length;i++){
                page+=arr[i];
                if(page>mid){
                    student++;
                    page=arr[i];
                }
            }

            if(student<=k){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findPages(arr,k));
    }

}
