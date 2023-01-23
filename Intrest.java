import java.util.Scanner;
public class Intrest{
 public static void main(String[] args){
  float r;
  float intrest;
  Scanner sc = new Scanner(System.in);
  System.out.println("Principle amount: ");
  float p = sc.nextFloat();
  System.out.println("Time: ");
  float t = sc.nextFloat();
  System.out.println("Is customer senior citizen(y/n): ");
  char ch = sc.next().charAt(0);
  if (ch=='y'){
    intrest = (p*t*12)/100;
    System.out.println(intrest);
  }
  else if (ch=='n'){
   intrest = (p*t*10)/100;
   System.out.println(intrest);
  }
  else{
   System.out.println("Enter y or n only.");
  }  
 }
}

  
  