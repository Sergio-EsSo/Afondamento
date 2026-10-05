package Biblioteca;

public class pedirMostrarArray {

    public static int[][] matriz(int rows, int cols){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] array = new int[rows][cols];

        System.out.println("Añade "+(rows*cols)+" números");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("· Elemento ["+i+"]["+j+"]: ");
                array[i][j] = sc.nextInt();
            }
        }    
        sc.close();
        return array;
    }

    public static void print2DArray(int[][] array){
        for(int[] row : array){
            System.out.print("| ");
            for(int elem : row){
                System.out.print(elem+" ");
            }
        System.out.println("|");
        }
    }

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i=0, j=0;
        System.out.println("\nDame el número de filas que vaya a tener tu matriz:");
        i = sc.nextInt();
        System.out.println("\nDame el número de columnas que vaya a tener tu matriz:");
        j = sc.nextInt();

        System.out.println();
        System.out.println("--------");
        System.out.println();
        int[][] mat = matriz(i,j);

        System.out.println();
        System.out.println("--------\n");
        System.out.println("Matriz:\n");
        print2DArray(mat);
        System.out.println();

        sc.close();
    }
}