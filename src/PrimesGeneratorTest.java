import java.util.*;

public class PrimesGeneratorTest {
    public static void main(String[] args) {
    int N = 10;
    PrimesGenerator generator = new PrimesGenerator(N);

    List<Integer> primes = new ArrayList<>();
    while (generator.hasNext()) {
        primes.add(generator.next());
    }

    System.out.println("Первые " + N + " простых чисел:");
    System.out.println(primes);

    Collections.reverse(primes);
    System.out.println("Обратный порядок:");
    System.out.println(primes);
}
}
