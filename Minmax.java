import java.util.Scanner;
public class Minmax{
 public static void main(String[] arsg){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter size of array");
  int n = sc.nextInt();
  
  int[] array = new int[n];
  
  System.out.println("Enter "+ n+ " values:");
  for (int i=0;i<n;i++){
   array[i]=sc.nextInt();
  }


  int max = array[0];
  for(int j=0;j<array.length;j++){
   if(array[j]>max)
    max=array[j];
  }
  System.out.println("maximun="+max);
  
  int min = array[0];
  for(int k=0;k<array.length;k++){
   if(array[k]<min)
    min=array[k];
  }
  System.out.println("minimum="+min);
  System.out.println("addition of max and min="+(max+min));
  System.out.println("substraction of max and min="+(max-min));
 }
}
