import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        System.out.println("ingrese la cantidad de productos en bodega");
        int cantidadBodega = Leer.nextInt();

        System.out.println("ingrese la cantidad minima requerida");
        int cantidadMinimaRequerida = Leer.nextInt();

        if (cantidadBodega > cantidadMinimaRequerida){
            System.out.println("no es necesario realizar el pedido al proveedor");
        }else if (cantidadBodega < cantidadMinimaRequerida){
            System.out.println("si es necesario realizar el pedido al proveedor");
        }

        Leer.close();
    }
}
