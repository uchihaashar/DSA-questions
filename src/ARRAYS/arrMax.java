package ARRAYS;


import java.util.Scanner;

public class arrMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the  length of array you want");
        int num = sc.nextInt();
        int arr [] = new int[num];
        System.out.println( " Enter the number in array index ");

        for (int i = 0 ; i <arr.length; i++){
            arr[i]=sc.nextInt();

        }
        int max = 0;

        for ( int i = 0; i <arr.length ; i++){
            if (arr[i]>max){
                max = arr[i];
            }


        }
        System.out.println(" the max value of this array is " + max  );
    }


}
