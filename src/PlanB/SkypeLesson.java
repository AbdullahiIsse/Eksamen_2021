package PlanB;

public class SkypeLesson extends OnlineLesson
{

  private String inviteLink;
  public SkypeLesson(String topic, Date date, Time start, Time end, File[] res, boolean screenShare, String inviteLink){
    super(topic,date,start,end,res,screenShare);
    this.inviteLink=inviteLink;
  }

  public String getInviteLink()
  {
    return inviteLink;
  }

  @Override public String nameOfSoftware()
  {
    return "Skype";
  }

  @Override public String toString()
  {
    return "SkypeLesson{" + "inviteLink='" + inviteLink + '\'' + '}';
  }
}
