public class Retangulo {
    private double comprimento, largura;
    
    public double area () {
        return comprimento * largura;
    }
    public double perimetro () {
        return (comprimento * 2) + (largura * 2);
    }

    public Retangulo (double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }
}
