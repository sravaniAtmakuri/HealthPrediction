
package bean;

public class PatientBean {
    
    private String Name, Password, Address, Email, Gender,UserName;
    private int Age;

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
   

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }
      public String getUserName() {
        return UserName;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    
}
