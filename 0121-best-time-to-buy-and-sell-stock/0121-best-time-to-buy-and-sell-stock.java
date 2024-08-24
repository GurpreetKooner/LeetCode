class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minVal = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<minVal){
                minVal = prices[i];
            }else{
                int diff = prices[i] - minVal;
                if(diff > max){
                    max = diff;
                }
            }
        }
        return max;   
    }
}