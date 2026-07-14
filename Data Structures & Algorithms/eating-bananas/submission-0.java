class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1, right=Arrays.stream(piles).max().getAsInt();
        int result=right;
        int mid;
        while(left<=right){
            int totTime=0;
            mid=left+(right-left)/2;
            for(int pile:piles){
              totTime+=Math.ceil((double)pile/mid);
            }
            if(totTime<=h){
                result=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return result;
    }
}
