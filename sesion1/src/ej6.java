import java.util.Scanner;

public class ej6 {
    
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int cantidadTipoProductos;
        int cantidadDelProducto;
        float valorProducto;
        float totalFactura = 0f;
        int cont = 1;

        System.out.println("Ingrese la cantidad de tipo de producto");
        cantidadTipoProductos = Leer.nextInt();

        for (int i = 1; i <= cantidadTipoProductos; i++) {
            System.out.println("ingrese la cantidad del producto " + cont + ":");
            cantidadDelProducto = Leer.nextInt();

            System.out.println("ingrese el valor del producto " + cont + ":");
            valorProducto = Leer.nextInt();

            totalFactura = totalFactura + (cantidadDelProducto * valorProducto);
            cont = cont + 1;
        }

        System.out.println("el total de la factura es: " + totalFactura);
        System.out.println("gracias por su compra :) ");

        Leer.close();
    }
}
