import java.util.Scanner;
public class Divide{
 public static int divideTheNumber(int num){
  int steps = 0;
  while(num!=0){
   if(num%2==0){
    num=num/2;
   }
   else{
    num=num-1;
   }
   steps++;
  }
  return steps; 
 }
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number: ");
  int n = sc.nextInt();
  System.out.println("Steps :"+divideTheNumber(n));
 }
}