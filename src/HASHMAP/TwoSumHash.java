package HASHMAP;

import java.util.HashMap;

public class TwoSumHash {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,};
        int k = 11;
     boolean bk =   pairSum(arr , 11);
        System.out.println(bk);

    }



    public static boolean pairSum(int arr[] , int k ){
        HashMap<Integer,Integer>hm = new HashMap<>();
        for (int i = 0 ; i< arr.length;i++){
            if (hm.containsKey(arr[i])==true){
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }
            else {
                hm.put(arr[i],1);
            }
        }
        for (int i = 0 ; i < arr.length;i++){
            int a = arr[i];
            int b = k - a;
            if (a!=b && hm.containsKey(b)==true){
                return true;
            } else if (a==b && hm.get(b)>1) {
                return true;

            }
            else {
                return false;
            }
        }
        return false;
    }
}
