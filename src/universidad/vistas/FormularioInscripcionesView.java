/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidad.vistas;


import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 4K
 */
public class FormularioInscripcionesView extends javax.swing.JInternalFrame {

private ArrayList<Materia> listaM; //camio y dejo List 4:27
private ArrayList<Alumno> listaA;   //camio y dejo List 4:30


private InscripcionData inscData;

private MateriaData mData;

private AlumnoData aData;

private DefaultTableModel modelo;
    
    
    
    /**
     * Creates new form FormularioInscripcionesView
     */
    public FormularioInscripcionesView() {
        initComponents();
        
aData = new AlumnoData();
listaA= (ArrayList<Alumno>) aData.listarAlumnos(); ///Mayuscula x las dudas
modelo= new DefaultTableModel();
inscData = new InscripcionData();
mData = new MateriaData();

cargaAlumno(); //5:14 presiona y se va al codigo cargarAlumno 
armarCabeceraTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jButton1Inscribir = new javax.swing.JButton();
        jButton2AnularInscripcion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1MateriasInscriptas = new javax.swing.JRadioButton();
        jRadioButton2MateriaNoInscripta = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscrpcion");

        jLabel2.setText("Seleccione un alumno:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText(" Listado de Materias");

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jtMaterias);

        jButton1Inscribir.setText("Inscribir");
        jButton1Inscribir.setEnabled(false);
        jButton1Inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InscribirActionPerformed(evt);
            }
        });

        jButton2AnularInscripcion.setText("Anular Inscripcion");
        jButton2AnularInscripcion.setEnabled(false);
        jButton2AnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2AnularInscripcionActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jRadioButton1MateriasInscriptas.setText("Materias Inscriptas");
        jRadioButton1MateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1MateriasInscriptasActionPerformed(evt);
            }
        });

        jRadioButton2MateriaNoInscripta.setText("Materias no inscriptas");
        jRadioButton2MateriaNoInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2MateriaNoInscriptaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1Inscribir)
                .addGap(50, 50, 50)
                .addComponent(jButton2AnularInscripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton1MateriasInscriptas)
                        .addGap(93, 93, 93)
                        .addComponent(jRadioButton2MateriaNoInscripta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1MateriasInscriptas)
                    .addComponent(jRadioButton2MateriaNoInscripta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Inscribir)
                    .addComponent(jButton2AnularInscripcion)
                    .addComponent(jButton3))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1MateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1MateriasInscriptasActionPerformed

 borrarFilaTable();
jRadioButton2MateriaNoInscripta.setSelected(false);
cargaDatosInscriptas();
jButton2AnularInscripcion.setEnabled(true);
jButton1Inscribir.setEnabled(false);





        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1MateriasInscriptasActionPerformed

    private void jRadioButton2MateriaNoInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2MateriaNoInscriptaActionPerformed

 borrarFilaTable();
 jRadioButton1MateriasInscriptas.setSelected(false);
  cargaDatosNoInscriptas();
jButton2AnularInscripcion.setEnabled(false);
jButton1Inscribir.setEnabled(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2MateriaNoInscriptaActionPerformed

    private void jButton1InscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InscribirActionPerformed

int filaSeleccionada= jtMaterias.getSelectedRow();
if(filaSeleccionada!=-1){
   Alumno a=(Alumno)jComboBox1.getSelectedItem();
   int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
   String nombreMateria=(String) modelo.getValueAt(filaSeleccionada, 1);
   int anio= (Integer) modelo.getValueAt(filaSeleccionada, 2);
   Materia m = new Materia (idMateria, nombreMateria, anio, true);
   Inscripcion i = new Inscripcion (a,m,0);
   inscData.guardarInscripcion(i);
   borrarFilaTable();
   
   
}





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1InscribirActionPerformed

    private void jButton2AnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2AnularInscripcionActionPerformed

int filaSeleccionada= jtMaterias.getSelectedRow();
if(filaSeleccionada!=-1){
   Alumno a=(Alumno)jComboBox1.getSelectedItem();
   int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
   
   inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(),idMateria);
   borrarFilaTable();
   
}else{
    
    
    
}
        





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2AnularInscripcionActionPerformed
private void cargaAlumno(){ //carga al combo Box

   for(Alumno item: listaA){

    jComboBox1.addItem(item); //5:43 fijate en este minuto te lleva al cuadrito
    }
}

private void armarCabeceraTabla(){
    ArrayList<Object> filaCabecera = new ArrayList <> ();
    filaCabecera.add("ID");
    filaCabecera.add("Nombre");
    filaCabecera.add("Año"); //6:15 mirar 

  for(Object it: filaCabecera){
      
        modelo.addColumn(it);
}

    jtMaterias.setModel(modelo); //6:50 cambia por jtMateria/jTable1


}
private void borrarFilaTable(){

 int indice = modelo.getRowCount() -1;

for (int i = indice; i>0;i--){
   modelo.removeRow(i); //7:54 mirar 
}

}

private void cargaDatosNoInscriptas(){
   //borrarFilaTabla();
Alumno selec = (Alumno) jComboBox1.getSelectedItem();
listaM = (ArrayList) inscData.obtenerMateriasNoCursadas(selec.getIdAlumno()); //9:00 el pela borra Array
for(Materia m: listaM){
   modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()}); //9:46 mirar
}
}

private void cargaDatosInscriptas(){
    //borrarFilasTabla();
   Alumno selec = (Alumno) jComboBox1.getSelectedItem();
   List<Materia> lista = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
for(Materia m : lista){
   modelo.addRow(new Object [] {m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
}
}





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Inscribir;
    private javax.swing.JButton jButton2AnularInscripcion;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<Alumno> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1MateriasInscriptas;
    private javax.swing.JRadioButton jRadioButton2MateriaNoInscripta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables
}
