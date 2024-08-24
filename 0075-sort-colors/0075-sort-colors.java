class Solution {
    public void sortColors(int[] nums) {

        quickSort(nums, 0, nums.length-1);
        
    }

    public static void quickSort(int[] nums, int lo, int hi) {
    if (lo >= hi) {
      return;
    }
    int pivot = nums[hi];
    int pi = partition(nums, pivot, lo, hi);
    quickSort(nums, lo, pi - 1);
    quickSort(nums, pi + 1, hi);
  }
  public static int partition(int[] nums, int pivot, int lo, int hi) {
    int i = lo;
    int j = lo;
    while (i <= hi) {
      if (nums[i] <= pivot) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j++;
      } else {
        i++;
      }
    }
    return (j - 1);
  }
}