import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = scanner.nextInt();
    int a = 0;
    int b = 1;
    int c;
    System.out.print(a + " " + b);

    for (int i = 2; i < n; i++) {
      c = a + b;
      System.out.print(" " + c);
      a = b;
      b = c;
    }
  }
}
