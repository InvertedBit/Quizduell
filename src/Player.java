
public class Player
{
  public String name;
  
  public String avatar;
  
  private int score;
  
  public int getScore()
  {
    return this.score;
  }
  
  public void askQuestion(Question question)
  {
	  question.printQuestion();
	  String answer = System.console().readLine();
	  char answerLetter = answer.charAt(0);
	  if(question.selectAnswer(answerLetter))
	  {
		  this.score++;
	  }
	  System.out.println("Your current score is: " + this.score);
  }
  
  public Player(String initName)
  {
	  this.name = initName;
  }
}
