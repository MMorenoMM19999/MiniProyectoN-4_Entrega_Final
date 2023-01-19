
package main;

import GUI.GUI_Cliente;
import GUI.GUI_productos;
import GUI.Menu;


//////////////////////////////////////////////////////////////////////////////////////////////
/**
 *@author Moreno Romero Miguel Angel 
 * miguel.romero@correounivalle.edu.co
 *@author Valencia Pardo Sergio 
 * sergio.pardo@correounivalle.edu.co
 */
/////////////////////////////////////////////////////////////////////////////////////////////

/*
nos encontramos nuestra clase principal "main " que es la encargada de ejecutar  
la fucionalidad y metodos necesarios para la funcioniladad por la cual se tuvo encuenta su creacion y es el buen 
funcionamiento de la modificacion del archivo.txt
*/

public class main {

    public static Menu men;
    public static GUI_Cliente Clientes;
    public static GUI_productos product;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //aqui lo que hacemos es inicializar nuestra interfaz con unos respecivos parametros 
          men = new Menu();
          men.setVisible(true);
          men.setLocationRelativeTo(null);
          men.setResizable(false);
    
    }
    
}
