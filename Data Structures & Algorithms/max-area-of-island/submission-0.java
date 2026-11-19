class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int result=0;
        boolean[][] visited= new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(!visited[i][j] && grid[i][j]==1){
                 int count=0;
                 int area=dfs(visited, grid, i,j);
                 result=Math.max(result,area);
                }
            }
        } 
        return result;
    }

    public int dfs(boolean[][] visited, int [][] grid, int i, int j){
        visited[i][j]=true;
        int count=1;
        if(i+1<grid.length && grid[i+1][j]==1 && !visited[i+1][j]){             
            count=count+dfs(visited, grid,i+1,j);
        }
        if(i-1>=0 && grid[i-1][j]==1 && !visited[i-1][j]){
            count=count+dfs(visited, grid,i-1,j);
        }
        if(j+1<grid[0].length && grid[i][j+1]==1 && !visited[i][j+1]){
            count=count+dfs(visited, grid,i,j+1);
        }
        if(j-1>=0 && grid[i][j-1]==1 && !visited[i][j-1]){
           count=count+ dfs(visited, grid,i,j-1);
        }
 return count;
    }
}
