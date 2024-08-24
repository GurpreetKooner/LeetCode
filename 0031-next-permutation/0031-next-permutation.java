class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int breakIndex = n - 1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                breakIndex = i - 1;
                break;
            }
        }
        if (breakIndex < n - 1) {
            for (int i = n - 1; i > breakIndex; i--) {
                if (nums[i] > nums[breakIndex]) {
                    int temp = nums[i];
                    nums[i] = nums[breakIndex];
                    nums[breakIndex] = temp;
                    break;
                }
            }
        }

        if (breakIndex < n - 2) {
            reverseArray(breakIndex + 1, n - 1, nums);
        }
        if(breakIndex == n-1){
            reverseArray(0, n -1, nums);
        }
    }

    public void reverseArray(int startIndex, int endIndex, int[] nums) {
        int i = startIndex;
        int j = endIndex;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}