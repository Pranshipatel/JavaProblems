package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class MergeSort {
    public static void main(String[] args) {
        int nums1[] = {1,2,3};
        int nums2[] = {2,5,6};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ;i< nums1.length;i++){
            list.add(nums1[i]);
        }

        for(int i = 0 ;i< nums1.length;i++){
            list.add(nums2[i]);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i : list){
            if(!set.contains(i)){
                set.add(i);
            }
        }
        System.out.println(set);
    }
}
