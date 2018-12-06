
public class Run {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.InitDeck();
		int maxNumber = 0;

		while (deck.Nokori > 0) {
			Card card = deck.CardDraw();
			deck.NokoriCard();
			String s = card.Mark + "の" + card.number;

			maxNumber = deck.MaxNumber(maxNumber);

			deck.execString(s);
			System.out.println("現在の最大の数値は" + maxNumber + "です");
			System.out.println("残り枚数は" + deck.Nokori + "枚です。");
			System.out.println();

		}
	}

}
