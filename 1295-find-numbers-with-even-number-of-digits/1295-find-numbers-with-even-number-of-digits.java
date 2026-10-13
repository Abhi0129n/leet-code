class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int x:nums){
            String s=String.valueOf(x);
            if(s.length()%2==0){
                count++;
            }
        }
        return count;
    }
}