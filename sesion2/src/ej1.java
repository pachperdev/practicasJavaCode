import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) throws Exception {
        Scanner Leer = new Scanner(System.in);

        System.out.println("digite el numero de prodcutos: ");
        int numeroDeProductos = Leer.nextInt();

        int[] listaCodigo = new int[numeroDeProductos];
        int[] listaCantidadBodega = new int[numeroDeProductos];
        int[] listaCantidadMinima = new int[numeroDeProductos];

        for (int i = 0; i < numeroDeProductos; i++) {
            System.out.println("introduzca el codigo del producto " + (i+1)+ ":");
            listaCodigo[i] = Leer.nextInt();

            System.out.println("introduzca la cantidad en bodega del codigo: " + listaCodigo[i]);
            listaCantidadBodega[i] = Leer.nextInt();

            System.out.println("introduzca la cantidad minima requerida del codigo: " + listaCodigo[i]);
            listaCantidadMinima[i] = Leer.nextInt();
        }

        int may=-1, cmay=0, men=1000000, cmen=0;
        System.out.println("codigos de productos que se necesitan pedir:");

        for (int i = 0; i < numeroDeProductos; i++) {
            if (listaCantidadBodega[i] < listaCantidadMinima[i]) {
                System.out.println("debe pedir al provedor productos del codigo: " + listaCodigo[i]);
            }
            if (listaCantidadBodega[i] < men) {
                men = listaCantidadBodega[i];
                cmen = listaCodigo[i];
            }
            if (listaCantidadBodega[i] > may) {
                may = listaCantidadBodega[i];
                cmay = listaCodigo[i];
            }
        }

        System.out.println("el codigo con el mayor valor es: " + cmay);
        System.out.println("el codigo con el menor valor es: " + cmen);

        Leer.close();
    }
}
