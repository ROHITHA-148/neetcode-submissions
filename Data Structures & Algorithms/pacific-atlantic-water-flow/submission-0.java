class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows=heights.length;
        int cols=heights[0].length;
        boolean[][] visitedp=new boolean[rows][cols];
        boolean[][] visiteda=new boolean[rows][cols];
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[0].length;j++){
                if((i==0 || j==0) && !visitedp[i][j]){
                visitedp[i][j]=true;
                dfsp(heights, visitedp, i,j);
                }
                if((j==heights[0].length-1 || i==heights.length-1) && !visiteda[i][j]){
                    visiteda[i][j]=true;
                    dfsa(heights, visiteda, i , j);
                    }
            }
        }
              for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[0].length;j++){
                if(visiteda[i][j]==true && visitedp[i][j]==true){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    result.add(temp);
                } 
            }
              }
                  
            
        return result;
        }

    public void dfsa(int[][] heights, boolean[][] visiteda,int i,int j){
        if(i+1< heights.length && heights[i+1][j]>=heights[i][j] &&!visiteda[i+1][j]){
            visiteda[i+1][j]=true;
            dfsa(heights, visiteda,i+1,j );
        }
        if(i-1>=0 && heights[i-1][j]>=heights[i][j] && !visiteda[i-1][j] ){
            visiteda[i-1][j]=true;
            dfsa(heights,visiteda, i-1,j);
        }
        if(j+1< heights[0].length && heights[i][j+1]>=heights[i][j] && !visiteda[i][j+1]){
            visiteda[i][j+1]=true;
            dfsa(heights, visiteda, i, j+1);
        }
         if(j-1>=0 && heights[i][j-1]>=heights[i][j]  && !visiteda[i][j-1]){
            visiteda[i][j-1]=true;
            dfsa(heights, visiteda, i , j-1);
        }
            
    }

     public void dfsp(int[][] heights, boolean[][] visitedp,int i,int j){
        if(i+1< heights.length && heights[i+1][j]>=heights[i][j] && !visitedp[i+1][j] ){
            visitedp[i+1][j]=true;
             dfsp(heights, visitedp, i+1, j);
        }
        if(i-1>=0 && heights[i-1][j]>=heights[i][j] && !visitedp[i-1][j]){
            visitedp[i-1][j]=true;
             dfsp(heights, visitedp, i-1, j);
        }
        if(j+1< heights[0].length && heights[i][j+1]>=heights[i][j] && !visitedp[i][j+1]){
            visitedp[i][j+1]=true;
             dfsp(heights, visitedp, i , j+1);
        }
         if(j-1>=0 && heights[i][j-1]>=heights[i][j] && !visitedp[i][j-1]){
            visitedp[i][j-1]=true;
            dfsp(heights, visitedp, i , j-1);
        }
            
    }

}

    
