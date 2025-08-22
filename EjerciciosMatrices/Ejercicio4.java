package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] m = new int[4][4];
        int opcion;
        float resultado = 0;
        Scanner input = new Scanner(System.in);   
        System.out.println("Por favor rellene la matriz 4x4: ");
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {
                m[i][j] = input.nextInt();
            }
        }
        System.out.println("Que desea realizar:\n1.Sumar una fila\n2.Sumar una columna\n3.Sumar la diagonal principal\n4.Sumar la diagonal inversa\n5.Promediar los valores de la matriz");
        opcion = input.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Que fila desea sumar?");
                opcion = input.nextInt();
                if (!((opcion > 0)&&(opcion <= 4))) System.out.println("Opción no válida");
                else
                    for (int i=0; i<4; i++){
                        resultado+=m[opcion-1][i];
                    }
                break;
            
            case 2:
                System.out.println("Que columna desea sumar?");
                opcion = input.nextInt();
                if (!((opcion > 0)&&(opcion <= 4))) System.out.println("Opción no válida");
                else
                    for (int i=0; i<4; i++){
                        resultado+=m[i][opcion-1];
                    }
                break;
            
            case 3:
                for (int i=0; i<4; i++){ 
                    resultado+=m[i][i];
                }
                break;
            
            case 4:
                for (int i=0; i<4; i++){
                    resultado+=m[i][3-i];
                }
                break;

            case 5:
                for (int i=0; i<4; i++){
                    for (int j=0; j<4; j++){
                        resultado+=m[i][j];
                    }
                }
                resultado/=16;
                break;
            
            default:
                System.out.println("Opción no válida");
                break;
        }
        input.close();
        System.out.println("El resultado es: " + resultado);
    }
}
