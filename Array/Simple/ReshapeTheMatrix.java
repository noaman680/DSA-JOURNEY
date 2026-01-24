import java.util.*;
public class ReshapeTheMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of same row and col : ");
        int input = sc.nextInt();
        int arr[][] = new int[input][input];
        System.out.print("Enter Matrix : ");
        for(int i=0;i<input;i++){
            for(int j=0;j<input;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Row U want to change : ");
        int r = sc.nextInt();
        System.out.print("Enter Col U want to change : ");
        int col = sc.nextInt();
        int[][] result = matrixReshape(arr, r, col);

        System.out.println("Reshaped matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
    public static int[][] matrixReshape(int[][] mat, int r, int c){
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c){
            return mat;
        }
        int[][] res = new int[r][c];

        int row = 0;
        int col = 0;

        for(int i=row;i<row;row++){
            for(int j=0;j<col;col++){
                res[row][col] = mat[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }
            }
        }
        return res;


        /*Optimised 

        for(int i=0;i<m * n;i++){
            res[i/c][i%c] = mat[i/n][i%n];
        }
            
         */
    }
    
}