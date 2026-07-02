class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> us= new HashSet<>();
        char[] array=new char[s.length()];
        array=s.toCharArray();
        int i=0;
        int maxLength=Integer.MIN_VALUE;
        for(int j=0;j<s.length();j++){
            while(us.contains(array[j])){
               us.remove(array[i]);
               i++;
            }
            us.add(array[j]);
            maxLength=Math.max(maxLength,j-i+1);
        }
        return maxLength==Integer.MIN_VALUE?s.length():maxLength;
    }
}
