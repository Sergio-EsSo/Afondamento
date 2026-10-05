package Biblioteca;

public class basicas {

    public static int[][] fillFromKeyboard(int rows, int cols){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] array = new int[rows][cols];

        System.out.println("Añade "+(rows*cols)+" números");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("· Elemento ["+i+"]["+j+"]: ");
                array[i][j] = sc.nextInt();
            }
        }    
        //sc.close();
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

    public static int[][] trasponer(int[][] array){
        int rows = array.length;
        int cols = array[0].length;
        int[][] traspuesta = new int[cols][rows];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                traspuesta[j][i] = array[i][j];
            }
        }
        return traspuesta;
    }

    public static boolean esCuadrada(int[][] array){
        boolean cuad = false;
        int rows = array.length;
        int cols = array[0].length;
        if(rows==cols){
            cuad = true;
        }
        return cuad;
    }

    public static boolean esSimetrica(int[][] array){

        int rows = array.length;
        int cols = array[0].length;
        int[][] traspuesta = trasponer(array);

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(array[i][j]!=traspuesta[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean esDiagonal(int[][] array){

        int rows = array.length;
        int cols = array[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i!=j && array[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int traza(int[][] array){

        int rows = array.length;
        int cols = array[0].length;
        int tr = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==j){
                    tr += array[i][j];
                }
            }
        }
        return tr;
    }
}