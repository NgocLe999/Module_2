package ss14_search;

import java.util.Arrays;

public class DemoBinarySearch {

    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <=right) {
            int mid = (left + right)/2;
            if(value == arr[mid]) {
                return mid;
            } else if(value > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,8,2,0,4,3,10,6, 9};
        Arrays.sort(arr);
        int index = binarySearch(arr, 2);
        System.out.println(index);
    }
}
