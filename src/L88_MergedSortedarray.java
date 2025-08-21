package src;

public class L88_MergedSortedarray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num[] = new int[n+m];
        int idx1 = 0;
        int idx2 = 0;
        int x=0;
        while(idx1<m && idx2<n){
            if(nums1[idx1]<nums2[idx2]){
                num[x]=nums1[idx1];
                idx1++;
            }else{
                num[x]=nums2[idx2];
                idx2++;
            }
            x++;
        }
        while(idx1<m){
            num[x]=nums1[idx1];
            x++;
            idx1++;
        }
        while(idx2<n){
            num[x]=nums2[idx2];
            x++;
            idx2++;
        }
        for(int i=0;i<n+m;i++){
            nums1[i]=num[i];
        }
    }
}
