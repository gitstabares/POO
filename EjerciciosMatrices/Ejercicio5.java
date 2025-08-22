package EjerciciosMatrices;

import java.util.Random;
public class Ejercicio5 {
    public static int[][] RandomMatrix()
    {
        int number;
        int upperLimit = 10;
        int[][] matrix = new int[3][3];
        int[] seen = new int[upperLimit];
        Random r = new Random();
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                number = r.nextInt(upperLimit)+1; // Random number between 1 and upperLimit
                if (seen[number-1] != 0){
                    j--;
                }
                else{
                    seen[number-1] = number;
                    matrix[i][j] = number;
                }
            }
        }
        return matrix;
    }
}
