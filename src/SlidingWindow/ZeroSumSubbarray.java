package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubbarray {

    public int subarraySum(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={6, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        ZeroSumSubbarray s=new ZeroSumSubbarray();
        System.out.println(s.subarraySum(arr));
    }
}
