package ClassicWarCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards;
	
	
	public Deck() {
		 cards = new ArrayList<Card>();

		 for(int i=0; i<52;i++) {
			 Card card= new Card();
			 card.setValue(i);
			 card.setName("of hearts");
			 cards.add(card);		 
		 }
	}
	
	
	// getters and setters methods
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	//methods
	public void Shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
		
	}
	

}
