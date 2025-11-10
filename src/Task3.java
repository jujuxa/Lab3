import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Анна", "Петрова", 25),
                new Human("Иван", "Сидоров", 25),
                new Human("Мария", "Петрова", 40),
                new Human("Анна", "Петрова", 25),
                new Human("Олег", "Смирнов", 50)
        );

        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("HashSet: " + hashSet);

        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<Human> treeSetNatural = new TreeSet<>(humans);
        System.out.println("TreeSet (по compareTo): " + treeSetNatural);

        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("TreeSet (по фамилии): " + treeSetByLastName);
    }
}