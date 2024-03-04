public class Principal {
    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo(3,2);
        Retangulo ret2 = new Retangulo(5, 4);

        System.out.println("Area do primeiro retangulo: " + ret1.area());
        System.out.println("Perímetro do primeiro retangulo: " + ret1.perimetro());
        System.out.println("Area do segundo retangulo: " + ret2.area());
        System.out.println("Perímetro do segundo retangulo: " + ret2.perimetro());
    }
}
