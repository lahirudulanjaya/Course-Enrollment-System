/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_view;

import NSBMCourseEnrollmentSystem_control.Undergraduate_Student_controll;
import NSBMCourseEnrollmentSystem_model.Undergraduate_Student;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Show_undergraduate extends javax.swing.JFrame {

    /**
     * Creates new form Show_undergraduate
     */
    public Show_undergraduate() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        business = new javax.swing.JRadioButton();
        computing = new javax.swing.JRadioButton();
        engineering = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show All");
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Full Name", "Age", "Gender", "Address", "Date of Birth", "Phone number"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 770, 390));

        jLabel1.setText("Faculty");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 30));

        buttonGroup1.add(business);
        business.setText("School of Business");
        getContentPane().add(business, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        buttonGroup1.add(computing);
        computing.setText("School of Computing");
        getContentPane().add(computing, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        buttonGroup1.add(engineering);
        engineering.setText("School of Engineering");
        getContentPane().add(engineering, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jToggleButton1.setText("Show Students");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 150, -1));

        jToggleButton2.setText("Back");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 90, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            
            ArrayList<Undergraduate_Student> students = Undergraduate_Student_controll.getall();
            DefaultTableModel tbl = (DefaultTableModel) table.getModel();
            tbl.setRowCount(0);
            for(Undergraduate_Student st : students){
                
                Object[] Data={st.getAdmission_number(),st.getName(),st.getAge(),st.getGender(),st.getAddress(),st.getDOB(),st.getPhone_number()};
                if(business.isSelected() && "School of Business".equals(st.getFaculty())){
                    tbl.addRow(Data);
                }
                else if(computing.isSelected() && "School of Computing".equals(st.getFaculty())){
                     tbl.addRow(Data);
                }
                else if(engineering.isShowing() && "School of Engineering".equals(st.getFaculty())){
                    tbl.addRow(Data);
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Show_undergraduate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       this.dispose();
        Admin_Undergraduate ad = new Admin_Undergraduate();
        ad.setVisible(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Show_undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_undergraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_undergraduate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton business;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton computing;
    private javax.swing.JRadioButton engineering;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}