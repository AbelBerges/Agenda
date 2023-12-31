/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package agenda;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalema
 */
public class BusquedaTodas extends javax.swing.JInternalFrame {

    public DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    /**
     * Creates new form BusquedaTodas
     */
    public BusquedaTodas() {
        initComponents();
        armarColumnas();
        //jtBusquedaKeyReleased();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadioBotones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultado = new javax.swing.JTable();
        jbtCambiarEstado = new javax.swing.JButton();
        jbtEliminar = new javax.swing.JButton();
        jrPendientes = new javax.swing.JRadioButton();
        jrRealizada = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("BÚSQUEDA DE TODAS LAS TAREAS");
        jLabel1.setFocusable(false);

        jLabel2.setText("Ingrese el patrón de búsqueda");
        jLabel2.setFocusable(false);

        jtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBusquedaKeyReleased(evt);
            }
        });

        jTResultado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTResultado);

        jbtCambiarEstado.setText("Cambiar Estado");
        jbtCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCambiarEstadoActionPerformed(evt);
            }
        });

        jbtEliminar.setText("Eliminar");
        jbtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminarActionPerformed(evt);
            }
        });

        grupoRadioBotones.add(jrPendientes);
        jrPendientes.setText("Pendiente");
        jrPendientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jrPendientesFocusGained(evt);
            }
        });

        grupoRadioBotones.add(jrRealizada);
        jrRealizada.setText("Realizada");
        jrRealizada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jrRealizadaFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jrPendientes)
                                        .addGap(45, 45, 45)
                                        .addComponent(jrRealizada))
                                    .addComponent(jtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 291, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtCambiarEstado)
                        .addGap(33, 33, 33)
                        .addComponent(jbtEliminar)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrPendientes)
                    .addComponent(jrRealizada))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCambiarEstado)
                    .addComponent(jbtEliminar))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBusquedaKeyReleased
        if (jrRealizada.isSelected()) {
            borrarFilas();
            for (Eventos listaEvento : Tareas.listaEventos) {
                if (jtBusqueda.getText().isEmpty()) {
                    borrarFilas();
                } else if (listaEvento.getEstado().equals("Realizada")) {
                    if (listaEvento.getNombre().startsWith(jtBusqueda.getText())) {
                        modelo.addRow(new Object[]{
                            listaEvento.getNombre(), listaEvento.getEstado(),
                            listaEvento.getFecha(), listaEvento.getLasCategorias()
                        });
                    }
                }
            }
        }else if (jrPendientes.isSelected()) {
            borrarFilas();
            for (Eventos pend : Tareas.listaEventos) {
                if (jtBusqueda.getText().isEmpty()) {
                    borrarFilas();
                } else if (pend.getEstado().equals("Pendiente")) {
                    if (pend.getNombre().startsWith(jtBusqueda.getText())) {
                        modelo.addRow(new Object[]{
                            pend.getNombre(), pend.getEstado(),
                            pend.getFecha(), pend.getLasCategorias()
                        });
                    }

                }
            }
        }else{
            borrarFilas();
            for (Eventos total : Tareas.listaEventos) {
                if(jtBusqueda.getText().isEmpty()){
                    borrarFilas();
                }else if(total.getNombre().startsWith(jtBusqueda.getText())){
                    modelo.addRow(new Object[]{
                    total.getNombre(), total.getEstado(),
                        total.getFecha(), total.getLasCategorias()
                    });
                }
            }
        }
    }//GEN-LAST:event_jtBusquedaKeyReleased

    private void jbtCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCambiarEstadoActionPerformed
        int valor=jTResultado.getSelectedRow();
        if(valor!=-1){
            Eventos aux=new Eventos(Tareas.listaEventos.get(valor).getNombre(), "Realizada",
                    Tareas.listaEventos.get(valor).getFecha(), Tareas.listaEventos.get(valor).getLasCategorias());
            Tareas.listaEventos.set(valor, aux);
            modelo.removeRow(valor);
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbtCambiarEstadoActionPerformed

    private void jrRealizadaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jrRealizadaFocusGained
        borrarFilas();
        jtBusqueda.setText("");
        jtBusqueda.requestFocus();
        jtBusqueda.selectAll();
    }//GEN-LAST:event_jrRealizadaFocusGained

    private void jrPendientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jrPendientesFocusGained
       borrarFilas();
       jtBusqueda.setText("");
       jtBusqueda.requestFocus();
       jtBusqueda.selectAll();
    }//GEN-LAST:event_jrPendientesFocusGained

    private void jbtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminarActionPerformed
        int valor=jTResultado.getSelectedRow();
        if(valor!=-1){
            modelo.removeRow(valor);
            Tareas.listaEventos.remove(valor);
            jtBusqueda.requestFocus();
            jtBusqueda.selectAll();
        }else{
            JOptionPane.showMessageDialog(this, "Debe elegir una fila de la tabla");
            jtBusqueda.requestFocus();
            jtBusqueda.selectAll();
        }
    }//GEN-LAST:event_jbtEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoRadioBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTResultado;
    private javax.swing.JButton jbtCambiarEstado;
    private javax.swing.JButton jbtEliminar;
    private javax.swing.JRadioButton jrPendientes;
    private javax.swing.JRadioButton jrRealizada;
    private javax.swing.JTextField jtBusqueda;
    // End of variables declaration//GEN-END:variables

    private void armarColumnas() {
        modelo.addColumn("Nombre Tarea");
        modelo.addColumn("Estado");
        modelo.addColumn("Fecha de inicio");
        modelo.addColumn("Categoria");
        jTResultado.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = jTResultado.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }



}
