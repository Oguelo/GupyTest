import java.util.ArrayList;


public class FunctionFib {
    public static ArrayList<Integer> fibonacciSequence(int n) {
        ArrayList<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(0);
        fibSequence.add(1);
        while (fibSequence.get(fibSequence.size() - 1) < n) {
            int nextFib = fibSequence.get(fibSequence.size() - 1) + fibSequence.get(fibSequence.size() - 2);
            fibSequence.add(nextFib);
        }
        return fibSequence;
    }

    public static boolean pertenceFibonacci(int numero) {
        ArrayList<Integer> fibSequence = fibonacciSequence(numero);
        return fibSequence.contains(numero);
    }
}
