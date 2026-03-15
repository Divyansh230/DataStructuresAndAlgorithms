package Arrays;

import java.util.Scanner;

public class ArrayDivisionEqualSubbArraySum {

    public boolean canSplit(int[] arr) {
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }

        int prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            int ans=total-prefix;
            if(ans==prefix)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDivisionEqualSubbArraySum a = new ArrayDivisionEqualSubbArraySum();
        System.out.println("Enter array length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(a.canSplit(arr));

    }
}
