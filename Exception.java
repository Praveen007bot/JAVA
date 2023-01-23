import java.util.Scanner;
public class Exception{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the length of the array");
  int n = sc.nextInt();
  
  int[] numbers = new int[n];
  for (int i=0;i<n;i++){
   System.out.print("Enter element "+(i+1)+": ");
   numbers[i] = sc.nextInt();
  }
  int sum = 0;
  try{
   for (int i=0;i<=n;i++){
    sum=sum+numbers[i];
    System.out.println("The sum of the elements of the array is :"+sum);
   }
  }
  catch(ArrayIndexOutOfBoundsException e){
   System.out.println("Error: Loop varaible beyond the size of an array");
   return;
  }
  System.out.println("The sum of the elements of the array is :"+sum);
 }
}