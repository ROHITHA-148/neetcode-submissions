class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map= new HashMap<>();
        char[] arr=s.toCharArray();
        int left=0;
        int maxfreq=0;
        int result=0;
        for(int right=0;right<s.length();right++){
            map.put(arr[right], map.getOrDefault(arr[right],0) +1);
               for(int freq: map.values()){
                maxfreq=Math.max(maxfreq,freq);
               }
               while((right-left+1)-maxfreq>k){
                 map.put(arr[left],map.get(arr[left])-1);
                 left++;
               }
               result=Math.max(result,right-left+1);

        }
        return result;
    }
}
