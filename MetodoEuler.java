public class MetodoEuler {

    public static double evaluarFuncion(double x, double y) {
        // TODO: Implementar la funcion f(x,y) = x-y
        return x - y;
    }

    public static double solucionExacta(double x) {
        return x - 1 + 2 * Math.exp(-x);
    }

    public static void main(String[] args){
        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.01;// Variar este valor en el reporte (ej.0.1, 0.05,0.01)
        double xFinal = 0.3;

        // Criterio de paro(numero total de pasos N)
        int nPasos = (int) Math.round((xFinal-x0)/h);
        double x = x0;
        double y = y0;

        System.out.println("n\tx_n\t y_n(Euler)\t Exacta\t\t Error");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.6f%n",
                0, x, y, solucionExacta(x),
                Math.abs(solucionExacta(x) - y));

        for (int i = 0; i < nPasos; i++) {
            double pendiente = evaluarFuncion(x, y);

            y = y + h * pendiente;
            x = x + h;

            double exacta = solucionExacta(x);
            double error = Math.abs(exacta - y);

            System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.6f%n",
                    i + 1, x, y, exacta, error);
        }
    }
}
