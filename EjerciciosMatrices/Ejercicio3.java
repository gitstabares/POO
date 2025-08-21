package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Tamaño de las matrices
        int n;
        /* Indices:
         * 0: Número de matriz (A, B, A+B)
         * 1: Fila
         * 2: Columna */
        int[][][] m;
        Scanner input = new Scanner(System.in);
        System.out.println("De cuantas filas y columnas son las matrices?:" );
        n = input.nextInt();
        m = new int[3][n][n];
        // Llenado de las matrices
        for (int i=0; i<2; i++)
        {
            System.out.println("Por favor rellene los valores de la matriz " + (i+1) + ": ");
            for (int j=0; j<n; j++)
            {
                for (int k=0;k<n;k++)
                {
                    m[i][j][k] = input.nextInt();
                }
            }
        }
        // Cierre del scanner
        input.close();
        // Suma de las matrices
        for (int j=0; j<n; j++)
        {
            for (int k=0;k<n;k++)
            {
                m[2][j][k] = m[0][j][k] + m[1][j][k];
            }
        }
        // Display de las matrices
        System.out.println("La matriz original 1 es:");
        for (int j=0; j<n; j++)
        {
            for (int k=0;k<n;k++)
            {
                System.out.print(m[0][j][k] + " ");
            }
            System.out.println();
        }
        System.out.println("La matriz original 2 es:");
        for (int j=0; j<n; j++)
        {
            for (int k=0;k<n;k++)
            {
                System.out.print(m[1][j][k] + " ");
            }
            System.out.println();
        }
        System.out.println("La matriz resultante es:");
        for (int j=0; j<n; j++)
        {
            for (int k=0;k<n;k++)
            {
                System.out.print(m[2][j][k] + " ");
            }
            System.out.println();
        }
    }
}
