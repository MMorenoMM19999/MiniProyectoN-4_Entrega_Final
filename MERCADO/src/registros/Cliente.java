
package registros;

//////////////////////////////////////////////////////////////////////////////////////////////
/**
 *@author Moreno Romero Miguel Angel 
 * miguel.romero@correounivalle.edu.co
 *@author Valencia Pardo Sergio 
 * sergio.pardo@correounivalle.edu.co
 */
/////////////////////////////////////////////////////////////////////////////////////////////
/*
nos encontramos nuestra clase principal "Cliente " que es la encargada de contener 
la fucionalidad y metodos necesarios para la funcioniladad por la cual se tuvo encuenta su creacion y es el buen 
funcionamiento de la modificacion del archivo.txt
*/
public class Cliente {
    
    //delcaramos las variables que vamos a usar 
    private String nombre;
      private String identificacion;
      
      private String Productos;
      
 
          
//inicializamos las variables declaradas anteriormente en el constuctor 
        
    public Cliente(String nombre,String identificacion, String Productos) {
        this.nombre = nombre;
           this.identificacion = identificacion;
              this.Productos=Productos;
            
              
    }
    
    public String getProductos() {
        return Productos;    
    }

    public void setProductos(String Productos) {
        this.Productos = Productos;
    }


//e invocamos todos los metodos set y get denuestras varibles antes declaradas e inicializadas
 

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

 

    public Cliente() {
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


         
    
}
