package Biblioteca;

//import Biblioteca.basicas.*;

public class testBasicas {

    public static void main(String[] args) {
        
        System.out.println("Matriz cuadrada:");
        basicas.print2DArray(basicas.fillFromKeyboard(2,2));
        System.out.println();

        System.out.println("Matriz no simétrica:");
        int[][] mat = basicas.fillFromKeyboard(3, 1);
        basicas.print2DArray(mat);
        System.out.println();

        System.out.println("Matriz no simétrica TRASPUESTA:");
        basicas.print2DArray(basicas.trasponer(mat));
        System.out.println();

        System.out.println("Matriz simétrica?");
        System.out.println(basicas.esSimetrica(basicas.fillFromKeyboard(2, 2)));
    }
}