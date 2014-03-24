import java.util.ArrayList;


public class Game
{

	private ArrayList<Player> players;

	private ArrayList<Question> questions;
	
	private int currentQuestion = 0;
	
  public void start()
  {
    
	  // General configuration
	  int playerCount = 2;
	  int questionPerPlayer = 10;
	  int answerPerQuestion = 4;
	  
	  // Init Players
	  for(int i = 0; i < playerCount; i++)
	  {
		  System.out.println("Please enter Player 1 name:");
		  String name = System.console().readLine();
		  players.add(new Player(name));
	  }
	  
	  // Init Questions / Answers
	  for(int i = 0; i < questionPerPlayer * playerCount; i++)
	  {
		  //Todo: parse from xml;
		  //Question question;
		  //this.questions.add(question);
	  }
	  
	  // Start loop
	  this.loop();
  }
  
  public void highscore()
  {
    
  }
  
  private void loop()
  {
	  for(Player player:this.players)
	  {
		  player.askQuestion(this.questions.get(this.currentQuestion));
		  
		  this.currentQuestion++;
	  }
  }
}
