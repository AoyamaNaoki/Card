
public class Card {

	private int number;
	private String mark;
	private boolean isHigh;
	private String highName;
	private int compareNumber;
	private int compareMark;

	// コンストラクタ
	public Card(int number, String mark) {
		this.number = number;
		this.mark = mark;
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
		return this.mark;
	}

	// カプセル化
	public boolean getIsHigh() {
		return this.isHigh;
	}

	// カプセル化
	public String getHighName() {
		return this.highName;
	}

	public int getCompareMark() {
		return this.compareMark;
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

	public int CompareMark(Card anotherCard) {
		if (anotherCard.mark == "スペード") {
			compareMark = -1;
		}
		if (anotherCard.mark == "ハート" && mark == "スペード") {
			compareMark = 1;
		} else {
			compareMark = -1;
		}
		if (anotherCard.mark == "ダイヤ" && mark == "スペード" || mark == "ハート") {
			compareMark = 1;
		} else {
			compareMark = -1;
		}
		if (anotherCard.mark == "クローバー") {
			compareMark = 1;
		}
		return compareMark;
	}

}
