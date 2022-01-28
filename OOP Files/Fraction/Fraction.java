//
// Chapter 11, plus some extra practice for our OOP test
//
public class Fraction
{
    private int num;
    private int den;

    public Fraction(int num, int den)
    {
        this.num = num;
        this.den = den;
        this.cancel();
    }
    // overloaded constructor
    public Fraction()
    {
        this.num = 0;
        this.den = 1;
    }

    public double toDecimal()
    {
        return (double)this.num / (double)this.den;
    }

    // calculate the GCD to simplify a fraction
    private static int gcd(int n, int m)
    {
        int gcd;
        if ( n == m )
            gcd = n;
        else
        {
            while (n != m)
            {   if ( n < m )
                m = m - n;
            else
                n = n - m;
            }
        }
        return n;
    }

    public void cancel() // simplify
    {
        int gcd = gcd(this.num, this. den);
        this.num = this.num / gcd;
        this.den = this.den / gcd;
    }

    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public int getDen()
    {
        return den;
    }

    public void setDen(int den)
    {
        this.den = den;
    }
    
    //  Practice for the test: write the add, equals and compareTo methods
    public Fraction add(Fraction second)
    {
        // your code goes here
        // https://www.mathsisfun.com/numbers/common-denominator.html
		
		Fraction c1 = new Fraction (this.getNum()*second.getDen(), this.getDen()*second.getDen()); //common denominator
		//Fraction c2 = new Fraction (second.getNum() * this.getDen);
		Fraction c2 = new Fraction (second.getNum()*this.getDen(), this.getDen()*second.getDen()); //commobm denominator
		Fraction answer = new Fraction ( c1.getNum() + c2.getNum(), c2.getNum() );
		
		return answer;  

    }

    public boolean equals(Fraction second)
    {
        // your code goes here
        //return this.x == p2.getX() && this.y == p2.getY();
        return this.num == second.getNum() && this.den == second.getDen();
        
    }

    public double compareTo(Fraction second)
    {
        // your code goes here
        Fraction c1 = new Fraction (this.getNum()*second.getDen(), this.getDen()*second.getDen()); //common denominator
		//Fraction c2 = new Fraction (second.getNum() * this.getDen);
		Fraction c2 = new Fraction (second.getNum()*this.getDen(), this.getDen()*second.getDen()); //commobm denominator
		
		Fraction compare = new Fraction (c1.getNum() - c2.getNum(), c1.getDen());
		return compare.getNum()/compare.getDen();
    }

    public String toString()
    {
        return this.num + "/" + this.den;
    }
}


