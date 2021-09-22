public class SummerBreakHomework {
	
	public static int occurences (char [ ][ ] array, char t) { //occurences is a better word (also frequency)
		
		int checking = 0;
		
		for (int v = 0; v < array.length; v ++) { 
			
			for (int w = 0; w < array[v].length; w ++) {
			
				if (array [v] [w] == t) {
				
					checking = checking + 1;
				
				}
			}
		}
		
		return checking;
	}
	
	public static int checkRLDiagonal (char [ ][ ] array, char m) {
		
		int checking = 0;
		
		for (int v = 0; v < array.length; v ++) { 
			
			if (array [v] [v] == m) {
				
				checking = checking + 1;
				
			}
		}
		
		return checking;
	}
	
	public static int checkLRDiagonal (char [ ][ ] array, char p, int s) {
		
		int checking = 0;
		
		for (int v = 0; v < array.length; v ++) { 
			
			if (array [v] [s-1-v] == p) {
				
				checking = checking + 1;
				
			}
		}
		
		return checking;
	}
	
	
	public static int checkRow (char [ ][ ] array, char p, int a) {
		
		int checking = 0;
		
		for (int v = 0; v < array[a].length; v ++) { 
						
			if (array [a] [v] == p) {	
				
				checking = checking + 1;
				
			}
		}
		
		return checking;
	}
	
	public static int checkColumn (char [ ][ ] array, char q, int a) {
		
		int checking = 0;
		
		for (int v = 0; v < array.length; v ++) { 
						
			if (array [v] [a] == q) {	
				
				checking = checking + 1;
				
			}
		}
		
		return checking;
	}
	
	public static void print2Darray(char[][] array) {
		
        for (int i = 0; i < array.length; i++) {
			
            for (int j = 0; j < array[i].length; j++) {
				
                System.out.print(array[i][j]);
                
            }
            
            System.out.println();
        }  
    }
    
	public static void main (String[] args) {
		
		int x = 0; //variable for user 1 input for row
		int y = 0; //variable for user 1 input for column
		int a = 0; //variable for user 2 input for row
		int b = 0; //variable for user 2 input for column
		
		int size = IBIO.inputInt ("Enter the size of the board: "); //size of the borard
		if (size < 3) {
			size = 3; //if input is less than 3, board size will be 3
		}
		
		char [ ] [ ] board = new char [size] [size]; //2D array of char
		
		for (int i = 0; i < size; i++) {
			
			for (int j = 0; j < size; j++) {
		
				board [ i ] [ j ] = '-' ;
			}
		}
		
		print2Darray (board);
		
		System.out.println ("Let's Play!");
		
		while (occurences (board, '-') > 0) { //before player moves, checks for full board
		
			System.out.print ("Player O's turn. ");
			
			x = IBIO.inputInt ("Please enter the row: ");
			if (x > board.length) { //validation check
				
				x = IBIO.inputInt ("Invalid Input. Please enter the row: ");
			}
				
			y = IBIO.inputInt ("Please enter the column: ");
			if (y > board[x-1].length) { //validation check
				
				y = IBIO.inputInt ("Invalid Input. Please enter the column: ");
			}
			
			if (board [x-1] [y-1] == '-') { //check for empty cell
				board [x-1] [y-1] = 'O';
			}
			
			print2Darray (board);
			
			if (x == y) { //check if the user input could create a RL diagonal 
				
				if (checkRLDiagonal (board, 'O') == size) {
					
					System.out.println ("Player O wins");
				}
			}
			
			if ( x + y == size) { //check if the user input could create a LR diagonal
				
				if (checkLRDiagonal (board, 'O', size) == size) {
					
					System.out.println ("Player O wins");
					
				}
				
			}
			
			if (checkRow (board, 'O', x-1) == size) {//checks the row the user just entered 
				
				System.out.println ("Player O wins");
			}
			
			if (checkColumn (board, 'O', y-1) == size) {
				
				System.out.println ("Player O wins");
			}
			
			System.out.print ("Player X's turn. ");
			
			a = IBIO.inputInt ("Please enter the row: ");
			if (a > board.length+1) {//validation check
				a = IBIO.inputInt ("Invalid Input. Please enter the row: ");
			}
			
			b = IBIO.inputInt ("Please enter the column: ");
			if (b > board[b-1].length) {//validation check
				b = IBIO.inputInt ("Invalid Input. Please enter the column: ");
			}
			
			if (board [a-1] [b-1]== '-') {//check for empty cell
				board [a-1] [b-1] = 'X';
			}
			print2Darray (board);
			
			if (a == b) { //check if the user input could create a RL diagonal 
				
				if (checkRLDiagonal (board, 'X') == size) {
					
					System.out.println ("Player X wins");
					
					break;
				}
			}
			
			if ( a + b == size) { //check if the user input could create a LR diagonal
				
				if (checkLRDiagonal (board, 'X', size) == size) {
					
					System.out.println ("Player X wins");
					
					break;
					
				}
				
			}
			
			if (checkRow (board, 'X', a-1) == size) {//checks the row the user just entered 
				
				System.out.println ("Player X wins");
			}
			
			if (checkColumn (board, 'X', b-1) == size) {
				
				System.out.println ("Player X wins");
				
				break;
			}
			
		}
		
		if (occurences (board, '-') == 0) {
			
			System.out.println ("Board is full. Game over.");
			
		}
		
	}
	
	
}

