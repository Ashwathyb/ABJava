public class PeerTutoring {
	
	public static void main (String[] args) {
		
	//data type [ ] arrayname = new data type [length];
	
	String [] students = new String [8];
	
	
	students [0] = "Ash";
	students [1] = "Rayn";
	students [2] ="Balaji";
	students [3] = "Anish";
	students [4] = "Prerna";
	students [5] = "Charles";
	students [6] = "Tina";
	students [7] = "Sparsh";
	
	System.out.println ("----------------");
	System.out.println ("----------------");
	System.out.println ("----------------");
	
	
	
	for (int i = 0; i < students.length; i++) {
		
		System.out.println (students [i]);
		
	}
	
	//students [8] = "Benjamin"; - not possible
	
	System.out.println ("----------------");
	System.out.println ("----------------");
	System.out.println ("----------------");
	
	
	for (int c = students.length-1; c >= 0; c--) {
	
		System.out.println (students [c]); //students [7]
		
	}
		
	}
}


