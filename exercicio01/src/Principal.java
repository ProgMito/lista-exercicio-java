public class Principal {
    public static void main(String[] args) {
        double [] pontoA = {2,5};
        double [] pontoB = {1,4};

        Calculadora distanciaAB = new Calculadora();
        double resultado = distanciaAB.DistEntre2PontosPlanoCartesiano(pontoA, pontoB);
        System.out.println(resultado);
    }
}
