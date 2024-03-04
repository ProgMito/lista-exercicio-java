import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner le = new Scanner (System.in);


    
        System.out.print("Lado 1: ");
        double varLado1 = le.nextDouble();
        
        System.out.print("Lado 2: ");
        double varLado2 = le.nextDouble();

        System.out.print("Lado 3: ");
        double varLado3 = le.nextDouble();

        Triangulo triangulo1 = new Triangulo(varLado1, varLado2, varLado3);

        System.out.println("Área do Triângulo = " + triangulo1.area());
        
        System.out.println("Perímetro do Triângulo = " + triangulo1.perimetro());

        triangulo1.tipoTriangulo();

        le.close();
    }
}
