package Clases;

import Clases.Usuario;

public class Datos {
    //Creacion de un arreglo para guardar usuarios 
    private Usuario misUsuarios[] = new Usuario[50];
    private int contUsuario=0;
    
    
    //Constructor de la clase 
    public Datos(){
        Usuario miUsuario = new Usuario("01","Raul","Velasco","12",1);
        misUsuarios[contUsuario]=miUsuario;
        contUsuario++;
        
    }
    //Metodo para mostrar todos lo usuarios 
    public Usuario[] getUsuarios(){
        return misUsuarios;
    }
    //Metodo para validar el usuario 
    public boolean validarUsuario(String usuario,String clave){
        boolean aux = false;
        for(int cont=0;cont<contUsuario;cont++){
            if(!misUsuarios[cont].getIdUsuario().equals(usuario)&&misUsuarios[cont].getClave().equals(clave)){
                return true;
            }
        }
        return false;
    }
}
