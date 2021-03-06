package org.teachingkidsprogramming.section07objects;

import java.util.ArrayList;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Text;

public class CloneTurtles
{
  // Uncomment the two lines of code below to create a container and a window for your turtles --#1
  public ArrayList<Turtle> turtles = new ArrayList<Turtle>();
  public MultiTurtleWindow mtw     = new MultiTurtleWindow();
  //
  public CloneTurtles()
  {
    showSomeTurtles();
  }
  //
  private void showSomeTurtles()
  {
    for (int i = 0; i < 3; i++)
    {
      Turtle turtle = new Turtle();
      turtles.add(turtle);
    }
    //
    int numberOfTurtles = turtles.size();
    new Text("There are " + numberOfTurtles + " turtles in the turtle container").setTopLeft(50, 50)
        .setPenColor(PenColors.Yellows.Gold).addTo(mtw);
    //
    for (Turtle turtle : turtles)
    {
      mtw.addAndShowTurtle(turtle);
    }
    //
    for (int i = 0; i < 3; i++)
    {
      turtles.get(i).setX(i * 100 + 350);
      turtles.get(i).setY(i * 100 + 100);
    }
    //
    // Use a FOREACH loop to set values for all of your turtles --#7.1
    for (Turtle turtle : turtles)
    {
      //      Set the pen width to 10 pixels -- #7.3
      turtle.setPenWidth(10);
      //      Set the turtle speed to 9 --#7.4
      turtle.setSpeed(9);
      //      Have each turtle draw a star with a side that is 100 pixels --#7.5
      turtle.drawStar(100);
      // End Repeat --#7.2
    }
  }
  //
  public static void main(String[] args)
  {
    new CloneTurtles();
  }
}
