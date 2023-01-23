import java.util.Scanner;
class Star{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter value of n: ");
  int n = sc.nextInt();
  int a,b;
  for(a=0;a<n;a++){
   for(b=0;b<=a;b++){
    System.out.print("*");
   }
  System.out.println(" ");
  } 
 }
}