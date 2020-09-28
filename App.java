package ClassicWarCardGame;

public class App {

	public static void main(String[] args) {
		
		Deck deck= new Deck();
		
		Player sebi = new Player("Sebi Ubuntu Ra");
		Player ike = new Player("Ike Zulu");
		
		deck.Shuffle();
		
		//makes sure each player get an equal number of cards
		for(int i=0;i<52;i++) {
			if(i%2 ==0) {
				sebi.draw(deck);
			}
			else {
				ike.draw(deck);
			}			
		}
		
		
		
		for(int i=0;i<26;i++) {
			Card sebiCards = sebi.flip();
			Card ikeCards =ike.flip();
			
			
			if(sebiCards.getValue()>ikeCards.getValue()) {
				sebi.incrementScore();
			}
			else if(sebiCards.getValue()<ikeCards.getValue()) {
				ike.incrementScore();
			}
			else{
				sebi.incrementScore();
				ike.incrementScore();
			}
		}
		
		
		int sebiScore=sebi.getScore();
		int ikeScore=ike.getScore();
		
		if(sebiScore == ikeScore) {
			System.out.println("Battle is drawn between "+sebi.getName()+" and "+ike.getName());
		}
		else if(sebiScore > ikeScore) {
			System.out.println(sebi.getName()+" Wins!");
		}
		else {
			System.out.println(ike.getName()+" Wins!");
		}
		
		
		
		
		
		

	}

}
