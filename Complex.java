
/**
 * Takes in two integers and creates a complex number composed of a real number and a coefficient of i
 *
 * @author (Fletcher, Alden, Geoffrey)
 * @version (3)
 */
public class Complex
{
    //The real number portion of the complex
    private int real;
    
    //The coefficient of the imaginary number of the complex
    private int imag;

  /**
   * Constructs a Complex number made up of a real number and an imaginary number
   * 
   * @param a an integer number to be used as the real number
   * @param b an the number to be used as the coefficient of i
   */ 
  public Complex(int a, int b)
  {
    real = a;
    imag = b;
  }

  /**
   * Prints complex number as String
   * 
   * @return The real and imaginary numberin an equation, with the imaginary number shown as a coefficient of i
   */
  public String toString() 
  {
    if (imag == 1)
    {
      return real + " + i";
    }
    else if (imag == -1) 
    {
      return real + " - i";
    }
    else if (imag >= 0) 
    {
      return real + " + " + Math.abs(imag) + "i";
    }
    else 
    {
      return real + " - " + Math.abs(imag) + "i";
    } 
  }

  /**
   * Returns abstract value of complex number 
   * 
   * @return the square root of the sum of the real and imaginary numbers the squares
   */
  public double abs() 
  {
    return Math.sqrt(real*real + imag*imag);
  }
  
  /**
   * Addition method for addition of an integer to the complex number
   * 
   * @param val an integer to add to the complex number
   */
  public void add(int val)
  {
    real += val;
  }
  
  /**
   * Additon between two complex numbers
   * 
   * @param other a the complex number to be added to the complex number
   */
  public void add(Complex other)
  {
    real += other.real;
    imag += other.imag;
    
  }

  /**
   * Multiplies the complex by an integer
   * 
   * @param val an integer to multiply the complex by 
   */
  public void multiply(int val)
  {
    real *= val;
    imag *= val;
  }

  /**
   * Multiplies a complex by another given complex
   * 
   * @param other a complex number to be multiplied with the complex number
   */
  public void multiply(Complex other)
  {
    //Here we apply foil and multiply for the four terms
    //Then we add the related types up, and assign the sums
    //to their respective variables
    int a = real*other.real;
    int b = real*other.imag;
    int c = imag*other.real;
    //For the final term, i^2 = -1, so we multiply
    //the product of the coefficients by -1
    int d = imag*other.imag*-1;
    real = a + d;
    imag = b + c;
  }
  
  /**
   * Swaps the sign of the complex number to create the conjugate
   * 
   * @return conj the conjugate complex number
   */
  public Complex conjugate()
  {
    Complex conj = new Complex(real, imag);
    conj.imag *= -1;
    return conj;
  }
}
  