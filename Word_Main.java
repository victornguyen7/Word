package Word;
import java.util.Scanner;

public class Word_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mode = 0;
		
		Scanner input = new Scanner(System.in);
		
		Word word = new Word();
		
		String newWord ;
		
		System.out.println("The word is: " + word.getWord());
		
		while ( true ) {
			
			System.out.println();
			
			System.out.println("Choose what you want to do.");
			
			System.out.println("1 - Changing word");
			
			System.out.println("2 - Palindrome checking.");
			
			System.out.println("3 - Character counting");
			
			System.out.println("4 - Word comparison");
			if (input.hasNextInt()) {
				
				mode = input.nextInt();
				
				if( mode == 1 || mode == 2 || mode == 3 || mode == 4) {
					if(mode == 1) {
						System.out.println("Changing word: On");
						
						while(true) {
							
							while ( true ) {
							word.setWord();
							
							System.out.println();
							
							System.out.println("The new word is: " + word.getWord());
							
							System.out.println("Continuos changing? (1 - Yes / 2 - No)");
								
							if (input.hasNextInt()) {
									
								int countinue = input.nextInt();
									
								if(countinue == 2 ) {
									break;
								}
								else if(countinue == 1) {
									
								}
								else {
									System.out.println("Invalid input. Try again!");
								}
							}
							else {
								System.out.println("Invalid input. Try again!");
								input.next();
							}
						}
						break;
					}
				}
				else if(mode == 2) {
					System.out.println("Palindrome checking: On");
					
					while(true) {
						
						while ( true ) {
							if(mode == 2) {
								String isPalindrome = String.valueOf(word.Palindrome()).substring(0, 1).toUpperCase() + String.valueOf(word.Palindrome()).substring(1);
									
								System.out.println("The word " + word.getWord() + " is palidrome? " + isPalindrome);
								break;
							}
						}
						break;
					}
				}
					else if( mode == 3) {
						System.out.println("Character counting: On");
						
						while(true) {
							
							while ( true ) {
								System.out.println("Select the character: ");
								
								char character = input.next().charAt(0);
								
								if(word.Character(character) > 1) {
									System.out.println("The word has: " + word.Character(character) + " characters " + Character.toLowerCase(character));
								}
								else {
									System.out.println("The word has: " + word.Character(character) + " character " + Character.toLowerCase(character));
								}
								System.out.println("Continuos counting? (1 - Yes / 2 - No)");
								
								if (input.hasNextInt()) {
										
									int countinue = input.nextInt();
										
									if(countinue == 2 ) {
										break;
									}
									else if(countinue == 1) {
										
									}
									else {
										System.out.println("Invalid input. Try again!");
									}
								}
								else {
									System.out.println("Invalid input. Try again!");
									input.next();
								}
							}
							break;
						}
					}
					else if( mode == 4){
						
						System.out.println("Word comparision: On");
						
						word.setSecondWord();
						
						word.Compare();
					}
				}
				else {
					System.out.println("Invalid input. Try again!");
				}
			}
			else {
				System.out.println("Invalid input. Try again!");
				input.next();
			}
		}
	}

}
