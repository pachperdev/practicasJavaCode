import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        String listaCodigo[];

        System.out.println("digite tamaño del vector: ");
        int tamVector = leer.nextInt();

        System.out.println("digite los codigos separados por espacios: ");
        String linea = leer.nextLine();
        listaCodigo = linea.split(" ");

        int productos = listaCodigo.length;
        System.out.println("el tamaño de los productos es: " + productos);

        leer.close();

    }
}
