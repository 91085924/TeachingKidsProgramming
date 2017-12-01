package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdlibsVariation
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    String edverb = askEdverb();
    String bodyPart = askBodyPart();
  } //end of main
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Y u due knot wana playy?Too starts u needed 1 adverb!");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers R knot adverbs?");
      askAdverb();
    }
    return adverb;
  } //end of method
  private static String askEdverb()
  {
    String edverb = MessageBox.askForTextInput("Enter verb that ends with -ed: ");
    if (edverb.isEmpty())
    {
      MessageBox.showMessage("NOPE NOPE");
      askEdverb();
    }
    else if (edverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("NO NO NO!");
      askEdverb();
    }
    return edverb;
  }
  private static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("Enter a body part: ");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("You walked the prank: ");
      askBodyPart();
    }
    else if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.showMessage("HAHHAAHAH OKAY");
      askBodyPart();
    }
    return bodyPart;
  }
} //end of class
