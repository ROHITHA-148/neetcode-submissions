class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int zeroCount=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
          if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }
        int output[]=new int[n];
        for(int j=0;j<nums.length;j++){
           if (zeroCount > 1) {
                output[j] = 0;
            }

            // Exactly one zero
            else if (zeroCount == 1) {
                if (nums[j] == 0) {
                    output[j] = product;
                } else {
                    output[j] = 0;
                }
            }

            // No zero
            else {
                output[j] = product / nums[j];
            }
        }
        return output;
        
    }
}  
