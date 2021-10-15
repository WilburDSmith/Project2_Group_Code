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
import za.ac.cput.supplierstock.dao.StockDAO;
import za.ac.cput.supplierstock.domain.Stock;
import za.ac.cput.supplierstock.domain.Supplier;

/**
 *
 * @author Alizwa
 */
public class StockGui extends javax.swing.JFrame {
StockDAO dao;
Stock st;
Stock stk = new Stock();
int ok;
DefaultTableModel table;
	public StockGui() throws SQLException {
		dao = new StockDAO();
		initComponents();
		table();
	}
//This Method Adds the values in the arrylist/database table and displays them on the gui table
	public void table()
	{
		table = (DefaultTableModel) jTable1.getModel();
		table.setRowCount(0);
    
		List<Stock> stockList;

		 stockList= dao.getAll();

//Adding attributes values to the table from the arrayList
		for (int i = 0; i < stockList.size(); i++) {

		int StockId = stockList.get(i).getStockId();
		String StockName = stockList.get(i).getStockName();
		String StockType = stockList.get(i).getStockType();
		String  StockDescription = stockList.get(i).getStockDescription();
		String StockQuantity = stockList.get(i).getStockQuantity();
		String StockLocation = stockList.get(i).getStockLocation();
			
	

		Object[] stockAttributes = {StockId, StockName, StockType, StockDescription, StockQuantity,StockLocation};
			table.addRow(stockAttributes);
		}	
	}
		public void Tableselect() {
		table = (DefaultTableModel) jTable1.getModel();
		ok = jTable1.getSelectedRow();

		int StockId = Integer.parseInt(table.getValueAt(ok, 0).toString());

		jTextStockId.setText(table.getValueAt(ok, 0).toString());
		jTextStockName.setText(table.getValueAt(ok, 1).toString());
		jTextStockType.setText(table.getValueAt(ok, 2).toString());
		jTextStockDescription.setText(table.getValueAt(ok, 3).toString());
		jTextStockQuantity.setText(table.getValueAt(ok, 4).toString());
		jTextStockLocation.setText(table.getValueAt(ok, 5).toString());

		jButtonAdd.setEnabled(false);

	}
public void clear() {
	jTextStockId.setText("");
	jTextStockName.setText("");
	jTextStockType.setText("");
	jTextStockDescription.setText("");
	jTextStockQuantity.setText("");
	jTextStockLocation.setText("");
	table();
	jButtonAdd.setEnabled(true);
		


	}
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextStockId = new javax.swing.JTextField();
        jTextStockName = new javax.swing.JTextField();
        jTextStockType = new javax.swing.JTextField();
        jTextStockDescription = new javax.swing.JTextField();
        jTextStockLocation = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextStockQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRemove = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jclose = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonStock3 = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(250, 90, 0));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("Stock Id");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel11.setText("Stock Type");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel12.setText("Stock Description");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel13.setText("Stock Name");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel14.setText("Stock Quantity");

        jTextStockLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextStockLocationActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel15.setText("Stock Location");

        jTextStockQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextStockQuantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextStockLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextStockQuantity)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextStockDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                    .addComponent(jTextStockType, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextStockId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextStockName))))
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStockId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStockName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStockType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStockDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStockQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextStockLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StockId", "StockName", "StockType", "StockDescription", "StockQuantity", "StockLocation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 90, 0));
        jLabel1.setText("STOCK SHIELD");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(245, 90, 0));
        jPanel3.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 90, 0));
        jLabel2.setText("STOCK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        jRemove.setBackground(new java.awt.Color(0, 0, 0));
        jRemove.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRemove.setForeground(new java.awt.Color(245, 90, 0));
        jRemove.setText("Remove");
        jRemove.setToolTipText("");
        jRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoveActionPerformed(evt);
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

        jclose.setBackground(new java.awt.Color(0, 0, 0));
        jclose.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jclose.setForeground(new java.awt.Color(245, 90, 0));
        jclose.setText("Close");
        jclose.setToolTipText("");
        jclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcloseActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(245, 90, 0));
        jButton6.setText("Supplier");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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

        jUpdate.setBackground(new java.awt.Color(0, 0, 0));
        jUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jUpdate.setForeground(new java.awt.Color(245, 90, 0));
        jUpdate.setText("Update");
        jUpdate.setToolTipText("");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonStock3))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jclose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147)
                .addComponent(jButton6)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jclose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private void jTextStockLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextStockLocationActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextStockLocationActionPerformed

        private void jRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoveActionPerformed
	try {
		table = (DefaultTableModel) jTable1.getModel();
		ok = jTable1.getSelectedRow();
		
		int Stockid = Integer.parseInt(table.getValueAt(ok, 0).toString());
		dao.Delete(Stockid);
		clear();
	} catch (SQLException ex) {
		Logger.getLogger(StockGui.class.getName()).log(Level.SEVERE, null, ex);
	}
        }//GEN-LAST:event_jRemoveActionPerformed

        private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
           
	try {
		
		int StockId = Integer.parseInt(jTextStockId.getText());
		String StockName =  jTextStockName.getText();
		String StockType =  jTextStockType.getText();
		String  StockDescription =jTextStockDescription.getText();
		String StockQuantity =  jTextStockQuantity.getText();
		String StockLocation =  jTextStockLocation.getText();
			
			 
			 stk = new Stock(StockId, StockName , StockType,StockDescription, StockQuantity, StockLocation);
			st = dao.save(stk);
			if (st.equals(stk)) {
				JOptionPane.showMessageDialog(null, "Added Successfully");
			} else {
				JOptionPane.showMessageDialog(null, "Encountered a problem ");
			}

			clear();

		} catch (SQLException ex) {
			Logger.getLogger(SupplierGui.class.getName()).log(Level.SEVERE, null, ex);
		}

        }//GEN-LAST:event_jButtonAddActionPerformed

        private void jcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcloseActionPerformed
               System.exit(0);
		
        }//GEN-LAST:event_jcloseActionPerformed

        private void jTextStockQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextStockQuantityActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextStockQuantityActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
	try {
		// TODO add your handling code here:
		SupplierGui gui = new SupplierGui();
		gui.setVisible(true);
	} catch (SQLException ex) {
		Logger.getLogger(StockGui.class.getName()).log(Level.SEVERE, null, ex);
	}

        }//GEN-LAST:event_jButton6ActionPerformed

        private void jButtonStock3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStock3ActionPerformed
              clear();
        }//GEN-LAST:event_jButtonStock3ActionPerformed

        private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
               Tableselect();
        }//GEN-LAST:event_jTable1MouseClicked

        private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
              table = (DefaultTableModel) jTable1.getModel();
		ok = jTable1.getSelectedRow();
		
		int StockId = Integer.parseInt(table.getValueAt(ok, 0).toString());
		
		
	        Integer.parseInt(jTextStockId.getText());
		String StockName =  jTextStockName.getText();
		String StockType =  jTextStockType.getText();
		String  StockDescription =jTextStockDescription.getText();
		String StockQuantity =  jTextStockQuantity.getText();
		String StockLocation =  jTextStockLocation.getText();
		stk = new Stock(StockId, StockName , StockType,StockDescription, StockQuantity, StockLocation);
		st = dao.Update(stk);
		if (st.equals(stk)) {
			JOptionPane.showMessageDialog(null, "Added Successfully");
			clear();
		} else {
			JOptionPane.showMessageDialog(null, "Encountered a problem ");
		}
		clear();
		
        }//GEN-LAST:event_jUpdateActionPerformed

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
			java.util.logging.Logger.getLogger(StockGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(StockGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(StockGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(StockGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new StockGui().setVisible(true);
				} catch (SQLException ex) {
					Logger.getLogger(StockGui.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonStock3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jRemove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextStockDescription;
    private javax.swing.JTextField jTextStockId;
    private javax.swing.JTextField jTextStockLocation;
    private javax.swing.JTextField jTextStockName;
    private javax.swing.JTextField jTextStockQuantity;
    private javax.swing.JTextField jTextStockType;
    private javax.swing.JButton jUpdate;
    private javax.swing.JButton jclose;
    // End of variables declaration//GEN-END:variables
}
