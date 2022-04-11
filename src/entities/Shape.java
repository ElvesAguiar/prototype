package entities;

import java.util.Objects;

public abstract class Shape implements Prototype {
	public int x;
	public int y;
	public String color;

	public Shape() {
	}

	public Shape(Shape shape) {
		if (shape != null) {
			this.x = shape.x;
			this.y = shape.y;
			this.color = shape.color;
		}
	}

	//Metodo Clone
	
	public abstract Shape clone();
	
	//metodo equals
	
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Shape))
			return false;
		Shape shape = (Shape) object;
		return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
	}
}