/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Login.Employer;

import Business.AdminPackage.FacultyDirectory;
import Business.AdminPackage.Student;
import Business.AdminPackage.StudentDirectory;
import Business.CoursePackage.Course;
import Business.CoursePackage.CourseCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author smatcha

 */

public class EmployerWorksJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployerWorks
     */
    JPanel userProcessContainer;
    StudentDirectory studentDir;
    FacultyDirectory facultyDir;
    CourseCatalog courseCatalog;
    
    public EmployerWorksJPanel(JPanel userProcessContainer, StudentDirectory studentDir, FacultyDirectory facultyDir, CourseCatalog coruseCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.studentDir = studentDir;
        this.facultyDir = facultyDir;
        this.courseCatalog = courseCatalog;
        populateTable();
    }
    
     private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCourseDetails.getModel();
        dtm.setRowCount(0);
        for (int i=0; i< studentDir.getStudentDir().size();i++) {
            for(int j=0; j< studentDir.getStudentDir().get(i).getCourseList().size() ; j++ ){
            Object[] row = new Object[4];
            
            row[0] = studentDir.getStudentDir().get(i).getFullName();
            row[1] = studentDir.getStudentDir().get(i).getCourseList().get(j).getCourseId();
            row[2] = studentDir.getStudentDir().get(i).getCourseList().get(j).getCourseName();
            row[3] = studentDir.getStudentDir().get(i).getTranscript().getGrade().get(String.valueOf(row[1]));
            dtm.addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourseDetails = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtCourse = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCourseDetails.setBackground(new java.awt.Color(0, 255, 255));
        tblCourseDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student", "Course ID", "Course", "Marks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourseDetails);
        if (tblCourseDetails.getColumnModel().getColumnCount() > 0) {
            tblCourseDetails.getColumnModel().getColumn(0).setResizable(false);
            tblCourseDetails.getColumnModel().getColumn(1).setResizable(false);
            tblCourseDetails.getColumnModel().getColumn(2).setResizable(false);
            tblCourseDetails.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 25, 347, 538));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 255, 51));
        btnSearch.setText("Search by course");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 140, -1));

        txtCourse.setBackground(new java.awt.Color(255, 153, 153));
        add(txtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 180, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 15, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Reset Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String search = txtCourse.getText();
        DefaultTableModel dtm = (DefaultTableModel) tblCourseDetails.getModel();
       
        for (int i=0; i< studentDir.getStudentDir().size();i++) {
            for(int j=0; j< studentDir.getStudentDir().get(i).getCourseList().size() ; j++ ){
                if(studentDir.getStudentDir().get(i).getCourseList().get(j).getCourseName().equalsIgnoreCase(search)){
                    dtm.setRowCount(0);
                    Object[] row = new Object[4];
                    row[0] = studentDir.getStudentDir().get(i).getFullName();
                    row[1] = studentDir.getStudentDir().get(i).getCourseList().get(j).getCourseId();
                    row[2] = studentDir.getStudentDir().get(i).getCourseList().get(j).getCourseName();
                    row[3] = studentDir.getStudentDir().get(i).getTranscript().getGrade().get(String.valueOf(row[1]));
                    dtm.addRow(row);}
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCourseDetails;
    private javax.swing.JTextField txtCourse;
    // End of variables declaration//GEN-END:variables
}
