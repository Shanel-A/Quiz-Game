/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

/**
 *
 * @author Alcaraz
 */
public class Question {
    private String question;

    public Question(String question) {
        this.question = question;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public String getAnswer() {
        return "";
    }
    
    public boolean checkAnswer(String ans) {
        return false;
    }
    
}
