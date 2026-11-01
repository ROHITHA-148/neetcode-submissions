class Solution {
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        boolean[][] visited= new boolean[rows][cols];
        int count=0;
         for(int i=0;i<grid.length; i++){
        for(int j=0;j<cols;j++){
           if(!visited[i][j] && grid[i][j]=='1'){
            count++;
            dfs(grid, visited, i,j);
        }
        }}
       
        return count;
    }

public void dfs(char[][] grid, boolean visited[][],int i, int j)
{
    visited[i][j]=true;
    if(i+1<grid.length && grid[i+1][j]=='1'  && !visited[i+1][j]){
       dfs(grid,visited,i+1,j);
    }
    if(j+1<grid[0].length && grid[i][j+1]=='1'&& !visited[i][j+1]){
       dfs(grid,visited,i,j+1);
    }
    if(i-1>=0 && grid[i-1][j]=='1' && !visited[i-1][j]){
       dfs(grid,visited,i-1,j);
    }
    if(j-1>=0 && grid[i][j-1]=='1' && !visited[i][j-1]){
        dfs(grid,visited,i,j-1);
    }


}
}
