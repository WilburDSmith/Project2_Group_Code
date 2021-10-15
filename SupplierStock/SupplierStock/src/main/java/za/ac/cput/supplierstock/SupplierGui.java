/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.supplierstock;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import za.ac.cput.supplierstock.dao.SupplierDAO;
import za.ac.cput.supplierstock.domain.Supplier;

/**
 *
 * @author Alizwa
 */
public class SupplierGui extends javax.swing.JFrame {

	SupplierDAO dao;

	int ok;
	Supplier sup;
	DefaultTableModel table;
        Supplier supp = new Supplier();
	
	public SupplierGui() throws SQLException {
		dao = new SupplierDAO();
		initComponents();
		tablel();
	}
////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////	
//This  Method Adds the values from the textfields to the table

	public void tablel() throws SQLException {
		table = (DefaultTableModel) jTable1.getModel();
		table.setRowCount(0);
    
		List<Supplier> suppliers;

		suppliers = dao.getAll();

//Adding attributes values to the table from the arrayList
		for (int i = 0; i < suppliers.size(); i++) {

			int SupplierId = suppliers.get(i).getSupplierId();
			String SupplierName = suppliers.get(i).getSupplierName();
			String SupplierPhone = suppliers.get(i).getSupplierPhone();
			String SupplierEmail = suppliers.get(i).getSupplierEmail();
			String SupplierAddress = suppliers.get(i).getSupplierAddress();

	Object[] supplierAttributes = {SupplierId, SupplierName, SupplierPhone, SupplierEmail, SupplierAddress};
			table.addRow(supplierAttributes);
		}

	}
////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////	

	//Placing values on from the table to the textfields
	public void Tableselect() {
		table = (DefaultTableModel) jTable1.getModel();
		ok = jTable1.getSelectedRow();

		int SupplierId = Integer.parseInt(table.getValueAt(ok, 0).toString());

		jTextSupplierId.setText(table.getValueAt(ok, 0).toString());
		jTextSupplierName.setText(table.getValueAt(ok, 1).toString());
		jTextSupplierPhone.setText(table.getValueAt(ok, 2).toString());
		jTextSupplierEmail.setText(table.getValueAt(ok, 3).toString());
		jTextSupplierAddress.setText(table.getValueAt(ok, 4).toString());

		jButtonAdd.setEnabled(false);

	}

