/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_view;

import NSBMCourseEnrollmentSystem_control.Postgraduate_student_controll;
import NSBMCourseEnrollmentSystem_control.Undergraduate_Student_controll;
import NSBMCourseEnrollmentSystem_model.Postgraduate;
import NSBMCourseEnrollmentSystem_model.Undergraduate_Student;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class Update_Postgraduate extends javax.swing.JFrame {

    /**
     * Creates new form Find
     */
    public Update_Postgraduate() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        stu_id = new javax.swing.JTextField();
        update = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        phn_num = new javax.swing.JTextField();
        faculty = new javax.swing.JTextField();
        course = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        reset = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        semester = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        degree = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        institute = new javax.swing.JTextField();
        jToggleButton3 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Insert Student ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 158, 42));
        jPanel1.add(stu_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 173, 42));

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, 120, 40));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel2.setText("Institute");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 180, 40));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, 40));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel7.setText("Age");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 180, 40));

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, 40));

        jLabel11.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel11.setText("Date Of birth");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 180, 40));

        jLabel13.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel13.setText("phone number");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, 40));

        jLabel15.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel15.setText("faculty");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 180, 40));

        jLabel17.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel17.setText("course");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 180, 40));

        jLabel21.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel21.setText("Student Id");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 40));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 300, 30));
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 300, 30));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 300, 30));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 300, 30));
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 300, 30));
        jPanel1.add(phn_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 300, 30));
        jPanel1.add(faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 300, 30));
        jPanel1.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 300, 30));
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 300, 30));

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton2.setText("DELETE");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 120, 40));

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton1.setText("Search");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 120, 40));

        reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 120, 40));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel3.setText("Student Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, 40));
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 300, 30));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel4.setText("YEaR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 180, 40));
        jPanel1.add(semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 300, 30));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel6.setText("SEMESTER");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 180, 40));
        jPanel1.add(degree, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 300, 30));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel8.setText("Previous degree");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 180, 40));
        jPanel1.add(institute, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 300, 30));

        jToggleButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jToggleButton3.setText("BACK");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, 80, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        Postgraduate us =new Postgraduate();
        us.setName(name.getText());
        us.setAdmission_number(stu_id.getText());
        us.setDOB(dob.getText());
        
        us.setGender(gender.getText());
        
        
         us.setAddress(address.getText());
         us.setAge(Integer.parseInt(age.getText()));
         us.setPhone_number(Integer.parseInt(phn_num.getText()));
         us.setFaculty(faculty.getText());
        us.setCourse(course.getText());
        us.setYear(Integer.parseInt(year.getText()));
         us.setSem(Integer.parseInt(semester.getText()));
         us.setDegree(degree.getText());
         us.setInstitute(institute.getText());
         
        try {
            Postgraduate_student_controll.Postgraduate_Student_update(us);
            JOptionPane.showMessageDialog(this,"Updated Success");
        } catch (SQLException ex) {
            Logger.getLogger(Update_Postgraduate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_updateActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
            String id = stu_id.getText();
        try {
            Postgraduate_student_controll.Postgraduate_Student_delete(id);
        } catch (SQLException ex) {
            Logger.getLogger(Update_Postgraduate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
                String id = stu_id.getText();
        try{
            Postgraduate us =Postgraduate_student_controll.search(id);
            if (us!=null){
                ID.setText(us.getAdmission_number());
                name.setText(us.getName());
                
                age.setText(Integer.toString(us.getAge()));
                gender.setText(us.getGender());
                address.setText(us.getAddress());
                dob.setText(us.getDOB());
                faculty.setText(us.getFaculty());
                course.setText(us.getCourse());
                phn_num.setText(Integer.toString(us.getPhone_number()));
                year.setText(Integer.toString(us.getYear()));
                semester.setText(Integer.toString(us.getSem()));
                degree.setText(us.getDegree());
                institute.setText(us.getInstitute());
                
            }
            else{
                JOptionPane.showMessageDialog(this,"There is no student");
            }

        }   catch (HeadlessException | SQLException ex) {
            Logger.getLogger(Update_Postgraduate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
                ID.setText(null);
                name.setText(null);
                
                age.setText(null);
                gender.setText(null);
                address.setText(null);
                dob.setText(null);
                faculty.setText(null);
                course.setText(null);
                phn_num.setText(null);
                year.setText(null);
                semester.setText(null);
                degree.setText(null);
                institute.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
      if(Home.student==1){
        Admin_Undergraduate ad = new Admin_Undergraduate();
        ad.setVisible(true);
        }
        if(Home.student==2){
            Admin_Postgraduate ap =new Admin_Postgraduate();
            ap.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Postgraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Postgraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Postgraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Postgraduate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Postgraduate().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField course;
    private javax.swing.JTextField degree;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField faculty;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField institute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phn_num;
    private javax.swing.JToggleButton reset;
    private javax.swing.JTextField semester;
    private javax.swing.JTextField stu_id;
    private javax.swing.JToggleButton update;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
