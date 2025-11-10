import java.util.*;

public class PrimesGenerator implements Iterator<Integer> {
    private int current = 2;
    private int generated = 0;
    private final int limit;

    public PrimesGenerator(int n) {
        this.limit = n;
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public boolean hasNext() {
        return generated < limit;
    }

    public Integer next() {
        while (!isPrime(current)) current++;
        int prime = current;
        current++;
        generated++;
        return prime;
    }
}