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
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JFrame;
import static shha.mainGUI2.adminContainerPanel;
import static shha.mainGUI2.adminTablePanel;
import static shha.mainGUI2.defaultAdminPanel;
import static shha.mainGUI2.removeUserButton;
import static shha.mainGUI2.viewEmployeesButton;


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

        empScrollPane = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();

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
        empScrollPane.setViewportView(empTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
   
   
    //Method to capture the row that was Double Clicked on the table
    private void empTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTableMouseClicked
        if (evt.getClickCount() == 2) {
        JTable target = (JTable)evt.getSource();
        int row = target.getSelectedRow();
        int column = target.getSelectedColumn();
        
        Database db = new Database("SMSDB2");
        ResultSet rs = db.queryEmployeeInfo(empTable.getValueAt(row, 4).toString());
       
        //Determine if Employee Table is in view
        if (empContainerPanel.isShowing()){
        
        empContainerPanel.removeAll();
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
        
        try {
            rs.next();
            mainGUI2.empFirstNameText.setText(rs.getString(1));
            mainGUI2.empMiddleIntText.setText(rs.getString(2));
            mainGUI2.empLastNameText.setText(rs.getString((3)));
            //skip column 4 which is username
            //skip column 5 which is password
            //column 6 is position
            //column 7 is access level
            mainGUI2.empSSNText.setText(rs.getString(8));
            //column 9 is Sex
            mainGUI2.empAddress1Text.setText(rs.getString(10));
            mainGUI2.empAddress2Text.setText(rs.getString(11));
            mainGUI2.empCityText.setText(rs.getString(12));
            mainGUI2.empStateText.setText(rs.getString(13));
            mainGUI2.empZipText.setText(rs.getString(14));
            //15 is birth month
            //16 is birth day
            //17 is birth year
            mainGUI2.empPhoneText.setText(rs.getString(18));
            mainGUI2.empEmailText.setText(rs.getString(19));
                       
        } catch(SQLException e) {
            System.out.println("Error parsing users");
            System.out.println(e.toString());
        }
        
        empContainerPanel.add(viewEmpPanel);
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
        }
        
        
        if (adminContainerPanel.isShowing()){
            RemoveEmpDialog opForm = new RemoveEmpDialog(new JFrame(), true);
            opForm.setVisible(true);
        }
        
             
      }
        
    }//GEN-LAST:event_empTableMouseClicked

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane empScrollPane;
    private javax.swing.JTable empTable;
    // End of variables declaration//GEN-END:variables

    
    //Method to retrieve the Table
    public JTable getTable(){
        return empTable;
    }
}
