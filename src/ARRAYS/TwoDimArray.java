package ARRAYS;

import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row");
        int row = sc.nextInt();
        System.out.println("Enter the column");
        int col = sc.nextInt();
        System.out.println("Fill the array index");
        int arr[][] = new int[row][col];

        for (int i = 0 ; i < row; i++){
            for (int j = 0 ; j<col;j++){

               arr[i][j]=sc.nextInt();
            }

        }
        for (int i = 0 ; i < row; i++){
            for (int j = 0 ; j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
