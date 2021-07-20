import java.util.Scanner;

public class ej {
    
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        System.out.println("Digite la cantidad de referencias a comprar");
        int cantidadReferencias = Leer.nextInt();

        int cantidadProducto;
        int valorProducto;
        float totalFactura = 0f;

        for (int i = 1; i <= cantidadReferencias; i++){
            System.out.println("Digite la cantidad de productos");
            cantidadProducto = Leer.nextInt();

            System.out.println("digite el valor");
            valorProducto = Leer.nextInt();

            totalFactura += valorProducto * cantidadProducto;
        }

        System.out.println("el valor total de la factura es: " + totalFactura);

        Leer.close();
    }
}