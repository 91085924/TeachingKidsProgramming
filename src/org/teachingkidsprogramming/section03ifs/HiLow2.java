package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

//this variation tells user how many guesses they have left.
public class HiLow2
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int answer = rand.nextInt(100) + 1;
    // int answer = (int) (Math.random() * 100 + 1);
    //System.out.println("The answer is " + answer);
    int tries = 8;
    for (int i = 1; i <= tries; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
      if (i == tries)
      {
        MessageBox.showMessage("You lost");
      }
      MessageBox.showMessage("You have " + (tries - i) + " tries left.");
    }
  }
}
