package PlanB;

import java.util.ArrayList;

public class planBTest
{
  public static void main(String[] args)
  {
    Time tid1 = new Time(60);
    tid1.tic(10000000);
    System.out.println(tid1);
    File[] mark = new File[2];
    ArrayList<Lesson>  hej1 = new ArrayList<>();

    hej1.add(new Lesson("hej",new Date(12,2,8900),new Time(8,54,34),
        new Time(74374), mark));

    hej1.add(new SkypeLesson("hej",new Date(12,2,8900),new Time(8,54,34),
        new Time(74374), mark, false,"hejinvmighej"));

    hej1.add(new DiscordLesson("hej",new Date(12,2,8900),new Time(8,54,34),
        new Time(74374), mark, false,"hejinvmighej",true));

    Course course = new Course("mark");
    course.addLesson(hej1.get(1));
    course.addLesson(hej1.get(0));
    course.addLesson(hej1.get(2));

    System.out.println(course.getSkypeLessons());

  }
}

