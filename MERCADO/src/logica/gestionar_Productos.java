
package logica;
/*
aqui se encuentran todas y cada una de las diferentes librerias que fueron utilizadas para la
realizacion de nuestras interfaces, y el llamado de los diferentes packages donde haciamos el llamado de los
diferentes metodos para la buen funcionamiento de la logica de esta interfaz 
*/

import GUI.GUI_Cliente;
import GUI.GUI_productos;
import registros.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registro.Venta;
//////////////////////////////////////////////////////////////////////////////////////////////
/**
 *@author Moreno Romero Miguel Angel 
 * miguel.romero@correounivalle.edu.co
 *@author Valencia Pardo Sergio 
 * sergio.pardo@correounivalle.edu.co
 */
/////////////////////////////////////////////////////////////////////////////////////////////
/*
nos encontramos nuestra clase principal "gestionar_Productos " que es la encargada de contener 
la fucionalidad y metodos necesarios para la funcioniladad por la cual se tuvo encuenta su creacion y es el buen 
funcionamiento de la modificacion del archivo.txt
*/
public class gestionar_Productos implements ActionListener{
/*
ahora una vez  debemos de llamar nuestros metodos antes inicializados 
para poder tener accesos a ellos y poder operar sobre nuestro archivo de texto adecuado y correcto     
*/    
    GUI_productos m;
    Vector informacion  = new Vector();

 
    
  //aqui se inicializa el constructor donde en uno se le pasa como parametro la "gestionar_Productos() "  y el otro es 
//totalmente vacio dado que es necesario para la buena ejecucion de nuestra interfaz y de los valor que entre estas
//se pasan constantemente con la interaccion del usuario   
   
    
      public gestionar_Productos() {
        
      
        
    }
      
    public gestionar_Productos(GUI_productos m) {
        this.m = m;
        this.m.btnAgregar.addActionListener(this);
        
    }

 /*
ahora lo que haceremos es declarar nuestros dos metodos que son los que nos ayudan guardar  los datos ingresados 
por el usuario a un archivo ".txt" que es necesario para poder darles uso en la modificacion y eliminacion y le permitan 
quedar registrados o guardados para un uso futuro, para esto tambien utilizamos nuestros metodos "FileWriter" y "BufferedWriter" y "PrintWriter"
*/ 

   
    
    public void guardar(Venta datos){
        informacion.addElement(datos);
        
    }
        public void guardarArchivo(Venta datosArchivo){
            try {
                FileWriter s =new FileWriter("Productos.txt",true);
                BufferedWriter w = new BufferedWriter(s);
                PrintWriter p = new PrintWriter(w);
               
                p.print("\n");
                p.print(datosArchivo.getDescripcion());             
                p.print(" || "+datosArchivo.getPrecio());
                p.print(" || "+datosArchivo.getCantidad());
                p.print(" || "+datosArchivo.getImporte());
                
             
                
               
                p.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
    }
 /*
ahora lo que haceremos es declarar nuestros  metodo que es el que nos ayudan mostrar  los datos ingresados 
por el usuario y antes guardados por los anteriores metodos en un archivo ".txt" que es necesario para poder darles uso en la modificacion y eliminacion y le permitan 
quedar registrados o guardados para un uso futuro, tomarlos y manipularlos despues de guardar y de cerrar el archivo para 
mostrarlos en nuestra JTable donde corresponda cada archivo almacenandolos en un vector y por medio de un TRY and CATCH 
dentro del manejo de esta excepcion implementar un ciclo while que nos permita leer el archivo de texto separado por punto y coma 
y poderlos mostrar en la tabla,para que esto se lleve a cabo hacemos uso de nuestros metodos "FileReader" & "BufferedReader"
*/    
        public DefaultTableModel  mostrar(){
            Vector almacenar = new Vector();
            
            almacenar.addElement("Descripcion");
             almacenar.addElement("Precio.u");
              almacenar.addElement("Cantidad");
              almacenar.addElement("Importe");
             
                 
          
            DefaultTableModel nuestraTabla = new DefaultTableModel(almacenar,0);
            
            try {
                FileReader leer = new FileReader("Productos.txt");
                BufferedReader b = new BufferedReader(leer);
                String c;
                
                while((c = b.readLine())!=null){
                    StringTokenizer dato = new StringTokenizer(c," || ");
                    
                    Vector f = new Vector ();
                    while(dato.hasMoreTokens()){
                        
                        f.addElement(dato.nextToken());
                        
                    }
                    nuestraTabla.addRow(f);
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e); 
            }
            
        return nuestraTabla;
            
            
        }
        
        
  

    @Override
    public void actionPerformed(ActionEvent e) {
   }

 
    
    
  
    
    
}
