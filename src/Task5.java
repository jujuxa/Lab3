import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Map<String, Integer> original = new HashMap<>();
        original.put("a", 1);
        original.put("b", 2);
        original.put("c", 3);
        System.out.println("Исходная карта: " + original);
        Map<Integer, String> inverted = invert(original);
        System.out.println("Инвертированная карта: " + inverted);
    }
    public static <K, V> Map<V, K> invert(Map<K, V> name) {
        Map<V, K> output = new HashMap<>();
        for (Map.Entry<K, V> entry : name.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            output.put(value, key);
        }
        return output;
    }
}