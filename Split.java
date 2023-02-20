import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Split {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        Map<Character, Integer> repeatedLetters = new HashMap<>();

        
        String[] words = sentence.split(" ");
        for (String word : words) {
           
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

               
                if (Character.isLetter(ch) && !repeatedLetters.containsKey(ch)) {
                    int count = 0;

                  
                    for (int j = 0; j < word.length(); j++) {
                        if (ch == word.charAt(j)) {
                            count++;
                        }
                    }
                    if (count > 1) {
                        
                        repeatedLetters.put(ch, count);
                    }
                }
            }
        }

       
        for (Map.Entry<Character, Integer> entry : repeatedLetters.entrySet()) {
            System.out.println("Letter: " + entry.getKey() + " appears " + entry.getValue() + " times.");
        }
    }
}
