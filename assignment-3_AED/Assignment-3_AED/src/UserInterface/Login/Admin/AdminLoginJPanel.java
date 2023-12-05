/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Login.Admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.AdminPackage.FacultyDirectory;
import Business.AdminPackage.StudentDirectory;
import Business.CoursePackage.CourseCatalog;

/**
 
 * @author smatcha
 
 */
public class AdminLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminLandingPage
     */
    JPanel userProcessContainer;
    StudentDirectory studentDir;
    FacultyDirectory facultyDir;
    CourseCatalog courseCatalog;

    public AdminLoginJPanel(JPanel userProcessContainer, StudentDirectory studentDir, FacultyDirectory facultyDir, CourseCatalog coruseCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.studentDir = studentDir;
        this.facultyDir = facultyDir;
        this.courseCatalog = courseCatalog;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminIdTextField = new javax.swing.JTextField();
        pwdTextField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bypassBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminIdTextField.setBackground(new java.awt.Color(153, 255, 153));
        add(adminIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 124, 156, -1));

        pwdTextField.setBackground(new java.awt.Color(153, 255, 153));
        add(pwdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 179, 156, -1));

        loginBtn.setBackground(new java.awt.Color(0, 255, 204));
        loginBtn.setText("Sign In");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 245, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Password :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 179, 74, 22));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Admin ID :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 124, 74, 22));

        bypassBtn.setText("Bypass");
        bypassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bypassBtnActionPerformed(evt);
            }
        });
        add(bypassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("WELCOME TO ADMIN LOGIN");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 260, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String admin_id = this.adminIdTextField.getText();
        String pwd = String.valueOf(this.pwdTextField.getPassword());
        if (admin_id == null || pwd == null) {
            JOptionPane.showMessageDialog(this, "Admin id or password is emopty", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (admin_id.equals("admin") && pwd.equals("admin")) {
                AdminMainWorksJPanel adminMainOps = new AdminMainWorksJPanel(userProcessContainer, studentDir, facultyDir, courseCatalog);
                this.userProcessContainer.add("adminMainOps", adminMainOps);
                CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
                cardLayout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(this, "Admin id or password is incorrect", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void bypassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bypassBtnActionPerformed
        // TODO add your handling code here:
        AdminMainWorksJPanel adminMainOps = new AdminMainWorksJPanel(userProcessContainer, studentDir, facultyDir, courseCatalog);
        this.userProcessContainer.add("adminMainOps", adminMainOps);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_bypassBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminIdTextField;
    private javax.swing.JButton bypassBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField pwdTextField;
    // End of variables declaration//GEN-END:variables
}
