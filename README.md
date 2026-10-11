
Estructura Modular del Proyecto

El programa se divide en cuatro módulos independientes estructurados bajo el principio de responsabilidad única:
• Gauss.java: Contiene la lógica matemática para la eliminación hacia adelante. Su único objetivo es transformar la matriz original en una matriz triangular superior.
• GaussJordan.java: Coordina el proceso de resolución. Aplica la triangulación de Gauss y ejecuta el Paso 2 (recorrido inverso hacia arriba) para normalizar las diagonales a 1 y realizar el barrido de coeficientes superiores.
• DefMatriz.java: Almacena los datos del sistema de ecuaciones (matriz aumentada). Implementa las funciones de visualización y el Paso 3 (lectura y despliegue directo de los resultados de la última columna).
• Main.java: Es el punto de entrada de la aplicación. Orquesta el flujo completo llamando a los métodos de cada módulo en el orden correcto.


Pasos para Compilar y Ejecutar el Programa

1. Guardar los archivos: Asegúrate de crear una carpeta y guardar los cuatro bloques de código del mensaje anterior en archivos de texto con sus nombres exactos: Gauss.java, GaussJordan.java, DefMatriz.java y Main.java.
2. Abrir la terminal: Navega mediante la consola hasta la carpeta exacta donde guardaste estos archivos.
3. Compilar el proyecto: Ejecuta el siguiente comando para compilar todos los archivos .java al mismo tiempo:
bash
javac Gauss.java GaussJordan.java DefMatriz.java Main.java
   
5. Ejecutar el programa: Corre la clase principal usando el comando:
bash
java Main


Ejemplo de Prueba y Salida por Consola

Al ejecutar el programa con los datos predefinidos en el módulo DefMatriz, la salida exacta en formato de texto plano es la siguiente:
text
Matriz original:

|   3.00  -0.10  -0.20 |   7.85 |
|   0.10   7.00  -0.30 | -19.30 |
|   0.30  -0.20  10.00 |  71.40 |

Matriz Identidad Reducida:

|   1.00   0.00   0.00 |   3.00 |
|   0.00   1.00   0.00 |  -2.50 |
|   0.00   0.00   1.00 |   7.00 |

Solución directa:  x1 = 3.00  x2 = -2.50  x3 = 7.00 
   
