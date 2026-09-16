class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        for(char c:c1){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        int left=0;
        for(int right=0;right<s2.length();right++){
            map2.put(c2[right],map2.getOrDefault(c2[right],0)+1);
             if((right-left+1)==s1.length()){
                   if(map1.equals(map2)){
                    return true;
                   }
         map2.put(c2[left],map2.getOrDefault(c2[left],0)-1);
                       
                    if(map2.get(c2[left])==0){
                        map2.remove(c2[left]);
                       }    left++;
             }
        }
        return false;
    }
}
