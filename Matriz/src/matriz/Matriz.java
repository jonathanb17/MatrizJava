

package matriz;

import java.util.Scanner;

public class Matriz {

   
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,ncol;
        System.out.println("Ingrse el numero de filas que qres que tenga la matriz");
        nFilas= entrada.nextInt();
        System.out.println("Ingrse el numero de columnas que qres que tenga la matriz");
        ncol= entrada.nextInt();
        
        matriz= new int[ncol][ncol];// definimos la matriz
        
        
        // rellenamos la matriz
        
        for (int i = 0; i <nFilas; i++) {
            for (int j = 0; j <ncol; j++) {
                System.out.print("matriz["+i+"]["+j+"]:");
                matriz[i][j]=entrada.nextInt(); // los valores se va guardando en la matriz
            }
        }
        
        
        //Mostramos la matriz
        
        System.out.println("\n la matriz es:");
            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < ncol; j++) {
                    System.out.print(matriz[i][j]);// se muestra la matriz de acuerdo al tamaño establecido
                }
                System.out.println("");
        }
        
            
            
            //SUMAR LAS FILAS DE LA MATRIZ
            
              for (int i =0; i <nFilas; i++) {
                int sumaFila=0; // acumulara la suma de cada fila
                                // cada ves que el bucle termine la suma de fila sea igual a cero
                                //,para que me sume la siguiente fila 
                    for (int j = 0; j <ncol; j++) {
                        sumaFila+=matriz[i][j];
                    }
                    
                    System.out.print("\n la suma de la fila["+i+"]:"+sumaFila);  // imprime la suma de cada fila 
                                                                                  
                 }
            System.out.println("");
            
            
            
            //Sumar las  columnas DE LA MATRIZ
            
              for (int j =0; j <ncol; j++) {
                int sumaColumna=0; // acumulara la suma de cada columna
                    for (int i = 0; i <nFilas; i++) {
                        sumaColumna+=matriz[i][j];
                    }
                    
                    System.out.print("\n la suma de la columna["+j+"]:"+sumaColumna);  // imrpime la suma 
                                                                                         // por cada iteracion que haga el for
                 }
            System.out.println("");
            
            
            
        
    }
    
}
