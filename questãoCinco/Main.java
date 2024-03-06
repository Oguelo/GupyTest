package questãoCinco;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String str = scanner.nextLine();

        String strInvertida = inverseString.inverterString(str);
        System.out.println("String invertida: " + strInvertida);
    }
}