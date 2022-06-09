import java.util.Scanner;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().toLowerCase().split("\\s+");
        TreeSet<String> uniqueWords = new TreeSet<>();

        for (int i = 0; i < words.length; i++) {
            if (!uniqueWords.contains(words[i])) {
                uniqueWords.add(words[i]);
            }
        }

        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }

        scanner.close();
    }
}
