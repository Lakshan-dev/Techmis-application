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
public class Eligibility {
    Connection con = MyConnection.getConnection();
    
    private String sub = null;
    private String id = null;
    
    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    String getTotalEligibility(String id,String sub){
            float t = getTheoryEligibility(id,sub);
            float p = getPracticalEligibility(id,sub);

            return getFinalEligible(getEligible(t),getEligible(p));
    }
    
    float getTheoryEligibility(String id,String sub)
    {
        try {
         String q = "select count(st_id) from attendance where st_id='"+id+"' and sub_id='"+sub+"' and type='T' and status='1'";
         PreparedStatement ps = con.prepareStatement(q);
         ResultSet rs = ps.executeQuery(q);
         
         if(rs.next())
         {
             int c = rs.getInt("count(st_id)");
             int total= c+getMedicalTheory(id,sub);
             return (float)total/15*100;	
         }
    } catch (Exception e) {
    }
	return 0;
    }
    
    float getPracticalEligibility(String id,String sub){

	try {
        String q = "select count(st_id) from attendance where st_id='"+id+"' and sub_id='"+sub+"' and type='P' and status='1'";
        PreparedStatement ps = con.prepareStatement(q);
        ResultSet rs = ps.executeQuery(q);
         
        if(rs.next())
        {
             int c = rs.getInt("count(st_id)");
             int total = c+getMedicalPractical(id,sub);
             return (float)total/15*100;	
        }
        } catch (Exception e) {
        }
	return 0;
    }
    
    int getMedicalTheory(String id,String sub){
        try {
        
            String q = "select count(st_id) from medical  where st_id='"+id+"' and sub_id='"+sub+"' and type='T'";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery(q);
         
        if(rs.next()){
              return (int)rs.getInt("count(st_id)");
        }
        } catch (Exception e) {
        }
            return 0;
    }
    
    int getMedicalPractical(String id,String sub){

	try {
        
            String q = "select count(st_id) from medical  where st_id='"+id+"' and sub_id='"+sub+"' and type='P'";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery(q);
         
        if(rs.next()){
            return (int)rs.getInt("count(st_id)");
        }
        } catch (Exception e) {
        }
        return 0;
    }
    
    String getEligible(float total){
   
	if(total>=80)
        {
            return "Eligible";
        }else{
            return "Not Eligible";
        }
    }
    
    String getFinalEligible(String theory,String pra){
    if(theory.equals("Eligible") && pra.equals("Eligible"))
    {
        return "Eligible";
    }else{
            return "Not Eligible";
        }
    }
}
