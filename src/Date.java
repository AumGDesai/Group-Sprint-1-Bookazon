public class Date {
	private int year;
	private int month;
	private int day;

	public Date(int year, int month, int day) {
		this.year = year;

		// might be better to throw exceptions, but alas
		
		// no year disallowed: negative = bce

		this.month = month;
		if (!isValidMonth()) {
			this.month = 1;
		}

		this.day = day;
		if (!isValidDay()) {
			this.day = 1;
		}
	}

	private boolean isValidMonth() {
		return 1 <= this.month && this.month <= 12;
	}

	// could further check day is valid according to month, 
	// but likely too detail-oriented for this exercise
	private boolean isValidDay() {
		return 1 <= this.day && this.day <= 31; 
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;

		if (!isValidMonth()) {
			this.month = 1;
		}
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;

		if (!isValidDay()) {
			this.day = 1;
		}
	}

	public String toString() {
		return this.year + "-" + this.month + "-" + this.day;
	}
}
		
