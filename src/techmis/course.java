/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techmis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author shan
 */
public class course {
    private String depId = null;
    private String subId = null;
    private String subName = null;
    private String lecId = null;
    private String coId = null;
 
    public void setCourseDepId(String depId)
    {
        this.depId = depId;
    }
    
    public void setCourseSubId(String subId)
    {
        this.subId = subId;
    }
    
    public void setCourseSubName(String subName)
    {
        this.subName = subName;
    }
    
    public void setCourseLecId(String lecId)
    {
        this.lecId = lecId;
    }
    
    public void setCourseCoId(String coId){
        this.coId = coId;
    }
    
    public String getCourseDepId()
    {
        return depId;
    }
    
    public String getCourseSubId()
    {
        return subId;
    }
    
    public String getCourseSubName()
    {
        return subName;
    }
    
    public String getCourseLecId()
    {
        return lecId;
    }
    
    public String getCourseCoId()
    {
        return coId;
    }
    public void createCourse()
    {
        Connection con = null;
        
        try
        {
       
            
                con=MyConnection.getConnection();
                String result="insert into subjects(sub_d_id,sub_id,sub_co_id,sub_name,lec_id) values('"+getCourseDepId()+"','"+getCourseSubId()+"','"+getCourseCoId()+"',"+getCourseSubName()+"','"+getCourseLecId()+"')";
                PreparedStatement ps = con.prepareStatement(result);
                ps.execute();
                javax.swing.JOptionPane.showMessageDialog(null, "Data added successfully");
          
                          
        }
        
        catch(Exception e)
        {
                javax.swing.JOptionPane.showMessageDialog(null,e);
        }
}
     public ResultSet searchCourse(String subId) 
    {
        ResultSet rs = null;
        try{
            Connection con = MyConnection.getConnection();
            String sql = "SELECT * FROM subjects WHERE sub_id='"+subId+"' LIMIT 1";
            PreparedStatement ps = con.prepareCall(sql);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }    
        return rs;
    }      
     
     public void editCourse()
    {
        Connection con = null;
        
        try
        {
            con = MyConnection.getConnection();
            String result = "update subjects set sub_d_id='"+ getCourseDepId()+"',sub_co_id='"+getCourseCoId()+"',sub_name='"+ getCourseSubName()+"',lec_id='"+ getCourseLecId()+"' where sub_id='"+ getCourseSubId()+"'";
            PreparedStatement ps = con.prepareStatement(result);
            ps.execute();
            javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
     
     
      public void deleteCourse()
    {
        Connection con = null;
        
        try
        {
            con = MyConnection.getConnection();
            String result = "delete from subjects where Sub_id='"+getCourseSubId()+"'";
            PreparedStatement ps = con.prepareStatement(result);
            ps.execute();
            javax.swing.JOptionPane.showMessageDialog(null, "Data delete successfully");
        }
        
        catch(Exception e)
        {
            
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
}
