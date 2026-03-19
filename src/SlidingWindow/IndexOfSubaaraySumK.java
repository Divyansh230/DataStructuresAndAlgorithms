package SlidingWindow;

import java.util.ArrayList;

public class IndexOfSubaaraySumK {
    public static ArrayList<Integer> subarraySum(int[] nums,int k) {
        ArrayList<Integer> res=new ArrayList<>();
        int start=0,end=0,sum=0;

        while(end<nums.length){
            sum+=nums[end];
            while(sum>k && start<=end){
                sum-=nums[start];
                start++;
            }
            if(sum==k){
                res.add(start+1);
                res.add(end+1);
                return res;
            }
            end++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums={2,3,-2,1,-3,4};
        IndexOfSubaaraySumK s=new IndexOfSubaaraySumK();
        System.out.println(s.subarraySum(nums,2));
    }
}
