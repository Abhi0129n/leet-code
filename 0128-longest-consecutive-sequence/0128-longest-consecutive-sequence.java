class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int x:nums){
            set.add(x);
        }
        int max=0;
        for(int y:set){
            if(!set.contains(y-1)){
                int current =y;
                int count =1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    
    }
}
