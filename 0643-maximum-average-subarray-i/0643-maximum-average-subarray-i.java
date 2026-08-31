class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long windowSum=0;
        //First widow 
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        long maxSum=windowSum;
        //slide the window
        for(int right=k;right<nums.length;right++){
            windowSum+=nums[right];
            windowSum-=nums[right-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return (double)maxSum/k;
    }
}