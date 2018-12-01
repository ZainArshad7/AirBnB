/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnb;

/**
 *
 * @author ZAIN ARSHAD
 */
public class property {
    String propertyType;
    int propertyId;
    String restrictions;
    int day;
    int month;
    int year;
    
    property(String ptype,int propId,String rest,int da,int mo,int y)
    {
        propertyType=ptype;
        propertyId=propId;
        restrictions=rest;
        day=da;
        month=mo;
        year=y;
    }
    public String getType()
    {
        return propertyType;
    }
    
    public int getId()
    {
        return propertyId;
    }
    
    public String getRestrictions()
    {
        return restrictions;
    }
    
    public int getday()
    {
        return day;
    }
    
    public int getmonth()
    {
        return month;
    }
    
    public int getyear()
    {
        return year;
    }
    
    public void getDate(int d,int m,int y)
    {
        d=getday();
        m=getmonth();
        y=getyear();
    }
}
