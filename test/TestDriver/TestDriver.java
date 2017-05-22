
package TestDriver;

import ConnectDB.ConnectDB;
import bean.LoginBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestDriver {
   
    public ResultSet getSymptomTable(){
        ResultSet result=null;
        Connection connection;
        Statement statement;
        String query;
    try {
            connection = ConnectDB.connectToDB();
            statement = connection.createStatement();
            System.out.println("in test Driver class");
            query = "SELECT * FROM symptomdisease Limit 20";
            statement.executeQuery(query);
            result = statement.getResultSet();
            
        } catch (Exception ex) {
            System.out.println("Exception in prediction method:" + ex);
        }
    return result;
    }
    
    
    public ResultSet getDiseaseForGivenSymptoms(){
        ResultSet result=null;
        Connection connection;
        Statement statement;
        String query;
    try {
            connection = ConnectDB.connectToDB();
            statement = connection.createStatement();
            query = "SELECT DiseaseName FROM diseaseid INNER JOIN symptomdisease On diseaseid.DiseaseId = symptomdisease.DiseaseID LIMIT 20 ";
            statement.executeQuery(query);
            result = statement.getResultSet();
            
        } catch (Exception ex) {
            System.out.println("Exception in prediction method:" + ex);
        }
    return result;
    }
    
    public ResultSet GetAllAppointedPatientDrEmail(){
        ResultSet result=null;
        ResultSet finalresult;
        Connection connection;
        Statement statement;
        String query;
        try {
            connection = ConnectDB.connectToDB();
            statement = connection.createStatement();
            query="SELECT  DISTINCT docUserName FROM appointment LIMIT 1 ";
            statement.executeQuery(query);
            result=statement.getResultSet();
            
        
        
    }   catch (SQLException ex) {
            Logger.getLogger(TestDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
      TestDriver tst=new TestDriver();
      
     // System.out.println("final result is: "+finalresult)
     return result;   
}
   
    public ArrayList getUsernameLogin(){
         ArrayList<String> userName=new ArrayList<String>();
        ArrayList<String> password=new ArrayList<String>();
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="select * from login";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                userName.add(rs.getString("UserName"));
                password.add(rs.getString("password"));
            }
        }catch (Exception e){
            
        }
        return userName;
    }
    public ArrayList getPasswordLogin(){
         ArrayList<String> password=new ArrayList<String>(); 
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="select * from login";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
               password.add(rs.getString("password"));
            }
        }catch (Exception e){
            
        }
        return password;
    }
    
    public LoginBean getLoginTable(){
        LoginBean obj=null;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="select * from login";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                 obj=new LoginBean();
                 obj.setUserName(rs.getString("UserName"));
                 obj.setPassword(rs.getString("password"));
                 obj.setType(rs.getInt("type"));
            }
        
    }   catch (SQLException ex) {
            Logger.getLogger(TestDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
       return obj;
    }
    public String getEmptyValue(){
        return "";
    }
    public String invalidUsername(){
        return "xxxx";
    }
    public String invalidPassword(){
        return "yyyy";
    }
    public String validUsername(){
        return "rty";
    }
    public String validPassword(){
        return "rty";
    }
    public ArrayList EmptyDocEmail(){
        ArrayList<String> docEmail=new ArrayList<String>();
        docEmail.add("sravani@gmail.com");
        return docEmail;
        
    }
}

    

