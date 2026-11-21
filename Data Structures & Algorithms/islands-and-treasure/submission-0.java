class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        for(int i=0; i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q.offer(new int[] {i,j});
                }
            }
        }
int INF=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int[] current=q.poll();
            int row=current[0];
            int col=current[1];
            if(row-1>=0 && grid[row-1][col]==INF){
                    grid[row-1][col]=grid[row][col]+1;
                    q.offer(new int[] {row-1,col});
            }
            if(row+1<grid.length && grid[row+1][col]==INF){
                grid[row+1][col]=grid[row][col]+1;
                q.offer(new int[] {row+1,col});
            }
            if(col-1>=0 && grid[row][col-1]==INF){
                    grid[row][col-1]=grid[row][col]+1;
                    q.offer(new int[] {row,col-1});
            }
            if(col+1<grid[0].length && grid[row][col+1]==INF){
                grid[row][col+1]=grid[row][col]+1;
                q.offer(new int[] {row,col+1});
            }
            
        }
        
    }
}
