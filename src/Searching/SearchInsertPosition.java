package Searching;

import java.util.Scanner;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int id=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target)return mid;

            if(nums[mid]<target){
                start=mid+1;
            }
            else{
                id=mid;
                end=mid-1;
            }
        }
        return id;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        SearchInsertPosition si = new SearchInsertPosition();
        System.out.println(si.searchInsert(nums,target));
    }
}
