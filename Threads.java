import java.util.*;
class thread extends Thread{
 public void run(){
  
   Scanner sc = new Scanner(System.in);
   int a=0;
   int b=1;
   int c=a+b;
   System.out.print("number: ");
   int n = sc.nextInt();
   System.out.print(a+" "+b);
   
   for(int i=0;i<n-2;i++){
    System.out.print(" "+c);
    a=b;
    b=c; 
    c=a+b;
   }
  }
 }
class Main2{
 public static void main(String[] args){
  thread ob = new thread();
  ob.start();
 }
}
