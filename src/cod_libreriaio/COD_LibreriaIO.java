/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_libreriaio;

/**
 *
 * @author Lara vazquez dorna
 */
public class COD_LibreriaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dialogo miDialogo = Dialogo.crearDialogo(Dialogo.Tipo.CONSOLA);
        miDialogo.mostrar("Hola!! esto es la  consola del ordenador");
        Dialogo otroDialogo = Dialogo.crearDialogo(Dialogo.Tipo.VENTANA);
        otroDialogo.mostrar("Hola!! esto es una ventana del ordenador");
    }
    
}
