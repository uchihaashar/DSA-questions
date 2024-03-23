package HASHMAP;
import java.util.HashMap;

public class FirstNonRepeatElement {
    public static void main(String[] args) {
    int arr[]={2,3,2,3,2,3,2,5,2,3,2,5,7,3,2,3,2};

    int ans =FNR(arr);
        System.out.println(ans);
    }

    public static int FNR(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i<arr.length; i++){
            if(hm.containsKey(arr[i])==true){
                int temp = hm.get(arr[i]);
                 hm.put(arr[i], temp + 1);
            }
          else {
              hm.put(arr[i],1);

            }

        }
        for (int i = 0 ; i < arr.length;i++){
           if (hm.get(arr[i])==1){
               return arr[i];
           }
        }


        return 0;
    }
}
