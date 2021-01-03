package PlanB;

public class Date
{
  private int day,month,year;

  public Date(int day,int month,int year){
    this.day=day;
    this.month=month;
    this.year=year;
  }

  public Date copy()
  {
new Date(day,month,year);
return copy();
  }
  public boolean equals(Object obj){
if (!(obj instanceof Date)){
  return false;
}
Date other = (Date) obj;
return day==other.day && month==other.month && year== other.year;
}

  @Override public String toString()
  {
    return "Date{" + "day=" + day + ", month=" + month + ", year=" + year
        +'}';
  }
}
