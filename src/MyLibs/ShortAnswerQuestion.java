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

public class ShortAnswerQuestion extends Question{
    private String answer;

    public ShortAnswerQuestion(String question, String answer) {
        super(question);
        this.answer = answer;
    }
        
    //Return the answer to this question, potentially with helpful comments
      public String getAnswer() {
        return answer;
    }
      
    //Return true if the given answer is correct for this question
    public boolean checkAnswer(String ans)
    {
        return (answer.equalsIgnoreCase(ans));
    }
}

