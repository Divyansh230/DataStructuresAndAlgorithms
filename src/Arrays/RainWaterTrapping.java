package Arrays;

import java.util.Scanner;

public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

    }

    public int trap(int[] height) {
        int maxHeight=height[0],index=0;
        for(int i=1;i<height.length;i++){
            if(height[i]>maxHeight){
                maxHeight=height[i];
                index=i;
            }
        }
        int left=0,right=height.length-1,water=0;
        for(int i=0;i<index;i++){
            if(left>maxHeight){
                water=left-maxHeight;
            }
            else{
                left=maxHeight;
            }
        }
        for(int i=height.length-1;i>index;i--){
            if(right>maxHeight){
                water=right-maxHeight;
            }
            else{
                right=maxHeight;
            }
        }
        return water;
    }
}
