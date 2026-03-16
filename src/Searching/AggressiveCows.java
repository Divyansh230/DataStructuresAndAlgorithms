package Searching;

import java.util.Arrays;

public class AggressiveCows {
    public int aggressiveCows(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);

        int start=0,end=n-1,ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            int cowCount=0,current=arr[0];
            for(int i=0;i<n;i++){
                if(arr[i]-current>=mid){
                    cowCount++;
                    current=arr[i];
                }
            }
            if(cowCount>=k){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        AggressiveCows a=new AggressiveCows();
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(a.aggressiveCows(arr,3));
    }
}
