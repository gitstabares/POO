package EjerciciosMatrices;

import java.util.Random;
public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] matrix = Ejercicio5.RandomMatrix();
        int suma = 0, randomEleccion, randomArray;
        Random r = new Random();
        randomEleccion = r.nextInt(2);
        randomArray = r.nextInt(3);
        for (int i=0; i<3; i++)
        {
            if (randomEleccion == 0) suma+=matrix[randomArray][i];
            else suma+=matrix[i][randomArray];
        }
    }
}
