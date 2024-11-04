package ss2_loop_array;

import java.util.Arrays;

public class Demo {
    int a;
    String b;
    boolean c;
    float d; //0.0f
    Integer e;

    public static void main(String[] args) {
//        int[] arr = {2, 1, 4, 5, 9, 7, 11};
//        int[] temp = new int[arr.length+1];
//
////        String arr1[] ={"haiTT"};
//
////        String[] arr = new String[10];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//            temp[i] = arr[i];
//        }
//        temp[temp.length - 1] = 8;
//        arr = temp;
//
//        System.out.println(Arrays.toString(arr));

//        int[][] arr = new int[3][3];
        int[] arr = {2, 1, 4, 5, 9, 7, 11};
//        for (let temp of arr) trong js
        for (int temp : arr) {
            temp = temp * 2;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
//        boxing, unboxing
        Long i = Long.valueOf(5);
    }
}
