import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        int cantidadBodega;
        int cantidadMinimaRequerida;
        int unidadesFaltaVender;

        System.out.println("ingrese la cantidad de productos en bodega");
        cantidadBodega = Leer.nextInt();

        System.out.println("ingrese la cantidad minima requerida");
        cantidadMinimaRequerida = Leer.nextInt();

        unidadesFaltaVender = cantidadBodega - cantidadMinimaRequerida;

        if (cantidadBodega > cantidadMinimaRequerida){
            System.out.println("no es necesario realizar el pedido al proveedor");
        }
        else if (cantidadBodega < cantidadMinimaRequerida){
            System.out.println("si es necesario realizar el pedido al proveedor");
        }

        System.out.println("Unidades que hacen falta vender: " + unidadesFaltaVender);

        if (unidadesFaltaVender < 10){
            System.out.println("Alerta generada");
        }

        Leer.close();
    }
}
