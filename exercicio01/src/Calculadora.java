public class Calculadora {
    public double DistEntre2PontosPlanoCartesiano (double[] pointA, double[] pointB)
    {
        return Math.sqrt(Math.pow(pointB[0] - pointA[0], 2) + Math.pow(pointB[1] - pointA[1], 2));
    }
}