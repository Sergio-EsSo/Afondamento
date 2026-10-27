package Biblioteca;

public class ProductoArray {
 
    public static void main(String[] args) {
        
        System.out.println("Introduce una matriz (es 2x3): ");
        int[][] array1 = basicas.fillFromKeyboard(2,3);
        basicas.print2DArray(array1);
        System.out.println("Introduce OTRA matriz (es 3x2): ");
        int[][] array2 = basicas.fillFromKeyboard(3, 2);
        basicas.print2DArray(array2);
        
        System.out.print("\n---\n");
        System.out.println("PRODUCTO DE AMBAS:");
        basicas.print2DArray(complejas.productoArrays(array1, array2));

        System.out.println("------");

        System.out.println("Introduce una matriz (es 2x1): ");
        int[][] array3 = basicas.fillFromKeyboard(2, 1);
        basicas.print2DArray(array3);

        System.out.print("\n---\n");
        System.out.println("PRODUCTO DE TRES:");
        basicas.print2DArray(complejas.productoTriple(array1, array2, array3));
    }
}