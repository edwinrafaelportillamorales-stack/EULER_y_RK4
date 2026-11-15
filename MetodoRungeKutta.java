public class MetodoRungeKutta {

    public static double evaluarFuncion(double x,double y){
        // TODO: Implementar la funcion f(x,y) = x+y
        return x + y;
    }

    public static double solucionExacta(double x) {
        return 2 * Math.exp(x) - x - 1;
    }

    public static void main(String[] args){
        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.1;
        double xFinal = 0.3;

        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("n\tx_n\t y_n(RK4)\t Exacta\t\t Error");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.6f%n",
                0, x, y, solucionExacta(x),
                Math.abs(solucionExacta(x) - y));

        for (int i = 0; i < nPasos; i++) {

            double k1 = evaluarFuncion(x, y);
            double k2 = evaluarFuncion(x + h / 2, y + h * k1 / 2);
            double k3 = evaluarFuncion(x + h / 2, y + h * k2 / 2);
            double k4 = evaluarFuncion(x + h, y + h * k3);

            y = y + (h / 6) * (k1 + 2 * k2 + 2 * k3 + k4);
            x = x + h;

            double exacta = solucionExacta(x);
            double error = Math.abs(exacta - y);

            System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.6f%n",
                    i + 1, x, y, exacta, error);
        }
    }
}