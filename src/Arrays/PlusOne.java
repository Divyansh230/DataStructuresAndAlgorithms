package Arrays;

import java.util.Scanner;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i]=='9'){
                digits[i]=0;
            }
            digits[i]++;
            return digits;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            PlusOne obj=new PlusOne();
            int n=sc.nextInt();
            int[] digits=new int[n];
            for(int i=0;i<n;i++){
                digits[i]=sc.nextInt();
            }
            digits=obj.plusOne(digits);
            for(int i=0;i<digits.length;i++){
                System.out.print(digits[i]+" ");
            }

        }
    }
}
