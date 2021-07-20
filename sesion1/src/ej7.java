import java.util.Scanner;

public class ej7 {
    
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int cantidadTipoProductos;
        int cantidadDelProducto;
        float valorProducto;
        float totalFactura = 0f;
        int numeroDeClientes;
        int  contProductos = 1;
        int contClientes  = 1;

        System.out.println("ingrese el numero de clientes: ");
        numeroDeClientes = Leer.nextInt();

        for (int i = 1; i <= numeroDeClientes; i++) {
        
            System.out.println("Cliente " + contClientes + ":");
            System.out.println("ingrese la cantidad de tipo de producto");
            cantidadTipoProductos = Leer.nextInt();

            for (int j = 1; j <= cantidadTipoProductos; j++) {

                System.out.println("ingrese la cantidad del producto " +  contProductos + ":");
                cantidadDelProducto = Leer.nextInt();

                System.out.println("ingrese el valor del producto " +  contProductos + ":");
                valorProducto = Leer.nextInt();

                totalFactura = totalFactura + (cantidadDelProducto * valorProducto);
                contProductos =  contProductos + 1;

                if (cantidadTipoProductos == contProductos) {
                    contProductos = 1;
                }
            }
            
            contClientes = contClientes +1;
        }

        System.out.println("el total de la factura es: " + totalFactura);
        System.out.println("gracias por su compra :) ");

        Leer.close();
    }
}
