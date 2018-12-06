
public class Run {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.InitDeck();
		int maxNumber = 0;

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
		Card card1 = deck.CardDraw();
		Card card2 = deck.CardDraw();

		if (card1.Compare(card2) == -1) {
			System.out.println("カード1の数値はカード2より" + (card2.getNumber() - card1.getNumber()) + "小さいです");
		} else if (card1.Compare(card2) == 0) {
			System.out.println("カード1とカード2の数値は等しいです");
		} else {
			System.out.println("カード1の数値はカード2より" + (card1.getNumber() - card2.getNumber()) + "大きいです");
		}

	}

}
