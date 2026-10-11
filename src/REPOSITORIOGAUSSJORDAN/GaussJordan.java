package REPOSITORIOGAUSSJORDAN;

public class GaussJordan {
    public static void resolver(double[][] matriz) {
        // 1. Matriz Escalonada Triangular (Hacia adelante)
        escalonarMatriz(matriz);

        // 2. Matriz Identidad Reducida (Hacia atrás / Paso 2)
        reducirMatriz(matriz);
    }

    private static void escalonarMatriz(double[][] matriz) {
        Gauss.eliminacionGaussiana(matriz);
    }

    /**
     * PASO 2: Normalización y barrido superior.
     * Convierte la matriz escalonada en su forma reducida por Gauss-Jordan.
     * Recorre los renglones hacia arriba para convertir cada pivote en 1
     * y anular los coeficientes que están por encima de él.
     */
    private static void reducirMatriz(double[][] matriz) {
        int n = matriz.length; // Obtener el total de filas.

        // Iterar desde el último renglón hasta el primer renglón de la matriz (Hacia arriba)
        for (int i = n - 1; i >= 0; i--) {

            // --- PARTE A: Normalización (Convertir el elemento de la diagonal en 1) ---
            double pivote = matriz[i][i];
            // Dividir toda la fila actual entre el valor del pivote
            for (int k = i; k < matriz[i].length; k++) {
                matriz[i][k] /= pivote;
            }

            // --- PARTE B: Barrido superior (Anular coeficientes superiores) ---
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i]; // Coeficiente arriba del pivote a eliminar

                // FilaSuperior(j) = FilaSuperior(j) - factor * FilaPivote(i)
                for (int k = i; k < matriz[j].length; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }
}
