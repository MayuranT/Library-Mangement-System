/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.Color;
import java.awt.HeadlessException;
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
public class Details extends javax.swing.JFrame {

    /**
     * Creates new form Details
     */
    public Details() {
        initComponents();
        disp();
        setValue();
        //setValue1();
        //setValue2();
        //setValue3();
        //this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bi = new javax.swing.JTextField();
        tl = new javax.swing.JTextField();
        au = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nop = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        mc = new javax.swing.JComboBox<>();
        sc = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        sebtn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        dbtn1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        yopu = new com.toedter.calendar.JYearChooser();
        lpy = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel1.setText("Book Id");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel2.setText("Title");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel3.setText("Author");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel4.setText("Main Classification");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel5.setText("Sub Classification");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel6.setText("Year of Publishing");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel7.setText("Last Print Year");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel8.setText("ISBN No");

        bi.setBackground(new java.awt.Color(240, 240, 240));
        bi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel9.setText("No of Pages");

        jLabel10.setText(":");

        jLabel11.setText(":");

        jLabel12.setText(":");

        jLabel13.setText(":");

        jLabel14.setText(":");

        jLabel15.setText(":");

        jLabel16.setText(":");

        jLabel17.setText(":");

        jLabel18.setText(":");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Book_Id", "Title ", "Author", "Main_Classification", "Sub_Classification", "Year_of_Publishing", "Last_Prented_Year", "ISBN_No", "No_of_Pages"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jpLayout = new javax.swing.GroupLayout(jp);
        jp.setLayout(jpLayout);
        jpLayout.setHorizontalGroup(
            jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpLayout.setVerticalGroup(
            jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        mc.setBackground(new java.awt.Color(240, 240, 240));
        mc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        mc.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                mcPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcActionPerformed(evt);
            }
        });

        sc.setBackground(new java.awt.Color(240, 240, 240));
        sc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.cyan, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel2.setForeground(new java.awt.Color(153, 255, 255));

