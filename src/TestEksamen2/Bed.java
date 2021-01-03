/**package TestEksamen2;

public class Bed
{
  private String type;

  public Bed(String type){
    this.type=type;
  }
  public boolean isDouble(){
    String typeholder = type;
    if(typeholder.toLowerCase().equals("double"))
      return true;
    return false;
  }
  public boolean isKingsize(){
    String typeholder = type;
    if(typeholder.toLowerCase().equals("kingsize"))
      return true;
    return false;
  }
  public boolean isSingle(){
    String typeholder = type;
    if(typeholder.toLowerCase().equals("single"))
      return true;
    return false;
  }



}
**/