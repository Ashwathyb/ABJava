/*
 */


public class untitled {
	
	public static void main (String[] args) {
	
	int number = IBIO.inputInt("Give me a number  ");
	int answer = number;
	System.out.print (number);
	for (int i = 1; i<= number; i++) {
		answer=answer*number;
	}
	System.out.println(answer);
		
	}
}

