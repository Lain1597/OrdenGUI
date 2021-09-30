
package MetodosOrdenamiento;

import java.util.ArrayList;


public class Burbuja {
    private int[] arreglo;
    private int intercambios;
    private int comparaciones;
    
    public ArrayList<Integer> p1 = new ArrayList<>();
    public ArrayList<Integer> p2 = new ArrayList<>();
    
    public Burbuja (int[] arreglo){
        this.arreglo = new int[13];
        this.arreglo = arreglo;
        this.intercambios = 0;
        this.comparaciones= 0;
    }
    public void ordenar(){
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                comparaciones++;
                if (arreglo[j] > arreglo[j + 1]) {
                    int tmp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                    p1.add(j);
                    p2.add(j+1);
                    intercambios++;
                }
            }
        }
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
