/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342354727
 */
public class Result {
    private int score;
    
    /**
     * Constructs a Result object
     * @param score the user's score
     */
    public Result(int score){
        this.score = score;
    }
    /**
     * Constructs a default Result object
     */
    public Result(){
        this.score = -1;
    }
    /**
     * Updates result value
     * @param result new result value
     */
    public void setResult(int result){
        this.score = result;
    }
    /**
     * Gets the result value
     * @return returns the user's result
     */
    public int getResult(){
        return score;
    }
    /**
     * Displays the user's result in a nice format
     * @return returns the string of the formatted attributes of given object
     */
    public String toString(){
        return "Your result is: " + score;
    }
}
