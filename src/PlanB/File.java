package PlanB;

import java.util.Objects;

public class File
{
  private String fileName,extension;

  public File(String fileName,String extension){
    this.fileName=fileName;
    this.extension=extension;
  }

  public boolean isPDF(){
if (extension.equalsIgnoreCase("pdf")) {
      return true;
    } return false;
  }


  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof File)){
      return false;

    }
    File other = (File) obj;
    return extension.equals(other.extension)&& fileName.equals(other.fileName);
  }


  @Override public String toString()
  {
    return "File{" + "fileName='" + fileName + '\'' + ", extension='"
        + extension + '\'' + '}';
  }
}
