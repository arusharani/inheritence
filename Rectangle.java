package inheritence;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "inheritence.Rectangle")
@Table(name = "rectangle")
public class Rectangle extends Shape {
	private int length;
	private int breath;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

}
