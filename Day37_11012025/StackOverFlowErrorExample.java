import java.util.*;

public class StackOverFlowErrorExample {
  
  public static void a(){
    System.out.println("a is called...");
    a();
    // int a = 10/0;
  }
    public static void main(String[] args) {
        a();
  }
}