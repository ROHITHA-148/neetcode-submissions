class Solution {
    boolean result=true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {      
        List<List<Integer>> graph= new ArrayList<>();
        boolean[] visited= new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            int u=edge[0];
            int v=edge[1];
            graph.get(v).add(u);
        }

boolean current[] = new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
            dfs(i, current,graph,visited);
            }
        }
        return result;
       
    }

    public void dfs(int i, boolean[] current, List<List<Integer>> graph, boolean[] visited){
        if(!visited[i]){
            visited[i]=true;
            current[i]=true;
        for(int neighbor: graph.get(i)){
            if(current[neighbor]){
               result=false;
               return;
            }
            else if(!visited[neighbor]){
                dfs(neighbor, current, graph,visited);
            }
        }
        }
        current[i]=false;
    }
}
