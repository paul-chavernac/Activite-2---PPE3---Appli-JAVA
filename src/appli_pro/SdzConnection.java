/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author d.poncet
 */
public class SdzConnection {
    
    private static String url ="jdbc:mysql://localhost:3333/appli_etudiant";
    private static String user="appli_etudiant";
    private static String passwd = "ppe32017";
    private static Connection connect;
    public static Connection getInstance(){
        if (connect==null){
            try {
                connect = DriverManager.getConnection(url,user,passwd);
                
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return connect;
    }
    
}
