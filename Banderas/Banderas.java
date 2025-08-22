import java.awt.Color;

public class Banderas
{
    static int COLOR_YELLOW = new Color(253,209,23).getRGB();
    static int COLOR_BLUE = new Color(26,31,137).getRGB();
    static int COLOR_RED = new Color(230,0,19).getRGB();
    static int COLOR_GREEN = new Color(0,152,66).getRGB();
    static int COLOR_BLACK = new Color(0,0,0).getRGB();
    static int COLOR_WHITE = new Color(255,255,255).getRGB();

    public static void main(String[] args) {
        int scale = 1;
        JOptionPaneArrays.showColorArray2D(null,banderaCOL(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaVEN(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaPOL(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaPAN(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaCHL(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaUSA(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaCZE(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaDNK(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaFIN(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaNOR(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaKWT(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaZAF(12*scale,20*scale));
        JOptionPaneArrays.showColorArray2D(null,banderaCHE(12*scale,20*scale));
    }
    public static int[][] banderaCOL(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<filas*3/4; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        for (int i=0; i<filas/2; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_YELLOW;
            }
        }
        return matrix;
    }
    public static int[][] banderaVEN(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<filas*2/3; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        for (int i=0; i<filas*1/3; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_YELLOW;
            }
        }
        return matrix;
    }
    public static int[][] banderaPOL(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<filas/2; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        return matrix;
    }
    public static int[][] banderaPAN(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=0; i<filas/2; i++)
        {
            for (int j=columnas/2; j<columnas; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=filas/2; i<filas; i++)
        {
            for (int j=0; j<columnas/2; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        return matrix;
    }
    public static int[][] banderaCHL(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<filas/2; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=0; i<filas/2; i++)
        {
            for (int j=0; j<filas/2; j++)
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
        for (int i=0; i<filas; i++)
        {
            if ((i/grosorFranja)%2==0)
            {
                for (int j=0; j<columnas; j++)
                {
                    matrix[i][j] = COLOR_RED;
                }    
            }
            else
            {
                for (int j=0; j<columnas; j++)
                {
                    matrix[i][j] = COLOR_WHITE;
                }
            }
        }
        for (int i=0; i<filas/2; i++)
        {
            for (int j=0; j<filas/2; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        return matrix;
    }
    public static int[][] banderaCZE(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<filas/2; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                if ((j<-i+filas)&&(j<=i))
                matrix[i][j] = COLOR_BLUE;
            }
        }
        return matrix;
    }
    public static int[][] banderaDNK(int filas, int columnas)
    {
        int grosorCruz = filas/12;
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=filas/2-grosorCruz; i<filas/2+grosorCruz; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=0; i<filas; i++)
        {
            for (int j=filas/2-grosorCruz; j<filas/2+grosorCruz; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        return matrix;
    }
    public static int[][] banderaFIN(int filas, int columnas)
    {
        int grosorCruz = filas/12;
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=filas/2-grosorCruz*2; i<filas/2+grosorCruz*2; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        for (int i=0; i<filas; i++)
        {
            for (int j=filas/2-grosorCruz*2; j<filas/2+grosorCruz*2; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        return matrix;
    }
    public static int[][] banderaNOR(int filas, int columnas)
    {
        int grosorCruz = filas/12;
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=filas/2-grosorCruz*2; i<filas/2+grosorCruz*2; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=0; i<filas; i++)
        {
            for (int j=filas/2-grosorCruz*2; j<filas/2+grosorCruz*2; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=filas/2-grosorCruz; i<filas/2+grosorCruz; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        for (int i=0; i<filas; i++)
        {
            for (int j=filas/2-grosorCruz; j<filas/2+grosorCruz; j++)
            {

                matrix[i][j] = COLOR_BLUE;
            }
        }
        return matrix;
    }
    public static int[][] banderaKWT(int filas, int columnas)
    {
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<filas*2/3; i++)
        {
            for (int j=0; j<matrix[i].
            
            length; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=0; i<filas*1/3; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_GREEN;
            }
        }
        for (int i=0; i<filas; i++)
        {

            for (int j=0; j<=filas/3; j++)
            {
                if ((j<-i+filas)&&(j<=i))
                matrix[i][j] = COLOR_BLACK;
            }
        }
        return matrix;
    }
    public static int[][] banderaZAF(int filas, int columnas)
    {
        int grosorCruz = filas/12;
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_BLUE;
            }
        }
        for (int i=0; i<filas*2/3; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=0; i<filas*1/3; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                if ((j<-i+filas+grosorCruz)&&(j<=i+grosorCruz))
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=filas/2-grosorCruz; i<filas/2+grosorCruz; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_GREEN;
            }
        }
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                if ((j<-i+filas)&&(j<=i))
                matrix[i][j] = COLOR_GREEN;
            }
        }
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                if ((j<-i+filas-2*grosorCruz)&&(j<=i-2*grosorCruz))
                matrix[i][j] = COLOR_YELLOW;
            }
        }
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                if ((j<-i+filas-3*grosorCruz)&&(j<=i-3*grosorCruz))
                matrix[i][j] = COLOR_BLACK;
            }
        }
        return matrix;
    }
    public static int[][] banderaCHE(int filas, int columnas)
    {
        int grosorCruz = filas/6;
        int[][] matrix = new int[filas][columnas];
        for (int i=0; i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                matrix[i][j] = COLOR_RED;
            }
        }
        for (int i=filas/2-grosorCruz; i<filas/2+grosorCruz; i++)
        {
            for (int j=columnas/2-2*grosorCruz; j<columnas/2+2*grosorCruz; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        for (int i=filas/2-2*grosorCruz; i<filas/2+2*grosorCruz; i++)
        {
            for (int j=columnas/2-grosorCruz; j<columnas/2+grosorCruz; j++)
            {
                matrix[i][j] = COLOR_WHITE;
            }
        }
        return matrix;
    }
}