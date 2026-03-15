package Arrays;

import java.util.Scanner;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum1=n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=nums[i];
        }

        return sum1-sum2;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(missingNumber.missingNumber(nums));
    }
}
