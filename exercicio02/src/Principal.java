import java.util.Scanner;

public class Principal
 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int valorA = le.nextInt();

        System.out.print("Valor de B: ");
        int valorB = le.nextInt();

        Numeros sequencia1 = new Numeros();
        sequencia1.imparesAB(valorA, valorB);

    }
        
}
