class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0;i<board.length;i++){
            boolean idx[] = new boolean[10];
            for (int j = 0;j<board[0].length;j++){
                char val = board[i][j];
                 if (val == '.') {
                    continue;
                }

                int num = val - '0';
                if(idx[num]){
                    return false;
                }
                idx[num] = true;
            }
        }
        for (int i = 0;i<board[0].length;i++){
            boolean idx[] = new boolean[10];
            for(int j = 0;j<board.length;j++){
                char val = board[j][i];
                 if (val == '.') {
                    continue;
                }

                int num = val - '0';
                if(idx[num]){
                    return false;
                }
                idx[num] = true;
            }
        }
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                boolean[] idx = new boolean[10];

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        char val = board[i][j];

                        if (val == '.') {
                            continue;
                        }

                        int num = val - '0';

                        if (idx[num]) {
                            return false;
                        }

                        idx[num] = true;
                    }
                }
            }
        }
        return true;

    }
}
