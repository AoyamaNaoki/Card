import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	static List<Card> cards = new ArrayList<Card>();
	public static boolean isStarted = false;

	public static void main(String[] args) {
		if (isStarted == false) {
			InitDeck();
			isStarted = true;
		}
		CardDraw();
		CardDraw();
		CardDraw();
		CardDraw();
		CardDraw();
		CardDraw();
		CardDraw();
		CardDraw();
		CardDraw();

	}

	public static void InitDeck() {

		String Mark = null;

		for (int i = 1; i <= 14; i++) {
			if (i == 14) {
				Mark = "JOKER";
				Card joker1 = new Card(0, Mark);
				Card joker2 = new Card(0, Mark);
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
		System.out.println("登録データ数:" + cards.size());
	}

	public static void CardDraw() {
		System.out.println(cards.get(0).number + "\t" + cards.get(0).Mark);
		cards.remove(0);
		System.out.println("登録データ数:" + cards.size());
	}

}
