import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
class Roman {
    public static int romanToInt(String s) {
        int res = 0;
        int prev = 0;
        Map<Character, Integer> roman_to_int = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = roman_to_int.get(s.charAt(i));
            if (curr < prev) {
                res -= curr;
            } else {
                res += curr;
            }
            prev = curr;
        }
        return res;
   }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        String n = sc.nextLine();
        int result = romanToInt(n);
        System.out.println("Integer Number: "+result);
    }
    
}
