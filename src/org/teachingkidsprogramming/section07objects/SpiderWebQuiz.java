package org.teachingkidsprogramming.section07objects;

import org.teachingkidsprogramming.recipes.quizzes.graders.SpiderQuiz;
import org.teachingkidsprogramming.recipes.quizzes.graders.SpiderWebQuizGrader;

public class SpiderWebQuiz extends SpiderQuiz
{
  @Override
  public void question1()
  {
    //      Do the following the current number of times HINT: "number" is a variable name
    //number = 1;
    for (int i = 0; i < number; i++)
    {
      //      Call circle()
      circle();
    }
    //      Repeat
  }
  public void question2()
  {
    //      Create and then call a recipe called circleAround which 
    circleAround();
    //      Does the following 3 times
  }
  public void question3()
  {
    //      Create and then call a recipe called grow which 
    grow();
  }
  public void grow()
  {
    length = length * 2.5;
  }
  public void question4()
  {
    //      Create and then call a recipe called shrink which
    shrink();
  }
  public void shrink()
  {
    //      Decreases the current length by 9 pixels
    length = length - 9;
  }
  public void question5()
  {
    //      Create and then call a recipe called expand which
    expand();
  }
  public void expand()
  {
    //      Increases the current number by 12
    number = number + 12;
  }
  public static void main(String[] args)
  {
    new SpiderWebQuizGrader().grade(new SpiderWebQuiz());
  }
  public void circleAround()
  {
    for (int i = 0; i < 3; i++)
    {
      //      Call adjust()
      adjust();
      //      Call question1
      question1();
      //      Repeat
    }
  }
}
