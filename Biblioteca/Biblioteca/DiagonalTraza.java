package Biblioteca;

public class DiagonalTraza {

    public static void main(String[] args) {
        
        System.out.println("Introduce una matriz 3x3");
        int[][] array = basicas.fillFromKeyboard(3,3);
        basicas.print2DArray(array);
        System.out.print("\n---\n");
        System.out.println("Es diagonal? "+basicas.esDiagonal(array)+"\n");
        System.out.println("Traza: "+basicas.traza(array));
    }
}