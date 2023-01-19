
package GUI;
/*
aqui se encuentran todas y cada una de las diferentes librerias que fueron utilizadas para la
realizacion de nuestras interfaces, y el llamado de los diferentes packages donde haciamos el llamado de los
diferentes metodos para la buen funcionamiento de la logica de esta interfaz 
*/

import LOGICA.gestionar_Cliente;
import registros.Cliente;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import logica.gestionar_Proveedor;
import static main.main.men;
import registros.Proveedor;
//////////////////////////////////////////////////////////////////////////////////////////////
/**
 *@author Moreno Romero Miguel Angel 
 * miguel.romero@correounivalle.edu.co
 *@author Valencia Pardo Sergio 
 * sergio.pardo@correounivalle.edu.co
 */
/////////////////////////////////////////////////////////////////////////////////////////////
/*
nos encontramos nuestra clase principal "GUI_M_Proveedor " que es la encargada de contener 
la fucionalidad y metodos necesarios para la funcioniladad por la cual se tuvo encuenta su creacion y es el buen 
funcionamiento de la modificacion del archivo.txt
*/
public class GUI_M_Proveedor extends javax.swing.JFrame {
/*
ahora lo que haremos es inicializar una variable "Filas" que es la que nos ayudara para determinar 
el numero de filas en el cual nosotros hemos seleccionado para poder realizar la respectiva operacion 
solo sobre la fila seleccionada 

*/     
    
 int filas;
    
/*
ahora una vez inicializada nuestra variable tipo entero, debemos de llamar nuestros metodos antes inicializados 
para poder tener accesos a ellos y poder operar sobre nuestro archivo de texto adecuado y correcto     
*/
    Proveedor  m =new Proveedor();
    gestionar_Proveedor g = new gestionar_Proveedor();  
    DefaultTableModel nuestraTabla;   
    Vector almacenar = new Vector();
   
 /*
una vez que hemos declarado nuestra variable tipo entero (int) y llamado  nuestros metodos antes incializados 
procedemos a inicializar nuestra clase que estara declara al final de todo el codigo que es la responsable 
de pasar una imagen de fondo a nuestro panel principal 
*/   
 
    imagen_fondo cgd = new imagen_fondo();
   
    
/*
una vez declarado todas los metodos que vamos a utilizar procedemos a inicializar en nuestro "CONSTRUCTOR" la clase 
responsable de inicializar nuestos elementos del JFrame, el fondo de nuestro JPanel y de colocar los datos visibles
en nuestra JTable apenas aparezca nuestra interfaz.    
*/
    
    
    
    
    public GUI_M_Proveedor() {
        
      
        
         this.setContentPane(cgd);
         
        initComponents();
        setLocationRelativeTo(null);
        llenarCombox();
        llenarCombox2();
        almacenar.addElement("Nombre");             
         almacenar.addElement("Codigo");
         almacenar.addElement("Productos");
         almacenar.addElement("Cantidad");
         almacenar.addElement("Precio");
         
         nuestraTabla= new DefaultTableModel(almacenar,0);
         
         Tabla.setModel(g.mostrar());
        
    }

