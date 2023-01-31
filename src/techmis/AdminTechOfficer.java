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
public class AdminTechOfficer {
   
    private String tec_id,tec_d_id,tec_name,gender,tec_p_no;  
    public AdminTechOfficer(String tec_id, String tec_d_id, String tec_name ,String gender,String tec_p_no)

    {
        this.tec_id=tec_id;
        this.tec_d_id=tec_d_id;
        this.tec_name=tec_name;
        this.gender=gender;
        this.tec_p_no=tec_p_no;
       
    }

    AdminTechOfficer(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String gettec_id(){
        return tec_id;
    }
    public String gettec_d_id(){
        return tec_d_id;
    }
    public String gettec_name(){
        return tec_name;
    }
      public String getgender(){
        return gender;   
    }
      public String gettec_p_no(){
        return tec_p_no;
        
    }
     
    
}


