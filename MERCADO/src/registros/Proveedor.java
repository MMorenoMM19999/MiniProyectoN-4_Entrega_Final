
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
nos encontramos nuestra clase principal "Proveedor " que es la encargada de contener 
la fucionalidad y metodos necesarios para la funcioniladad por la cual se tuvo encuenta su creacion y es el buen 
funcionamiento de la modificacion del archivo.txt
*/
public class Proveedor {
    
    //delcaramos las variables que vamos a usar 
    private String nombre;
      private String identificacion; 
      private String Productos;
      private String precio ;
      private String unidades;
 
          
//inicializamos las variables declaradas anteriormente en el constuctor 
        
    public Proveedor(String nombre,String identificacion, String Productos, String precio,String unidades) {
        this.nombre = nombre;
           this.identificacion = identificacion;
              this.Productos=Productos;
              this.precio =precio;
              this.unidades= unidades;
            
              
    }
//y despues de creadas e inicializadas nuestras variables creamos nuestros respectivos metodos Getters & Setters 
    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }
    
    
    
    public String getProductos() {
        return Productos;    
    }

    public void setProductos(String Productos) {
        this.Productos = Productos;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }


//e invocamos todos los metodos set y get denuestras varibles antes declaradas e inicializadas
 

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

 

    public Proveedor() {
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


         
    
}
