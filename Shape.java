package inheritence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity(name="inheritence.Shape")
@Table(name="shapes")
@Inheritance(strategy=InheritanceType.JOINED)

public class Shape {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shape_id;
	
	private int x,y;

	public int getShape_id() {
		return shape_id;
	}

	public void setShape_id(int shape_id) {
		this.shape_id = shape_id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
