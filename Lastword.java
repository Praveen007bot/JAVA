import java.util.Scanner;
public class Lastword{
 public static int WordLength(String s){
  s=s.trim();
  String[] word = s.split("\\s+");
  return word[word.length-1].length();
 }
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the String: ");
  String str = sc.nextLine();
  System.out.println("length of last word : "+WordLength(str));
 }
}