/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shha;

import java.awt.TextArea;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTextArea;
import static shha.mainGUI2.tcPanel;


/**
 *
 * @author Sheldon
 */
public class TimeClockPanel extends javax.swing.JPanel {

    /**
     * Creates new form TimeClockPanel
     */
    
    Date timeIn, timeOut;   //instance variables for when they punch in and out
    
    public TimeClockPanel() {
        initComponents();
        timeIn = null;         //null when initialized
        timeOut = null;
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
        timeTextArea = new javax.swing.JTextArea();
        punchInButton = new javax.swing.JButton();
        punchOutButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 500));

        timeTextArea.setColumns(20);
        timeTextArea.setLineWrap(true);
        timeTextArea.setRows(5);
        timeTextArea.setWrapStyleWord(true);
        timeTextArea.setMaximumSize(new java.awt.Dimension(500, 500));
        timeTextArea.setMinimumSize(new java.awt.Dimension(500, 500));
        timeTextArea.setPreferredSize(new java.awt.Dimension(500, 500));
        jScrollPane1.setViewportView(timeTextArea);

        punchInButton.setText("Punch In");
        punchInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punchInButtonActionPerformed(evt);
            }
        });

        punchOutButton.setText("Punch Out");
        punchOutButton.setEnabled(false);
        punchOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punchOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(punchInButton)
                    .addComponent(punchOutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {punchInButton, punchOutButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(punchInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(punchOutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {punchInButton, punchOutButton});

    }// </editor-fold>//GEN-END:initComponents

    private void punchInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punchInButtonActionPerformed
        punchInButton.setEnabled(false);
        punchOutButton.setEnabled(true);
        Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        timeIn = now;         //make timeIn that calendar time
        System.out.println("Punch In - " + now.toString());
        
        JTextArea textArea = tcPanel.getTextArea();
        textArea.append("Punch In - " + now.toString()+"\n\n");
        tcPanel.repaint();
        tcPanel.revalidate();
    }//GEN-LAST:event_punchInButtonActionPerformed

    private void punchOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punchOutButtonActionPerformed
        punchOutButton.setEnabled(false);
        punchInButton.setEnabled(true);
        Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        System.out.println("Punch Out - " + now.toString());
        
        timeOut = now;             //make timeout the time they punched out
        calculateTimeWorked(); //Display time worked on console
        JTextArea textArea = tcPanel.getTextArea();
        textArea.append("Punch Out - " + now.toString()+"\n\n");
        tcPanel.repaint();
        tcPanel.revalidate();
    }//GEN-LAST:event_punchOutButtonActionPerformed

    
    private void calculateTimeWorked(){             //let's get to it
        long off = timeOut.getTime();       //get that particular date in milliseconds
        System.out.println(off); //test
        long on = timeIn.getTime();         //same as line above
        System.out.println(on); //test

        //subtract total time then were in the office in milliseconds
        long workedTimeInMillis = off - on;
        System.out.println(workedTimeInMillis); //test
        
        /* -1000 miliseconds make a minute, therefore 60,000 miliseconds make a minute
           -to calculate every 15minutes they are on the clock, 60,000*15
           - making it 900,000 miliseconds for every 15minutes
           - every 4 15mins make an hour, so divide by 4 to get total hours worked
           - make double to account for decimals.
        */
        
        long per15mins = (workedTimeInMillis/900000);
        System.out.println(per15mins);
        double hoursWorked = per15mins/4;
        
        System.out.println("Total hours worked= " + hoursWorked);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton punchInButton;
    private javax.swing.JButton punchOutButton;
    private javax.swing.JTextArea timeTextArea;
    // End of variables declaration//GEN-END:variables

    public JTextArea getTextArea(){
        return timeTextArea;
    }

}
