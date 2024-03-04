import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        Cachorro [] cao = new Cachorro[4];
        for ( int i = 0; i < cao.length; i++)
        {
            cao[i] = new Cachorro();
            System.out.print("\nCachorro " +  (i + 1)  + "\nNome: ");
            cao[i].setNome(le.nextLine());
            System.out.print("Raça: ");
            cao[i].setRaca(le.nextLine());
            System.out.print("Idade: ");
            cao[i].setIdade(le.nextInt());
            le.nextLine();
            

        }

        for ( int i = 0; i < cao.length; i++) {
            System.out.println(cao[i].getNome() + "\n" + cao[i].getRaca());
        }
    }
}
