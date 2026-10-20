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

    public static int[][] sumaArrays(int[][] arr1, int[][] arr2){
        
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;

        int[][] total;

        if(r1==r2 && c1==c2){
            total = new int[r1][c1];

            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    total[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }
        else{
            throw new IllegalArgumentException("Las matrices no son del mismo tamaño");
        }
        return total;
    }

    public static int[][] restaArrays(int[][] arr1, int[][] arr2){
        
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;

        int[][] total;

        if(r1==r2 && c1==c2){
            total = new int[r1][c1];

            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    total[i][j] = arr1[i][j] - arr2[i][j];
                }
            }
        }
        else{
            throw new IllegalArgumentException("Las matrices no son del mismo tamaño");
        }
        return total;
    }
}