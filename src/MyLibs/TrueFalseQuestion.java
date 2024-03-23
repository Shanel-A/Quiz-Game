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
public class TrueFalseQuestion extends Question{
    private String answer;

    public TrueFalseQuestion(String question, String answer) {
        super(question);
        this.answer = answer;
    }

   @Override
    public String getAnswer(){
        return answer;
    }
    
    @Override
    public boolean checkAnswer(String ans)
    {
        return (answer.equalsIgnoreCase(ans));
    }
 
}
