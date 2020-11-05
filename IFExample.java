/* This is an example of using ifs */

public class IFExample
{
	public static void main (String[] args)
	{
		int number = IBIO.inputInt ("Give me a number - ");
		if (number <= 4)
			{
				System.out.println ("That's such a small number");
			}
		else if (number <= 10)
			{
				System.out.println ("Meh. Okay.");;
			}
			if (number > 10)
			{
				System.out.println ("Great! Thanks");
			}
	}
}
