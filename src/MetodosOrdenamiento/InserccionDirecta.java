
package MetodosOrdenamiento;

import java.util.ArrayList;
import java.util.Arrays;


public class InserccionDirecta {

    private int[] arreglo;
    private int intercambios;
    private int comparaciones;

    public ArrayList<Integer> p1 = new ArrayList<>();
    public ArrayList<Integer> p2 = new ArrayList<>();

    public InserccionDirecta(int[] arreglo) {
        this.arreglo = new int[13];
        this.arreglo = arreglo;
        this.intercambios = 0;
        this.comparaciones = 0;
    }

    public void ordenar() {
        
        for (int i = 1; i < arreglo.length; i++) {
            System.out.println(Arrays.toString(arreglo) + "-" + i);
            int aux = arreglo[i];
            
            int ptr = i - 1;
            comparaciones += 1;
            while (ptr >= 0 && aux < arreglo[ptr]) {
                comparaciones += 1;                
                arreglo[ptr + 1] = arreglo[ptr]; 
                
                ptr = ptr - 1;
               

            }   
             p1.add(ptr-1);
             p2.add(i);
            intercambios += 1;
            arreglo[ptr + 1] = aux;
        }
        System.out.println(getIntercambios());
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public int getIntercambios() {
        return intercambios;
    }

    public int getComparaciones() {
        return comparaciones;
    }

}
