import java.util.Scanner;
public class Table {
     public static void main(String[] args) {
         Scanner asad = new Scanner(System.in);
         System.out.print("Enter the number for table: ");
         int a = asad.nextInt();
         int n = 10;
         for (int i = 1; i <= n; i++) {
             System.out.print(a + " * " + i + " = " + a*i);
             System.err.println();
         } 
         System.out.println();
     }
}
