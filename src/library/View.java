/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static library.JdbcConn.DB_URL;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MayuKogi
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        Disp();
        //this.getContentPane().setBackground(Color.lightGray);
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
        jTable1 = new javax.swing.JTable();
        btn9 = new javax.swing.JButton();
        ser = new javax.swing.JTextField();
        rbtn1 = new javax.swing.JRadioButton();
        rbtn2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Book_Id", "Title", "Author", "Main_Classification", "Sub_Classification", "Year_Of_Publishing", "Last_Printed Year", "ISBN_No", "No_of _Pages"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn9.setBackground(javax.swing.UIManager.getDefaults().getColor("ToolBar.dockingForeground"));
        btn9.setForeground(new java.awt.Color(255, 51, 51));
        btn9.setText("Back to Main Menu");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        ser.setBackground(new java.awt.Color(0, 153, 153));
        ser.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        ser.setForeground(new java.awt.Color(0, 0, 51));
        ser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                serMousePressed(evt);
            }
        });
        ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serActionPerformed(evt);
            }
        });
        ser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serKeyReleased(evt);
            }
        });

        buttonGroup1.add(rbtn1);
        rbtn1.setForeground(new java.awt.Color(0, 102, 102));
        rbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn1MouseClicked(evt);
            }
        });
        rbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtn2);
        rbtn2.setForeground(new java.awt.Color(0, 102, 102));
        rbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtn2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Book Id");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Author");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Search By");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 388, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtn1)
                                .addGap(39, 39, 39)
                                .addComponent(ser, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbtn2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(btn9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        Add ad =new Add();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn9ActionPerformed

    private void serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serActionPerformed

    private void serKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serKeyReleased
        // TODO add your handling code here:
        try{
             Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
             if(rbtn1.isSelected())
             {
            String qry = "SELECT Book_Id,Title,Author,Main_Classification,Sub_Classification,Year_of_Publishing,Last_Printed_Year,ISBN_No,No_of_Pages FROM content_tb WHERE Book_Id = '"+ser.getText()+"'";
            PreparedStatement pst =conn.prepareStatement(qry);
           ResultSet rs=pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
         }
             else if(rbtn2.isSelected())
             {
                 String qry = "SELECT Book_Id,Title,Author,Main_Classification,Sub_Classification,Year_of_Publishing,Last_Printed_Year,ISBN_No,No_of_Pages FROM content_tb WHERE Author = '"+ser.getText()+"'";
            PreparedStatement pst =conn.prepareStatement(qry);
           ResultSet rs=pst.executeQuery();
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
             }  
         }
        catch(SQLException e)
        {
             JOptionPane.showMessageDialog(null, e);
        }
        
          
    }//GEN-LAST:event_serKeyReleased

    private void rbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rbtn1ActionPerformed

    private void serMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serMouseClicked
        // TODO add your handling code here:
        //ser.setEnabled(false);
        
    }//GEN-LAST:event_serMouseClicked

    private void rbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn1MouseClicked
        // TODO add your handling code here:
        ser.setEnabled(true);
        ser.setText("");
        Disp();
    }//GEN-LAST:event_rbtn1MouseClicked

    private void rbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtn2MouseClicked
        // TODO add your handling code here:
        ser.setEnabled(true);
        ser.setText("");
        Disp();
    }//GEN-LAST:event_rbtn2MouseClicked

    private void serKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_serKeyPressed

    private void serMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serMousePressed
        // TODO add your handling code here:
        if(rbtn1.isSelected()||rbtn2.isSelected())
        {
            ser.setEnabled(true);
        }
        else
        {
            ser.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Please Select Your Option");   
        }
        
    }//GEN-LAST:event_serMousePressed

    
     public void Disp(){
        try{
        Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
        String str="SELECT * FROM content_tb";
        PreparedStatement pst =conn.prepareStatement(str);
        ResultSet rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e) {
        JOptionPane.showMessageDialog(null,e);
    }
        
    }
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn9;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JRadioButton rbtn1;
    public javax.swing.JRadioButton rbtn2;
    public javax.swing.JTextField ser;
    // End of variables declaration//GEN-END:variables
}
