class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> result=new HashMap<>();
        for(String s: strs){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sortS=new String(charArray);
            result.putIfAbsent(sortS,new ArrayList<>());
            result.get(sortS).add(s);
        }
        return new ArrayList<>(result.values());
    }
        
    }
