package CLASE;
import java.util.Random;

public class Ventas {
    int[][] ventas = new int[5][12];


    public Ventas() {
        Random random = new Random();
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                ventas[i][j] = random.nextInt(10000) + 1; // Ventas entre 1 y 10000
            }
        }
        // Imprimir la matriz de ventas
        System.out.println("Matriz de ventas con numeros aleatorios:");
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
               // System.out.println(""+ventas[i][j]);
                System.out.printf("%8d  ", ventas[i][j]);
            }
            System.out.println();
        }
    }
    public void ImprimirMatriz(){
        ordenarPorColumna(ventas);
        System.out.println("Matriz de ventas odenadas por Columnas:");
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                // System.out.println(""+ventas[i][j]);
                System.out.printf("%8d  ", ventas[i][j]);
            }
            System.out.println();
        }
    }
    public void imprimirfilasIntStream(){
        //imprimir con foreach por filas
        System.out.println("Matriz de ventas impresa por filas con un foreach");
        for (int[] fila : ventas) {
            for (int elemento : fila) {
                //{System.out.printf(" "+element );});
                System.out.printf("--"+elemento);
            }
            System.out.println();
        }
    }

    public static void ordenarPorColumna(int[][] matriz) {
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length - 1; j++) {
                for (int k = j + 1; k < matriz.length; k++) {
                    if (matriz[j][i] > matriz[k][i]) {
                        int temp = matriz[j][i];
                        matriz[j][i] = matriz[k][i];
                        matriz[k][i] = temp;
                    }
                }
            }
        }
    }

    public  void  FitrarElementosdeMatriz(){
        System.out.println("Filtrar los numeros menores o iguales que el primer numero de la matriz");
        //int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// Criterio de filtro
        int valorFiltro = ventas[0][0];

// Recorrido de la matriz con bucles for anidados
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                // Filtrado de elementos por criterio
                if (ventas[i][j] <= valorFiltro ) {
                    // Impresión del elemento que cumple el criterio
                    System.out.println("Elemento encontrado: " + ventas[i][j]);
                }
            }
        }



    }


}










