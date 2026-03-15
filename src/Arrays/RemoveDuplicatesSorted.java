package Arrays;

import java.util.Scanner;

public class RemoveDuplicatesSorted {

    public int removeDuplicates(int[] nums) {
       int n=nums.length;
       if(n==0)return 0;

       int k=0;
       for(int i=1;i<n;i++){
           if(nums[i]!=nums[k]){
               k++;
               nums[k]=nums[i];
           }
       }
       return k+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RemoveDuplicatesSorted obj=new RemoveDuplicatesSorted();
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=obj.removeDuplicates(nums);
        System.out.println(k);

    }
}