	public void clear() {
		try {
			jTextSupplierId.setText("");
			jTextSupplierName.setText("");
			jTextSupplierPhone.setText("");
			jTextSupplierEmail.setText("");
			jTextSupplierAddress.setText("");

			tablel();
			jButtonAdd.setEnabled(true);
		} catch (SQLException ex) {
			Logger.getLogger(SupplierGui.class.getName()).log(Level.SEVERE, null, ex);
		}
		


	}
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jButtonStock1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jButtonRemove = new javax.swing.JButton();
                jButtonAdd = new javax.swing.JButton();
                jButtonUpdate = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jPanel6 = new javax.swing.JPanel();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                jTextSupplierId = new javax.swing.JTextField();
                jTextSupplierName = new javax.swing.JTextField();
                jTextSupplierPhone = new javax.swing.JTextField();
                jTextSupplierEmail = new javax.swing.JTextField();
                jTextSupplierAddress = new javax.swing.JTextField();
                jButtonStock = new javax.swing.JButton();
                jButtonStock2 = new javax.swing.JButton();
                jButtonStock3 = new javax.swing.JButton();

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                );

                jButtonStock1.setBackground(new java.awt.Color(0, 0, 0));
                jButtonStock1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
                jButtonStock1.setForeground(new java.awt.Color(245, 90, 0));
                jButtonStock1.setText("Stock");
                jButtonStock1.setToolTipText("");
                jButtonStock1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonStock1ActionPerformed(evt);
                        }
                });

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(245, 90, 0));
                jLabel1.setText("STOCK SHIELD");

                jPanel3.setBackground(new java.awt.Color(0, 0, 0));
                jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                jPanel3.setForeground(new java.awt.Color(245, 90, 0));
                jPanel3.setToolTipText("");

                jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(240, 90, 0));
                jLabel2.setText("SUPPLIER");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jButtonRemove.setBackground(new java.awt.Color(0, 0, 0));
                jButtonRemove.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
                jButtonRemove.setForeground(new java.awt.Color(245, 90, 0));
                jButtonRemove.setText("Remove");
                jButtonRemove.setToolTipText("");
                jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonRemoveActionPerformed(evt);
                        }
                });

                jButtonAdd.setBackground(new java.awt.Color(0, 0, 0));
                jButtonAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
                jButtonAdd.setForeground(new java.awt.Color(245, 90, 0));
                jButtonAdd.setText("Add ");
                jButtonAdd.setToolTipText("");
                jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonAddActionPerformed(evt);
                        }
                });

                jButtonUpdate.setBackground(new java.awt.Color(0, 0, 0));
                jButtonUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
                jButtonUpdate.setForeground(new java.awt.Color(245, 90, 0));
                jButtonUpdate.setText("Update");
                jButtonUpdate.setToolTipText("");
                jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonUpdateActionPerformed(evt);
                        }
                });

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "SupplierId", "SupplierName", "SupplierPhone", "SupplierEmail", "SupplierAddress"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jTable1MouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(jTable1);

                jPanel6.setBackground(new java.awt.Color(250, 90, 0));
                jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jLabel10.setBackground(new java.awt.Color(0, 0, 0));
                jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                jLabel10.setText("Supplier Id");

                jLabel11.setBackground(new java.awt.Color(0, 0, 0));
                jLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                jLabel11.setText("Supplier Phone");

                jLabel12.setBackground(new java.awt.Color(0, 0, 0));
                jLabel12.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                jLabel12.setText("Supplier Email");

                jLabel13.setBackground(new java.awt.Color(0, 0, 0));
                jLabel13.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                jLabel13.setText("Supplier Name");

                jLabel14.setBackground(new java.awt.Color(0, 0, 0));
                jLabel14.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                jLabel14.setText("Supplier Address");

                jTextSupplierId.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextSupplierIdActionPerformed(evt);
                        }
                });

                jTextSupplierAddress.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextSupplierAddressActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextSupplierAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                                .addComponent(jTextSupplierEmail)
                                                .addComponent(jTextSupplierPhone, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jTextSupplierId, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextSupplierName))
                                .addGap(24, 24, 24))
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextSupplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextSupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
                );

                jButtonStock.setBackground(new java.awt.Color(0, 0, 0));
                jButtonStock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
                jButtonStock.setForeground(new java.awt.Color(245, 90, 0));
                jButtonStock.setText("Stock");
                jButtonStock.setToolTipText("");
                jButtonStock.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonStockActionPerformed(evt);
                        }
                });

                jButtonStock2.setBackground(new java.awt.Color(0, 0, 0));
                jButtonStock2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
                jButtonStock2.setForeground(new java.awt.Color(245, 90, 0));
                jButtonStock2.setText("Close");
                jButtonStock2.setToolTipText("");
                jButtonStock2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonStock2ActionPerformed(evt);
                        }
                });

                jButtonStock3.setBackground(new java.awt.Color(0, 0, 0));
                jButtonStock3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
                jButtonStock3.setForeground(new java.awt.Color(245, 90, 0));
                jButtonStock3.setText("Clear");
                jButtonStock3.setToolTipText("");
                jButtonStock3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonStock3ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButtonStock2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(136, 136, 136)
                                .addComponent(jButtonStock)
                                .addGap(21, 21, 21))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonStock3))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jButtonStock, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addComponent(jButtonStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
		
		
		      table = (DefaultTableModel) jTable1.getModel();
			ok = jTable1.getSelectedRow();
	
			int SupplierId = Integer.parseInt(table.getValueAt(ok, 0).toString());
			dao.delete(SupplierId);
			clear();
        }//GEN-LAST:event_jButtonRemoveActionPerformed

        private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

		//Add button
		try {
			int SupplierId = Integer.parseInt(jTextSupplierId.getText());
			String SupplierName = jTextSupplierName.getText();
			String SupplierPhone = jTextSupplierPhone.getText();
			String SupplierEmail = jTextSupplierEmail.getText();
			String SupplierAddress = jTextSupplierAddress.getText();

			 supp = new Supplier(SupplierId, SupplierName, SupplierPhone, SupplierEmail, SupplierAddress);
			sup = dao.save(supp);
			if (sup.equals(supp)) {
				JOptionPane.showMessageDialog(null, "Added Successfully");
			} else {
				JOptionPane.showMessageDialog(null, "Encountered a problem ");
			}

			clear();

		} catch (SQLException ex) {
			Logger.getLogger(SupplierGui.class.getName()).log(Level.SEVERE, null, ex);
		}


        }//GEN-LAST:event_jButtonAddActionPerformed

        private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
			table = (DefaultTableModel) jTable1.getModel();
			ok = jTable1.getSelectedRow();
			//int SupplierId = Integer.parseInt(jTextSupplierId.getText());
			int SupplierId = Integer.parseInt(table.getValueAt(ok, 0).toString());
			
			

