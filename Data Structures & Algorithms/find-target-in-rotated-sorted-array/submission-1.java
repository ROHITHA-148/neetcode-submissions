class Solution {
    public int search(int[] nums, int target) {
        int left=0, right=nums.length-1;
        int mid;
        int pivot;
        while(left<right){
            mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        pivot=right;

        int result=binarySearch(nums,target,0,pivot-1);
        if(result!=-1){
            return result;
        }

        return binarySearch(nums,target,pivot,nums.length-1);
    }
       public int binarySearch(int[] nums, int target, int left, int right){
            while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
        }

    }

