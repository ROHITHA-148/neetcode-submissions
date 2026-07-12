class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        int count=1;
        int j=1;
        int i=0;
        if(nums.length==1){
            return count;
        }
        while(j<nums.length) {
            if(nums[j]-nums[i]==1){
                count++;
                i++;
                j++;
                res=Math.max(count,res);
            }
            else if(nums[i]==nums[j]){
                i++;
                j++;
                res=Math.max(count,res);
            }
            else{
                res=Math.max(count,res);
                count=1;
                i++;
                j++;
            }
        }
        return res;
}
    }

