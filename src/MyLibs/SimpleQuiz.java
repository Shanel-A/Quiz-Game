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
import java.util.ArrayList;
import java.util.Random;

public class SimpleQuiz {
    private ArrayList<Question> myQuestions;
    private int currentQuestion;
    
    public SimpleQuiz()
    {
        myQuestions =new ArrayList<Question>();
        
        myQuestions.add(new ShortAnswerQuestion("1. What is the color of apple?","RED"));
        myQuestions.add(new ShortAnswerQuestion("2. Who founded Mapua University?","TOMAS MAPUA"));
        
        myQuestions.add(new TrueFalseQuestion("3. Mapua University is located in the Philippines.", "True"));
        myQuestions.add(new TrueFalseQuestion("4. COVID-19 was first discovered in 2018.", "False"));
        
        myQuestions.add(new FillInBlankQuestion("5. Social distancing means to keep ____ft distance away from each other.", "Six"));
        myQuestions.add(new FillInBlankQuestion("6. NBA stands for National __________ Association.", "Basketball"));
        
        myQuestions = shuffleList (myQuestions);
        currentQuestion=0;

    }
       
    //Return the full specification for the current question
        public String getCurrentQuestion()
        {
            return myQuestions.get(currentQuestion).getQuestion();
        }
        
        //Return the answer to the current question
        public String getCurrentAnswer()
        {
            return myQuestions.get(currentQuestion).getAnswer();
        }
        
        //Returns true if the given answer is correct for the current question
        public boolean checkCurrentAnswer(String answer)
        {
           return myQuestions.get(currentQuestion).checkAnswer(answer);
        }
        
        //Returns true if this quiz has another question
        public boolean hasNext()
        {
            return currentQuestion < myQuestions.size() - 1;
        }
        
        public void next() throws Exception 
        {
            if(currentQuestion == myQuestions.size()-1)
            {
                throw new Exception("There are no more questions.");
            }
            currentQuestion++;
        }
        
        //Shuffle the list
private ArrayList<Question> shuffleList (ArrayList<Question> inputList)
        {
                ArrayList<Question> randomList = new ArrayList<>();
                
                Random r=new Random();
                int randomIndex=0;
                while(inputList.size() > 0)
                {
                   randomIndex=r.nextInt(inputList.size());  //Choose a random object in the list
                   randomList.add(inputList.get(randomIndex));   //add it to the new, random list
                   inputList.remove(randomIndex);   //remove to avoid duplicates
                }
                
                return randomList;  //return the new random list
        }

}

