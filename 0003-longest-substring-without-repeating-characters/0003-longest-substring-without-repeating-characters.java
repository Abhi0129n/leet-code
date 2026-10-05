class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int sum=Integer.MIN_VALUE;
        
        for(int right=0;right<c.length;right++){
            while(set.contains(c[right])){
                set.remove(c[left]);
                left++;
            }
            set.add(c[right]);
            int currentlength=right-left+1;
            sum=Math.max(sum,currentlength);
        }
        return sum==Integer.MIN_VALUE?0:sum;
        
    }
}