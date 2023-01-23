import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = scanner.nextInt();

    
    int[] numbers = new int[n];
    for (int i=0;i<n;i++) {
      System.out.print("Enter element "+(i+1)+": ");
      numbers[i] = scanner.nextInt();
    }

    
    int sum = 0;
    try {
      for (int i=0;i<=n;i++) {
        sum+=numbers[i];
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: loop variable beyond the size of the array.");
      return;
    }

    
    System.out.println("The sum of the elements of the array is:"+sum);
  }
}