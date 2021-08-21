
import java.util.Scanner;

public class reto1joiner {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        double PersonaP = 0;
        
        
        Scanner sc = new Scanner(System.in);

        int CantidadPorcentaje = sc.nextInt();// 6

        Double[] arreglo = new Double[CantidadPorcentaje];// Creamos el arreglo

        for (int i = 0; i < arreglo.length; i++) {// Recorremos el arreglo

            System.out.print("");
            double porcentaje = sc.nextDouble();// 70.8

            arreglo[i] = porcentaje; // Guardamos en el arreglo según la posición

        }

        // Calcular el Promedio
        double suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            // System.out.println(arreglo[i]);

            suma = suma + arreglo[i];
            /*
             * Sumamos el valor que se encuentra en la variable suma, con el valor que se
             * encuentra en el arreglo
             */

            if (arreglo[i] >= 5.1 && arreglo[i] <= 35) {
                PersonaP += 1;
            }

        }

        double promedio = suma / arreglo.length;
        // System.out.println("Promedio es: "+promedio);

        if (promedio >= 80.1 && promedio <= 100) {
            // System.out.println("Promedio es: "+promedio);
            System.out.println("INVIABLE SANITARIAMENTE");
        } else if (promedio >= 35.1 && promedio <= 80) {
            System.out.println("ALTO");
        } else if (promedio >= 14.1 && promedio <= 35) {
            System.out.println("MEDIO");
        } else if (promedio >= 5.1 && promedio <= 14) {
            System.out.println("BAJO");
        } else if (promedio >= 0 && promedio <= 5) {
            System.out.println("SIN RIESGO");
            System.out.println(" Continuar el control y la vigilancia");
        }

        // Calcular el Número Menor
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < arreglo.length; i++) {
            menor = Double.min(menor, arreglo[i]);
        }
        
        System.out.println(String.format("%.2f", PersonaP));
        System.out.println(String.format("%.2f", menor));
    
        sc.close();

    }

}
