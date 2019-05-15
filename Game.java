import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class Game {
	
	JFrame window;
	Container con;
	JPanel titlePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleLabel, cloutLabel, cloutLabelNumber, repectLabel, repectLabelNumber, cashLabel, cashLabelNumber;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
	Font buttonFont = new Font("Times New Roman", Font.PLAIN, 15);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	int clout , respect, cash;
	String readiness , position;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	
	JTextField txtInput = new JTextField("");
	



	public static void main(String[] args) {

		new Game();
	}
	
	public Game(){
		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		titlePanel = new JPanel();
		titlePanel.setBounds(100, 100, 600, 150);
		titlePanel.setBackground(Color.black);
		titleLabel = new JLabel("AYT");
		titleLabel.setForeground(Color.white);
		titleLabel.setFont(titleFont);	
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.white);
		startButton.setForeground(Color.green);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		
		titlePanel.add(titleLabel);
		startButtonPanel.add(startButton);
		
		con.add(titlePanel);
		con.add(startButtonPanel);
	}
	
	public void createGameScreen(){
		
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("AYT");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
		
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.green);
		choice1.setFont(buttonFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.green);
		choice2.setFont(buttonFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.green);
		choice3.setFont(buttonFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		choice4 = new JButton("Choice 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.green);
		choice4.setFont(buttonFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 15, 600, 50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);
		cloutLabel = new JLabel("clout:");
		cloutLabel.setFont(normalFont);
		cloutLabel.setForeground(Color.white);
		playerPanel.add(cloutLabel);
		cloutLabelNumber = new JLabel();
		cloutLabelNumber.setFont(normalFont);
		cloutLabelNumber.setForeground(Color.white);
		playerPanel.add(cloutLabelNumber);
		repectLabel = new JLabel("repect:");
		repectLabel.setFont(normalFont);
		repectLabel.setForeground(Color.white);
		playerPanel.add(repectLabel);
		repectLabelNumber = new JLabel();
		repectLabelNumber.setFont(normalFont);
		repectLabelNumber.setForeground(Color.white);
		playerPanel.add(repectLabelNumber);
		cashLabel = new JLabel("cash:");
		cashLabel.setFont(normalFont);
		cashLabel.setForeground(Color.white);
		playerPanel.add(cashLabel);
		cashLabelNumber = new JLabel();
		cashLabelNumber.setFont(normalFont);
		cashLabelNumber.setForeground(Color.white);
		playerPanel.add(cashLabelNumber);

		playerSetup();

	}
	public void playerSetup(){
		clout  =  0;
		respect = 0;
		cash = 0;
		readiness  = "notready";
		cloutLabelNumber.setText("" + clout);
		repectLabelNumber.setText("" + respect);
		cashLabelNumber.setText("" + cash);	
		yuh();
	}
	public void yuh() {
		position = "yuh";
		mainTextArea.setText("Wacko Swami: Yo that right there is Symere. He’s the guy you want to talk to if you want to join Ayt Squad. He’s the manager and the lead rapper.\n" + 
				"You: Yo bet can you introduce us, I sent them a demo a couple days ago.\n" + 
				"Wacko Swami: Yooo Symere this my boy who can rap, he sent you that demo a couple days ago. \n" + "");
		choice1.setText("Continue");
		choice2.setText("Continue");
		choice3.setText("Continue");
		choice4.setText("Continue");
	}
	public void introduction(){
		position = "introduction";
		mainTextArea.setText("What’s good G? You the one who sent us that trash demo?");		
		choice1.setText("Na G, all my tracks are heat.");
		choice2.setText("Watchu mean dawg you tryna start sum?");
		choice3.setText("");
		choice4.setText("");
	}
	public void ifA(){
		position = "ifA";
		mainTextArea.setText("I was just playing dawg, I ain’t even check you out yet, play something smt for me.");
		choice1.setText("Ayt dawg lemme play a lil sum for you, I call it “Chutney”. This goes B.");
		choice2.setText("Yea I knew you wasn’t no stupid. Lemme play a lil sum I call “Chutney");
		choice3.setText("");
		choice4.setText("");
	}
	public void ifB(){
		position = "ifB";
		mainTextArea.setText("You buggin b, I ain’t even listen to it yet but On Moms it's prolly trash");
		choice1.setText("Watchu tryna say dawg? ayt squad? Who names themselves ayt squad my guy? You calling my stuff trash?");
		choice2.setText("Lemme prove you wrong real quick Symere. Lemme play this banger me and my boy Wacko Swami put together.");
		choice3.setText("");
		choice4.setText("");
	}
	public void ifAChoiceOne(){
		position = "ifAChoiceOne";
		
		mainTextArea.setText("Symere: Yo this fire fam. You should come into the studio with us one day. ayt squad could use another member.\n" + 
				"You: Yea, I’ll hit the stu witchu tmrw. I’m tryna get some battle rap in right now though. You down?  \n" + 
				"Symere: No doubt, I’ll beat you.\n" + "");

		choice1.setText("Battle");
		choice2.setText("Battle");
		choice3.setText("Battle");
		choice4.setText("Battle");		
	}
	public void ifAChoiceTwo(){
		position = "ifAChoiceTwo";
		
		mainTextArea.setText("Symere: Ima ignore that slight cause yo demo fire. You should hit the studio with us one day. \n" + 
				"You: Yo how about this, we battle right here and If I win you let me join ayt squad.\n" + 
				"Symere: Hahah you think you can beat ME? Bet\n" + "");
		
		try {
			ausdio a=new ausdio("");
			a.play();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		choice1.setText("Battle");
		choice2.setText("Battle");
		choice3.setText("Battle");
		choice4.setText("Battle");		
	}
	public void ifBChoiceOne(){
		position = "ifBChoiceOne";
		
		mainTextArea.setText("Symere: Dawg get outta here. You tryna catch this fade huh I’ll bet a band right now that you can’t take me in a cypher. \n" + 
				"You: Bet let’s do it right here right now.\n" + 
				"Symere: Bet if you win I’ll even let you join Ayt Squad.\n" + "");
	
		try {
			ausdio a=new ausdio("");
			a.play();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		choice1.setText("Battle");
		choice2.setText("Battle");
		choice3.setText("Battle");
		choice4.setText("Battle");		
	}
	public void ifBChoiceTwo(){
		position = "ifBChoiceTwo";
		
		mainTextArea.setText("Symere: Yo this is aight but idk how much of it is you and how much of it is ya boy.\n" + 
				"You: How about this, lemme just hit you with this freestyle real quick. One band  says I can out rap you. \n" + 
				"Symere: Hahah you think you can beat ME? Bet if you win I’ll even let you join Ayt Squad.\n" + "");
		
		try {
			ausdio a=new ausdio("");
			a.play();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		choice1.setText("Battle");
		choice2.setText("Battle");
		choice3.setText("Battle");
		choice4.setText("Battle");		
	}
	
	public void battle(){
		JTextField t1,t2, t3;  
	    

		mainTextArea.setText("Battle Stage");
		position = "battle";
		int count = 0;
		int losses = 0;
		int wins = 0;
		String input;
		while(count<10) {
			String b=RhymeGame.getRandomWord();
			RhymeGame a=new RhymeGame(b);

			JOptionPane.showMessageDialog(null, b);
			a.getArray();
			ArrayList rhymes=a.rhymes;
			input = JOptionPane.showInputDialog("input");
			if(rhymes.contains(input.toLowerCase().replaceAll(" ","" ).replaceAll("'","").replaceAll("-", ""))) {
				JOptionPane.showMessageDialog(null, "Thats a rhyme!");
				wins++;
				count++;		
			}
			else {
				JOptionPane.showMessageDialog(null, "Lmao Nope!");
				wins--;
				count--;
			}
	}
		if(wins>losses) {
			win();
		}
		else {
			lose();
		}	
}
	
	public void continued(){
		position = "continued";
		
		mainTextArea.setText("The Next Day");			
		
	}
	public void replayIntroduction(){
		position = "replayIntroduction";
		
		introduction();	
	}
	public void replayBattle(){
		position = "replayBattle";
		
		battle();		
	}
	public void quit(){
		position = "quit";
		
		mainTextArea.setText("See Ya");	
		System.exit(0);
	}
	public void win(){
		position = "win";
		
		mainTextArea.setText("");	
		
		clout+=15; 
		cloutLabelNumber.setText(""+clout); 
		respect+=15; 
		repectLabelNumber.setText(""+respect); 
		cash+=15; 
		cashLabelNumber.setText(""+cash); 
			
		
		choice1.setText("Continue");
		choice2.setText("Quit");
		choice3.setText("");
		choice4.setText("");
		
	}
	public void lose(){
		position = "lose";
		clout-=15; 
		cloutLabelNumber.setText(""+clout); 
		respect-=15; 
		repectLabelNumber.setText(""+respect); 
		cash-=15; 
		cashLabelNumber.setText(""+cash); 
		
		mainTextArea.setText("YOU LOST . . .");
		
		choice1.setText("Replay Battle");
		choice2.setText("Quit");
		choice3.setText("");
		choice4.setText("");
	}	

	public class TitleScreenHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			createGameScreen();
		}
	}
	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			String yourChoice = event.getActionCommand();
			
			switch(position){
			case "yuh":
				switch(yourChoice){
				case "c1": replayIntroduction(); 
				case "c2": replayIntroduction(); 
				case "c3": replayIntroduction(); 
				case "c4": replayIntroduction(); 
					}
				break;
			case "introduction":
				switch(yourChoice){
				case "c1": ifA(); 
				clout+=15; 
				cloutLabelNumber.setText(""+clout); 
				respect+=15; 
				repectLabelNumber.setText(""+respect); 
				cash+=15; 
				cashLabelNumber.setText(""+cash); 
				try {
					ausdio a=new ausdio("");
					a.play();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				break;
				case "c2": ifB();
				clout+=15; 
				cloutLabelNumber.setText(""+clout); 
				respect+=15; 
				repectLabelNumber.setText(""+respect); 
				cash+=15; 
				cashLabelNumber.setText(""+cash); 
				try {
					ausdio a=new ausdio("");
					a.play();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				break;
				}
				break;
			case "ifA":
				switch(yourChoice){
				case "c1": ifAChoiceOne(); 
				clout+=15; 
				cloutLabelNumber.setText(""+clout); 
				respect+=15; 
				repectLabelNumber.setText(""+respect); 
				cash+=15; 
				cashLabelNumber.setText(""+cash); 
				try {
					ausdio a=new ausdio("");
					a.play();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				break;
				case "c2": ifAChoiceTwo();
				clout+=15; 
				cloutLabelNumber.setText(""+clout); 
				respect+=15; 
				repectLabelNumber.setText(""+respect); 
				cash+=15; 
				cashLabelNumber.setText(""+cash); 
				try {
					ausdio a=new ausdio("");
					a.play();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				break;
				}
				break;
			case "ifB":
				switch(yourChoice){
				case "c1": ifBChoiceOne(); 
				clout+=15; 
				cloutLabelNumber.setText(""+clout); 
				respect+=15; 
				repectLabelNumber.setText(""+respect); 
				cash+=15; 
				cashLabelNumber.setText(""+cash); 
				try {
					ausdio a=new ausdio("");
					a.play();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				break;
				case "c2": ifBChoiceTwo();
				clout+=15; 
				cloutLabelNumber.setText(""+clout); 
				respect+=15; 
				repectLabelNumber.setText(""+respect); 
				cash+=15; 
				cashLabelNumber.setText(""+cash); 
				try {
					ausdio a=new ausdio("");
					a.play();
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				break;
				}
				break;
			case "ifAChoiceOne":
				switch(yourChoice){
				case "c1": battle(); break;
				case "c2": battle(); break;
				case "c3": battle(); break;
				case "c4": battle(); break;
				}
				break;
			case "ifAChoiceTwo":
				switch(yourChoice){
				case "c1": battle(); break;
				case "c2": battle(); break;
				case "c3": battle(); break;
				case "c4": battle(); break;
				}
				break;
			case "ifBChoiceOne":
				switch(yourChoice){
				case "c1": battle(); break;
				case "c2": battle(); break;
				case "c3": battle(); break;
				case "c4": battle(); break;
				}
				break;
			case "ifBChoiceTwo":
				switch(yourChoice){
				case "c1": battle(); break;
				case "c2": battle(); break;
				case "c3": battle(); break;
				case "c4": battle(); break;
				}
				break;
			case "lose":
				switch(yourChoice){
				case "c1": replayBattle(); break;
				case "c2": quit(); break;
				}
				break;
			case "win":
				switch(yourChoice){
				case "c1": continued(); break;
				case "c2": quit(); break;
				}
				break;
			}
		}	
	}
}
