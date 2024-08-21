import java.util.Scanner;
//In this class we play the game, we are choosing a random word,showing to the user how many letters in the word
//letting the user guess a letter and showing him the letter he guessed in the word and the abc he can choose from
//when the user guesses the word we finish the game and showing him the number of guesses it took him
//and letting the user start a new game if he wants to
public class LetsPlay {//here will be the Main
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		//first we create objects for each class
		Game game=new Game();
		WordsCollection words=new WordsCollection();
		ChozenWord chozenWord=new ChozenWord();//at this point our word havn't chosen yet
		//other variables
		boolean newgame=true;
		int index;
		char rep_letter;
		while(newgame==true) {// to let the user to start new game
			chozenWord.restartKavim();//restarting kavim
			game.newGame(chozenWord,words);//choosing random word
			chozenWord.setKavim(chozenWord.getWord().length());//initialize kavim at first after we chose a word
			game.restartAbc();//restart abc
			game.restartGuesees();//restart guesses
			System.out.println("Let's start playing!");
			while(game.isGameOver(chozenWord)==false) {//keep playing while the user havn't guessed the word
				String letter;
				System.out.println(chozenWord.getKavim());//showing the user the "kavim" of the word:"_ _ _..."
				System.out.println("Guess a letter out of the letters: "+game.getAbc());
				letter=scan.nextLine();//the letter the user guesses 
				game.illegalLetter(letter);//checking if the user entered a letter
				game.guessesPlus();//increasing number of guesses
				//checking if the letter is in the word
				if (game.isLetterInWord(chozenWord,letter)==true) {//if it's in the word
					chozenWord.updateKavim(letter);//putting the letter in the right places in the word
					//updating the letters the user can choose from
					index=game.getAbc().indexOf(letter);
					rep_letter=game.getAbc().charAt(index);
					game.setAbc(game.getAbc().replace(rep_letter,' '));
				}

			}
			System.out.println("Well done you guessed the word!!");
			System.out.println("number of guesses: "+game.getGussess());
			System.out.println("Do you want to play a new game?");
			System.out.println("please enter true/false");
			newgame=scan.nextBoolean();
		}
		scan.close();
	}

}
