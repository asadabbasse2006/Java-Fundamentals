import java.util.Scanner;
public class Average {
     public static void main(String[] args) {
          Scanner asad = new Scanner(System.in);
          System.out.print("Enter the number 1: ");
          int a = asad.nextInt();
          System.out.print("Enter the number 2: ");
          int b = asad.nextInt();
          int c = (a + b)/2;
          System.out.print("The average of " + a + " and " + b + " is " + c);
          asad.close();
     }
}
