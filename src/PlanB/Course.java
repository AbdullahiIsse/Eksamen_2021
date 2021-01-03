package PlanB;

import java.util.ArrayList;

public class Course
{
  private String name;
  private ArrayList<Lesson> schedule;

  public Course(String name)
  {this.name=name;
  schedule = new ArrayList<>();
  }

  public String getName()
  {
    return name;
  }

  public int getNumberofLessons()
  {
    return schedule.size();
  }
  public void addLesson(Lesson lesson){
    schedule.add(lesson);
  }
  public void removeLesson(Lesson lesson){
    schedule.remove(lesson);
  }

  public boolean hasLessonsOnDate(Date date){
    for (int i = 0; i < schedule.size(); i++)
    {
      if (schedule.get(i).getDate().equals(date))
      {
        return true;
      }
    }
    return false;
  }
  public  ArrayList<Lesson> getAllLessons(){
    return schedule;
}
public ArrayList<String> getAlllTopics(){
    ArrayList<String> topics = new ArrayList();
  for (int i = 0; i <schedule.size() ; i++)
  {
    topics.add(schedule.get(i).getTopic());
  }
  return topics;
}

public ArrayList<OnlineLesson> getOnlineLessons()
{
  ArrayList<OnlineLesson> onlineLessons = new ArrayList();
  for (int i = 0; i < schedule.size(); i++)
  {
    if (schedule.get(i) instanceof OnlineLesson)
      onlineLessons.add((OnlineLesson) schedule.get(i));
  }
return onlineLessons;
}
public ArrayList<SkypeLesson> getSkypeLessons(){
    ArrayList<SkypeLesson> skypeLessons = new ArrayList<>();
  for (int i = 0; i < schedule.size(); i++)
  {
    if (schedule.get(i) instanceof SkypeLesson)
      skypeLessons.add((SkypeLesson)schedule.get(i));
  }
  return skypeLessons;
}
  public ArrayList<DiscordLesson> getDiscordLessons(){
    ArrayList<DiscordLesson> discordLessons = new ArrayList<>();
    for (int i = 0; i < schedule.size(); i++)
    {
      if (schedule.get(i) instanceof DiscordLesson)
        discordLessons.add((DiscordLesson) schedule.get(i));
    }
    return discordLessons;
  }


}
