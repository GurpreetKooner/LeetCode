class Solution {
    public int majorityElement(int[] nums) {

        // int val = nums[0];
        // int count = 1;

        // for(int i=1; i<nums.length; i++){
        //     if(val==nums[i]){
        //         count++;
        //     }else{
        //         count--;
        //     }

        //     if(count==0){
        //         val = nums[i];
        //         count = 1;
        //     }
        // }

        // return val;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int maxCount = 0;
        int ans = 0;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>maxCount){
                ans = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return ans;
    }
}