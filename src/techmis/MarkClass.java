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
public class MarkClass {
     private String id=null;
     private String sub=null;
     private String q1=null;
     private String q2=null;
     private String q3=null;
     private String q4=null;
     private String a1=null;
     private String a2=null;
     private String a3=null;
     private String mid=null;
     private String th=null;
     private String pr=null;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the sub
     */
    public String getSub() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSub(String sub) {
        this.sub = sub;
    }

    /**
     * @return the q1
     */
    public String getQ1() {
        return q1;
    }

    /**
     * @param q1 the q1 to set
     */
    public void setQ1(String q1) {
        this.q1 = q1;
    }

    /**
     * @return the q2
     */
    public String getQ2() {
        return q2;
    }

    /**
     * @param q2 the q2 to set
     */
    public void setQ2(String q2) {
        this.q2 = q2;
    }

    /**
     * @return the q3
     */
    public String getQ3() {
        return q3;
    }

    /**
     * @param q3 the q3 to set
     */
    public void setQ3(String q3) {
        this.q3 = q3;
    }

    /**
     * @return the q4
     */
    public String getQ4() {
        return q4;
    }

    /**
     * @param q4 the q4 to set
     */
    public void setQ4(String q4) {
        this.q4 = q4;
    }

    /**
     * @return the a1
     */
    public String getA1() {
        return a1;
    }

    /**
     * @param a1 the a1 to set
     */
    public void setA1(String a1) {
        this.a1 = a1;
    }

    /**
     * @return the a2
     */
    public String getA2() {
        return a2;
    }

    /**
     * @param a2 the a2 to set
     */
    public void setA2(String a2) {
        this.a2 = a2;
    }

    /**
     * @return the a3
     */
    public String getA3() {
        return a3;
    }

    /**
     * @param a3 the a3 to set
     */
    public void setA3(String a3) {
        this.a3 = a3;
    }

    /**
     * @return the mid
     */
    public String getMid() {
        return mid;
    }

    /**
     * @param mid the mid to set
     */
    public void setMid(String mid) {
        this.mid = mid;
    }
    
    
    /**
     * @return the th
     */
    public String getTh() {
        return th;
    }

    /**
     * @param th the th to set
     */
    public void setTh(String th) {
        this.th = th;
    }

    /**
     * @return the pr
     */
    public String getPr() {
        return pr;
    }

    /**
     * @param pr the pr to set
     */
    public void setPr(String pr) {
        this.pr = pr;
    }


    
     public void create(){
        Connection con = null;
        
        try
        {
                con = MyConnection.getConnection();
                String result = "insert into CA_marks(sub_id,st_id,q1,q2,q3,q4,ass1,ass2,ass3,mid) values('"+getSub()+"','"+getId()+"','"+getQ1()+"','"+getQ2()+"','"+getQ3()+"','"+getQ4()+"','"+getA1()+"','"+getA2()+"','"+getA3()+"','"+getMid()+"')";
                PreparedStatement ps = con.prepareStatement(result);
                ps.execute();
                
                String result1 = "insert into final_exam_marks(sub_id,st_id,practical,theory) values('"+getSub()+"','"+getId()+"','"+getTh()+"','"+getPr()+"')";
                PreparedStatement ps1 = con.prepareStatement(result1);
                ps1.execute();
                
                javax.swing.JOptionPane.showMessageDialog(null, "Data added successfully");
                     
        }
        
        catch(Exception e)
        {
                javax.swing.JOptionPane.showMessageDialog(null,e);
        }
    }
     
    public ResultSet searchMarks(String stuId,String subId) {
        ResultSet rs = null;
        
        try{
            Connection con = MyConnection.getConnection();
            String sql = "SELECT c.`sub_id`, c.`st_id`, c.`q1`, c.`q2`, c.`q3`, c.`q4`, c.`ass1`, c.`ass2`, c.`ass3`, c.`mid`, f.`practical`, f.`theory` FROM `CA_marks` c,`final_exam_marks` f  WHERE c.`st_id`='"+stuId+"' and f.`sub_id`='"+subId+"' and c.`sub_id`=f.`sub_id` LIMIT 1";
            PreparedStatement ps = con.prepareCall(sql);

            rs = ps.executeQuery();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }    
            return rs;
        } 
       
       
    public void editMarks()
    {
        Connection con = null;
        
        try
        {
            con = MyConnection.getConnection();
            
            String result = "update CA_marks set q1='"+ getQ1()+"',q2='"+ getQ2()+"',q3='"+ getQ3()+"',q4='"+getQ4()+"',ass1='"+ getA3()+"',ass2='"+ getA2()+"',ass3='"+ getA3()+"', mid='"+ getMid()+"' where st_id='"+ getId()+"' and sub_id='"+ getSub()+"'";
            PreparedStatement ps = con.prepareStatement(result);
            ps.execute();
            
            String result1 = "update final_exam_marks set practical='"+getPr()+"',theory='"+getTh()+"' where st_id='"+ getId()+"' and sub_id='"+ getSub()+"'";
            PreparedStatement ps1 = con.prepareStatement(result1);
            ps1.execute();
            
            javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
}
