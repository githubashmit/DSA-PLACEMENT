package src;

public class L238_productofarrayexceptself {
    public int[] prefix(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] * nums[i];
        }
        return pre;
    }

    public int[] suffic(int[] nums) {
        int[] suff = new int[nums.length];
        suff[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i];
        }
        return suff;
    }
    public int[] productExceptSelf(int[] nums) {
        int []prefix1 = prefix(nums);
        int []suffix1 = suffic(nums);
        int ans[] = new int[nums.length];
        ans[0]=suffix1[1];
        ans[nums.length-1]=prefix1[nums.length-2];
        for (int i = 1; i < nums.length-1; i++){
            ans[i]=prefix1[i-1]*suffix1[i+1];
        }
        return ans;

    }
}
