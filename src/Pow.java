public class Pow
{
  public static void main(String[] args)
  {
    int base = 10;
    int exponet = 4;
    int result = pow(base, exponet);
    System.out.println("The answer is " + result);
  }
  public static int pow(int base, int exp)
  {
    int product = 1;
    for (int i = 0; i < exp; i++)
    {
      product = product * base;
    }
    //what goes in here?????
    return product;
  }
}
