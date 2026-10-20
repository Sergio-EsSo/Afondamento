package Biblioteca;

public class SumaRestaArrays {

    public static void main(String[] args) {

        System.out.println("Introduce una matriz (es 2x2): ");
        int[][] array1 = basicas.fillFromKeyboard(2,2);
        basicas.print2DArray(array1);
        System.out.println("Introduce OTRA matriz (es 2x2): ");
        int[][] array2 = basicas.fillFromKeyboard(2, 2);
        basicas.print2DArray(array2);
        
        System.out.print("\n---\n");
        System.out.println("SUMA DE AMBAS: ");
        basicas.sumaArrays(array1, array2);
        System.out.println("\n---\n");
        System.out.println("RESTA DE AMABS: ");
        basicas.restaArrays(array1, array2);
    }
}