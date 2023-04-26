package integracionnumerica;
import java.util.Scanner;

public class IntegracionNumerica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca los valores necesarios
        System.out.print("Introduce el limite inferior de integracion: ");
        double a = entrada.nextDouble();
        
        System.out.print("Introduce el limite superior de integracion: ");
        double b = entrada.nextDouble();
        
        System.out.print("Introduce el numero de subintervalos: ");
        int n = entrada.nextInt();
        
        // Calculamos la integral utilizando el método del trapecio
        double h = (b - a) / n;
        double suma = f(a) + f(b);
        
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            suma += 2.0 * f(x);
        }
        
        double integral = (h / 2) * suma;
        
        // Mostramos el resultado por pantalla
        System.out.println("La integral de f(x) en [" + a + ", " + b + "] es: " + integral);
    }
    
    // Definimos la función a integrar
    public static double f(double x) {
        return Math.pow(Math.E, Math.pow(x, 2));
    }
}
