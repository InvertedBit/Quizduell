import java.util.ArrayList;


public class Question
{
  private String text;
  
  private ArrayList<Answer> answers;
  
  public void printQuestion()
  {
	  System.out.println(this.text);
	  
	  for(Answer answer:this.answers)
	  {
		  answer.printAnswer();
	  }
  }
  
  public boolean selectAnswer(char answer)
  {
	  return true;
  }
  
  public Question(String initText, Answer[] initAnswers)
  {}
}
