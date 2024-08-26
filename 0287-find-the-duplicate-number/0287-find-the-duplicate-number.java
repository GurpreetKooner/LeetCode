class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;

        int[] arr = new int[n-1];

        for(int i=0; i<n; i++){
            if(arr[nums[i]-1]==0){
                arr[nums[i]-1] = nums[i]; 
            }else{
                return nums[i];
            }
        }
        return 0;
        
    }
}