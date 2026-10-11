package REPOSITORIOGAUSSJORDAN;

public class Main {
    public static void main(String[] args) {
        // Obtener los datos del módulo de definición
        double[][] matriz = DefMatriz.obtener();

        System.out.print("Matriz original:");
        DefMatriz.imprimirMatriz();

        // Resolver usando el módulo de Gauss-Jordan (incluye el Paso 2 internamente)
        GaussJordan.resolver(matriz);

        System.out.print("Matriz Identidad Reducida:");
        DefMatriz.imprimirMatriz();

        // Mostrar los datos utilizando el Paso 3 (Lectura directa)
        DefMatriz.imprimirResultado();
    }
}
