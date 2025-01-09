package Binary_Search;

public class B_704 {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        int start = 0;
        int end = nums.length-1;
        System.out.println( binarySearch(nums,target,start,end));
    }
    public static int binarySearch(int nums[],int target,int start , int end){

        while(start<= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target)return mid;
            else if(nums[mid] > target )return binarySearch(nums,target,start,mid-1);
            else return binarySearch(nums,target,mid+1,end);
        }
        return -1;
    }
}
