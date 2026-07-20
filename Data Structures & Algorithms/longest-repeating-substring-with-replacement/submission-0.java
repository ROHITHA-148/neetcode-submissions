class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int res=0;
        int maxf=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0) +1);
            //find max frequency
            maxf=Math.max(maxf,map.get(s.charAt(right)));
            while((right-left+1)-maxf>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
          res=Math.max(res, right-left+1);
        }
        return res;
    }
}
