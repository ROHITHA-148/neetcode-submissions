class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
        HashSet<Character> set3=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && set1.contains(board[i][j])){
                    return false;
                }
                if(board[j][i]!='.' && set2.contains(board[j][i])){
                    return false;
                }
                if(board[i][j]!='.'){
                set1.add(board[i][j]);
                }
                if(board[j][i]!='.'){
                set2.add(board[j][i]);
                }

            }
            set1.clear();
            set2.clear();
        }

        for (int row = 0; row < 9; row += 3) {
    for (int col = 0; col < 9; col += 3) {

        set3.clear();

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {

                if (board[i][j] != '.' && set3.contains(board[i][j])) {
                    return false;
                }

                if (board[i][j] != '.') {
                    set3.add(board[i][j]);
                }
            }
        }
    }
        }


        return true;
    }
}
