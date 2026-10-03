class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set =new HashSet<>();
        HashSet<Integer> result =new HashSet<>();
        
        for(int x: nums1){
            set.add(x);
        }
        for(int y:nums2){
            if(set.contains(y)){
                result.add(y);
            }

        }
        int[] arr=new int[result.size()];
        int index=0;
            for(int x:result){
                arr[index]=x;
                index++;

            }
        return arr;
    }
}