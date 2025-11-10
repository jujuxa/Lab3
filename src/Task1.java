import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int N = 10;
        int[] arr = new int[N];
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(101);
        }

        List<Integer> list = new ArrayList<>();
        for (int x : arr) list.add(x);
        System.out.println("Исходный список: " + list);

        Collections.sort(list);
        System.out.println("По возрастанию: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("По убыванию: " + list);

        Collections.shuffle(list);
        System.out.println("После перемешивания: " + list);

        Collections.rotate(list, 1);
        System.out.println("После сдвига на 1: " + list);

        Set<Integer> uniqueSet = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(uniqueSet);
        System.out.println("Только уникальные: " + list);

        List<Integer> original = new ArrayList<>();
        for (int x : arr) original.add(x);
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : original) freq.put(x, freq.getOrDefault(x, 0) + 1);
        List<Integer> duplicates = new ArrayList<>();
        for (int x : original) {
            if (freq.get(x) > 1 && !duplicates.contains(x)) {
                duplicates.add(x);
            }
        }
        System.out.println("Только дублирующиеся: " + duplicates);

        Integer[] resultArray = list.toArray(new Integer[0]);
        System.out.println("Массив из уникальных: " + Arrays.toString(resultArray));

        System.out.println("Частота каждого числа:");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
    }
}