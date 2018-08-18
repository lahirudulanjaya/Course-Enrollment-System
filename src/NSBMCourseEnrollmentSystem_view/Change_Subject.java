/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_view;

import NSBMCourseEnrollmentSystem_control.Selected_Subject_controll;
import NSBMCourseEnrollmentSystem_control.Subject_controll;
import NSBMCourseEnrollmentSystem_model.Selected_Subjects;
import NSBMCourseEnrollmentSystem_model.Subject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Change_Subject extends javax.swing.JFrame {

    /**
     * Creates new form Choose_Subject_Undergraduate
     */
    public static int attempt=0;
    public Change_Subject() {
        initComponents();
        if(Change_Subject.attempt==1){
            confirm.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        confirm = new javax.swing.JToggleButton();
        confirm1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Subjects");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Change Subjects");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 206, 31));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Admission Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 30));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 190, 30));

        jToggleButton1.setText("View Subjects");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 140, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Compulsory Subjects");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 210, 40));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Code", "Subject", "Select"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setMinWidth(120);
            Table.getColumnModel().getColumn(0).setMaxWidth(120);
            Table.getColumnModel().getColumn(2).setMinWidth(80);
            Table.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 640, 130));

        confirm.setText("Change");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 160, 40));

        confirm1.setText("Back");
        confirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm1ActionPerformed(evt);
            }
        });
        getContentPane().add(confirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 160, 40));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Code", "Subject"
            }
        ));
        jScrollPane2.setViewportView(Table1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 660, 100));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Select Subjects");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 110, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
            
            try {
                ArrayList<Subject> subject_list = Subject_controll.view_notcompulsory(id.getText());
                ArrayList<Subject> subject_list_com = Subject_controll.view_compulsory(id.getText());
                DefaultTableModel tbl = (DefaultTableModel) Table.getModel();
                DefaultTableModel tb2 = (DefaultTableModel) Table1.getModel();
                tbl.setRowCount(0);
                tb2.setRowCount(0);
                for(Subject sub :subject_list){
                    Object data[]={sub.getSubject_code(),sub.getName(),sub.isCompulsory()};
                    tbl.addRow(data);
                    }
                for(Subject sub :subject_list_com){
                    Object data[]={sub.getSubject_code(),sub.getName()};
                    tb2.addRow(data);
                    }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Change_Subject.class.getName()).log(Level.SEVERE, null, ex);
            }

            
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
      if(getsum()!=4){  
          JOptionPane.showMessageDialog(this,"Select Four Subjects");
      }
      
      else{
         try { 
            Selected_Subject_controll.Delete_subject(id.getText());
          for(int i=0;i<Table.getRowCount();i++){
              Selected_Subjects ss =new Selected_Subjects();
              ss.setSubject_code((String) Table.getValueAt(i,0));
              ss.setStudent_id(id.getText());
              ss.setCompulsory(false);
              if(Table.getValueAt(i,2).equals(true)){
              Selected_Subject_controll.add_subject(ss);
              }
          }
           
          
          
                  JOptionPane.showMessageDialog(jMenu1, "Success");
                  
              } catch (SQLException ex) {
                  
                 JOptionPane.showMessageDialog(jMenu1,ex);
              }
          
          
          
      }
      
        
        
    }//GEN-LAST:event_confirmActionPerformed

    private void confirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm1ActionPerformed
       this.dispose();
        Student_Ability ad = new Student_Ability();
        ad.setVisible(true);
    }//GEN-LAST:event_confirm1ActionPerformed

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
            java.util.logging.Logger.getLogger(Change_Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new Change_Subject().setVisible(true);
            }
        });
    }
    public int getsum(){
        int sum =0;
        for(int i=0;i<Table.getRowCount();i++){
            if(Boolean.valueOf((boolean) Table.getValueAt(i, 2)).equals(true)){
                sum=sum+1;
            }
            
        }
        return sum;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTable Table1;
    private javax.swing.JToggleButton confirm;
    private javax.swing.JToggleButton confirm1;
    private javax.swing.JTextField id;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
