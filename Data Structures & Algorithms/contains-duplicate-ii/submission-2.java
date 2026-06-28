class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i;
        int j;
        for(i=0;i<nums.length;i++){
            j=nums.length-1;
        while(i<j){
            if(i!=j && nums[i]==nums[j] && Math.abs(i-j)<=k){
                return true;
            }
            j--;
        }
        }
        return false;
    }
}