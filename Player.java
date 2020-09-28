package ClassicWarCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand;
	private int score;
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}



	private String name;

	
	


	//Constructor for this class
	public Player(String name) {
		this.name=name;
		this.hand=new ArrayList<Card>();
		this.setScore(0);
	}
	
	//getters and setters
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	
	
	public void describe() {
		System.out.println("Player Name: "+this.name);
		 for(Card card:hand) {
			 card.describe();
		 }
	}
	
	//This method removes and returns the top card of the hand
	public Card flip() {
		 return hand.remove(0);
		 
		 
	 }
	
	public void draw(Deck deck) {
		Card card= deck.draw();
		hand.add(card);
	}
	
	
	public void incrementScore() {
		setScore(getScore() + 1);
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}
}
