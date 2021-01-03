package PlanB;

public abstract class OnlineLesson extends Lesson
{
  private boolean screenSharing;

  public OnlineLesson(String topic, Date date, Time start, Time end, File[] res, boolean screenSharing)
  {
    super(topic, date, start, end, res);
    this.screenSharing=screenSharing;
  }

  public boolean teacherWillshareScreen(){
      return screenSharing; }

  public abstract String nameOfSoftware();

  @Override public String toString()
  {
    return "OnlineLesson{" + "screenSharing=" + screenSharing + '}';
  }
}
