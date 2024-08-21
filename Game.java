//This class represents the game itself,it has the attributes: 
//1. guesses-which is the number of the guesses the user had until he guessed the word 
//2. abc-represents the letters the user can guess out of the whole abc, and when there are letters
//he already guessed in the word they won't appear in the abc anymore
public class Game {

	//attributes
	private int guesees;
	private String abc;

	//constructors
	//this class uses the default constructor

	//functions
	//when the player wants to play new game we will set the number of guesses to 0.
	public void restartGuesees() {
		this.guesees=0;
	}

	//gets our guesses if we call it from another class
	public int getGussess() {
		return guesees;
	}

	//we will increase the number of the guesses in the game by one after every guess the user made
	public void guessesPlus() {
		this.guesees=guesees+1;
	}

	// Setter abc-lets us change the current abc if we call it from another class
	public void setAbc(String abc) {
		this.abc=abc;
	}

	// Getter abc-gets our abc if we call it from another class
	public String getAbc() {
		return abc;
	}
	//when the player wants to play new game we will set abc to be the whole abc
	public void restartAbc() {
		abc="abcdefghijklmnopqrstuvwxyz";
	}

	//initialize new game-choosing random word from word collection
	public void newGame(ChozenWord chozenword ,WordsCollection words) {
		String myword=words.chooseWord();//choosing word randomly from words collection
		chozenword.setWord(myword);//setting the word in our object Word to be that word

	}
	//checking if the letter the user entered is in the word
	public boolean isLetterInWord(ChozenWord chozenword,String letter) {
		if (chozenword.getWord().contains(letter)==false) {
			return false;
		} 
		else {
		}
		return true;
	}

	//checking if the user guessed the word and finished the game
	public boolean isGameOver(ChozenWord chozenword) {
		if (chozenword.getKavim().indexOf("_")==-1) {
			return true;

		}
		return false;

	}

	//checking if the user entered a letter and not something else(string,number...)
	public void illegalLetter(String letter) {
		if (letter.length()!=1) {
			System.out.println("Error:you didn't enter a letter!");
			System.out.println("Please enter a letter:)");
		}
		else if (!(Character.isAlphabetic(letter.charAt(0)))){
			System.out.println("Error:you didn't enter a letter!");
			System.out.println("Please enter a letter:)");
		}

	}


}










