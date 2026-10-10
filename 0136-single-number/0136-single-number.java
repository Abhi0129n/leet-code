class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x: nums){
            if (set.contains(x)){
                set.remove(x);
            }
            else{
                set.add(x);
            }

        }
        return set.iterator().next();
    }
}