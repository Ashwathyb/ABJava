public class FinalCode {

    public static void print2Darray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = IBIO.inputInt("Enter the size of the board: "); //size of the board
        if (n < 3) {
            n = 3; //if input is less than 3, board size will be 3
        }

        char[][] board = new char[n][n]; //2D array of char

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { // <-- the error was here ( it was i instead of j ) -->
                board[i][j] = '-';
            }
        }

        print2Darray(board);
    }
}
