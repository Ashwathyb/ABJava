/*
 * Example to input an integer (with a prompt)
 * 
 */

public class InputExample
{
	
	public static void main (String[] args)
	{
		System.out.println("===========");
		String name = IBIO.input("What is your name? ");
		System.out.println("Nice to meet you, " + name);
		int age = IBIO.inputInt("How old are you? ");
		System.out.println("So you are " + age + " years old.");
		if (age>17)
		{
				System.out.print ("You are old, ");
				System.out.print (name + ".");
				System.out.print (" At least you're not dead");
		}
		else
		{
				System.out.println ("You are young.");
				System.out.print (age);
				System.out.println (" is such a young age.");
		}			
		/* By using the brackets, the "if" applies to all that is inside the brackets.
		  No brackets means that only the first line of code applies to the "if" */
	}
}

/*
If input<17 then:
* OUTPUT
* 
* ===========
What is your name? AB
Nice to meet you, AB
How old are you? 16
So you are 16 years old.
You are young.
16 is such a young age.
* 
If input>17 then:
* 
* ===========
What is your name? AB
Nice to meet you, AB
How old are you? 18
So you are 18 years old.
You are old, AB. At least you're not dead
*/
