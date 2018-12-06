
public class Card {

	private int number;
	private String Mark;
	private boolean isHigh;
	private String highName;
	private int compareNumber;

	// コンストラクタ
	public Card(int number, String Mark) {
		this.number = number;
		this.Mark = Mark;
		this.isHigh = false;

		if (this.number == 11) {
			highName = "JACK";
			isHigh = true;
		}
		if (this.number == 12) {
			highName = "QUEEN";
			isHigh = true;
		}
		if (this.number == 13) {
			highName = "KING";
			isHigh = true;
		}
		if (this.number == 14) {
			highName = "JOKER";
			isHigh = true;
		}
		if (this.number == 1) {
			highName = "ACE";
			isHigh = true;
		}
	}

	// カプセル化
	public int getNumber() {
		return this.number;
	}

	// カプセル化
	public String getMark() {
		return this.Mark;
	}

	// カプセル化
	public boolean getIsHigh() {
		return this.isHigh;
	}

	// カプセル化
	public String getHighName() {
		return this.highName;
	}

	public int Compare(Card anotherCard) {

		if (number > anotherCard.number) {
			compareNumber = 1;
		} else if (number == anotherCard.number) {
			compareNumber = 0;
		} else {
			compareNumber = -1;
		}
		return compareNumber;
	}

}
