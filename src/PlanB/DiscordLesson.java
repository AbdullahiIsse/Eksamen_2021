package PlanB;

public class DiscordLesson extends OnlineLesson
{
  private String channelName;
  private boolean voiceChannel;

  public DiscordLesson(String topic, Date date, Time start, Time end, File[] res, Boolean voiceChannel, String channelName,boolean screenShare){
    super(topic,date,start,end,res, screenShare);
    this.channelName=channelName;
    this.voiceChannel=voiceChannel;
  }

  @Override public String nameOfSoftware()
  {
    return "Discord";
  }

  public String getChannelName()
  {
    return channelName;
  }

  public boolean usesVoiceChannel(){
    return voiceChannel;
  }

  @Override public String toString()
  {
    return "DiscordLesson{" + "channelName='" + channelName + '\''
        + ", voiceChannel=" + voiceChannel + '}';
  }
}
