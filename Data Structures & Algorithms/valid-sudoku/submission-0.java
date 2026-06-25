class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentVal = board[i][j];

                if (currentVal != '.') {
                    if (!set.add(currentVal + "row" + i) ||
                        !set.add(currentVal + "column" + j) ||
                        !set.add(currentVal + "box" + i / 3 + "-" + j / 3))
                        return false;
                }
            }
        }
        return true;
    }
}
