class Solution {
    public boolean isValidSudoku(char[][] board) {
      
        int val = 0;
        for(int i=0;i<board.length;i++){
              HashSet<Character>set = new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(set.contains(board[i][j])){
                    return false;
                }else{
                    if(board[i][j]>='0'&&board[i][j]<='9'){
                         set.add(board[i][j]);
                    }
                }
            }
        }
        for(int i=0;i<board[0].length;i++){
              HashSet<Character>set = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(set.contains(board[j][i])){
                    return false;
                }else{
                    if(board[j][i]>='0'&&board[j][i]<='9'){
                         set.add(board[j][i]);
                    }
                   
                }
            }
        }
         for (int block = 0; block < 9; block++) {
            HashSet<Character> blockSet = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = 3 * (block / 3) + i;
                    int col = 3 * (block % 3) + j;
                    char current = board[row][col];
                    if (current != '.') {
                        if (blockSet.contains(current)) {
                            return false;
                        }
                        blockSet.add(current);
                    }
                }
            }
        }
        
        return true;
    }
}