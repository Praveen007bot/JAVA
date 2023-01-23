import java.util.Scanner;
public class Palindrome{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("case= ");
 int a = sc.nextInt(); 
 switch(a){
  case 1:{
   String original,reverse="";
   System.out.println("Enter a string: ");
   Scanner in = new Scanner(System.in);
   original = in.nextLine();
   int length = original.length();
   for(int i=length-1;i>=0;i--){
    reverse = reverse+original.charAt(i);
   }
   if(original.equals(reverse)){
    System.out.println("string is palindrome");
   }
   else{
    System.out.println("string is not a palindrome");
   }
  }
  break;
  case 2:{
   int r,sum=0,temp;
   System.out.println("Enter a number: ");
   Scanner num = new Scanner(System.in);
   int n = num.nextInt();
   temp=n;
   while(n>0){
    r=n%10;
    sum=(sum*10)+r;
    n=n/10;
   }
   if(temp==sum)    
    System.out.println("palindrome number ");    
   else    
    System.out.println("not palindrome"); 
  }
  break;
}
}
}
