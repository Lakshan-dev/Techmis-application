/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techmis;

import java.sql.Date;

/**
 *
 * @author HUNTER
 */
class ToStudent {
    private String st_id,st_d_id,menter_id,st_name,st_address,gender,st_b_day,st_p_no;  ;
    public ToStudent(String st_id, String st_d_id, String menter_id ,String st_name,String st_address,String gender,String st_b_day ,String st_p_no)

    {
        this.st_id=st_id;
        this.st_d_id=st_d_id;
        this.menter_id=menter_id;
        this.st_name=st_name;
        this.st_address=st_address;
        this.gender=gender;
        this.st_b_day=st_b_day;
        this.st_p_no=st_p_no;
    }
    public String getst_id(){
        return st_id;
    }
    public String getst_d_id(){
        return st_d_id;
    }
    public String getst_b_day(){
        return st_b_day;
    }
     public String getgender(){
        return gender;
    }
      public String getst_name(){
        return st_name;
        
    }
      public String getst_address(){
        return st_address;
        
    }
      public String getmenter_id(){
        return menter_id;
        
    }
      public String getst_p_no(){
        return st_p_no;
        
    }
    
}


