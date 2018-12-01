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
public class Airbnb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        user u=new user("Zain","Arshad",26,03,1996);
        u.print();
        property p=new property("sdf",89,"afd",12,23,123);
        int b = 0,c=0,v=0;
        p.getDate(b,c,v);
        System.out.println(b);
        
    }
    
}
