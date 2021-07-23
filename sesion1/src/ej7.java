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
        float totalVendido = 0f;
        int contClientesFactura;

        System.out.println("ingrese el numero de clientes: ");
        numeroDeClientes = Leer.nextInt();

        for (int i = 1; i <= numeroDeClientes; i++) {
            System.out.println("cliente " + contClientes + ":");
            contClientes = contClientes + 1;

            System.out.println("ingrese la cantidad de tipo de productos: ");
            cantidadTipoProductos = Leer.nextInt();

            for (int j = 1; j <= cantidadTipoProductos; j++) {
                System.out.println("ingrese la cantidad del producto " + contProductos + ":");
                cantidadDelProducto = Leer.nextInt();

                System.out.println("ingrese el valor del producto " + contProductos + ":");
                valorProducto = Leer.nextFloat();
                contProductos = contProductos + 1; 

                if (contProductos > cantidadTipoProductos) {
                    contProductos = 1;
                }
                totalFactura = totalFactura + (cantidadDelProducto * valorProducto);
                totalVendido = totalVendido + (cantidadDelProducto * valorProducto);
            }
            contClientesFactura = contClientes - 1;  
            System.out.println("total factura cliente " + contClientesFactura + " es: " + totalFactura);
            System.out.println("");
            totalFactura = 0f;
        }

        System.out.println("el total vendido es: " + totalVendido);
        System.out.println("gracias por su compra :) ");

        Leer.close();
    }
}
