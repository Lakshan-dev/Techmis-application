package techmis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author HUNTER
 */
public class AdminlecturerUpdate extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    MyConnection conn = new MyConnection();

    /**
     * Creates new form toStuInsert
     */
    public AdminlecturerUpdate() {
        
        initComponents();
        con = conn.getConnection();
        show_Lecturer();
    }
    public ArrayList<AdminLecturer> studentList(){
        ArrayList<AdminLecturer> studentList = new ArrayList<>();
        try{
            String query1="SELECT * FROM lecturer";
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            
            AdminLecturer lecture;
                while(rs.next()){
                                lecture=new AdminLecturer(rs.getString("lec_id"),
                                                    rs.getString("lec_dept_id"),
                                                    rs.getString("lec_name"),
                                                    rs.getString("lec_address"),
                                                    rs.getString("gender"),
                                                    rs.getString("lec_p_no"));
                    studentList.add(lecture);
                }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return studentList;
    }public void show_Lecturer(){
        ArrayList<AdminLecturer> list = studentList();
        DefaultTableModel model =(DefaultTableModel)displaystudent.getModel();
        Object[] row = new Object [8];
        for(int i=0;i<list.size();i++){
            row[0]= list.get(i).getlec_id();
            row[1]= list.get(i).getlec_d_id();
            row[2]= list.get(i).getlec_name();
            row[3]= list.get(i).getlec_address();
            row[4]= list.get(i).getgender();
            row[5]= list.get(i).getlec_p_no();
            model.addRow(row);
            
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
        jScrollPane1 = new javax.swing.JScrollPane();
        displaystudent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        department = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phone_tct = new javax.swing.JTextField();
        gender_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        Addbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displaystudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "lec_id", "department", "name ", "address", "gender	", "phone"
            }
        ));
        displaystudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displaystudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(displaystudent);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 810, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Rgistration Number");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 184, 41));
        jPanel1.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 184, 41));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Department");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Phone No");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        phone_tct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_tctActionPerformed(evt);
            }
        });
        jPanel1.add(phone_tct, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 184, 41));

        gender_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender_txtActionPerformed(evt);
            }
        });
        jPanel1.add(gender_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 184, 41));

        address_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_txtActionPerformed(evt);
            }
        });
        jPanel1.add(address_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 184, 41));

        name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txtActionPerformed(evt);
            }
        });
        jPanel1.add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 184, 41));

        Addbutton.setText("ADD");
        Addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Addbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 120, 44));

        deletebutton.setText("DELETE");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 120, 47));

        updatebutton.setText("UPDATE");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(updatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 120, 47));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 80, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Lecturers");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 230, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void address_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_txtActionPerformed

    private void gender_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gender_txtActionPerformed

    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_txtActionPerformed

    private void phone_tctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_tctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_tctActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void AddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbuttonActionPerformed

        String lecid = id.getText();
        String dept = department.getText();
        String namelec = name_txt.getText();
        String address = address_txt.getText();
        String gender = gender_txt.getText();
        String phone = phone_tct.getText();
       

        if(!lecid.isEmpty()){
            if(!dept.isEmpty()){
                if(!namelec.isEmpty()){
                    if(!address.isEmpty()){
                        if(!gender.isEmpty()){
                            if(!phone.isEmpty()){
                                

                                        try {
                                            String sql="insert into student(lec_id,lec_dept_id,lec_name,lec_address,gender,lec_p_no) "
                                                    + " values('"+lecid+"','"+dept+"','"+namelec+"','"+address+"','"+gender+"','"+phone+"')";
                                            pst = con.prepareStatement(sql);
                                            pst.execute();
                                            DefaultTableModel model = (DefaultTableModel)displaystudent.getModel();
                                            model.setRowCount(0);
                                            show_Lecturer();
                                            JOptionPane.showMessageDialog(null,"Adding succsess");

                                        } catch (SQLException ex) {
                                            Logger.getLogger(AdminlecturerUpdate.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }else{
                                        JOptionPane.showMessageDialog(null,"Insert phone ","error", JOptionPane.ERROR_MESSAGE);

                                    }

                                }else{
                                    JOptionPane.showMessageDialog(null,"Insert birth day","error", JOptionPane.ERROR_MESSAGE);

                                }

                            }else{
                                JOptionPane.showMessageDialog(null,"Insert gender","error", JOptionPane.ERROR_MESSAGE);

                            }

                        }else{
                            JOptionPane.showMessageDialog(null,"Insert address","error", JOptionPane.ERROR_MESSAGE);

                        }

                    }else{
                        JOptionPane.showMessageDialog(null,"Insert name","error", JOptionPane.ERROR_MESSAGE);

                    }

                }else{
                    JOptionPane.showMessageDialog(null,"Insert menta id","error", JOptionPane.ERROR_MESSAGE);

                }

           

        // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed

       String lecid = id.getText();
        String dept = department.getText();
        String namelec = name_txt.getText();
        String address = address_txt.getText();
        String gender = gender_txt.getText();
        String phone = phone_tct.getText();
        

         if(!lecid.isEmpty()){
            if(!dept.isEmpty()){
                if(!namelec.isEmpty()){
                    if(!address.isEmpty()){
                        if(!gender.isEmpty()){
                            if(!phone.isEmpty()){
                                

                                        try {
                                            String sql="Update lecturer set lec_dept_id ='"+dept+"',"
                                                    + "lec_name ='"+namelec+"',"
                                                    + "lec_address ='"+address+"',"
                                                    + "gender ='"+gender+"',"
                                                    
                                                    + "lec_p_no ='"+phone+"' where lec_id ='"+lecid+"'"
                                                    ;
                                           
                                            pst = con.prepareStatement(sql);
                                            pst.execute();
                                            DefaultTableModel model = (DefaultTableModel)displaystudent.getModel();
                                            model.setRowCount(0);
                                            show_Lecturer();
                                            JOptionPane.showMessageDialog(null,"update succsess");

                                        } catch (SQLException ex) {
                                            Logger.getLogger(AdminlecturerUpdate.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }else{
                                        JOptionPane.showMessageDialog(null,"Insert phone ","error", JOptionPane.ERROR_MESSAGE);

                                    }

                                }else{
                                    JOptionPane.showMessageDialog(null,"Insert birth day","error", JOptionPane.ERROR_MESSAGE);

                                }

                            }else{
                                JOptionPane.showMessageDialog(null,"Insert gender","error", JOptionPane.ERROR_MESSAGE);

                            }

                        }else{
                            JOptionPane.showMessageDialog(null,"Insert address","error", JOptionPane.ERROR_MESSAGE);

                        }

                    }else{
                        JOptionPane.showMessageDialog(null,"Insert name","error", JOptionPane.ERROR_MESSAGE);

                    }

                }else{
                    JOptionPane.showMessageDialog(null,"Insert menta id","error", JOptionPane.ERROR_MESSAGE);

                }

            
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void displaystudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displaystudentMouseClicked

        int i = displaystudent.getSelectedRow();
        TableModel model =displaystudent.getModel();
        id.setText(model.getValueAt(i,0).toString());
        department.setText(model.getValueAt(i,1).toString());
        name_txt.setText(model.getValueAt(i,2).toString());
        address_txt.setText(model.getValueAt(i,3).toString());
        gender_txt.setText(model.getValueAt(i,4).toString());
        phone_tct.setText(model.getValueAt(i,5).toString());
       

        // TODO add your handling code here:
    }//GEN-LAST:event_displaystudentMouseClicked

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed

        String lecid = id.getText();
        String dept = department.getText();
        String namelec = name_txt.getText();
        String address = address_txt.getText();
        String gender = gender_txt.getText();
        String phone = phone_tct.getText();
        

       
         if(!lecid.isEmpty()){
            if(!dept.isEmpty()){
                if(!namelec.isEmpty()){
                    if(!address.isEmpty()){
                        if(!gender.isEmpty()){
                            if(!phone.isEmpty()){

                                        try {
           String query = "delete from lecturer where st_id ='"+lecid+"'";
            pst = con.prepareStatement(query);
            pst.execute();
            DefaultTableModel model = (DefaultTableModel)displaystudent.getModel();
                    model.setRowCount(0);
                    show_Lecturer();
                    JOptionPane.showMessageDialog(null,"Delete success");
            
        }catch (SQLException ex) {
                                            Logger.getLogger(AdminlecturerUpdate.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }else{
                                        JOptionPane.showMessageDialog(null,"Insert phone ","error", JOptionPane.ERROR_MESSAGE);

                                    }

                                }else{
                                    JOptionPane.showMessageDialog(null,"Insert birth day","error", JOptionPane.ERROR_MESSAGE);

                                }

                            }else{
                                JOptionPane.showMessageDialog(null,"Insert gender","error", JOptionPane.ERROR_MESSAGE);

                            }

                        }else{
                            JOptionPane.showMessageDialog(null,"Insert address","error", JOptionPane.ERROR_MESSAGE);

                        }

                    }else{
                        JOptionPane.showMessageDialog(null,"Insert name","error", JOptionPane.ERROR_MESSAGE);

                    }

                }else{
                    JOptionPane.showMessageDialog(null,"Insert menta id","error", JOptionPane.ERROR_MESSAGE);

                }

    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    WelcomeAdmin w1 =new WelcomeAdmin();
    w1.show();
    
    dispose();
        
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminlecturerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminlecturerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminlecturerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminlecturerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminlecturerUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbutton;
    private javax.swing.JTextField address_txt;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField department;
    private javax.swing.JTable displaystudent;
    private javax.swing.JTextField gender_txt;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField phone_tct;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}