package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumK {
    public static int subarraySum(int[] nums, int k) {
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
            else{
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        SubArraySumK s=new SubArraySumK();
        System.out.println(s.subarraySum(new int[]{1,2,3,4,5,6,7},3));
    }
}
