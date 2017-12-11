package org.teachingkidsprogramming.section08events;

import java.util.Random;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class VariationSimpleBubble implements MouseLeftClickListener
{
  ProgramWindow programWindow; //this is a class level variable(member variable)
  public VariationSimpleBubble()
  {
    programWindow = new ProgramWindow("My Bubble");
    programWindow.setWindowVisible(true);
    programWindow.addMouseLeftClickListener(this);
    //
    prepareColorPalette();
  }
  private void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Browns.Chocolate);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Greens.YellowGreen);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    createBubble(x, y);
  }
  private void createBubble(int x, int y)
  {
    //     Remove previous bubbles from your program window --#9
    programWindow.clearWindow();
    Random random = new Random();
    int radius = random.nextInt(41) + 10;
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    //     Create a circle with the radius and the next color from the color wheel --#2.1
    //     Move the center of the bubble to the current position of the mouse on the window --#3
    circle.setCenter(x, y);
    //     Add the circle to your program window --#2.4
    circle.addTo(programWindow);
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}