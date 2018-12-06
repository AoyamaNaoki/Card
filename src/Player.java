import java.util.ArrayList;
import java.util.List;

public class Player {

	public Deck deck;
	public List<Card> hands = new ArrayList<Card>();

	public static void main(String[] args) {

	}

	public void addHand() {
		if (hands.size() < 5) {
			hands.add(deck.CardDraw());
			System.out.println(hands.get(1));
		}
	}
}
