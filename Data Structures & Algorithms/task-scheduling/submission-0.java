class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        int time=0;
        int count[]=new int[26];
        for(char task:tasks){
           count[task-'A']++;
        }
      for(int cnt:count){
        if(cnt>0){
            pq.add(cnt);
        }
      }

    Queue<int[]> q= new LinkedList<>();
    while(!pq.isEmpty() || !q.isEmpty()){
        time++;
        if(pq.isEmpty()){
           time=q.peek()[1];
        }
        else{
            int x=pq.poll()-1;
            if(x>0){
                q.add(new int[]{x,time+n});
            }
        }

        if(!q.isEmpty() && q.peek()[1]==time){
            pq.add(q.poll()[0]);
        }
    }
    return time;
}
}
