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
    
    public Result(int score){
        this.score = score;
    }
    
    public Result(){
        this.score = -1;
    }
    
    public void setResult(int result){
        this.result = result;
    }
    
    public int getResult(){
        return score;
    }
    
    public String toString(){
        return "Your result is: " + score;
    }
}
