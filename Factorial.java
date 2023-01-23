import java.util.Scanner;
public class Factorial{
 public static long Fact(long n){
  if (n==0){
   return 1;
  }
  return n*Fact(n-1);
 }
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number: ");
  long num = sc.nextLong();
  long fact = Fact(num);
  System.out.println("Fact: "+fact);
 }
}