
public class Card {

	private int number;
	private String Mark;
	private boolean isHigh;
	private String highName;

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

	public int getNumber() {
		return this.number;
	}

	public String getMark() {
		return this.Mark;
	}

	public boolean getIsHigh() {
		return this.isHigh;
	}

	public String getHighName() {
		return this.highName;
	}

}
