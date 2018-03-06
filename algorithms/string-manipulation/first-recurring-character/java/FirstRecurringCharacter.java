import java.util.HashMap;

public class FirstRecurringCharacter {

    public static void main(String[] args) {

        String str = args[0];

        HashMap<Character, Integer> seenChars = new HashMap<Character, Integer>();

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0 ; i < alpha.length() ; i++) {
            seenChars.put(alpha.charAt(i), 0);
        }

        for (int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i); 
            if (seenChars.get(c) == 1) {
                System.out.println(c);
                break;
            } else {
                seenChars.put(c, seenChars.get(c) + 1);
            }
        }

    }

}
