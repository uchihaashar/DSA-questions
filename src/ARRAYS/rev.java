package ARRAYS;

import java.util.Arrays;

public class rev {
    public static void main(String[] args) {
        int arr [] = { 1,2,3,4,5,6,7,8,9};
        System.out.println("original array " + Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1 ;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp ;
            start++;
            end--;
        }
        System.out.println("reverse array  "+Arrays.toString(arr));
    }
}
