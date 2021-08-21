import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String listaCodigo[];

        System.out.println("ingrese el tamaño del vector");
        int tamVec = leer.nextInt(); 

        System.out.println("digite los codigos separados por espacios");
        String linea = leer.nextLine();
        listaCodigo = linea.split(" ");

        tamVec = listaCodigo.length;
        System.out.println("el tamaño de los tamVec es: " + tamVec);
        

        leer.close();
    }
}
