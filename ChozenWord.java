//This class represents the random word we chose ,it has the attributes: 
//1. the word itself 
//2. "kavim" which represents the word as a set of lines we show to the user so during the whole game he will know
//how many letters to guess and if he guessed a letter where is it in the word 

public class ChozenWord {

	//attributes:
	private String word;
	private StringBuilder kavim;

	//constructors:
	//this class uses the default constructor

	//functions:
	// Getter word-gets our word if we call it from another class
	public String getWord() {
		return word;
	}

	// Setter word-lets us change the word if we call it from another class
	public void setWord(String word) {
		this.word=word;
	}

	// Getter kavim-gets our kavim if we call it from another class
	public StringBuilder getKavim() {
		return kavim;
	}

	//initializes kavim to represent the random word-it's building kavim by the given word length
	public void setKavim(int wordlength) {
		for (int i = 0; i <wordlength ; i++) {
			kavim.append("_ ");
		}  
	}
	//when the player wants to play new game and we don't want to create new ChozenWord object
	//so all we need to do is to set kavim as a new object 
	public void restartKavim() {
		kavim=new StringBuilder();
	}

	//when the user chooses a letter we call this function to put the letter in the right place in kavim
	public void updateKavim(String letter){
		for (int i=0;i<word.length();i++) {
			if (word.charAt(i)==letter.charAt(0)) {
				kavim.setCharAt(i*2,letter.charAt(0));
			}
		}
	}

}