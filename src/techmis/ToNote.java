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
class ToNote {
    private String title,notice,date ;
    private int no;

    public ToNote(int no,String date ,String title, String notice)
           
           
    {
        this.no=no;
        this.date=date;
        this.title=title;
        this.notice=notice;
    }
    public int getno(){
        return no;
    }
    public String getdate(){
        return date;
    }
    public String gettitle(){
        return title;
    }
    public String getnotice(){
        return notice;
    }
    
}
