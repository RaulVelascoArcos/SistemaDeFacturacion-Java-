package Clases;

import Formularios.frmLogin;

/*Creacion de un sistema de facturacion basico */
public class Principal {
    //Metodo Principal
    public static void main(String arg[]){
        //Creo mi objeto datos
        Datos com = new Datos();
        frmLogin ventaPrin = new frmLogin();
        ventaPrin.setDatos(com); 
        ventaPrin.setLocationRelativeTo(null);
        ventaPrin.setVisible(true);
    }
}
