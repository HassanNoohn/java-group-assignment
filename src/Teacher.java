/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342354727
 */
public class Teacher extends User {
    private int teacherID;
    
    /**
     * Constructs a teacher object 
     * @param name name of the user
     * @param age age of the user
     * @param experience experience level of the user
     * @param teacherID user's teacher ID
     * @param classCode user's class code
     */
    public Teacher(String name, int age, String experience, int teacherID, String classCode){
        super(name, age, experience, classCode);
        this.teacherID = teacherID;
    }
    /**
     * Constructs a default teacher object
     */
    public Teacher(){
        super();
        this.teacherID = -1;
    }
    /**
     * Gets teacher ID value
     * @return returns teacher ID
     */
    public int getID(){
        return teacherID;
    }

    /**
     * Updates teacher ID value
     * @param teacherID new teacher ID
     */
    public void setTeacherID(int teacherID){
        this.teacherID = teacherID;
    }
    
    @Override
    /**
     * Displays the user's information in a nice format
     * @return returns the string of the formatted attributes of given object
     */
    public String toString(){
        return super.toString() + "\nTeacher ID: " + teacherID;
    }
}
