/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_libreriaio;

/**
 *
 * @author Lara Vazquez Dorna
 */
public abstract class Dialogo implements MetodosComunes {

    @Override
    public abstract void mostrar(String msg);

    /**
     * 
     */
    enum Tipo {
        CONSOLA, VENTANA
    };

    public static Dialogo crearDialogo(Tipo tipo) {

        Dialogo dialogoCreado;
        switch (tipo) {
            // creamos un dialogo de consola
            case CONSOLA:
                dialogoCreado = new ConsDialogo();
                break;
            // creamos un dialogo de ventana
            case VENTANA:
                dialogoCreado = new WindDialogo();
                break;
            default:
                dialogoCreado = null;
        }

        return dialogoCreado;

    }
}
