package day06;

public class ArrayMain {
    public static void main(String[] args) {

        String[] lines = new String[10];

        // 3 x 3 matrix of float
        float [][] mat = new float[3][3];

        // longer method - assign float
        float [][] mat2 = new float[3][];
        for (int i = 0; i < mat2.length; i++) {
            mat[i] = new float[3];
            mat[i][0] = i;
            mat[i][1] = i;
            mat[i][2] = i;
        }

        float [][] mat3 = new float[3][];
        for (int i = 0; i < mat3.length; i++) {
            mat3[i] = new float[i+1];

        }

        // tictac board
        // x| |
        //  |o|
        //  | |

        char[][] board = new char[3][3];
        board[0][0] = 'x';
        board[1][1] = 'o';

        
    }
}
