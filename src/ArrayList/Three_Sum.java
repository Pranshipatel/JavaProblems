package ArrayList;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class Three_Sum {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }
    static void threeSum(int nums[]){
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        if(n < 3 || nums == null ) System.out.println(list);
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n-1;
            while (left < right){
                int sum = nums[i]+ nums[left]+ nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if(sum < 0)left++;
                else right-- ;
            }
        }
        System.out.println(list);
    }
}
