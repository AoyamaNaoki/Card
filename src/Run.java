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

		if (card1.CompareCard(card2) == 1) {
			System.out.println("カード1はカード2に対し勝ちです");
		} else if (card1.CompareCard(card2) == 0) {
			System.out.println("カード1はカード2に対し引き分けです");
		} else if (card1.CompareCard(card2) == -1) {
			System.out.println("カード1はカード2に対し負けです");
		} else {
			System.out.println("そのパターンは存在しません");
		}

//		if (card1.Compare(card2) == -1) {
//			System.out.println("カード1の数値はカード2より" + (card2.getNumber() - card1.getNumber()) + "小さいです");
//		} else if (card1.Compare(card2) == 0) {
//			System.out.println("カード1とカード2の数値は等しいです");
//			if (card1.CompareMark(card2) == 1) {
//				System.out.println("カード1のマークがカード2より強いので勝ちです");
//			} else if (card1.CompareMark(card2) == -1) {
//				System.out.println("カード1のマークがカード2より弱いので負けです");
//			} else {
//				System.out.println("そのパターンは存在しません");
//			}
//		} else {
//			System.out.println("カード1の数値はカード2より" + (card1.getNumber() - card2.getNumber()) + "大きいです");
//		}

//		// カードを5枚引いて最大のカードを出す
//		Deck deck3 = new Deck();
//		deck3.InitDeck();
//		Card card3 = deck.CardDraw();
//		Card card4 = deck.CardDraw();
//		Card card5 = deck.CardDraw();
//		Card card6 = deck.CardDraw();
//		Card card7 = deck.CardDraw();
//		List<Card> cards3 = new ArrayList<Card>();
//		cards3.add(card3);
//		cards3.add(card4);
//		cards3.add(card5);
//		cards3.add(card6);
//		cards3.add(card7);
//		Card strongCard = cards3.get(0);
//		List<Card> strongCards = new ArrayList<Card>();
//		int count = 3;
//		while (count < strongCards.size()) {
//			if (card3.Compare(card4) == 1)
//				;
//
//			count += 1;
//		}

//		System.out.println("強いカードは" + strongCard);

//		if (strongCards.size() == 1) {
//			System.out.println("一番強いカードは" + strongCard.getNumber());
//		} else if (strongCards.size() > 1) {
//			System.out.println("数字被りあり");
//		}

//		System.out.println(card3.getNumber());
//		System.out.println(card4.getNumber());
//		System.out.println(card5.getNumber());
//		System.out.println(card6.getNumber());
//		System.out.println(card7.getNumber());

	}

}
