/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shha;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import static shha.mainGUI2.empContainerPanel;
import static shha.mainGUI2.adminContainerPanel;
import static shha.mainGUI2.viewEmpPanel;
import static shha.mainGUI2.defaultEmpPanel;
import static shha.mainGUI2.empTablePanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Sheldon
 */
public class ViewEmpDialog extends javax.swing.JDialog {
    //instance table model
DefaultTableModel tableModel = new DefaultTableModel() {

    @Override
    public boolean isCellEditable(int row, int column) {
       //all cells false
       return false;
    }
};

    /**
     * Creates new form testDialog
     */
    public ViewEmpDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewAllButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        employeeText = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Employees");
        setPreferredSize(new java.awt.Dimension(379, 250));

        viewAllButton.setText("View All");
        viewAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        employeeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeTextActionPerformed(evt);
            }
        });

        searchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchLabel.setText("Search Employees By Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchButton))
                    .addComponent(employeeText)
                    .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {searchButton, viewAllButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(searchLabel)
                .addGap(18, 18, 18)
                .addComponent(employeeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(viewAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {searchButton, viewAllButton});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllButtonActionPerformed
        this.dispose();

        EmpTablePanel empTable = new EmpTablePanel();
        JTable table = empTable.getTable();
        AbstractTableModel model = (AbstractTableModel)table.getModel();
        model.fireTableDataChanged();
        
        Database db = new Database("SMSDB2");
        ResultSet rs = db.queryEmployees();
        if (rs == null) {
             JOptionPane.showMessageDialog(rootPane, "No employees found");
        }
        table.setModel((AbstractTableModel)DbUtils.resultSetToTableModel(rs));
        
        table.repaint();
        table.revalidate();
        empTable.repaint();
        empTable.revalidate();

        empTablePanel.removeAll();
        empTablePanel.repaint();
        empTablePanel.revalidate();

        empTablePanel.add(empTable);
        empTablePanel.repaint();
        empTablePanel.revalidate();

        empContainerPanel.removeAll();
        empContainerPanel.repaint();
        empContainerPanel.revalidate();

        empContainerPanel.add(empTablePanel);
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
    }//GEN-LAST:event_viewAllButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        this.dispose();

        EmpTablePanel empTable = new EmpTablePanel();
        JTable table = empTable.getTable();
        AbstractTableModel model = (AbstractTableModel)table.getModel();
        model.fireTableDataChanged();
        
        Database db = new Database("SMSDB2");
        String employee = employeeText.getText();
        ResultSet rs = db.searchForEmployee(employee);
        
        
        table.setModel(DbUtils.resultSetToTableModel(rs));
        
        table.repaint();
        table.revalidate();
        empTable.repaint();
        empTable.revalidate();

        empTablePanel.removeAll();
        empTablePanel.repaint();
        empTablePanel.revalidate();

        empTablePanel.add(empTable);
        empTablePanel.repaint();
        empTablePanel.revalidate();

        empContainerPanel.removeAll();
        empContainerPanel.repaint();
        empContainerPanel.revalidate();

        empContainerPanel.add(empTablePanel);
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void employeeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeTextActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEmpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEmpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEmpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEmpDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewEmpDialog dialog = new ViewEmpDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField employeeText;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JButton viewAllButton;
    // End of variables declaration//GEN-END:variables
}
