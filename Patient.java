import java.io.PrintStream; 

public class Patient{
    int age;
    String name;
    String surname ;
    String ID_number;
    char gender;  // F or M.

    public  Patient(String name_, String surname_, String ID_number_, int age_, char gender_){
        name = name_;
        surname = surname_;
        ID_number = ID_number_;
        age = age_;
        gender = gender_;
    }

  public void displayDetails() {
      System.out.printf(name  + " " + surname + " " + ID_number + " " + gender + " of age: " + age + "\n");
 }
}