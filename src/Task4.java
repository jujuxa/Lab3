import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        String text = "Never gonna give you up. Never gonna let you down, Never gonna run around and desert you!";
        String[] words = text.split("\\W+");

        Map<String, Integer> howmuch = new HashMap<>();

        for (String word : words) {
            String key = word.toLowerCase().trim();
            if (key.isEmpty()) continue;
            howmuch.put(key, howmuch.getOrDefault(key, 0) + 1);
        }

        System.out.println("Слова и их частоты:");
        for (Map.Entry<String, Integer> entry : howmuch.entrySet()) {
            System.out.println("'" + entry.getKey() + "' → " + entry.getValue());
        }
    }
}