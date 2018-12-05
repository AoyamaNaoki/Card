import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	static List<Card> cards = new ArrayList<Card>();
	public int Nokori = 55;

	public void InitDeck() {

		String Mark = null;

		for (int i = 1; i <= 14; i++) {
			if (i == 14) {
				Mark = "JOKER";
				Card joker1 = new Card(14, Mark);
				Card joker2 = new Card(14, Mark);
				cards.add(joker1);
				cards.add(joker2);
				break;
			}

			for (int n = 0; n < 4; n++) {
				if (n == 0) {
					Mark = "ハート";
				}
				if (n == 1) {
					Mark = "ダイヤ";
				}
				if (n == 2) {
					Mark = "クローバー";
				}
				if (n == 3) {
					Mark = "スペード";
				}
				if (n >= 4) {
					n = 0;
				}

				Card card = new Card(i, Mark);
				cards.add(card);
			}
		}
		Collections.shuffle(cards);

	}

	public Card CardDraw() {
		Card card = null;
		card = cards.get(0);
		cards.remove(0);
		return card;
	}

	public int NokoriCard() {
		Nokori = cards.size();
		return Nokori;
	}

	public int KeepNumber(int beforeNumber, int newNumber) {
		if (beforeNumber >= newNumber) {
			newNumber = beforeNumber;
		}
		return newNumber;

	}

}
