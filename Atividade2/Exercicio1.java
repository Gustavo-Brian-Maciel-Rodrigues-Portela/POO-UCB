import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        String sinal = "";
        int resultado = 0;

        System.out.print("Insira o primeiro número: ");
        numero1 = scan.nextInt();
        System.out.print("Insira o sinal: ");
        sinal = scan.next();
        System.out.print("Insira o segundo número: ");
        numero2 = scan.nextInt();

        switch(sinal) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2; 
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;        
        }

        System.out.printf("Resultado: %d", resultado);

        
    }

}