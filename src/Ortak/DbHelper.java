package Ortak;
import java.sql.*;

public class DbHelper extends BaglantiSaglandi{ //ABSTRACT CLASS VE POLİMORFİZM
    
    private String userName = "root";
    private String password = "Ni3420123";
    private String dbUrl = "jdbc:mysql://localhost:3306/cinemanilay?useSSL=false&serverTimezone=UTC";
    
     public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }
     
      public void showErrorMessage(SQLException exception){
        System.out.println("Error :"+exception.getMessage());
        System.out.println("Error code : "+exception.getErrorCode());
    }
    @Override
      public void onayMesajı(){
        System.out.println("Bağlantı DbHelper tarafından sağlandı.");
    }
      
      
}


    

