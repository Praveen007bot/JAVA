import java.util.Scanner;
public class Calander{
 public static void main(String[] args){
  int years,weeks,days,d;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of days: ");
  d = sc.nextInt();
  years = d/365;
  d = d%365;
  System.out.println("years: "+ years);
  weeks = d/7;
  d = d%7;
  System.out.println("weeks: "+ weeks);
  days = d;
  System.out.println("days: "+ days);
 }
}
  