   /*
    este metodo nos ayuda a llenar el comboBox para la seleccion de productos disponibles que dispone el supermercado 
    de un maner dinamica donde se llena el comboBox dependiendo de lo que haya en el archivo de texto "Productos.txt"
    */ 
    public void llenarCombox(){
             
                
        try {
            
          BufferedReader br = new BufferedReader(new FileReader("Productos.txt"));
          for(int i =1;i<=100;i++){
            
          String linea ;
         JComboBox<String> d = new JComboBox<String>();
       while((linea = br.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(linea," || ");
            combo.addItem(tokens.nextElement().toString());
            
           

            }
      
           
           
          }
          br.close();
        } catch (Exception e) {
        }
        
    }
    
     public void llenarCombox2(){
         for (int i=0;i<100;i++){
             combo2.addItem(String.valueOf(i).toString());
         }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Actualizar = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Producto = new javax.swing.JTextField();
        Atras = new javax.swing.JButton();
        precio = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        Cantidad = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESA LA INFORMACION PARA SURTIR EL SUPERMERCADO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        Tabla.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 255)));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "NºIdentifiacion", "Producto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Tabla.setOpaque(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        Actualizar.setBackground(new java.awt.Color(204, 204, 255));
        Actualizar.setText("ACTUALIZAR");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        Nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        Id.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));
        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });
        Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        combo2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });

        Producto.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));
        Producto.setOpaque(true);

        Atras.setBackground(new java.awt.Color(204, 204, 255));
        Atras.setText("ATRAS");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));
        precio.setOpaque(true);

        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        Cantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        Cantidad.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Id)
                            .addComponent(Nombre)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(254, 254, 254))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel2)
                .addGap(216, 216, 216)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
 /*
ahora en nuestro boton de "AGREGAR" declaramos un condicional para tener presente que todos los campos  y los datos que se encuentra
en cada uno de los "JTextField" esten llenos, donde si estos estan vacios no dejara que hagas el respectivo registro 
una vez inicializada nuestrra tabla procedemos a declarar varibles de tipo "String"  para escribirlos en el archivo ".TXT" 
suministrada por el usuario.      
*/   
     String []cantidad = new String[7];
     
     cantidad[0] = Nombre.getText();
     cantidad[1] = Id.getText();
     cantidad[2] = Producto.getText();
    
     cantidad[3]= precio.getText();
     cantidad[4]= Cantidad.getText();
     
     for(int i =0;i<Tabla.getColumnCount();i++){
         
         Tabla.setValueAt(cantidad[i],filas,i);
     }
        try {
            
            String g = "Proveedor.txt";
            BufferedWriter mw =  new BufferedWriter(new FileWriter(g));
            for(int h=0;h<Tabla.getRowCount();h++){
                for(int j=0;j<Tabla.getColumnCount();j++){
                     mw.write((String)(Tabla.getValueAt(h,j)));
                     
                     if(j<Tabla.getColumnCount()-1){
                         mw.write(" || ");
                     }
                }
               mw.newLine();
            }
           mw.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"NO se modifico el archivo");
        }
        
        JOptionPane.showMessageDialog(null,"se modifico el archivo con exito");
        //en esta parte lo que hacemos es decirle que despues de modificado nos deje los campos del JTectField vacios 
                      Nombre.setText("");
                      Id.setText("");
                      Producto.setText("");
                      Cantidad.setText("");
                      precio.setText("");
              
                 // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
/*
En este metodo tendremos el evento de que cuando le demos clic al tabla este no solo nos señale la fila 
sino que nos traiga la ifomacion seleccionada en cada uno de los campos donde corresponde la respectiva informacion 
donde es importar tener en cuenta que seguimos trabajando con lamatriz antes definida donde para taer el dato 
es necesario tener en cuenta la posicion dekl mismo la cual la pasaremos a nuestra variable entera(int) antes inicializada 
llamada "Filas".        
*/   
             
      this.nuestraTabla= (DefaultTableModel)Tabla.getModel();
         
        int selecionado = Tabla.getSelectedRow();
                      
          Nombre.setText(Tabla.getValueAt(selecionado,0).toString());
          Id.setText(Tabla.getValueAt(selecionado,1).toString());
          Producto.setText(Tabla.getValueAt(selecionado,2).toString());
          precio.setText(Tabla.getValueAt(selecionado,3).toString());
          Cantidad.setText(Tabla.getValueAt(selecionado,4).toString());
          
          
            filas= selecionado; 
   
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaMouseClicked

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
  // TODO add your handling code here:
    }//GEN-LAST:event_NombreKeyTyped

    private void IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_IdKeyTyped

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
/*
ahora en esta parte del escucha del boton donde le decimos que cuando hagamos clic nos desactive la interfaz actual 
y nos muestre la anterior estos llamados es lo que nos permite el desplazamiento entre las interfaces graficas al usuario
despues de realizar alguna operacion         
*/
     Actualizar.setEnabled(true);
         setVisible(false);
        new GUI_Proveedor().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
     /*
        para nuestro comboBox que es el encargado de llenar la respectiva cantida lo llenamos con valores de 0 a 100 
       
        */
        
        String cantidad_producto= combo2.getSelectedItem().toString();
    Cantidad.setText(cantidad_producto);
   
// TODO add your handling code here:
    }//GEN-LAST:event_combo2ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
      //ahora aqui lo que hacemos es pasarle a nuestro comboBox de productos el metodo anteriormente declarado que es el que nos 
    //permite llenar la categoria productos desde lo que esta ingresado en un archivo de productos 
     
        
        String mercancia = combo.getSelectedItem().toString();
     
       
        Producto.setText(mercancia);
        
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_M_Proveedor().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Actualizar;
    private javax.swing.JButton Atras;
    private javax.swing.JTextField Cantidad;
    public javax.swing.JTextField Id;
    public javax.swing.JTextField Nombre;
    private javax.swing.JTextField Producto;
    public javax.swing.JTable Tabla;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables
/*
ahora aqui declaramos nuestra clase "Imagen_Fondo" que es la que utilizaremos para pasar le una imagen anuestro JPanel 
para darle un mejor entorno visual a nuestra intrfaz grafica la cual fue inicializada al inicio del codigo y llamada
para su ejecucion en el constructor.     
*/
class imagen_fondo extends JPanel{
    private Image imagen;
    //metodo 
    public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("/imagenes/fondo_general.png")).getImage();
        g.drawImage(imagen,0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
    
}

}
