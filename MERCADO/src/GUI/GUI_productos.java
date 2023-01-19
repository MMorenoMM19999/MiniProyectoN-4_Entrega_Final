
package GUI;

import GUI.Menu;
import LOGICA.gestionar_Cliente;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import logica.gestionar_Productos;
import static main.main.men;
import static main.main.product;
import registro.Venta;
import registros.Cliente;


//////////////////////////////////////////////////////////////////////////////////////////////
/**
 *@author Moreno Romero Miguel Angel 
 * miguel.romero@correounivalle.edu.co
 *@author Valencia Pardo Sergio 
 * sergio.pardo@correounivalle.edu.co
 */
/////////////////////////////////////////////////////////////////////////////////////////////
/*
nos encontramos nuestra clase principal "GUI_productos " que es la encargada de contener 
la fucionalidad y metodos necesarios para la funcioniladad por la cual se tuvo encuenta su creacion y es el buen 
funcionamiento de la modificacion del archivo.txt
esta interfaz solo tiene la finalidad de caracter informativo para el usuario 
*/
public class GUI_productos extends javax.swing.JFrame {
    //inicializamos nuestras variables 
    
    int filas ;
    Venta  m =new Venta();
    gestionar_Productos g = new gestionar_Productos();  
    DefaultTableModel nuestraTabla;   
    Vector informacion = new Vector();
    
    
    
    //declaramos nuestros metodos que nos van a servir para poder llenar el comboBox de una manera mas adecuada 
    //y al mismo tiempo llamamos la clase que se encuentra al final del archvio que es la que nos permite
    //darle mas personalizacion a uestra interfasz donde decalramos que debe de tomar una imagen 
    
    String productos[] = {"Papas","Cafe","BigCola","Galletas","Jugo","Bombones","Vino","Arroz","Carne","Huevos"};
    double precios[] = {5000,2800,6500,3800,4500,1500,25000,38000,11000,12000};
    double precio = 0;
    int cantidad = 0;

     imagen_fondo fd = new imagen_fondo();
     
//nuestro construtor 
     /*
     donde declaramos cada uno de los componentes de nuestra interfaz y al mismo tiempo inicializamos nuestros metodos 
     que nos permite hacer los respectivos calculos de los productos en cuanto al precio.
     y al mismo tiempo declaramos que la tabla una vez se cargue la ventana se cargue la informacion que hasta el momento ha sido
     registrada por el usuario donde tambien le pasamos unos atributos como los encabezados que se mostraran en la tabla 
     */
    public GUI_productos() {
        
        this.setContentPane(fd);
        initComponents();
        this.setTitle("PRODUCTOS BABILONIU");      
        this.setLocationRelativeTo(null);
        
       
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
        cboProducto.setModel(comboModel);
      
        
       
        
         informacion.addElement("Nombre");             
         informacion.addElement("Nº Identificacion");
         informacion.addElement("Productos");    
         informacion.addElement("Precio");
         
         nuestraTabla= new DefaultTableModel(informacion,0);
         
        tblProductos.setModel(g.mostrar());
        
         calcularPrecio();
        
 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblIva = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        spnCantidad = new javax.swing.JSpinner();
        lblPrecio = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblImporte = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        btnelimnar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buscar = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIva.setForeground(new java.awt.Color(255, 255, 255));
        lblIva.setText("$0.0");
        lblIva.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IVA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(lblIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 130, 50));

        cboProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, -1));

        spnCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANTIDAD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 180, -1));

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("$ 0.0");
        lblPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRECIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 130, -1));

        tblProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descripcion", "Precio.U", "Cantidad", "Importe"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProductos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 470, 170));

        lblImporte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblImporte.setForeground(new java.awt.Color(255, 255, 255));
        lblImporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImporte.setText("$ 0.0");
        lblImporte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMPORTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, -1));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("$0.0");
        lblTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOTAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 130, 50));

        lblSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtotal.setText("$0.0");
        lblSubtotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUBTOTAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 130, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Urban Jungle", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SUPER MERCADO    BABILONIU");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 330, 30));

        jPanel1.setOpaque(false);

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);

        btnatras.setText("ATRAS");
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnatras);

        btnelimnar.setText("ELIMINAR");
        btnelimnar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimnarActionPerformed(evt);
            }
        });
        jPanel1.add(btnelimnar);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 470, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 30, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Biennvenido a nuestro gestionador de precios de nuestros productos\ncalcula tu compra de tu canasta familiar para saber cuanto debes depagar en caja ");
        jScrollPane3.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 470, 40));

        buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSACR "));
        buscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                buscarCaretUpdate(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        calcularPrecio();
    }//GEN-LAST:event_cboProductoActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        calcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    //aqui implementamos nuestros metodos declarados anteriormente para que se pueda guardar la infromacion suministrada en 
    //un archivo de texto .txt 
      
    nuestraTabla = new DefaultTableModel();
        

        m.setId(cboProducto.getSelectedIndex());
        m.setDescripcion(cboProducto.getSelectedItem().toString());
        m.setPrecio(precio);
        m.setCantidad(cantidad);
        m.setImporte(precio*cantidad);
       
             g.guardar(m);
             g.guardarArchivo(m);          
                        
             JOptionPane.showMessageDialog(null, "se ha guardado el registro con exito");
             
             tblProductos.setModel(g.mostrar());
                          
                     
        
        
        

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
      /*
        aqui declaramos lo que venimos trabajando en las otras interfaces que es para desplazarnos en las otras interfaces 
        que se desactive la interfaz actual y se muestre la que le sigue o viceversa 
        */
        
        setVisible(false);
      
        men.setVisible(true);
    
     
     
    


        // TODO add your handling code here:
    }//GEN-LAST:event_btnatrasActionPerformed

    private void btnelimnarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimnarActionPerformed
/*
ahora en nuestro boton de "ELIMINAR" declaramos un TRY and CATCH y dentro de este declaramos nuestro "FOR" para tener presente que todos los campos  y los datos que se encuentra
en cada uno de los "JTextField" se puedan borrar, donde lo que hacemos es que con nuestro for recorremos el archivo 
y lo volvemos a reescribir sin los datos que fueron seleccionados por el evento del mause 
*/         
       
        
        
        nuestraTabla.removeRow(tblProductos.getSelectedRow());
        
        try {
            
            String h = "Productos.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(h));
            
            for(int i =0;i< tblProductos.getRowCount();i++){
                for(int j=0;j<tblProductos.getColumnCount();j++){
                    bw.write((String)(tblProductos.getValueAt(i,j)));
                    if(j<tblProductos.getColumnCount()-1){
                        bw.write(" || ");
                        
                    }
                }
                bw.newLine();
            }
            bw.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"los datos NO han sido borrados con exito");
        }
        JOptionPane.showMessageDialog(null,"los datos han sido borrados con exito");
        //aqui le decimos al boton de agregar que se vuelva ha activar
        btnAgregar.setEnabled(true);    






        // TODO add your handling code here:
    }//GEN-LAST:event_btnelimnarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
    //aqui le estamos diciendo que cuando el mause de clic en alguna columna de nuestra tabla la seleccione toda para poder 
    //manipular la totalidad de los datos ingresados 
       
        btnAgregar.setEnabled(false);   
        this.nuestraTabla= (DefaultTableModel)tblProductos.getModel();
         
        int selecionado = tblProductos.getSelectedRow();
                      
         
                  
            filas= selecionado;



        // TODO add your handling code here:
    }//GEN-LAST:event_tblProductosMouseClicked

    private void buscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_buscarCaretUpdate
/*
aqui lo que hacemos es en campo de busqueda que es un "JTextField" lo cual lo designaremos que nos busque por nombre,
nos traiga eso que el usuario ingresa en el campo y lo compare con la columna y las filas que conforman a Nombre, donde si hay alguna coincidencia
este nos ilumine la fila.        
*/
  
           String letras = buscar.getText();

       for(int i=0; i < tblProductos.getRowCount();i++){
           
           if(tblProductos.getValueAt(i,0).equals(letras)){
               
               tblProductos.changeSelection(i,0,false,false);
               
           }
       }



        // TODO add your handling code here:
    }//GEN-LAST:event_buscarCaretUpdate

    public void borrarVenta(){
        
        precio = 0;
        cantidad = 0;
         
    }
   //aqui declaramos e inicializamos nuestro metodo para calcular el precio de los diferentes productos  
    public void calcularPrecio(){
        
        precio = precios[cboProducto.getSelectedIndex()];
        cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        lblPrecio.setText(aMoneda(precio));
        lblImporte.setText(aMoneda(precio*cantidad));
        
    }
  //y esta complementa el metodo anterior donde llamamos al precio guardado para el producto escogido   
    public String aMoneda (double precio){
        return "$ "+ Math.round(precio*100)/100;
    }
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btnelimnar;
    private javax.swing.JTextField buscar;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
 //esta clase se crreo con el fin de colocarle una imagen de fondo y nos permite    darle un mejor manejo de la misma 
  
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
