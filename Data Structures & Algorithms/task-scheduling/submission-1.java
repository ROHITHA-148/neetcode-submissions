class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int[] count=new int[26];
        for(char task:tasks){
            count[task-'A']++;
        }
        for(int c:count){
            if(c>0){
            pq.offer(c);
            }
        }
        Queue<int[]> q=new LinkedList<>();
        int cycle=0;
        while(!pq.isEmpty() || !q.isEmpty()){
            cycle++;
           if(pq.isEmpty()){
            cycle=q.peek()[1];
           }
           else{
            int x=pq.poll()-1;
            if(x>0){
            q.add(new int[]{x,cycle+n});
           }
           }
           if(!q.isEmpty() && q.peek()[1]==cycle){
            pq.offer(q.poll()[0]);
           }
        }
        return cycle;
    }
}
