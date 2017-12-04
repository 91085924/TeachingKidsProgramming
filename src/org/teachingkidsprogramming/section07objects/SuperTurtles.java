package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    //  makeSpeedyTurtle (recipe below) --#2.0
    //  ------------- Recipe for makeSpeedyTurtle --#1.0
    makeSpeedyTurtle();
    //  makeSlowTurtle (recipe below) --#4.0
    makeSlowTurtle();
    //  makeCrazyTurtle (recipe below) --#6.0
    makeCrazyTurtle();
    //  ------------- Recipe for makeCrazyTurtle --#5.1
    //        Create a new crazyTurtle instance  
    //        Add your crazyTurtle to your MultiTurtleWindow
    //        Have your crazyTurtle draw a 55 pixel long lightning bolt
    //  ------------- End of makeCrazyTurtle --#5.2
  }
  private void makeSpeedyTurtle()
  {
    Turtle speedyTurtles = new Turtle();
    mtw.addAndShowTurtle(speedyTurtles);
    speedyTurtles.setSpeed(10);
    speedyTurtles.drawTriangle(100);
  }
  private void makeSlowTurtle()
  {
    //        Create a new slowTurtle instance 
    //        Add your slowTurtle to your MultiTurtleWindow
    Turtle slowTurtle = new Turtle();
    mtw.addAndShowTurtle(slowTurtle);
    slowTurtle.setSpeed(1);
    slowTurtle.drawTriangle(-50);
  }
  private void makeCrazyTurtle()
  {
    Turtle crazyTurtle = new Turtle();
    mtw.addAndShowTurtle(crazyTurtle);
    crazyTurtle.drawLightning(55);
  }
}
