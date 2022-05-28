
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class AllStudent extends javax.swing.JFrame {
    
    Connection con = null;
    Statement stmt = null;
    ResultSet res = null;

    /**
     * Creates new form AllStudent
     */
    public AllStudent() {
        initComponents();
        con = DatabaseConnection.connection();
        showRecord();
    }
    
    public void showRecord(){
        try {
            stmt = con.createStatement();
            
            if(grade.getSelectedItem().equals("All Students"))
            {
               String query = "SELECT * FROM student";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
            
        } catch (Exception e) {
            
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        grade = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        view = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        mainmenu = new javax.swing.JButton();
        editadd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("STUDENTS.");

        grade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Students", "1 A", "1 B", "1 C", "2 A", "2 B", "2 C", "3 A", "3 B", "3 C", "4 A", "4 B", "4 C", "5 A", "5 B", "5 C", "6 A", "6 B", "6 C", "7 A", "7 B", "7 C", "8 A", "8 B", "8 C", "9 A", "9 B", "9 C", "10 A", "10 B", "10 C", "11 A", "11 B", "11 C", "12 Science", "12 Art", "12 Commerce", "13 Science", "13 Art", "13 Commerce" }));
        grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeActionPerformed(evt);
            }
        });

        view.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(view);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/p9.PNG"))); // NOI18N

        mainmenu.setBackground(new java.awt.Color(153, 153, 153));
        mainmenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mainmenu.setText("Main Menu");
        mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuActionPerformed(evt);
            }
        });

        editadd.setBackground(new java.awt.Color(102, 204, 255));
        editadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editadd.setText("Edit / Add");
        editadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1803, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(755, 755, 755)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addComponent(jLabel3)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(editadd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeActionPerformed
        // TODO add your handling code here:
       try {
            stmt = con.createStatement();
            
             if(grade.getSelectedItem().equals("All Students"))
            {
               String query = "SELECT * FROM student";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
             
              if(grade.getSelectedItem().equals("1 A"))
            {
               String query = "SELECT * FROM student WHERE grade = '1 A'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
              
               if(grade.getSelectedItem().equals("1 B"))
            {
               String query = "SELECT * FROM student WHERE grade = '1 B'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
               
                if(grade.getSelectedItem().equals("1 C"))
            {
               String query = "SELECT * FROM student WHERE grade = '1 C'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                
                 if(grade.getSelectedItem().equals("2 A"))
            {
               String query = "SELECT * FROM student WHERE grade = '2 A'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                 
                  if(grade.getSelectedItem().equals("2 B"))
            {
               String query = "SELECT * FROM student WHERE grade = '2 B'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                  
                   if(grade.getSelectedItem().equals("2 C"))
            {
               String query = "SELECT * FROM student WHERE grade = '2 C'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                   
                    if(grade.getSelectedItem().equals("3 A"))
            {
               String query = "SELECT * FROM student WHERE grade = '3 A'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                   
                   if(grade.getSelectedItem().equals("3 B"))
           {
               String query = "SELECT * FROM student WHERE grade = '3 B'";
              ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                     
                      if(grade.getSelectedItem().equals("3 C"))
            {
               String query = "SELECT * FROM student WHERE grade = '3 C'";
              ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
           }
                      
                       if(grade.getSelectedItem().equals("4 A"))
            {
               String query = "SELECT * FROM student WHERE grade = '4 A'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                      
                        if(grade.getSelectedItem().equals("4 B"))
            {
              String query = "SELECT * FROM student WHERE grade = '4 B'";
               ResultSet re = stmt.executeQuery(query);
              view.setModel(DbUtils.resultSetToTableModel(re));
            }
                        
                         if(grade.getSelectedItem().equals("4 C"))
            {
             String query = "SELECT * FROM student WHERE grade = '4 C'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
           }
                        
                          if(grade.getSelectedItem().equals("5 A"))
           {
              String query = "SELECT * FROM student WHERE grade = '5 A'";
              ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                         
                           if(grade.getSelectedItem().equals("5 B"))
           {
               String query = "SELECT * FROM student WHERE grade = '5 B'";
               ResultSet re = stmt.executeQuery(query);
              view.setModel(DbUtils.resultSetToTableModel(re));
            }
                          
                            if(grade.getSelectedItem().equals("5 C"))
            {
              String query = "SELECT * FROM student WHERE grade = '5 C'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
           }
                            
                             if(grade.getSelectedItem().equals("6 A"))
           {
               String query = "SELECT * FROM student WHERE grade = '6 A'";
               ResultSet re = stmt.executeQuery(query);
              view.setModel(DbUtils.resultSetToTableModel(re));
            }
                             
                              if(grade.getSelectedItem().equals("6 B"))
            {
               String query = "SELECT * FROM student WHERE grade = '6 B'";
              ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                             
                               if(grade.getSelectedItem().equals("6 C"))
            {
              String query = "SELECT * FROM student WHERE grade = '6 C'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
           }
                               
                                if(grade.getSelectedItem().equals("7 A"))
            {
               String query = "SELECT * FROM student WHERE grade = '7 A'";
              ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                
                                 if(grade.getSelectedItem().equals("7 B"))
            {
               String query = "SELECT * FROM student WHERE grade = '7 B'";
              ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                
                                  if(grade.getSelectedItem().equals("7 C"))
           {
               String query = "SELECT * FROM student WHERE grade = '7 C'";
              ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                 
                                  if(grade.getSelectedItem().equals("8 A"))
           {
              String query = "SELECT * FROM student WHERE grade = '8 A'";
              ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
           }
                                   
                                    if(grade.getSelectedItem().equals("8 B"))
           {
              String query = "SELECT * FROM student WHERE grade = '8 B'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                    
                                     if(grade.getSelectedItem().equals("8 C"))
            {
               String query = "SELECT * FROM student WHERE grade = '8 C'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                     
                                      if(grade.getSelectedItem().equals("9 A"))
            {
               String query = "SELECT * FROM student WHERE grade = '9 A'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                      
                                      if(grade.getSelectedItem().equals("9 B"))
            {
               String query = "SELECT * FROM student WHERE grade = '9 B'";
              ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                      
                                        if(grade.getSelectedItem().equals("9 C"))
            {
               String query = "SELECT * FROM student WHERE grade = '9 C'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                        
                     if(grade.getSelectedItem().equals("10 A"))                    
            {
               String query = "SELECT * FROM student WHERE grade = '10 A'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                     
                        if(grade.getSelectedItem().equals("10 B"))                    
            {
               String query = "SELECT * FROM student WHERE grade = '10 B'";
               ResultSet re = stmt.executeQuery(query);
              view.setModel(DbUtils.resultSetToTableModel(re));
            }
                        
                           if(grade.getSelectedItem().equals("10 C"))                    
            {
               String query = "SELECT * FROM student WHERE grade = '10 C'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                           
                              if(grade.getSelectedItem().equals("11 A"))                    
            {
               String query = "SELECT * FROM student WHERE grade = '11 A'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                              
                                 if(grade.getSelectedItem().equals("11 B"))                    
            {
               String query = "SELECT * FROM student WHERE grade = '11 B'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                 
                      if(grade.getSelectedItem().equals("11 C"))                                  
           {
               String query = "SELECT * FROM student WHERE grade = '11 C'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                    
                       if(grade.getSelectedItem().equals("12 Science"))                                    
            {
               String query = "SELECT * FROM student WHERE grade = '12 Science'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                       
                      if(grade.getSelectedItem().equals("12 Art"))                                        
           {
               String query = "SELECT * FROM student WHERE grade = '12 Art'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                          
                        if(grade.getSelectedItem().equals("12 Commerce"))                                        
            {
              String query = "SELECT * FROM student WHERE grade = '12 Commerce'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                             
                        if(grade.getSelectedItem().equals("13 Science"))                                            
            {
               String query = "SELECT * FROM student WHERE grade = '13 Science'";
              ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                                
                         if(grade.getSelectedItem().equals("13 Art"))                                              
            {
               String query = "SELECT * FROM student WHERE grade = '13 Art'";
               ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
                                                   
                        if(grade.getSelectedItem().equals("13 Commerce"))                                                  
            {
               String query = "SELECT * FROM student WHERE grade = '13 Commerce'";
              ResultSet re = stmt.executeQuery(query);
               view.setModel(DbUtils.resultSetToTableModel(re));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_gradeActionPerformed

    private void mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home view = new Home();
        view.setVisible(true);
    }//GEN-LAST:event_mainmenuActionPerformed

    private void editaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaddActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Student view = new Student();
        view.setVisible(true);
    }//GEN-LAST:event_editaddActionPerformed

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
            java.util.logging.Logger.getLogger(AllStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editadd;
    private javax.swing.JComboBox<String> grade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainmenu;
    private javax.swing.JTable view;
    // End of variables declaration//GEN-END:variables
}
