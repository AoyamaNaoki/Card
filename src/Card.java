
public class Card {

	private int number;
	private String mark;
	private boolean isHigh;
	private String highName;
	private int compareResult;

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
		return this.compareResult;
	}

	public int CompareCard(Card anotherCard) {
		if (number > anotherCard.number) {
			compareResult = 1;
		} else if (number < anotherCard.number) {
			compareResult = -1;
		}
		if (number == anotherCard.number) {
			if (mark == anotherCard.mark) {
				compareResult = 0;
			}
			if (mark == "スペード" && anotherCard.mark != "スペード") {
				compareResult = 1;
			}
			if (mark == "ハート" && anotherCard.mark == "スペード") {
				compareResult = -1;
			} else {
				compareResult = 1;
			}
			if (mark == "ダイヤ" && anotherCard.mark == "クローバー") {
				compareResult = 1;
			} else {
				compareResult = -1;
			}
			if (mark == "クローバー") {
				compareResult = -1;
			}
		}
		return compareResult;
	}
}