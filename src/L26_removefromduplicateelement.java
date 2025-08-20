package src;
import java.util.*;
public class L26_removefromduplicateelement {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
