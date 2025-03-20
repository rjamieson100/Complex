
/**
 * Write a description of class complexDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class complexDriver
{
    public static void main(String[] args)
    {
        Complex c = new Complex(3,4);
        System.out.println("c: Expecting 3 + 4i");
        System.out.println(c);
        double x = c.abs(); 
        System.out.println("x: Expecting 5.0");
        System.out.println(x);

        c.add(-5);
        System.out.println("c: Expecting -2 + 4i");
        System.out.println(c);
        c.multiply(-2);
        System.out.println("c: Expecting 4 - 8i");
        System.out.println(c);
        Complex d = c.conjugate(); 
        System.out.println("d: Expecting 4 + 8i");
        System.out.println(d);
        
        Complex d2 = d.conjugate();
        if (d2.abs() == d.abs())
        {
            System.out.println("a ok");
        }

        Complex e = new Complex(2,-1);
        System.out.println("e: Expecting 2 - i");
        System.out.println(e);
        Complex f = new Complex(3,4);
        e.multiply(f);
        System.out.println("e: Expecting 10 + 5i");
        System.out.println(e);
        e.add(c);
        System.out.println("e: Expecting 14 - 3i");
        System.out.println(e);

    }
}
