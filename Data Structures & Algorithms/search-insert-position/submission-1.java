class Solution {
    public int searchInsert(int[] nums, int target) {
        int r=nums.length-1;
        int result=nums.length;
        int l=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                r=mid-1;
                result=mid;
            }
            else{
                l=mid+1;
            }
        }
        return result;
    }
}