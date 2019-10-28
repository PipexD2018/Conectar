
package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conectar {
 
    private static Connection con ; 
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String User= "root";
    private static final String Password = "";
    private static final String url = "jdbc:mysql://localhost:3306/prueba";

    public conectar() {
    
    con = null;
        try {
            Class.forName(Driver);
            con = (Connection) DriverManager.getConnection(url, User, Password);
            if(con != null){
                JOptionPane.showMessageDialog(null,"La conexión fue exitosa");
            } else{
                JOptionPane.showMessageDialog(null,"La conexión no se ha logrado");
            }
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Se presento un error al momento de realizar la conexión el error es : "+e);
        }
        
        
    }
    
    
}
