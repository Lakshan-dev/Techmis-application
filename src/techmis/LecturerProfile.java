/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techmis;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author shan
 */
public class LecturerProfile {
    private static String id=null;
    private String name=null;
    private String add=null;
    private String pno=null;
    
    
     public void setName(String name) {
        this.name = name;
    }
     
     public String getName() {
        return name;
    }
     
    public void setAddress(String add) {
        this.add = add;
    }
     
     public String getAddress() {
        return add;
    } 

    public void setPno(String pno) {
        this.pno = pno;
    }
    
    public String getPno() {
        return pno;
    }
    
    
    public static void setId(String tId) {
        id = tId;
    }
    
    public static String getId() {
        return id;
    }
    
    
     public void editProfile()
    {
        Connection con = null;
        
        try
        {
            con = MyConnection.getConnection();
           
            String result = "update lecturer set lec_name='"+ getName()+"',lec_address='"+ getAddress()+"',lec_p_no='"+ getPno()+"' where lec_id='"+ getId()+"'";
            PreparedStatement ps = con.prepareStatement(result);
            ps.execute();
         
            javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
}
