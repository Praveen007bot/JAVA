import java.util.Scanner;
public class Commonelement{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of 1st array:);
  int s1 = sc.nextInt;
  int[] array1 = new int[s1];
  for(int i=0;i<s1;i++){
   System.out.println("Enter the "+(i+1)+"element: );
   array1(i)=sc.nextInt();
  }
  System.out.println("Enter the size of 1st array:);
  int s2 = sc.nextInt;
  int[] array2 = new int[s2];
  for(int i=0;i<s1;i++){
   System.out.println("Enter the "+(i+1)+"element: );
   array2(i)=sc.nextInt();
  }
  int[] common = new int[s1];
  count = 0;
  for(int i=0;i<s1;i++){
   for(int j=0;j<s2;j++){
    if(array1[i]==array2[j]){
     common[count]=array1[i]
    }
   }
  }
  if(count==0){
   System.out.println("There are no common elements.");
  }
  else{
   for(int i=0;i<s1;i++){
    System.out.println("Common Elements are: "+common[i]);
   }
  }
 }
}