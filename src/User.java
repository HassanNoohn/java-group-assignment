/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noohn
 */
public class User {
    //initializing attributes
    private String name;
    private int age;
    private String experience;
    private String classCode;
    private static int numOfUsers=0;
    
    //making my constructors
    /**
    * Constructor for user, initializes to all given values
    * @param name users name
    * @param age integer value of user's age
    * @param experience Describes users experience in fake news
    *
    */
    public User(String name, int age, String experience, String classCode){
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.classCode = classCode;
        numOfUsers++;
    }
    
    //making my overloaded constructor
    /**
    * Constructor for user, initializes to all default values
    */
    public User(){
        name = "Jane Doe";
        age = 0;
        experience = "beginner";
        numOfUsers++;
    }
    
    //making my getters
    /**
    * This method gets the name of a user object
    * @return The string of the user's name
    */
    public String getName(){
        return name;
    }
    /**
    * This method gets the age of a user object
    * @return The int of the user's age
    */
    public int getAge(){
        return age;
    }
    
    /**
    * This method gets the experience level of a user object
    * @return The string of the user's experience level
    */
    public String getExperience(){
        return experience;
    }
    /**
     * Gets class code
     * @return returns class code
     */
    public String getClassCode(){
        return classCode;
    }
    /**
    * This method gets the total number of user objects
    * @return The int value of student objects
    */
    public static int getNumOfUsers(){
        return numOfUsers;
    }
    /**
    * This method sets the user's name
    * @param name The string value of the user object's name
    */
    public void setName(String name){
        this.name = name;
    }
    /**
    * This method sets the user's age
    * @param age The int value of the user object's age
    */
    public void setAge(int age){
        this.age = age;
    }
    /**
    * This method sets the user's age
    * @param experience The string value of the user experience level
    */
    public void setExperience(String experience){
        this.experience = experience;
    }
    /**
     * Updates class code
     * @param classCode new class code
     */
    public void setClassCode(String classCode){
        this.classCode = classCode;
    }
    //making my toString method
    /**
    * This method displays information about a given bank account in a nice format
    * @return tString of formatted attributes of a given object
    */
    @Override
    public String toString(){
        return "\nUser's name: "+ name +"\nAge: "+ age + "\nExperience: "+ experience;
    }

}
