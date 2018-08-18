/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSBMCourseEnrollmentSystem_main;

import NSBMCourseEnrollmentSystem_view.Home;
import NSBMCourseEnrollmentSystem_view.Login;

/**
 *
 * @author Lahiru Dulanjaya
 */
public class CourseEntrollmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });

    }
    
}
