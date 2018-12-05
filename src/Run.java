
public class Run {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.InitDeck();

		while (deck.Nokori > 0) {
			Card card = deck.CardDraw();
			deck.NokoriCard();
			String s = card.Mark + "の" + card.number;
			System.out.println("カードは" + s + "です。");
			System.out.println("残り枚数は" + deck.Nokori + "枚です。");
		}
	}

}
