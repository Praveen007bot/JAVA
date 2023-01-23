import java.util.Scanner;
public class Bonus{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the grade of the employee: ");
  int g = sc.next().charAt(0);
  if (g == 'A'){
   System.out.println("Enter the s of the emoloyee: ");
   int s = sc.nextInt();
   if (s<10000){
    int bonus = s/7;
    int total = s+bonus;
    System.out.println("bonus:" + bonus);
    System.out.println("Total s: "+ total);
   }
   else {
    int bonus = s/5;
    int total = s+bonus;
    System.out.println("bonus:" + bonus);
    System.out.println("Total s: "+ total);
   }
  }
  else if (g == 'B'){
   int s = sc.nextInt();
   if (s<10000){
    int bonus = s/12;
    int total = s+bonus;
    System.out.println("bonus:" + bonus);
    System.out.println("Total s: "+ total);
   }
   else {
    int bonus = s/10;
    int total = s+bonus;
    System.out.println("bonus:" + bonus);
    System.out.println("Total s: "+ total);
   }
  }
 
}}