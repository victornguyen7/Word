package Word;
import java.util.Scanner;

public class Word {
	
	private String word;
	
	private String newWord;
	
	private String character;
	
	private String secondWord;
	
	private String checking;
	
	public Word() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the word: ");
		
		word = input.next();
	}
	public String getWord() {
		return word;
	}
	public void setWord() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the new word: ");
		
		newWord = input.next();
		
		word = newWord;
		
		checking = word;
		
		checking = newWord;
	}
	public boolean Palindrome() {
		
		boolean Palidrome = true;
		
		checking = word.toLowerCase();
		
		for(int i = 0; i <= checking.length() / 2 ; i++) {
			
			if(checking.charAt(i) != checking.charAt(checking.length() - i - 1)) {
				Palidrome = false;
			}	
		}
		return Palidrome;
	}
	public int Character(char character) {
		
		int count = 0;
		
		checking = word.toLowerCase();
		
		for(int i = 0; i < checking.length() ; i++) {
			
			if( checking.charAt(i) == Character.toLowerCase(character)) {
				count++;
			}
		}
		return count;
	}
	public void Compare() {
        
        if (word.length() < secondWord.length()) {
        	System.out.println("The word ( " + word + " ) is " + "smaller" + " than the second word ( " + secondWord + " )");
        } 
        else if (word.length() > secondWord.length()) {
        	System.out.println("The word ( " + word + " ) is " + "bigger" + " than the second word ( " + secondWord + " )");
        } 
        else {
        	System.out.println("The word ( " + word + " ) is " + "equal" + " to the second word ( " + secondWord + " )");
        }
	}
	public String getSecondWord() {
		return secondWord;
	}
	public void setSecondWord() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the second word: ");
		
		secondWord = input.next();
		
		secondWord = secondWord;
	}
}
