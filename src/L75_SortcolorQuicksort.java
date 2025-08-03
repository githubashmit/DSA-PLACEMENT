package src;

public class L75_SortcolorQuicksort {
    class Solution {
        public  int partition(int [] arr ,int low , int high){
            int pivot = arr[high];
            int i = low-1;

            for(int j = low;j<high;j++){
                if(arr[j] < pivot){
                    i++;

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            i++;
            int temp = arr[i];
            arr[i]=arr[high];
            arr[high]=temp;
            return i;
        }
        public void quicksort(int [] arr , int low , int high){
            if(low < high){
                int pidx = partition(arr, low , high);

                quicksort(arr,low,pidx-1);
                quicksort(arr,pidx+1,high);
            }
        }
        public void sortColors(int[] nums) {
            quicksort(nums, 0 , nums.length-1);
        }
    }
}
