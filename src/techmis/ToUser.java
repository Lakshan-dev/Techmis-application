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
class ToUser {
    private String d_id, d_name;
    public ToUser(String d_id, String d_name)
    {
        this.d_id=d_id;
        this.d_name=d_name;
    }
    public String getd_id(){
        return d_id;
    }
    public String getd_name(){
        return d_name;
    }
}
