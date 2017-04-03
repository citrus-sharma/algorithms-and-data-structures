package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String args[]) {
        Fibonacci fib = new Fibonacci();

        long start = System.nanoTime();
        int result = fib.fibonacci(50);
        System.out.println(" end "+ (System.nanoTime() -start));

        start = System.nanoTime();
         fib.fibonacciWithHash(50, new HashMap<Integer,Integer>());
        System.out.println(" end "+ (System.nanoTime() -start));

        System.out.println(result);
    }

    private int fibonacci(int n) {
        if(n <= 1)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    private int fibonacciWithHash(int n, Map<Integer, Integer> map) {
        if(map.containsKey(n)) {
            return map.get(n);
        }
        if(n <= 1) {
            map.put(1,1);
            return 1;
        }
        map.put(n, fibonacciWithHash(n-1, map) + fibonacciWithHash(n-2,map));
        return map.get(n);
    }
}
