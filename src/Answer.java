
public class Answer {

	private String text;
	
	private boolean isCorrect;
	
	private char letter;
	
	public boolean getIsCorrect()
	{
		return this.isCorrect;
	}
	
	public char getLetter()
	{
		return this.letter;
	}
	
	public void printAnswer()
	{
		System.out.println(this.letter + ": " + this.text);
	}
	
	
}
