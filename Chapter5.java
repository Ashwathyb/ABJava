public class Chapter5 {
	
	public static void main (String[] args) {
		
		System.out.println ("Part 5.1");
		System.out.println ("    ");
		double termone = 1;
		double sumone = 0;
		
		for (int i = 0; i < 100; i++) {
			termone = termone / 5;
			sumone = sumone + termone;
			//System.out.print (i + " = ");
			//System.out.println (term);
		}
		
		System.out.println ("The total is " + sumone);
		System.out.println ("   ");
		System.out.println ("Part 5.2");
		System.out.println ("    ");
		
		double sumtwo = 0;
		
		for (int c = 1; c <= 100; c++) {
			sumtwo = sumtwo + (1.0 / (c*c));	
		}
		System.out.println (sumtwo);
		System.out.println ("   ");
		System.out.println ("Part 5.3");
		System.out.println ("    ");

		double sumthree = 0;
		double divisor = 1;
		for (int v = 1; v <= 10000; v ++) {
			if (v%2 == 0) {
				sumthree = sumthree - 1.0/divisor;	
			}
			else {
				sumthree = sumthree + 1.0/divisor;
			}
			divisor = divisor + 2;
		}
		System.out.println (4*sumthree);
		System.out.println ("  ");
		System.out.println ("Part 5.4");
		System.out.println ("  ");
		
		double sumfour = 0;
		double divisortwo = 1;
		double term = 0;
		double increment = 1;
		double dividend = 1; 
		
		for (int x = 1; x <= 100; x ++) {
			
			term = dividend/divisortwo;
			sumfour = sumfour + term;
			
			increment = increment + 2;
			dividend = dividend * x;
			divisortwo = divisortwo * increment;
		}
		System.out.println (2*sumfour);
	}
}

