public class Triangulo {
    private double lado1, lado2, lado3;


    public Triangulo (double lado1, double lado2, double lado3){
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }

    public double perimetro (){
        return lado1 + lado2 + lado3;
    }

    public double area (){
        double sP = (lado1 + lado2 + lado3) / 2; 
        return Math.sqrt(sP * (sP - lado1) * (sP - lado2) * (sP - lado3));
    }

    public boolean ehEscaleno (){
        return (lado1 != lado2 && lado1 != lado3 && lado2 != lado3);
    }
    public boolean ehEquilatero (){
        return (lado1 == lado2 && lado1 == lado3);
    }
    public boolean ehIsosceles(){
        return ((lado1 == lado2 && lado1 != lado3) || (lado1 != lado2 && lado1 == lado3));
    }

    public void tipoTriangulo(){
        if (ehEquilatero())
            System.out.println("Triângulo equilátero");
        else if (ehEscaleno())
            System.out.println("Triângulo escaleno");
        else
            System.out.println("Triângulo isóceles");
    }

    public void setLado1 (double novoLado){
        this.lado1 = novoLado;
    }
    public void setLado2 (double novoLado){
        this.lado2 = novoLado;
    }
    public void setLado3 (double novoLado){
        this.lado3 = novoLado;
    }
    public double getLado1 (){
        return this.lado1;
    }
    public double getLado2 (){
        return this.lado2;
    }
    public double getLado3 (){
        return this.lado3;
    }
}
