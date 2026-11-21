class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int minute=-1;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[] {i,j});
                }
                if(grid[i][j]==1){
                    count++;
                }
            }
        }

        if(q.isEmpty() && count==0){
            return 0;
        }
        if(q.isEmpty() && count>0){
            return -1;
        }

        while(!q.isEmpty()){
            minute++;
            int size=q.size();
            while(size>0){
            int[] cell=q.poll();
            int row=cell[0];
            int col=cell[1];
            if(row+1<grid.length && grid[row+1][col]==1){
                q.offer(new int[] {row+1,col});
                grid[row+1][col]=2;
                count--;
            }
            if(row-1>=0 && grid[row-1][col]==1){
                q.offer(new int[] {row-1,col});
                grid[row-1][col]=2;
                count--;
            }
            if(col+1<grid[0].length && grid[row][col+1]==1){
                q.offer(new int[] {row,col+1});
                grid[row][col+1]=2;
                count--;
            }
            if(col-1>=0 && grid[row][col-1]==1){
                q.offer(new int[] {row,col-1});
                grid[row][col-1]=2;
                count--;
            }
            size--;
            }
        }
        if(count==0){
        return minute;
        }
        else{
            return -1;
        }
    }
}
