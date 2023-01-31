package techmis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class AdminLecturer {
   
    private String lec_id,lec_d_id,lec_name,lec_address,gender,lec_p_no;  
    public AdminLecturer(String lec_id, String lec_d_id, String lec_name ,String lec_address, String gender,String lec_p_no)

    {
        this.lec_id=lec_id;
        this.lec_d_id=lec_d_id;
        this.lec_name=lec_name;
        this.lec_address=lec_address;
        this.gender=gender;
        this.lec_p_no=lec_p_no;
       
    }

    AdminLecturer(String string, String string0, String string1, String string2, String string3, String string4,String string5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getlec_id(){
        return lec_id;
    }
    public String getlec_d_id(){
        return lec_d_id;
    }
    public String getlec_name(){
        return lec_name;
    }
    public String getlec_address(){
        return lec_address;   
    }
      public String getgender(){
        return gender;   
    }
      public String getlec_p_no(){
        return lec_p_no;
        
    }
     
    
}


