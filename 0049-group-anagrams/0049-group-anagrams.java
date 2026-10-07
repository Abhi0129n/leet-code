class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word : strs){
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String sortword=new String(arr);
            if(!map.containsKey(sortword)){
                map.put(sortword,new ArrayList<>());
            }
            map.get(sortword).add(word);

        }
        return new ArrayList<>(map.values());
    }
}