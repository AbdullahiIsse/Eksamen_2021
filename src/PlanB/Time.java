package PlanB;

public class Time
{
  private int hour, minute, second;

  public Time(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Time(int totalTimeInSeconds)
  {
    this.hour = totalTimeInSeconds / 3600;
    this.minute = (totalTimeInSeconds % 3600) / 60;
    this.second = ((totalTimeInSeconds % 3600) % 60);
  }

  public void tic()
  {
    Time tic = new Time(convertToSeconds() + 1);
    this.second=tic.second;
    this.minute=tic.minute;
    this.hour= tic.hour;
  }

  public void tic(int seconds)
  {
    for (int i = 0; i < seconds; i++)
    {
      tic();
    }
  }

  public int convertToSeconds()
  {
    int alltime = this.hour * 3600 + this.minute * 60 + this.second;
    return alltime;
  }

  public boolean isbefore(Time time2)
  {
    return this.convertToSeconds() < time2.convertToSeconds();
  }

  public Time timeTo(Time time2)
  {
    int timeremain = this.convertToSeconds() - time2.convertToSeconds();
    Time remain = new Time(timeremain);
    return remain;
  }

  public Time copy()
  {
    return new Time(hour, minute, second);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Time))
      return false;
    Time other = (Time) obj;
    return convertToSeconds() == other.convertToSeconds();

  }

  @Override public String toString()
  {
    return "Time{" + "hour=" + hour + ", minute=" + minute + ", second="
        + second + '}';
  }
}