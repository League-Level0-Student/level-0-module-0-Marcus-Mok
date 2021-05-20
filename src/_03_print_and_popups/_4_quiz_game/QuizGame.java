package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		
		int score = 0;
				
				String answer = JOptionPane.showInputDialog ("What is 3+7");
		if (answer .equals("10")) { 
			score += 1; 
		} 
		String answer2 = JOptionPane.showInputDialog ("What is 10 + 13");
		if (answer2 .equals("23")) {
			score +=1;
		}
		String answer3 = JOptionPane.showInputDialog ("What is 73 + 83");
		if (answer3 .equals("156")) {
			score +=1;
		}
		JOptionPane.showMessageDialog(null, "your score is " + score);
		
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
