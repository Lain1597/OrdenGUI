
package moverjlabel;

import java.util.ArrayList;
import javax.swing.SwingWorker;


public class Worker extends SwingWorker<Void, Void> {

    public FrameLabel f;
    public int posx1;
    public int posx2;
    public int posy1;
    public int posy2;
    public boolean salida;
    public boolean subir;
    public ArrayList<Integer> c1, c2;
    public int punt;

    public Worker(FrameLabel pu, ArrayList c1, ArrayList c2) {
        this.punt = 0;
        this.f = pu;
        this.c1 = c1;
        this.c2 = c2;

    }

    @Override
    protected Void doInBackground() throws Exception {
        boolean p1;
        boolean p2;
        //coger los 2 primeros valores 
        for (int i = 0; i < c1.size(); i++) {
            p1 = true;
            p2 = false;
            salida = true;
            subir = true;
            int aux1, aux2;
            f.asignar_et1(f.labels.get(this.c1.get(i)));
            f.asignar_et2(f.labels.get(this.c2.get(i)));
            this.posx1 = this.f.et1.getX();
            this.posx2 = this.f.et2.getX();
            this.posy1 = this.f.et1.getY();
            this.posy2 = this.f.et2.getY();

            f.et1.setVisible(true);
            f.et2.setVisible(true);
            do {
                try {

                    Thread.sleep(3);

                    //auxiliares para saber la posicion del label 1 en cada instante
                    aux1 = f.et1.getY();
                    aux2 = f.et1.getX();
                    if (p1) {
                        if (aux1 != 45) {
                            f.movery1(subir);
                            f.movery2(subir);//este subir es bajar xd
                        } else {
                            p1 = false;
                            p2 = true;

                        }

                    }

                    //si acabo de subir entonces mover en x
                    if (p2) {
                        if (aux2 != posx2) {
                            f.moverx1();
                            f.moverx2();
                        } else {
                            p2 = false;

                        }

                    }
                    //movemos los labels hacia la posicion inicial del otro
                    //si dejaron de subir y acabo el proceso 2 entonces movemos
                    if (!p1 && !p2) {
                        if (aux1 != posy2) {
                            f.movery1(!subir);
                            f.movery2(!subir);
                        } else {
                            salida = false;

                            f.labels.get(c2.get(i)).setIcon(f.et1.getIcon());
                            f.labels.get(c1.get(i)).setIcon(f.et2.getIcon());

                            f.et1.setVisible(false);
                            f.et2.setVisible(false);

                            f.labels.get(c1.get(i)).setVisible(true);
                            f.labels.get(c2.get(i)).setVisible(true);

                        }

                    }
                } catch (InterruptedException e) {
                }

            } while (salida);

        }

        return null;
    }

}
