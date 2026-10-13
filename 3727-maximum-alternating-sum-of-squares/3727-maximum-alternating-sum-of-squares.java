class Solution {
    public long maxAlternatingSum(int[] nums) {
        long max=0;
        
        Arrays.sort(nums);
        long[] squares=new long[nums.length];
        for(int i=0;i<nums.length;i++){
           squares[i]=(long) nums[i]*nums[i];
        }
        Arrays.sort(squares);
        int right=nums.length-1;
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                max+=squares[right];
                right--;
            }
            else{
                max-=squares[left];
                left++;
            }
        }
        return max;
    }
}