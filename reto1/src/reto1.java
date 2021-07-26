import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        System.out.println("digite el tamaño del vector: ");
        int tamVector = leer.nextInt();

        int[] irca = new int[tamVector];

        for (int i = 0; i < tamVector; i++) {
            System.out.println("ingrese el porcentaje de la clasificación IRCA: ");
            irca[i] = leer.nextInt();
        }

        leer.close();

    }
}
