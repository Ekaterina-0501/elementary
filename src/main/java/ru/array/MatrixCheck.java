package ru.array;

public class MatrixCheck {
    public  static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cel = 0; cel < board[row].length; cel++) {
            if (board[row][cel] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
