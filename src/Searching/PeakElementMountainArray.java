package Searching;

public class PeakElementMountainArray {
    public static int findPeakElement(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid=start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(findPeakElement(arr));
    }
}
