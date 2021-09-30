
package Clases;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Baraja {

    public Carta[] cartas;
    public int puntero;
    public ArrayList<Integer> listavalores = new ArrayList<>();

    private final int numerocartas;

    public Baraja() {
        this.numerocartas = 13;
        this.cartas = new Carta[13];
        this.puntero = 0;
        System.out.println(Arrays.toString(cartas));
    }

    private void asignarImagenes() {

        for (int i = 0; i < numerocartas; i++) {
            ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/carta" + String.valueOf(i + 1) + ".jpg"));
            Carta aux = new Carta();
            aux.setImagen(imagen);
            cartas[i] = aux;
        }
    }

    public void iniciarBaraja() {

        for (int i = 0; i < 13; i++) {
            Carta caux = new Carta();
            caux.setValor(i+1);
            cartas[i] = caux;
            listavalores.add(cartas[i].getValor());
        }

        asignarImagenes();
    }

    public Carta sacar(int valor) {
        Carta caux = cartas[valor - 1];
        puntero++;
        return caux;

    }

    public JLabel showCard(JLabel lab, Carta c) {
        ImageIcon i = c.getImagen();
        ImageIcon icono = new ImageIcon(i.getImage().getScaledInstance(lab.getWidth(), lab.getHeight(), Image.SCALE_SMOOTH));
        lab.setIcon(icono);
        return lab;
    }

   

    public void desordenar() {
        java.util.Collections.shuffle(listavalores);
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public int getPuntero() {
        return puntero;
    }

    public ArrayList<Integer> getListavalores() {
        return listavalores;
    }

}
