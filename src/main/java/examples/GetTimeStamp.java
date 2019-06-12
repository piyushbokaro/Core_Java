package examples;

public class GetTimeStamp {

  public static void main(String[] args) {
    java.util.Date time = new java.util.Date();
    System.out.println(new java.sql.Time(time.getTime())); 
  }
}