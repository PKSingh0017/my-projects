import java.io.*; 
  
class MulMatrices { 
      
  
    static int N = 4; 
     
    static void multiply(int mat1[][], int mat2[][], int res[][]) 
    { 
        int i, j, k; 
        for (i = 0; i < N; i++) 
        { 
            for (j = 0; j < N; j++) 
            { 
                res[i][j] = 0; 
                for (k = 0; k < N; k++) 
                    res[i][j] += mat1[i][k] * mat2[k][j]; 
            } 
        } 
    } 
  
    public static void main (String[] args)  
    { 
        int mat1[][] = { {1, -2, 4, 9}, 
                         {5, 7, 0, 4}, 
                         {-2, 3, 1, 7}, 
                         {4, 0, 7, -6}}; 
  
        int mat2[][] = { {1, 21, 2, 7}, 
                         {2, 8, 3, 9}, 
                         {5, 9, 4, 0}, 
                         {9, 0, 5, -8}}; 
   
        int res[][] = new int[N][N] ; 
        int i, j; 
        multiply(mat1, mat2, res); 
      
        System.out.println("Result matrix" + " is "); 
        for (i = 0; i < N; i++) 
        { 
            for (j = 0; j < N; j++) 
                System.out.print( res[i][j] + "		"); 
            System.out.println(); 
        } 
    } 
} 
