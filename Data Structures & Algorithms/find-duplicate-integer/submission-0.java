class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> mapD=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mapD.containsKey(nums[i])){
                int value=mapD.get(nums[i]);
                mapD.put(nums[i],value+1);
            }
            else{
                mapD.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> e : mapD.entrySet()){
            if(e.getValue()>=2){
                return e.getKey();
            }
    }
    return 1;
}
}
