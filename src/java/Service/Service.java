
package Service;

import ConnectDB.ConnectDB;
import bean.Appointment;
import bean.DoctorBean;
import bean.LoginBean;
import bean.PatientBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Service {
    int i=0;double n;
    
    public boolean login(String userName, String password)
    {
       
        boolean flag=false;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="select * from login";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String name=rs.getString("UserName");
                String pass=rs.getString("password");
                
                if(userName.equals(name) && password.equals(pass))
                {
                    
                    flag=true;
                    break;
                }
            }
        }
        catch(Exception e)
        {
                System.out.println("Exception in login - " + e);
        }
        return flag;
    }
    
    public int insertPatient(PatientBean obj)
    {
        String gid=null;
        int j=0,k=0;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query1="insert into patient(Name,UserName,Age,Gender,Email,Address) values('"+obj.getName()+"','"+obj.getUserName()+"','"+obj.getAge()+"','"+obj.getGender()+"','"+obj.getEmail()+"','"+obj.getAddress()+"')";
            j=stmt.executeUpdate(query1);   
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'inserting Patient info'"+ex);
        }
        
        if (j>0)
        {
            i=i+1;
        }
        else
        {
            System.out.println("NOT inserted in PATIENT table");
        }
        return i;
        
        
    }
    
     public int insertDoctor(DoctorBean obj)
    {
        String gid=null;
        int j=0,k=0;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query1="insert into doctor(Name,UserName,Gender,PhoneNumber,Specialization,AvailabilityHour,Email,ClinicAddress) values('"+obj.getName()+"','"+obj.getUserName()+"','"+obj.getGender()+"', '"+obj.getPhoneNumber()+"','"+obj.getSpecialization()+"','"+obj.getAvailabilityHour()+"','"+obj.getEmail()+"','"+obj.getClinicAddress()+"')";
            j=stmt.executeUpdate(query1);   
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'inserting Patient info'"+ex);
        }
        
        if (j>0)
        {
            i=i+1;
        }
        else
        {
            System.out.println("NOT inserted in PATIENT table");
        }
        return i;
        
        
    }
     public ArrayList<DoctorBean> searchDoctors(String location, String gender) {
        ArrayList<DoctorBean> doctorList = new ArrayList<DoctorBean>();
        Statement stmt = null;
        try {
            Connection con = ConnectDB.connectToDB();
            stmt = con.createStatement();
            String query = "select * from doctor where ClinicAddress like '%"+location+"%' and Gender='"+gender+"'";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                DoctorBean doctorInfo = new DoctorBean();
                doctorInfo.setName(rs.getString("Name"));
                doctorInfo.setEmail(rs.getString("Email"));
                doctorInfo.setClinicAddress(rs.getString("ClinicAddress"));
                doctorInfo.setPhoneNumber(rs.getString("PhoneNumber"));
                doctorInfo.setSpecialization(rs.getString("Specialization"));
                doctorInfo.setAvailabilityHour(rs.getString("AvailabilityHour"));
                if(!doctorInfo.equals(null))
                    doctorList.add(doctorInfo);
            }
        } catch (Exception ex) {
            System.out.println("Exception found in 'Searching doctors'" + ex);
        } finally {
            if (stmt != null) {
              //
            }
        }

        return doctorList;
    }


     
     
     
     
     
     
     public int updatePatientProfile(PatientBean obj,String userName){
            try {
                if(!obj.equals(null)){
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="update patient set Name='"+obj.getName()+"', Age='"+obj.getAge()+"', Gender='"+obj.getGender()
                    +"', Address='"+obj.getAddress()+"', Email='"+obj.getEmail()+"' where userName='"+userName+"'";
           int i =  stmt.executeUpdate(query);
            
            /*UPDATE `Patient` SET `PatientId`=[value-1],`Name`=[value-2],`Age`=[value-3],`Gender`=[value-4],
            `Address`=[value-5],`Email`=[value-6],`UserName`=[value-7] WHERE 1*/
                    }
        }catch (Exception e){
            
        }
         
       return i;  
         
         
     }
      public boolean feedback (String feedback, String username){
        int i;
        boolean result=false;
        try 
        {
            Connection con=ConnectDB.connectToDB();
             Statement stmt=con.createStatement();
             String query="UPDATE patient SET Feedback='"+feedback+"' WHERE UserName='"+username+"'"; 
             i=stmt.executeUpdate(query);
             if (i>0){
                result=true;
                     }
            
            
        } catch (Exception e) 
        {
            System.out.println("Exception in updating the password." + e);
        }
        return result;
    
}
     
     
     
    public PatientBean retrievePatientData(String userName){
          PatientBean patientProfile = new PatientBean();
        try {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String Query="select Name,Age,Gender,Email,Address FROM patient WHERE UserName='"+userName+"'";
            ResultSet rs=stmt.executeQuery(Query);
            while (rs.next()){
            
                
                patientProfile.setName(rs.getString("Name"));
                patientProfile.setAge(rs.getInt("Age"));
                patientProfile.setAddress(rs.getString("Address"));
                patientProfile.setEmail(rs.getString("Email"));
                System.out.println(rs.getString("Name"));
                patientProfile.setGender(rs.getString("Gender"));
                
            }
             
                      
            
        } catch (SQLException ex) {
           
        }
            return patientProfile;
        
        
    }
   
    
    public int insertPatientLoginDetails(LoginBean obj)
    {
      
        int j=0;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="insert into login(UserName,password,type) values('"+obj.getUserName()+"','"+obj.getPassword()+"','"+obj.getType()+"')";
            j=stmt.executeUpdate(query);   
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'inserting Patient Login Details'" + ex);
        }
        
        if (j>0)
        {
            i=i+1;
        }
        else
        {
            System.out.println("NOT inserted Patient's details in LOGIN table");
        }
        return i;
    }
    
    public int insertDoctorLoginDetails(LoginBean obj)
    {
      
        int j=0;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="insert into login(UserName,password,type) values('"+obj.getUserName()+"','"+obj.getPassword()+"','"+obj.getType()+"')";
            j=stmt.executeUpdate(query);   
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'inserting Doctor Login Details'" + ex);
        }
        
        if (j>0)
        {
            i=i+1;
        }
        else
        {
            System.out.println("NOT inserted Doctor details in LOGIN table");
        }
        return i;
    }
     
    
    public LoginBean getUserType(String Username, String password)
    {
    
        LoginBean bean = new LoginBean();
        try 
        {
            Connection con=ConnectDB.connectToDB();
             Statement stmt=con.createStatement();
             String query="select * from login where UserName='"+Username+"' and password='"+password+"'";
             ResultSet rs=stmt.executeQuery(query);
             while(rs.next())
             {
                 
                 int type=rs.getInt("type");
                 bean.setType(type);
             }
            
        } catch (Exception e) 
        {
            System.out.println("Exception in getting User type while logging in." + e);
        }
        return bean;
    }
    
    public boolean checkUserName(String Username){
        boolean result=false; 
        LoginBean bean = new LoginBean();
        try 
        {
            Connection con=ConnectDB.connectToDB();
             Statement stmt=con.createStatement();
             String query="select * from login where UserName='"+Username+"'";
             ResultSet rs=stmt.executeQuery(query);
             while(rs.next())
             {
                 result=true;
                
             }
            
        } catch (Exception e) 
        {
            System.out.println("Exception in getting User type while logging in." + e);
        }
        
        return result;
    } 
    public boolean updatePassword(String username, String password){
        int i;
        boolean result=false;
         LoginBean bean = new LoginBean();
        try 
        {
            Connection con=ConnectDB.connectToDB();
             Statement stmt=con.createStatement();
             String query="UPDATE login SET password='"+password+"'WHERE UserName='"+username+"'"; 
             i=stmt.executeUpdate(query);
             if(i>0){
                 result=true;
             }
            
        } catch (Exception e) 
        {
            System.out.println("Exception in updating the password." + e);
        }
        return result;
    }
    
    public ArrayList<Appointment> getAllAppointedPatient(String docEmail) {
        ArrayList<Appointment> patientAppointedList =null;
        Statement stmt = null;
        try {
            Connection con = ConnectDB.connectToDB();
            stmt = con.createStatement();
            String query = "select * from appointment where docUserName = '"+docEmail+"'";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
              patientAppointedList=new ArrayList<Appointment>();
            while (rs.next()) {
              
                Appointment patientInfo = new Appointment();
                patientInfo.setName(rs.getString("name"));
                patientInfo.setAge(rs.getInt("age"));
                patientInfo.setDate(rs.getString("date"));
                patientInfo.setTime(rs.getString("time"));
                patientInfo.setEmail(rs.getString("email"));
                patientInfo.setGender(rs.getString("gender"));
                if(!patientInfo.equals(null)){
                    
                    patientAppointedList.add(patientInfo);
                }
                
            }
            
        } catch (Exception ex) {
            System.out.println("Exception found in 'getting Appointment Patient info'" + ex);
        } finally {
            if (stmt != null) {
              //
            }
        }

        return patientAppointedList;
    }
     
    public ArrayList prediction(String a,String b,String c,String d, String e, String age)
    {
         ArrayList<String>result=new ArrayList<String>();
         ArrayList<String>resultids=new ArrayList<String>();
		try
		{
                    System.out.println("symptoms are :"+a+b+c+d+e);
			Connection con=ConnectDB.connectToDB();	
                        Statement s = con.createStatement();
			String query = null;
			ResultSet rs = null;
			
                        ArrayList<String> diseaseId=new ArrayList<String>();
                        ArrayList<Double>diseaseCount=new ArrayList<Double>();
                        ArrayList<Double>diseaseProbability=new ArrayList<Double>();
                        ArrayList<Double>symptomCount=new ArrayList<Double>();
                        ArrayList<Double>symptomProbability=new ArrayList<Double>();
                       
                        query="SELECT  DISTINCT DiseaseID FROM symptomdisease";
                        s.executeQuery(query);
                        rs=s.getResultSet();
                        while(rs.next()){
                        diseaseId.add(rs.getString("DiseaseID"));
                        }
                        for(int i=0;i<diseaseId.size();i++){
                            //System.out.println(diseaseId.get(i));
                        query ="SELECT  COUNT(*) FROM symptomdisease WHERE (DiseaseID = '"+diseaseId.get(i)+"') ";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
			diseaseCount.add(Double.parseDouble(rs.getString(1)));
                                                   
                        }
                       
                        
			query = "SELECT     COUNT(*)  FROM  symptomdisease ";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
			n = Double.parseDouble(rs.getString(1)); 
                        
                        for(int i=0;i<diseaseId.size();i++){
                            diseaseProbability.add((diseaseCount.get(i))/n);
                        }
                      //  System.out.println("Disease Probablility is:"+diseaseProbability);
			
			for(int i=0;i<diseaseId.size();i++){
                            
                         symptomCount.add(pfind(a,b,c,d,e,age, ""+diseaseId.get(i)+""));
                            
                        }
                  System.out.println("symptom Probablility is:"+symptomCount);       
                        for(int i=0;i<diseaseId.size();i++){
                         symptomProbability.add(symptomCount.get(i)*diseaseProbability.get(i));
                            
                        }
			// System.out.println("final  Probablility is:"+symptomProbability);
                        
                        double largest=symptomProbability.get(0);
                      
                       ArrayList<Integer>index=new ArrayList<Integer>();
			
			for(int i=0; i<symptomProbability.size();++i){
                        if(symptomProbability.get(i)>=largest)
                        {
                            largest =(symptomProbability.get(i));
                                                     
                        }
                        
                        }
                        for(int i=0;i<symptomProbability.size();i++){
                            if(symptomProbability.get(i)==largest){
                                index.add(i);
                            }
                       
                        }
                         for(int i=0;i<index.size();i++){
                            // System.out.println("You are suffering from:"+diseaseId.get(index.get(i)));
                             resultids.add(diseaseId.get(index.get(i)));
                        }
                      for(int i=0;i<index.size();i++){
                            //System.out.println(diseaseId.get(i));
                        query ="SELECT DiseaseName FROM diseaseid WHERE DiseaseId = '"+resultids.get(i)+"' ";
			s.execute(query);
			rs= s.getResultSet();
			while(rs.next()){
                            
                            result.add(rs.getString("DiseaseName"));
                        }
                      }
		}
		catch(Exception ex)
		{
			System.out.println("Exception in prediction method:"+ ex);
		}
               // System.out.println(result);
                return result;
	}

    public static double pfind(String s1,String s2,String s3,String s4, String s5,String age_group, String disease)
	{
		double ans = 0;
		try{
			
			
			Connection con = ConnectDB.connectToDB();
			Statement s = con.createStatement();
			String query = null;
			ResultSet rs = null;
		        double a=0.0 , b=0.0 , c=0.0 , d=0.0 , e=0.0, f=0.0, total=0.0;
			
			query ="SELECT    COUNT(*) FROM symptomdisease WHERE Symptom1 = '"+ s1 + "' AND DiseaseID = '" +disease+"' ";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
			a=Double.parseDouble(rs.getString(1));
                        // System.out.println("a is"+a+"with disease"+disease);
			
			query ="SELECT    COUNT(*) FROM symptomdisease WHERE   Symptom2 = '"+ s2 + "'  AND DiseaseID = '" +disease+"' ";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
			b=Double.parseDouble(rs.getString(1));
                         //System.out.println("b is"+b+"with disease"+disease);
                         
         		query ="SELECT    COUNT(*) FROM symptomdisease WHERE   Symptom3 = '"+ s3 + "'  AND DiseaseID = '" +disease+"' ";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
			c=Double.parseDouble(rs.getString(1));
                         //System.out.println("c is"+c+"with disease"+disease);
			
                        query ="SELECT    COUNT(*) FROM symptomdisease WHERE  Symptom4 = '"+ s4 + "' AND DiseaseID = '" +disease+"' ";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
			d=Double.parseDouble(rs.getString(1)); 
                        //System.out.println("d is"+d+"with disease"+disease);
                       
                        query ="SELECT    COUNT(*) FROM symptomdisease WHERE  Symptom5 = '"+ s5 + "' AND DiseaseID = '" +disease+"' ";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
			e=Double.parseDouble(rs.getString(1)); 
                        //System.out.println("d is"+d+"with disease"+disease);
                        
                        query ="SELECT    COUNT(*) FROM symptomdisease WHERE  AgeGroup = '"+ age_group + "' AND DiseaseID = '" +disease+"'";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
			f=Double.parseDouble(rs.getString(1)); 
                        //System.out.println("d is"+d+"with disease"+disease);
                        
			query ="SELECT    COUNT(*) FROM symptomdisease WHERE   (DiseaseID = '" +disease+"') ";
			s.execute(query);
			rs= s.getResultSet();
			if(rs.next())
			total=Double.parseDouble(rs.getString(1)); 
                        //System.out.println("total is"+total);
                       
			ans = (a /total)  + (b /total) + (c /total) + (d /total)+ (e /total)+ (f /total) ;
			//System.out.println("answer is: "+ ans);
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+ e);
		}
		return ans;
	}
    
    public int insertAppointmentDetails(Appointment obj)
    {
      
        int j=0;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="insert into appointment(name,email,date,time,gender,docUserName,age) values('"+obj.getName()+"','"+obj.getEmail()+"','"+obj.getDate()+"','"+obj.getTime()+"','"+obj.getGender()+"', '"+obj.getDocUserName()+"', '"+obj.getAge()+"')";
            j=stmt.executeUpdate(query);   
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'insert Appointment Details'" + ex);
        }
        
        if (j>0)
        {
            i=i+1;
        }
        else
        {
            System.out.println("NOT inserted Patient's details in Appointment table");
        }
        return i;
    }
    
     
      
        
    public PatientBean getPatientAge(String UserName)
            
    {
        PatientBean obj =new PatientBean();

        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="select * from patient where UserName = '"+UserName+"'";
            ResultSet rs= stmt.executeQuery(query);
            while(rs.next())
            {
                int age= rs.getInt("Age");
                obj.setAge(age);
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'getPatientAge Details'" + ex);
        }
        
      
        return obj;
    }
    
    public String getDoctorEmail(String UserName)
            
    {
        DoctorBean obj =new DoctorBean();
        String email = "";
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="select * from doctor where UserName = '"+UserName+"'";
            ResultSet rs= stmt.executeQuery(query);
            while(rs.next())
            {
                email= rs.getString("Email");
                obj.setEmail(email);
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'getDoctor Email Details'" + ex);
        }
        
      
        return email;
    }
    
    
    
}
