import java.util.Scanner;
class CountVowels{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String vowels="",consonants="";
  System.out.println("Enter the word: ");
  String word = sc.nextLine();
  word = word.toLowerCase();
  for(int i=0;i<word.length();i++){
   char c = word.charAt(i);
   if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){
    vowels=vowels+c;
   }
   else{
    consonants=consonants+c;
   }
  }  
  System.out.println("vowels :"+vowels);
  System.out.println("consonants :"+consonants);
 }
}