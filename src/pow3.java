public class Pow3
{
  public static void main(String[] args)
  {
    int base = 5;
    int exponet = 2;
    int result = pow(base, exp);
    System.out.println("The answer is: " + result);
  }
  public int pow(int base, int exp)
  {
    int product = 1;
    for (int i = 0; i < exp; i++)
    {
      product = product * base;
    }
    return 0;
  }
}//end of class
