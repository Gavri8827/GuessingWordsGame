import java.util.Random;
//This class represents our words collection,it has the attributes: 
//1.words-our words collection
//2.how many words in our collection
//and this class let's us choose a word from the words collection
public class WordsCollection {

	//attributes:
	private final String[] words={"avenged", "haravot", "harbu", "darbu","danny","hagari","rachel","ugiot","slipknot","barzel","daddy"};
	private int wordsLength=words.length;

	//constructors:
	//this class uses the default constructor

	//functions:
	//choosing random word from the words collection
	public String chooseWord() {
		Random rand = new Random();
		int randomint = rand.nextInt(wordsLength);
		return words[randomint];

	}





}