        sebtn1.setForeground(new java.awt.Color(102, 102, 255));
        sebtn1.setText("Save Edited");
        sebtn1.setToolTipText("Save After Edit");
        sebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sebtn1ActionPerformed(evt);
            }
        });

        btn3.setForeground(new java.awt.Color(102, 102, 255));
        btn3.setText("Update");
        btn3.setToolTipText("Save the New Records In Database");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setForeground(new java.awt.Color(102, 102, 255));
        btn4.setText("Reset");
        btn4.setToolTipText("Reset Your All Fields");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setForeground(new java.awt.Color(255, 51, 51));
        btn5.setText("Back To Main Menu");
        btn5.setToolTipText("Go to Main Menu");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        dbtn1.setForeground(new java.awt.Color(102, 102, 255));
        dbtn1.setText("Delete Row");
        dbtn1.setToolTipText("Delete the Specifig Row");
        dbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dbtn1)
                            .addComponent(sebtn1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(sebtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5)
                    .addComponent(dbtn1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(51, 51, 255), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 153, 204))))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 255));
        jLabel19.setText("Update Your Details ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel19)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        yopu.setBackground(new java.awt.Color(0, 153, 153));
        yopu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yopuMouseClicked(evt);
            }
        });

        lpy.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tl, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(au)
                            .addComponent(isbn)
                            .addComponent(nop)
                            .addComponent(bi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yopu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lpy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(bi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(au, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel4)
                            .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel14)
                            .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel15))
                            .addComponent(yopu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel16))
                            .addComponent(lpy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel18)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        bi.setText("");
        tl.setText("");
        au.setText("");
        mc.setSelectedItem("");
        sc.setSelectedItem("");
        yopu.setYear(2018);
        lpy.setYear(2018);
        isbn.setText("");
        nop.setText("");
        
        
    }//GEN-LAST:event_btn4ActionPerformed

    public void disp(){
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
    
    
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        Add ad =new Add();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        
        String Book_Id = bi.getText();
        String Title = tl.getText();
        String Author = au.getText();
        //String Main_Classification = mc.getSelectedItem().toString();
        //String Sub_Classification = sc.getSelectedItem().toString();
        int Year_of_Publishing =yopu.getYear();
        int Last_Printed_Year =lpy.getYear();
        String ISBN_No =isbn.getText();
        String No_of_Pages= nop.getText();

         try{
                Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
                    //Statement stmt = null;
                    if(!(bi.getText().equals(""))&&!(tl.getText().equals(""))&&!(au.getText().equals(""))&&!(isbn.getText().equals(""))&&!(nop.getText().equals(""))){
                    PreparedStatement stmt=conn.prepareStatement("insert into content_tb values (?,?,?,?,?,?,?,?,?)");
                    stmt.setString(1,Book_Id);
                    stmt.setString(2,Title);
                    stmt.setString(3,Author);
                    //stmt.setString(4,Main_Classification);
                    //stmt.setString(5,Sub_Classification);
                    stmt.setInt(6,yopu.getYear());
                    stmt.setInt(7,lpy.getYear());
                    stmt.setString(8,ISBN_No);
                    stmt.setString(9,No_of_Pages);
                    int i = stmt.executeUpdate();
                    if(i>0){
                        JOptionPane.showMessageDialog(null,"Details Saved Successfully ");
                    }
} 
                    else
                    {
                        JOptionPane.showMessageDialog(null,"OOPs...Fill all the Fields First");
                    }
            }
                catch(HeadlessException | SQLException e){   
                    JOptionPane.showMessageDialog(null,e);
                }
         
            MoreUpdate mu=new MoreUpdate();
            mu.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btn3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        int row =jTable1.getSelectedRow();
        String Bid = jTable1.getModel().getValueAt(row,0).toString();
        bi.setText(Bid);
        String Tl = jTable1.getModel().getValueAt(row,1).toString();
        tl.setText(Tl);
        String Au = jTable1.getModel().getValueAt(row,2).toString();
        au.setText(Au);
        String Mc = jTable1.getModel().getValueAt(row,3).toString();
        mc.setSelectedItem(Mc);
        String Sc = jTable1.getModel().getValueAt(row,4).toString();
        sc.setSelectedItem(Sc);
        int Yopu = (int) jTable1.getModel().getValueAt(row,5);
        yopu.setYear(Yopu);
        int Lpy = (int) jTable1.getModel().getValueAt(row,6);
        lpy.setYear(Lpy);
        String Isbn = jTable1.getModel().getValueAt(row,7).toString();
        isbn.setText(Isbn);
        String Nop = jTable1.getModel().getValueAt(row,8).toString();
        nop.setText(Nop);
        boolean a=jTable1.isEditing();
        //if(a==false){
           // JOptionPane.showMessageDialog(null, "Sorry You Can not Edit Data Directly in this Table❗ 👎");
       // }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void sebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sebtn1ActionPerformed
        // TODO add your handling code here:
        if(!(bi.getText().equals(""))&&!(tl.getText().equals(""))&&!(au.getText().equals(""))&&!(mc.getSelectedItem().toString().equals(""))&&!(sc.getSelectedItem().toString().equals(""))&&!(isbn.getText().equals(""))&&!(nop.getText().equals(""))){
            int row = jTable1.getSelectedRow();
            String id = jTable1.getModel().getValueAt(row,0).toString();
            try{
                Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
                String qry="UPDATE content_tb SET Book_Id='"+bi.getText()+"',Title='"+tl.getText()+"',Author='"+au.getText()+"',Main_Classification='"+mc.getSelectedItem().toString()+"',Sub_Classification='"+sc.getSelectedItem().toString()+"',Year_of_Publishing='"+yopu.getYear()+"',Last_Printed_Year='"+lpy.getYear()+"',ISBN_No='"+isbn.getText()+"',No_of_Pages='"+nop.getText()+"'WHERE Book_Id='"+id+"'";
                PreparedStatement pst =conn.prepareStatement(qry);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Update Success");
                bi.setText("");
                tl.setText("");
                au.setText("");
                mc.getSelectedItem().toString();
                sc.getSelectedItem().toString();
                yopu.getYear();
                lpy.getYear();
                isbn.setText("");
                nop.setText("");
                disp();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
                
            }
        }
        else{
             JOptionPane.showMessageDialog(null,"OOPs...Fill all the Fields First");
        }
    }//GEN-LAST:event_sebtn1ActionPerformed

    private void biActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biActionPerformed

    private void dbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbtn1ActionPerformed
        // TODO add your handling code here:
         //if(!(bi.getText().equals(""))&&!(tl.getText().equals(""))&&!(au.getText().equals(""))&&!(mc.getText().equals(""))&&!(sc.getText().equals(""))&&!(yopu.getText().equals(""))&&!(lpy.getText().equals(""))&&!(isbn.getText().equals(""))&&!(nop.getText().equals(""))){
            int row = jTable1.getSelectedRow();
            String id = jTable1.getModel().getValueAt(row,0).toString();
            try{
                Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
                String qry="DELETE FROM content_tb WHERE Book_Id='"+id+"'";
                PreparedStatement pst =conn.prepareStatement(qry);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Delete Success");
                bi.setText("");
                tl.setText("");
                au.setText("");
                mc.getSelectedItem().toString();
                sc.getSelectedItem().toString();
                yopu.getYear();
                lpy.getYear();
                isbn.setText("");
                nop.setText("");
                disp();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
                
            }                      
    }//GEN-LAST:event_dbtn1ActionPerformed

    private void mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcActionPerformed

    private void yopuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yopuMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_yopuMouseClicked

    private void scActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scActionPerformed

    private void mcPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_mcPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        setValue1();
    }//GEN-LAST:event_mcPopupMenuWillBecomeInvisible

    public void setValue(){
        try{
            Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
            String qry = "SELECT Main_Classcification FROM maincla_tb";
            PreparedStatement pst = conn.prepareStatement(qry);
            ResultSet rs = pst.executeQuery();
            mc.removeAllItems();
            while(rs.next())
            {
                mc.addItem(rs.getString("Main_Classcification"));
            }
        }
            
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    public void setValue1(){
        try{
            PreparedStatement pst = null;
            Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
            String qry = "SELECT * FROM subcla_tb where Main_id=?";
            String MID = null ;
            String qry1 ="SELECT * FROM maincla_tb WHERE Main_Classcification =?";
            
            pst = conn.prepareStatement(qry1);
            pst.setString(1, mc.getSelectedItem().toString());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                MID = rs.getString("Main_id");
                pst = conn.prepareStatement(qry);
                pst.setString(1, mc.getSelectedItem().toString());
                rs = pst.executeQuery();
                sc.removeAllItems();
            while(rs.next())
            {
                sc.addItem(rs.getString("Sub_Classcification"));
            }
                
            }
            
            
        }     
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
//    public void setValue2(){
//        try{
//            Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
//            String qry = "SELECT YearOfPublishing FROM compo_tb";
//            PreparedStatement pst = conn.prepareStatement(qry);
//            ResultSet rs = pst.executeQuery();
//            //yopu.removeAllItems();
//            while(rs.next())
//            {
//                yopu.addItem(rs.getString("YearOfPublishing"));
//            }
//        }
            
        
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//        }
//    }
    
//    public void setValue3(){
//        try{
//            Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
//            String qry = "SELECT LastPrentedYear FROM compo_tb";
//            PreparedStatement pst = conn.prepareStatement(qry);
//            ResultSet rs = pst.executeQuery();
//            lpy.removeAllItems();
//            while(rs.next())
//            {
//                lpy.addItem(rs.getString("LastPrentedYear"));
//            }
//        }
//            
//        
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//        }
//    }
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
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Details().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField au;
    private javax.swing.JTextField bi;
    public javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    public javax.swing.JButton dbtn1;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JPanel jp;
    private com.toedter.calendar.JYearChooser lpy;
    private javax.swing.JComboBox<String> mc;
    private javax.swing.JTextField nop;
    private javax.swing.JComboBox<String> sc;
    public javax.swing.JButton sebtn1;
    private javax.swing.JTextField tl;
    private com.toedter.calendar.JYearChooser yopu;
    // End of variables declaration//GEN-END:variables
}