package EjerciciosMatrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("De cuantas columnas desea la matriz?");
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int n = input.nextInt();
        input.close();
        int[][] matrix = new int[5][n];
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = r.nextInt(0,11);
            }
        }
    }
}