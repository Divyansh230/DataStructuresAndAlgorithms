package Arrays;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class IntersectionOfArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> arr = new ArrayList<>();

        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }

        int ans[] = new int[arr.size()];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = arr.get(k);
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];

        int n2=sc.nextInt();
        int arr2[]=new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        IntersectionOfArrays obj = new IntersectionOfArrays();
        System.out.println(obj.intersect(arr1, arr2));
    }

}
