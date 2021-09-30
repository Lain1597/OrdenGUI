
package MetodosOrdenamiento;

import java.util.ArrayList;


public class Shell {

    private int[] arreglo;
    private int intercambios;
    private int comparaciones;
    public ArrayList<Integer> p1 = new ArrayList<>();
    public ArrayList<Integer> p2 = new ArrayList<>();

    public Shell(int[] arreglo) {
        this.arreglo = new int[13];
        this.arreglo = arreglo;
        this.intercambios = 0;
        this.comparaciones = 0;
    }

    public void ordenar() {

        int salto, aux, i;
        boolean cambios;
        for (salto = arreglo.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) { // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < arreglo.length; i++) { // se da una pasada
                    comparaciones += 1;
                    if (arreglo[i - salto] > arreglo[i]) { // y si están desordenados
                        intercambios += 1;
                        aux = arreglo[i]; // se reordenan
                        arreglo[i] = arreglo[i - salto];
                        arreglo[i - salto] = aux;
                        p1.add(i-salto);
                        p2.add(i);
                        cambios = true; // y se marca como cambio.
                    }
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
