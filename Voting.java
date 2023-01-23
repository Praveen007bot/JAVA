import java.util.Scanner;
public class Voting{
 public static void main(String[] args){
  int age,i;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your age: ");
  age = sc.nextInt();
  if (age>=18){
   System.out.println("you are elgible to vote.");
  }
  else{
   i=(18-age);
   System.out.println("Sorry, you can vote after "+i+" years.");
  }
 }
}