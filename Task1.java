import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().toLowerCase().split("\\s+");
        HashMap<String, Integer> wordCounter = new HashMap<>();

        for (String word : words) {
            if (wordCounter.containsKey(word)) {
                wordCounter.put(word, wordCounter.get(word) + 1);
            } else {
                wordCounter.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            String word = entry.getKey();
            int counter = entry.getValue();
            System.out.println(word + ": " + counter);
        }

        scanner.close();
    }
}