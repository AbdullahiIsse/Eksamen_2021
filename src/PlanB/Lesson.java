package PlanB;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Lesson
{
  private String topic;
  private Date date;
  private File[] resources;
  private Time start;
  private Time end;

  public Lesson(String topic, Date date, Time start, Time end, File[] res)
  {
    this.date = date;
    this.end = end;
    this.start = start;
    this.resources = res;
    this.topic = topic;
  }

  public String getTopic()
  {
    return topic;
  }

  public Date getDate()
  {
    return date;
  }

  public File[] getResources()
  {
    return resources;
  }

  public ArrayList<File> getAllPDFs()
  {
    ArrayList<File> otherliste = new ArrayList<>();
    for (int i = 0; i < resources.length; i++)
    {
      otherliste.add(resources[i]);
    }
    return otherliste;
  }

  public Time getDuration()
  {
    return start.timeTo(end);
  }

  public static boolean hasValidTime(Time start, Time end)
  {
    if (end.isbefore(start))
    {
      return false;
    }
    else if (!start.isbefore(new Time(8, 20, 00)) && end
        .isbefore(new Time(21, 15, 00)))
    {
      return true;
    }
    else
      return false;
  }
  public void delayBy (int minnutes){
    if (minnutes<=120);{
      Time tid1 = new Time(start.convertToSeconds());
      Time tid2 = new Time(end.convertToSeconds());
      tid1.tic(minnutes*60);
      tid2.tic(minnutes*60);
      if (hasValidTime(tid1,tid2));{
        start.tic(minnutes*60);
        end.tic(minnutes*60);
      }
    }
  }
  public String getDateByString(){
    return String.valueOf(LocalTime.parse("HH:MM:SS"));
  }

  @Override public String toString()
  {
    return "Lesson{" + "topic='" + topic + '\'' + ", date=" + date
        + ", resources=" + Arrays.toString(resources) + ", start=" + start
        + ", end=" + end + '}';
  }
}



