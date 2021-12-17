/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import java.sql.*; 

public class conn {
    
    Connection c;       // Connection and Statement are interfaces of Sql class
    Statement s;
    
    public conn()
    {
        
        try{
        Class.forName("com.mysql.jdbc.Driver");   // loading the driver
                c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ums","root","");             // wamp server credentials  :-  ("jdbc:mysql://localhost:3306/ums","root","")   // Online server credentials "jdbc:mysql://sql6.freesqldatabase.com:3306/sql6448179","sql6448179","YcYP8Sdt9Y"
                s=c.createStatement();
                        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    } 
}
