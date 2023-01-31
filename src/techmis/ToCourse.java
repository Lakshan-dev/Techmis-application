/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techmis;

/**
 *
 * @author HUNTER
 */
class ToCourse {
    private String co_id, co_dept_id,co_name ;
    public ToCourse(String co_id, String co_dept_id, String co_name)
    {
        this.co_id=co_id;
        this.co_dept_id=co_dept_id;
        this.co_name=co_name;
    }
    public String getco_id(){
        return co_id;
    }
    public String getco_dept_id(){
        return co_dept_id;
    }
    public String getco_name(){
        return co_name;
    }
    
}
