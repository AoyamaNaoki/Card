import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.InitDeck();
		int maxNumber = 0;
		int count = 3;
		// 残り枚数があるときはカードを引く
		while (deck.Nokori > 0) {
			Card card = deck.CardDraw();
			deck.NokoriCard();
			String s = card.getMark() + "の" + card.getNumber();

			maxNumber = deck.MaxNumber(maxNumber);

			// カードのデータを出力する
			String x = card.getHighName();
			if (card.getNumber() == 14) {
				System.out.println("カードは" + x + "です。");
			} else if (card.getIsHigh() == true) {
				System.out.println("カードは" + card.getMark() + "の" + x + "です。");
			} else {
				System.out.println("カードは" + s + "です。");
			}

			// カードのデータを出力する
			System.out.println("現在の最大の数値は" + maxNumber + "です");
			System.out.println("残り枚数は" + deck.Nokori + "枚です。");
			System.out.println();

		}

		// カードの大小比較
		Deck deck2 = new Deck();
		deck2.InitDeck();
		Card card1 = deck2.CardDraw();
		Card card2 = deck2.CardDraw();

		System.out.println("【カード2枚の強さの比較】");

		if (card1.CompareCard(card2) == 1) {
			System.out.println("カード1はカード2に対し勝ちです");
		} else if (card1.CompareCard(card2) == 0) {
			System.out.println("カード1はカード2に対し引き分けです");
		} else if (card1.CompareCard(card2) == -1) {
			System.out.println("カード1はカード2に対し負けです");
		} else {
			System.out.println("そのパターンは存在しません");
		}
		System.out.println();

		Deck deck3 = new Deck();
		deck3.InitDeck();
		Card card3 = deck3.CardDraw();
		Card card4 = deck3.CardDraw();
		Card card5 = deck3.CardDraw();
		Card card6 = deck3.CardDraw();
		Card card7 = deck3.CardDraw();
		List<Card> cards3 = new ArrayList<Card>();
		cards3.add(card3);
		cards3.add(card4);
		cards3.add(card5);
		cards3.add(card6);
		cards3.add(card7);
		Card strongCard;

		if (card3.CompareCard(card4) == 1) {
			strongCard = card3;
		} else {
			strongCard = card4;
		}
		if (strongCard.CompareCard(card5) == -1) {
			strongCard = card5;
		}
		if (strongCard.CompareCard(card6) == -1) {
			strongCard = card6;
		}
		if (strongCard.CompareCard(card7) == -1) {
			strongCard = card7;
		}
		System.out.println("【カードを5枚引いて最も強いカードの出力】");
		System.out.println("5枚のカードの中で最も強いのは " + strongCard.getMark() + " の " + strongCard.getNumber() + " です ");
		System.out.println();
	}

}