try {
			Integer.parseInt(jTextSupplierId.getText());
			String SupplierName = jTextSupplierName.getText();
			String SupplierPhone = jTextSupplierPhone.getText();
			String SupplierEmail = jTextSupplierEmail.getText();
			String SupplierAddress = jTextSupplierAddress.getText();

			 supp = new Supplier(SupplierId, SupplierName, SupplierPhone, SupplierEmail, SupplierAddress);
			sup = dao.Update(supp);
		if (sup.equals(supp)) {
				JOptionPane.showMessageDialog(null, "Updated Successfully");
			} else {
				JOptionPane.showMessageDialog(null, "Encountered a problem ");
			}

			clear();

		} catch (SQLException ex) {
			Logger.getLogger(SupplierGui.class.getName()).log(Level.SEVERE, null, ex);
		}
	
		
        }//GEN-LAST:event_jButtonUpdateActionPerformed

        private void jTextSupplierAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSupplierAddressActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_jTextSupplierAddressActionPerformed

        private void jButtonStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStockActionPerformed
		try {
			// TODO add your handling code here:
			StockGui st = new StockGui();
			st.setVisible(true);
		} catch (SQLException ex) {
			Logger.getLogger(SupplierGui.class.getName()).log(Level.SEVERE, null, ex);
		}

        }//GEN-LAST:event_jButtonStockActionPerformed

        private void jTextSupplierIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSupplierIdActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_jTextSupplierIdActionPerformed

        private void jButtonStock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStock1ActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_jButtonStock1ActionPerformed

        private void jButtonStock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStock2ActionPerformed
		System.exit(0);
        }//GEN-LAST:event_jButtonStock2ActionPerformed

        private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
		Tableselect();
        }//GEN-LAST:event_jTable1MouseClicked

        private void jButtonStock3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStock3ActionPerformed
               clear();
        }//GEN-LAST:event_jButtonStock3ActionPerformed

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
			java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new SupplierGui().setVisible(true);
				} catch (SQLException ex) {
					Logger.getLogger(SupplierGui.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButtonAdd;
        private javax.swing.JButton jButtonRemove;
        private javax.swing.JButton jButtonStock;
        private javax.swing.JButton jButtonStock1;
        private javax.swing.JButton jButtonStock2;
        private javax.swing.JButton jButtonStock3;
        private javax.swing.JButton jButtonUpdate;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField jTextSupplierAddress;
        private javax.swing.JTextField jTextSupplierEmail;
        private javax.swing.JTextField jTextSupplierId;
        private javax.swing.JTextField jTextSupplierName;
        private javax.swing.JTextField jTextSupplierPhone;
        // End of variables declaration//GEN-END:variables
}
