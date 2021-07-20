import java.util.Scanner;

public class ej4 {
    
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int cantidadBodega;
        int cantidadMinimaRequerida;
        int unidadesFaltaVender;
        int cantidadCompraDeseada;
        int valorCompra;
        int valorCaja;

        System.out.println("ingrese la cantidad de productos en bodega");
        cantidadBodega = Leer.nextInt();

        System.out.println("ingrese la cantidad minima requerida");
        cantidadMinimaRequerida = Leer.nextInt();

        unidadesFaltaVender = cantidadBodega - cantidadMinimaRequerida; 

        if (cantidadBodega > cantidadMinimaRequerida){
            System.out.println("no es necesario realizar el pedido al proveedor");
            System.out.println("Unidades que hacen falta vender: " + unidadesFaltaVender);

            if (unidadesFaltaVender < 10){
                System.out.println("Alerta generada");
            }
        }
        else if (cantidadBodega < cantidadMinimaRequerida){
            System.out.println("si es necesario realizar el pedido al proveedor");
            System.out.println("ingrese la cantidad de compra deseada: ");
            cantidadCompraDeseada = Leer.nextInt();
            System.out.println("ingrese el valor de la compra: ");
            valorCompra = Leer.nextInt();
            System.out.println("ingrese el valor en caja: ");
            valorCaja = Leer.nextInt();

            if ( (cantidadCompraDeseada * valorCompra) < valorCaja ){
                System.out.println("Si es posible realizar el pedido");
            }
            else {
                System.out.println("No es posible realizar el pedido");
            }
        }
        
        Leer.close();
    }
}
