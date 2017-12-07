package org.teachingkidsprogramming.section09final;

public class FizzBuzz
{
  public static void main(String[] args)
  {
    //   For the whole numbers from 1 to 100,  
    for (int i = 1; i < 101; i++)
    {
      //    If that number is divisible by 3 and 5, then print the word 'FizzBuzz'      
      if (i % 15 == 0)
      {
        System.out.println(i + " FizzBuzz");
      }
      else if (i % 3 == 0)
      {
        //    If that number is divisible by 3, then print the word 'Fizz', 
        System.out.println(i + " Fizz");
      }
      //    If that number is divisible by 5, then print the word 'Buzz', 
      else if (i % 5 == 0)
      {
        System.out.println(i + " Buzz");
      }
      else
      {
        System.out.println(i);
      }
      //print either that number, or,
    }
    //
    //    NOTE: this is a kata (higher level instructions)
    //    part of the exercise is to translate into line-by-line English, THEN Java
    //
    //    For more complete directions see this page
    //    https://www.penflip.com/lynnlangit/tkp-lesson-plans/blob/master/course09.txt
  }
}
