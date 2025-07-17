package src;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            if(binarySearch(nums, i+1, nums.length-1, target - nums[i])){
                arr[0] = i;
                arr[1] = index;
                return arr;
            }
        }

        return arr;
    }

    int index = -1;
    public boolean binarySearch(int[] arr, int low, int high, int target){
        if(low > high){
            return false;
        }

        int mid = low + (high - low)/2;
        if(arr[mid] == target){
            index = mid;
            return true;
        }

        return binarySearch(arr, low, mid-1, target) || binarySearch(arr, mid+1, high, target);

    }
}
