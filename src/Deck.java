import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	static List<Card> cards = new ArrayList<Card>();
	public int Nokori = 55;
	Card card = null;
	String Mark = null;
	boolean isHigh = false;

	public void InitDeck() {

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
		card = cards.get(0);
		cards.remove(0);
		return card;
	}

	public int NokoriCard() {
		Nokori = cards.size();
		return Nokori;
	}

	public int MaxNumber(int beforeNumber) {
		int maxNumber = beforeNumber;
		if (card.number > maxNumber) {
			maxNumber = card.number;
		}
		return maxNumber;
	}

	public boolean checkCard() {
		if (card.number == 11 || card.number == 12 || card.number == 13 || card.number == 14) {
			isHigh = true;
		}
		return isHigh;
	}

	public String IsHigh() {
		String highName = null;

		if (card.number == 11) {
			highName = "JACK";
			isHigh = true;
		}
		if (card.number == 12) {
			highName = "QUEEN";
			isHigh = true;
		}
		if (card.number == 13) {
			highName = "KING";
			isHigh = true;
		}
		if (card.number == 14) {
			highName = "JOKER";
			isHigh = true;
		}
		if (card.number == 1) {
			highName = "ACE";
			isHigh = true;
		}
		return highName;
	}

	public void execString(String s) {
		String x = IsHigh();
		if (isHigh == true || card.number == 1) {
			System.out.println("カードは" + card.Mark + "の" + x + "です。");
			isHigh = false;
		} else {
			System.out.println("カードは" + s + "です。");
		}
	}

}
