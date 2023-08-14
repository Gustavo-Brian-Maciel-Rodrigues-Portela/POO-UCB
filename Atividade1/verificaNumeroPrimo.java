package Atividade1;
import java.util.Scanner;

public class verificaNumeroPrimo {

    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Integer numero = 0; 
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        numero = scan.nextInt();

        int resultado = verificaNumeroPrimo(numero);

        if (resultado == 0) {
            System.out.println(numero + " não é primo.");
        } else {
            System.out.println(numero + " é primo.");
        }
    }
}
