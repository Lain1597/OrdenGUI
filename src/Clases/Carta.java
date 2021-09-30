
package Clases;

import javax.swing.ImageIcon;


public class Carta {

    private int valor;
    private ImageIcon imagen;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public Carta(int valor, ImageIcon imagen) {
        this.valor = valor;
        this.imagen = imagen;
    }

    public Carta() {

    }

}
