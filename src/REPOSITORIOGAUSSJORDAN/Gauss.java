package REPOSITORIOGAUSSJORDAN;

public class Gauss {
    /**
     * Realiza la triangulación de la matriz usando Eliminación Gaussiana simple.
     * @param matriz Matriz aumentada [A | b] que será modificada directamente en memoria.
     */
    public static void eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length; // Número de filas (tamaño del sistema)

        // CICLO 1: Selecciona el renglón pivote actual (diagonal principal)
        for (int i = 0; i < n; i++) {
            // CICLO 2: Recorre todos los renglones que están ABAJO del pivote
            for (int j = i + 1; j < n; j++) {
                // Calcula el factor multiplicador para anular el coeficiente actual
                double factor = matriz[j][i] / matriz[i][i];

                // CICLO 3: Aplica la operación: R_j = R_j - (factor * R_i) por cada columna
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }

}
