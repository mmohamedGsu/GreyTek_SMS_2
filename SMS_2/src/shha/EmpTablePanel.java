/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shha;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import static shha.mainGUI2.empContainerPanel;
import static shha.mainGUI2.empTablePanel;
import static shha.mainGUI2.viewEmpPanel;

/**
 *
 * @author Sheldon
 */
public class EmpTablePanel extends javax.swing.JPanel {

    /**
     * Creates new form testTable
     */
    public EmpTablePanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        testButton = new javax.swing.JButton();
        removeColButton = new javax.swing.JButton();

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Key", "Employee ID", "First Name", "Last Name", "Position", "Phone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        empTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empTable);

        testButton.setText("Test");
        testButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButtonActionPerformed(evt);
            }
        });

        removeColButton.setText("RmCol1");
        removeColButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeColButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeColButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(testButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(removeColButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(testButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //Test DB and table sync
    private void testButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButtonActionPerformed
       
    }//GEN-LAST:event_testButtonActionPerformed
    
    //Method to remove the 1st Column (Key) from the table
    private void removeColButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeColButtonActionPerformed
        EmpTablePanel empTable = new EmpTablePanel();
        JTable table = empTable.getTable();
        table.removeColumn(table.getColumnModel().getColumn(0));
        
        AbstractTableModel model = (AbstractTableModel)table.getModel();
        model.fireTableDataChanged();
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
    }//GEN-LAST:event_removeColButtonActionPerformed
    
    //Method to capture the row that was Double Clicked on the table
    private void empTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTableMouseClicked
        if (evt.getClickCount() == 2) {
        JTable target = (JTable)evt.getSource();
        int row = target.getSelectedRow();
        int column = target.getSelectedColumn();
        System.out.println("Double Click on Row worked");
         
        empContainerPanel.removeAll();
        empContainerPanel.repaint();
        empContainerPanel.revalidate();

        empContainerPanel.add(viewEmpPanel);
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
         }
    }//GEN-LAST:event_empTableMouseClicked

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable empTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeColButton;
    private javax.swing.JButton testButton;
    // End of variables declaration//GEN-END:variables

    
    //Method to retrieve the Table
    public JTable getTable(){
        return empTable;
    }
}
