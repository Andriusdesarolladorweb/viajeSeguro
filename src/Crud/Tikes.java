package Crud;

import BD.ConexionMYSQL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import BD.dbTickest;

/**
 *
 * @author jquezada
 */
public class Tikes extends javax.swing.JFrame {

    ConexionMYSQL con = new ConexionMYSQL();
    Connection cn = con.conectar();

    /**
     * Creates new form ContactosCRUD
     */
    public Tikes() {
        initComponents();
        this.setLocationRelativeTo(null);
        limpiarCampos();
        mostrarDatos("");

        txtAerolinea.requestFocus();
        //  btnActualizar.setEnabled(false);
        // btnCancelar.setEnabled(false);
        btnAgregar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popMenu = new javax.swing.JPopupMenu();
        popEliminar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        pnlFormulario = new javax.swing.JPanel();
        lblAerolinea = new javax.swing.JLabel();
        lblAsientosTotales = new javax.swing.JLabel();
        lblHoraDeSalida = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        lblHoraDeLlegada = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        txtHorallegada = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtHorasalida = new javax.swing.JTextField();
        txtAerolinea = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        lebl = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jpRutas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltickes = new javax.swing.JTable();

        popEliminar.setText("Eliminar registro");
        popEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popEliminarActionPerformed(evt);
            }
        });
        popMenu.add(popEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFormulario.setBackground(new java.awt.Color(0, 134, 190));
        pnlFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        pnlFormulario.setForeground(new java.awt.Color(255, 255, 255));

        lblAerolinea.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblAerolinea.setForeground(new java.awt.Color(255, 255, 255));
        lblAerolinea.setText("Aerolinea");

        lblAsientosTotales.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblAsientosTotales.setForeground(new java.awt.Color(255, 255, 255));
        lblAsientosTotales.setText("Apellido");

        lblHoraDeSalida.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblHoraDeSalida.setForeground(new java.awt.Color(255, 255, 255));
        lblHoraDeSalida.setText("Hora de Salida");

        lblDestino.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(255, 255, 255));
        lblDestino.setText("Destino");

        lblHoraDeLlegada.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblHoraDeLlegada.setForeground(new java.awt.Color(255, 255, 255));
        lblHoraDeLlegada.setText("Hora de Llegada");

        lblCosto.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(255, 255, 255));
        lblCosto.setText("Nombre");

        txtHorallegada.setBackground(new java.awt.Color(204, 204, 204));
        txtHorallegada.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtHorallegada.setBorder(null);
        txtHorallegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorallegadaActionPerformed(evt);
            }
        });

        txtApellido.setBackground(new java.awt.Color(204, 204, 204));
        txtApellido.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtApellido.setBorder(null);

        txtDestino.setBackground(new java.awt.Color(204, 204, 204));
        txtDestino.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtDestino.setBorder(null);

        txtHorasalida.setBackground(new java.awt.Color(204, 204, 204));
        txtHorasalida.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtHorasalida.setBorder(null);

        txtAerolinea.setBackground(new java.awt.Color(204, 204, 204));
        txtAerolinea.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtAerolinea.setBorder(null);
        txtAerolinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAerolineaActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtNombre.setBorder(null);

        txtEstado.setBackground(new java.awt.Color(204, 204, 204));
        txtEstado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtEstado.setBorder(null);

        label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Identificacion");

        txtIdentificacion.setBackground(new java.awt.Color(204, 204, 204));
        txtIdentificacion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtIdentificacion.setBorder(null);

        lebl.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lebl.setForeground(new java.awt.Color(255, 255, 255));
        lebl.setText("Estado");

        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("Guardar datos del contacto");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("Guardar datos del contacto");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Guardar datos del contacto");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar1.setBackground(new java.awt.Color(255, 51, 51));
        btnAgregar1.setText("Cerrar Sesion");
        btnAgregar1.setToolTipText("Guardar datos del contacto");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        txtId.setBackground(new java.awt.Color(0, 134, 190));
        txtId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtId.setBorder(null);

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addComponent(lblAsientosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(lebl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(178, Short.MAX_VALUE))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIdentificacion, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHorasalida))
                                    .addComponent(lblHoraDeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHoraDeLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtHorallegada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                        .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(txtId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAerolinea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsientosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lebl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraDeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoraDeLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHorasalida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorallegada, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jpRutas.setBackground(new java.awt.Color(255, 255, 255));
        jpRutas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Tickets", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tbltickes.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tbltickes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbltickes.setToolTipText("Listado de contactos");
        tbltickes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltickesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbltickes);

        javax.swing.GroupLayout jpRutasLayout = new javax.swing.GroupLayout(jpRutas);
        jpRutas.setLayout(jpRutasLayout);
        jpRutasLayout.setHorizontalGroup(
            jpRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRutasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpRutasLayout.setVerticalGroup(
            jpRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRutasLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpRutas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpRutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpRutas.getAccessibleContext().setAccessibleName("Registro tickest");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void popEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popEliminarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Se eliminara el registro, desea continuar?", "Eliminar Registro",
                JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                String Borrar = "DELETE FROM tickets_reservados WHERE id='" + "'";
                PreparedStatement ps;
                ps = (PreparedStatement) cn.prepareStatement(Borrar);
                int respuesta = ps.executeUpdate();
                if (respuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado con exito!");
                    limpiarCampos();
                    mostrarDatos("");
                } else {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado la fila a ser borrada.");

                }
            } catch (SQLException e) {
                System.err.println("Error al eliminar...." + e);
                JOptionPane.showMessageDialog(null, "Error al eliminar!");
            }

        } else {
            limpiarCampos();
            mostrarDatos("");
            // btnActualizar.setEnabled(false);
            //btnCancelar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
    }//GEN-LAST:event_popEliminarActionPerformed

    private void tbltickesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltickesMouseClicked

        int fila = this.tbltickes.getSelectedRow();
          this.txtId.setText(this.tbltickes.getValueAt(fila,  0).toString());
        this.txtIdentificacion.setText(this.tbltickes.getValueAt(fila, 1).toString());
        this.txtNombre.setText(this.tbltickes.getValueAt(fila, 2).toString());
        this.txtApellido.setText(this.tbltickes.getValueAt(fila, 3).toString());
        this.txtAerolinea.setText(this.tbltickes.getValueAt(fila, 4).toString());
        this.txtDestino.setText(this.tbltickes.getValueAt(fila, 5).toString());
        this.txtHorasalida.setText(this.tbltickes.getValueAt(fila, 6).toString());
        this.txtHorallegada.setText(this.tbltickes.getValueAt(fila, 7).toString());
        this.txtEstado.setText(this.tbltickes.getValueAt(fila, 8).toString());


    }//GEN-LAST:event_tbltickesMouseClicked

    private void txtAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAerolineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAerolineaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String insertarSQL = "INSERT INTO  tickets_reservados ( Identificacion, Nombre, Apellido, Aerolinea,Destino, Hora_de_salida, Hora_de_llegada,Estado ) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = (PreparedStatement) cn.prepareStatement(insertarSQL);
            ps.setString(1, txtIdentificacion.getText());
            ps.setString(2, txtNombre.getText());
            ps.setString(3, txtApellido.getText());
            ps.setString(4, txtAerolinea.getText());
            ps.setString(5, txtDestino.getText());
            ps.setString(6, txtHorasalida.getText());
            ps.setString(7, txtHorallegada.getText());
            ps.setString(8, txtEstado.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Registro realizado con exito.");

            btnAgregar.setEnabled(true);
            mostrarDatos("");
            limpiarCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al tratar de insertar los datos: " + ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed


    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        try {
            PreparedStatement ps =cn.prepareStatement("Update tickets_reservados  set Identificacion='"+txtIdentificacion.getText()+"', Nombre ='"+txtNombre.getText()+"', Apellido ='"+txtApellido.getText()+"', Aerolinea ='"+txtAerolinea.getText()+"',Destino ='"+txtDestino.getText()+"', Hora_de_salida ='"+txtHorasalida.getText()+"', Hora_de_llegada ='"+txtHorallegada.getText()+"',  Estado ='"+txtEstado.getText()+"' where ID='"+txtId.getText()+ "'");
            
            int  indice =ps.executeUpdate();
            
            if(indice>0){
               JOptionPane.showMessageDialog(rootPane, "Actualizacion realizada con exito.");
                mostrarDatos("");
                 limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(rootPane, "no");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al tratar de insertar los datos: " + ex);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtHorallegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorallegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorallegadaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
           var idc = txtId.getText();
                   int fila = tbltickes.getSelectedRow();
            try{
            if(fila < 0){
                JOptionPane.showMessageDialog(rootPane, "Cleinte no tiene selecionado");
                limpiarCampos();
            }else{
                
                String sql = "delete from ickets_reservados where ID="+idc;
                    }}
            catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al tratar de insertar los datos: " + e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tikes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tikes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tikes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tikes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tikes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnAgregar1;
    public javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpRutas;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lblAerolinea;
    private javax.swing.JLabel lblAsientosTotales;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblHoraDeLlegada;
    private javax.swing.JLabel lblHoraDeSalida;
    private javax.swing.JLabel lebl;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JMenuItem popEliminar;
    private javax.swing.JPopupMenu popMenu;
    public javax.swing.JTable tbltickes;
    private javax.swing.JTextField txtAerolinea;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtHorallegada;
    private javax.swing.JTextField txtHorasalida;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos(String valorBuscar) {
        String consultaSQL = "SELECT * FROM tickets_reservados WHERE CONCAT(Nombre, ' ', Apellido) LIKE '%" + valorBuscar + "%'";

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Identificacion");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Aerolinea");
        modelo.addColumn("Destino");
        modelo.addColumn("Hora_de_salida");
        modelo.addColumn("Hora_de_llegada");
        modelo.addColumn("Estado");

        tbltickes.setModel(modelo);

// Asegúrate de que el tamaño del array `data` coincida con el número de columnas en el modelo
        String[] data = new String[9]; // Hay 9 columnas en el modelo
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);
            while (rs.next()) {
                data[0] = rs.getString("ID"); // Usar nombres de columnas en lugar de índices
                data[1] = rs.getString("Identificacion");
                data[2] = rs.getString("Nombre");
                data[3] = rs.getString("Apellido");
                data[4] = rs.getString("Aerolinea");
                data[5] = rs.getString("Destino");
                data[6] = rs.getString("Hora_de_salida");
                data[7] = rs.getString("Hora_de_llegada");
                data[8] = rs.getString("Estado");
                modelo.addRow(data);
            }
            tbltickes.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error en la consulta SQL: " + ex.getMessage());
        }

    }

    private void limpiarCampos() {

        txtId.setText("");
        txtIdentificacion.setText("");
        txtAerolinea.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        txtDestino.setText("");
        txtHorallegada.setText("");
        txtHorasalida.setText("");
        txtEstado.setText("");
    }
}
