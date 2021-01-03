//package TestEksamen7;
//
//public class School extends Education
//{
//  private String type;
//  public static String INFANT_SCHOOL = "Infant school";
//  public static String JUNIOR_SCHOOL = "Junior school";
//  public static String SECORDDARY_SCHOOL = "Secondary";
//  public static String HIGH_SCHOOL = "High school";
//
//  public School(String code, String title, String type){
//    super(code, title);
//    this.type=type;
//  }
//
//  public boolean equals(Object obj){
//    if (! super.equals(obj)) return false;
//    if (this.getClass()!=obj.getClass())
//      return false;
//    School other = (School) obj;
//    return this.type.equals(other.type);
//  }
//
//  public String getType()
//  {
//    return type;
//  }
//
//  @Override public String toString()
//  {
//    return "School{" + "type='" + type + '\'' + '}';
//  }
//}
