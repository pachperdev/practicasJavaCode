import java.util.Scanner;

public class s3ej1 {
    public static void main(String[] args) throws Exception {
        Scanner Leer = new Scanner(System.in);

        String listaCodigo[];
        int [][] tablaCantidadBodega = new int[100][100];
        int [][] tablaCantidadMinima = new int[100][100];

        //354 256 127
        System.out.println("digite los codigos separados por espacios");
        String linea = Leer.nextLine();
        listaCodigo = linea.split(" ");

        int productos = listaCodigo.length;
        System.out.println("el tamaño de los productos es: " + productos);

        //25 30 8 10;21 67 84 21;46 36 96 25;1 22 33 44
        //25 30 8 10
        //21 67 84 21
        //46 36 96 25
        //1 22 33 44
        //matriz 3x4 
        System.out.println("digite la tabla de las cantidades en bodega separando las filas por punto y coma y las cantidades por espacio: ");

        linea = Leer.nextLine();
        String[] filas = linea.split(";");
        // filas = ["25 30 8 10";"21 67 84 21";"46 36 96 25";"1 22 33 44"]

        int sedes = filas.length;

        for (int i = 0; i < sedes; i++) {
            String[] cantidades = filas[i].split(" ");
            //cantidades = ["25", "30", "8", "10"]
            for (int j = 0; j < productos; j++) {
                String num = cantidades[j];
                tablaCantidadBodega[i][j] = Integer.parseInt(num);
            }
        }
        //digitar la cantidad minima

        System.out.println("digite la tabla de las cantidades minimas requeridas separando las filas por punto y coma y las cantidades por espacio: ");
        linea = Leer.nextLine();
        filas = linea.split(";");
        for (int i = 0; i < sedes; i++) {
            String[] cantidades = filas[i].split(" ");
            for (int j = 0; j < productos; j++) {
                String num = cantidades[j];
                tablaCantidadMinima[i][j] = Integer.parseInt(num);
            }
        }

        for (int i = 0; i < sedes; i++) {
            for (int j = 0; j < productos; j++) {
                if (tablaCantidadBodega[i][j] < tablaCantidadMinima[i][j]) {
                    System.out.println("se debe solicitar producto " + listaCodigo[j] + " en sede " + i);
                }
            }
        }

        double prom;
        for (int i = 0; i < productos; i++) {
            prom = 0;
            for (int j = 0; j < sedes; j++) {
                prom += tablaCantidadBodega[i][j];
            }
            prom = prom / sedes;
            System.out.println("El promedio de productos del codigo " + listaCodigo[i] + " es " + prom);
        }

        Leer.close();
    }
}
