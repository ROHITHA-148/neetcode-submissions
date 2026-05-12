class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int results[]=new int[n];
        for(int i=0;i<temperatures.length;i++)
        {  int count=0;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]<=temperatures[i]){
                    count++;
                }
                else if(temperatures[j]>temperatures[i]){
                    count++;
                    results[i]=count;
                    break;
                }
            }
        }
        return results;
    }
}
