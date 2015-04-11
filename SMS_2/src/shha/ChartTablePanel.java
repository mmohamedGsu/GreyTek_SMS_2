/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shha;

import javax.swing.JTable;
import static shha.mainGUI2.patientsContainerPanel;

/**
 *
 * @author Sheldon
 */
public class ChartTablePanel extends javax.swing.JPanel {

    /**
     * Creates new form ChartTablePanel
     */
    public ChartTablePanel() {
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

        chartScollPane = new javax.swing.JScrollPane();
        chartTable = new javax.swing.JTable();

        chartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Sex", "Phone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        chartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chartTableMouseClicked(evt);
            }
        });
        chartScollPane.setViewportView(chartTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chartScollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chartScollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chartTableMouseClicked
        if (evt.getClickCount() == 2) {
            JTable target = (JTable)evt.getSource();
            int row = target.getSelectedRow();
            int column = target.getSelectedColumn();
            System.out.println("Double Click on Row worked");

            patientsContainerPanel.removeAll();
            patientsContainerPanel.repaint();
            patientsContainerPanel.revalidate();

            ViewChartPanel viewChartPanel = new ViewChartPanel();

            patientsContainerPanel.add(viewChartPanel);
            patientsContainerPanel.repaint();
            patientsContainerPanel.revalidate();
        }
    }//GEN-LAST:event_chartTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane chartScollPane;
    private javax.swing.JTable chartTable;
    // End of variables declaration//GEN-END:variables

    public JTable getTable(){
        return chartTable;
    }

}
