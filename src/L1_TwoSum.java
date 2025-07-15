package src;

public class L1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // int i=0;
        // int j=1;
        int ans[] = new int[2];
        for(int k=0;k<nums.length-1;k++){
            for(int j=k+1;j<nums.length;j++){
                if(nums[k]+nums[j]==target){
                    ans[0]=k;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}
