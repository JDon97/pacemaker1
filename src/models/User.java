package models;


public class User 
{
  public String firstName;
  public String lastName;
  public String email;
  public String password;

  public User()
  {
	  
  }
  public String toString()
  {
    return firstName + ' ' + lastName +' ' +  email +' ' +  password; 
  }

  public User(String firstName, String lastName, String email, String password)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
  }
}