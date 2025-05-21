/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noohn
 */
public class Student extends User{
    //defining attributes
    private int result;
    private int studentID;
    //students score, out of 10
    private final int DEFAULT_RESULT = 0;
    
    //making my constructor 
    /**
    * Constructor for student, initializes to all given values
    * @param name users name
    * @param age integer value of user's age
    * @param experience Describes users experience in fake news
    * @param result a score of the users result out of 10
    * @param studentID int of student id
    * @param classCode string of which classroom the student belongs in
    */
    public Student(String name, int age, String experience, int result, String classCode){
        super(name,age,experience,classCode);
        this.result = result;
        this.studentID = studentID;
    }
    
    //making my overloaded constructor
    /**
    * Constructor for user, initializes to all default values
    */
    public Student(){
        super();
        //setting to default values
        result = DEFAULT_RESULT;
        studentID = -1;
    }
    
    //making my getter nethods
    /**
    * This method gets the result of a student object
    * @return The int of the student's result
    */
    public int getResult(){
        return result;
    }
    /**
    * This method gets the id of a student object
    * @return The int of the student's id
    */
    public int getID(){
        return studentID;
    }
    
    //making my setter nethods
    /**
    * This method sets the result of a student object
    * @param result The int of the student's result
    */
    public void setResult(int result){
        this.result = result;
    }
    /**
    * This method sets the id of a student object
    * @param id The int of the student's id
    */
    public void setID(int id){
        studentID=id;
    }
    
    //making my toString method
    /**
    * This method displays information about a given bank account in a nice format
    * @return tString of formatted attributes of a given object
    */
    @Override
    public String toString(){
        return super.toString()+ "\nResult: "+result+"\nStudent ID: "+studentID;
    }
}
