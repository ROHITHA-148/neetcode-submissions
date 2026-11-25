class Solution {
    int max=0;
    public int lengthOfLongestSubstring(String s) {
        char[] c=s.toCharArray();
        Set set=new HashSet<>();
        int left=0;
        for(int right=0;right<s.length();right++){
                while(set.contains(c[right])){
                    set.remove(c[left]);
                    left++;
                }
                set.add(c[right]);
                max=Math.max(max,right-left+1);
        }
        return max;
    }
}
