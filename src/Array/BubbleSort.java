package Array;
import java.lang.reflect.Array;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
      int arr[] = {3,6,2,6,8,3,6,4,3};
     Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] Bubble(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
