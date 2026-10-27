package Biblioteca;

public class complejas {
    
    public static int[][] productoArrays(int[][] arr1, int[][] arr2){
        
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;

        int[][] total;

        if(c1==r2){ //columnas1 tiene que ser igual a filas2
            total = new int[r1][c2]; //la nueva matriz es de este tamaño

            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    for(int k=0; k<c1; k++){
                        total[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        }
        else{
            throw new IllegalArgumentException("Las matrices NO SON COMPATIBLES");
        }
        return total;
    }

    public static int[][] productoTriple(int[][] arr1, int[][] arr2, int[][] arr3){

        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;
        int r3 = arr3.length;
        int c3 = arr3[0].length; //no se usa, pero la matriz final es [r1][c3]

        int[][] subtotal;

        // se cumple la propiedad asociativa:
        if(c1==r2){ // (AxB)xC
            subtotal = productoArrays(arr1, arr2);

            return productoArrays(subtotal, arr3);
        }
        if(c2==r3){ // Ax(BxC)
            subtotal = productoArrays(arr2, arr3);

            return productoArrays(arr1, subtotal);
        }
        else{
            throw new IllegalArgumentException("Las matrices NO SON COMPATIBLES");
        }
    }
}