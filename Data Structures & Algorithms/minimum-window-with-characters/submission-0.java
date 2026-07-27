class Solution {
   private boolean isValid(HashMap<Character, Integer> mapNeed,
                        HashMap<Character, Integer> mapHas) {
    for (char c : mapNeed.keySet()) {
        if (mapHas.getOrDefault(c, 0) < mapNeed.get(c)) {
            return false;
        }
    }
    return true;
}

    public String minWindow(String s, String t) {
        HashMap<Character,Integer> mapNeed=new HashMap<>();
        char[] tArray=t.toCharArray();
        for(char c:tArray){
            mapNeed.put(c,mapNeed.getOrDefault(c,0) +1);
        }

        int left=0;
        int minLength=Integer.MAX_VALUE;
        int startIndex=0;
        HashMap<Character,Integer> mapHas=new HashMap<>();
        for(int right=0;right<s.length();right++){
              mapHas.put(s.charAt(right),mapHas.getOrDefault(s.charAt(right),0) +1);
               while(isValid(mapNeed,mapHas)){
                if(right-left+1<minLength){
                    minLength=right-left+1;
                    startIndex=left;
                }
                mapHas.put(s.charAt(left),mapHas.getOrDefault(s.charAt(left),0) -1);
                left++;
              }
               }
               
               return minLength==Integer.MAX_VALUE?"":s.substring(startIndex,startIndex+minLength);
        }

        
    }

