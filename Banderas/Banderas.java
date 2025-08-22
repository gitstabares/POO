import java.awt.Color;

public class Banderas
{
    static int COLOR_YELLOW = new Color(255,201,47).getRGB();
    static int COLOR_BLUE = new Color(0,33,123).getRGB();
    static int COLOR_RED = new Color(237,23,18).getRGB();
    static int COLOR_WHITE = new Color(255,255,255).getRGB();

    public static void main(String[] args) {
        int scale = 2;
        JOptionPaneArrays.showColorArray2D(null,banderaCOL(12*scale,28*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaVEN(12*scale,28*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaPOL(12*scale,28*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaPAN(12*scale,28*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaCHL(12*scale,28*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaUSA(12*scale,28*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaCZE(12*scale,28*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaCZE(12*scale,28*scale));
    }
    public static int[][] banderaCOL(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<matrix.length*3/4; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        for (int i=0; i<matrix.length/2; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_YELLOW;
            }
        }
        return matrix;
    }
    public static int[][] banderaVEN(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<matrix.length*2/3; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        for (int i=0; i<matrix.length*1/3; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_YELLOW;
            }
        }
        return matrix;
    }
    public static int[][] banderaPOL(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<matrix.length/2; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        return matrix;
    }
    public static int[][] banderaPAN(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=0; i<matrix.length/2; i++)
        {
            for (int j=matrix[i].length/2; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=matrix.length/2; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length/2; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        return matrix;
    }
    public static int[][] banderaCHL(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<matrix.length/2; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=0; i<matrix.length/2; i++)
        {
            for (int j=0; j<matrix.length/2; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        return matrix;
    }
    public static int[][] banderaUSA(int filas, int columnas)
    {
        int grosorFranja = filas/12;
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<matrix.length; i++)
        {
            if ((i/grosorFranja)%2==0)
            {
                for (int j=0; j<matrix[i].length; j++)
                {
                    matrix[i][j] = COLOR_RED;
                }    
            }
            else
            {
                for (int j=0; j<matrix[i].length; j++)
                {
                    matrix[i][j] = COLOR_WHITE;
                }
            }
        }
        for (int i=0; i<matrix.length/2; i++)
        {
            for (int j=0; j<matrix.length/2; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        return matrix;
    }
    public static int[][] banderaCZE(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<matrix.length/2; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                if ((j<-i+filas)&&(j<=i))
                matrix[i][j] = COLOR_BLUE;
            }
        }
        return matrix;
    }
    public static int[][]
}