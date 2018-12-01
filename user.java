/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnb;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author ZAIN ARSHAD
 */
public class user {
    String fname;
    String lname;
    //Date bdate;
    int y,m,d;
    //Calendar c;
    
    user(String fn,String ln,int year,int month,int day)//fn for firstname, ln for lastname, bdates for birthdate
    {
        fname=new String();
        fname=fn;
        lname=new String();
        lname=ln;
        y=year;
        m=month;
        d=day;
       // c=Calendar.getInstance();
        //c.set(year,month,day);
        //bdate=new Date();
        //bdate.setYear(year);
        //bdate.setMonth(month);
        //bdate.setDate(day);
        //bdate=bdates;
       // bdate.getDate();
    }
    
    void print()
    {
        System.out.print(fname+" ");
        System.out.println(lname);
        
        System.out.print(d+"/");
        System.out.print(m+"/");
        System.out.print(y);
    }
}
