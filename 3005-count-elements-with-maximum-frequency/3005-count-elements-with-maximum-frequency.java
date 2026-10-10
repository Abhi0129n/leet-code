class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=0;
        for(int count:map.values()){
            max=Math.max(max,count);
        }
        int total=0;
        for(int count:map.values()){
            if(count==max){
                total=total+count;
            }
        }
        return total;
    }
}