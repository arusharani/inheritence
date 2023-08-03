package inheritence;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="inheritence.Square")
@Table(name="square")
public class Square  extends Shape{
	
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	

}
