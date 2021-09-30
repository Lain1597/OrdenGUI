
package MetodosOrdenamiento;

import java.util.ArrayList;


public class Seleccion {

    private int[] arreglo;
    private int intercambios;
    private int comparaciones;
    public ArrayList<Integer> p1 = new ArrayList<>();
    public ArrayList<Integer> p2 = new ArrayList<>();

    public Seleccion(int[] arreglo) {
        this.arreglo = new int[13];
        this.arreglo = arreglo;
        this.intercambios = 0;
        this.comparaciones = 0;
    }

    public int[] ordenar() {
        int menor, pos, tmp;
        for (int i = 0; i < arreglo.length - 1; i++) { // tomamos como menor el primero
            menor = arreglo[i]; // de los elementos que quedan por ordenar
            pos = i; // y guardamos su posición
            for (int j = i + 1; j < arreglo.length; j++) { // buscamos en el resto
                comparaciones += 1;
                if (menor > arreglo[j]) { // del array algún elemento
                    menor = arreglo[j]; // menor que el actual
                    pos = j;            //guardamos su posicion
                }
            }
            // si hay alguno menor se intercambia
            tmp = arreglo[i];
            arreglo[i] = arreglo[pos];
            arreglo[pos] = tmp;
            p1.add(i);
            p2.add(pos);
            intercambios++;

        }
        return arreglo;
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
