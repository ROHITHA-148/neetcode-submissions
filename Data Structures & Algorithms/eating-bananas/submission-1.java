class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=Arrays.stream(piles).max().getAsInt();
        int result=Arrays.stream(piles).max().getAsInt();
        while(left<right){
            int k=(left+right)/2;
            int hours=0;
        for(int i=0;i<piles.length;i++){
             hours=hours+(int)Math.ceil((double)piles[i]/k);
        }
        if(hours>h){
            left=k+1;
        }
        else if(hours<=h){
            result=k;
            right=k;
        }
        }
        return result;
    }
}
