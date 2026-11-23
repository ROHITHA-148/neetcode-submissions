class Solution {
    public void solve(char[][] board) {
     int rows=board.length;
     if(board.length==0){
        return;
     }
     int cols=board[0].length;
     Queue<int[]> q=new LinkedList<>();
     char[][] safe= new char[rows][cols];
     boolean[][] visited=new boolean[rows][cols];
     for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if((i==0 || j==0 || i==rows-1 || j==cols-1) && board[i][j]=='O'){
                q.offer(new int[] {i,j});
                visited[i][j]=true;
                safe[i][j]='S';
            }
        }
     }

     bfs(board, safe, q, visited);
     for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(safe[i][j]=='S'){
                board[i][j]='O';
            }
            else{
                board[i][j]='X';
            }
        }
     }
        
    }

    public void bfs(char[][] board, char[][] safe, Queue<int[]> q, boolean[][] visited){
        while(!q.isEmpty()){
            int[] temp=q.poll();
            int i= temp[0];
            int j=temp[1];
            if(i-1>=0 && board[i-1][j]=='O' && !visited[i-1][j]){
                safe[i-1][j]='S';
                visited[i-1][j]=true;
                q.offer(new int[] {i-1,j});
            }
            if(i+1<board.length && board[i+1][j]=='O' && !visited[i+1][j]){
                safe[i+1][j]='S';
                visited[i+1][j]=true;
                q.offer(new int[] {i+1,j});
            }
if(j+1<board[0].length && board[i][j+1]=='O' && !visited[i][j+1]){
                safe[i][j+1]='S';
                visited[i][j+1]=true;
                q.offer(new int[] {i,j+1});
            }
            if(j-1>=0 && board[i][j-1]=='O' && !visited[i][j-1]){
                safe[i][j-1]='S';
                visited[i][j-1]=true;
                q.offer(new int[] {i,j-1});
            }

        }
    }
}
