package Searching;

import java.util.Scanner;

public class FirstLastOccurence {
    public int[] searchRange(int[] nums, int target) {
        int first=first_Position(nums,target);
        int last=last_Position(nums,target);
        return new int[]{first,last};
    }

    public int first_Position(int arr[],int x){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==x){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    public int last_Position(int arr[],int x){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==x){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        FirstLastOccurence fl = new FirstLastOccurence();
        System.out.println(fl.searchRange(arr,target));
    }
}
