class Solution {
    public int maxSubArray(int[] nums) {

        int cSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++){
            if(cSum >=0){
                cSum += nums[i];
            }else {
                cSum = nums[i];
            }

            if(maxSum < cSum){
                maxSum = cSum;
            }
        }
        return maxSum;
        
    }
}