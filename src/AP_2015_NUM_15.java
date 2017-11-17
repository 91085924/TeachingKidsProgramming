public class AP_2015_NUM_15
{
  public static void main(String[] args)
  {
    showMe(0);
  }
  public static void showMe(int input)
  {
    if (input < 10)
    {
      //recursive call
      showMe(input + 1);
    }
    else
    {
      System.out.println(input + " ");
    }
  }
}
