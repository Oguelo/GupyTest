package questaoDois;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (FunctionFib.pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence.");
        } else {
            System.out.println("O número " + numero + " não pertence .");
        }
    }
}
