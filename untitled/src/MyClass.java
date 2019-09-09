import java.util.Scanner;
/**
 * Developed by Patrick Grønvold (patr6996@edu.easj.dk)
 * Zealand / www.zealand.dk
 * 2019-06-09
 */

//class (Main) starting point
public class MyClass
{
  //psvm - public static void main
  public static void main(String[ ] args)
  {
    {
      String name = "Patrick";
      int age = 25;
      double weight = 92.5;
      char skilllevel = 'A';
    }
    // sout = System.out.println
    System.out.println("Hello World, this is my first project");

    System.out.println("Nu har jeg lært at system printe");

    //Print uden linjeskift.
    System.out.print("Printer ");
    System.out.print("uden ");
    System.out.print("linjeskift ");

    //Input fra brugeren
    Scanner s = new Scanner(System.in);
    System.out.println("skriv dit input: ");
    String input = s.next();
    System.out.println("Du har skrevet " + input);
  }
}