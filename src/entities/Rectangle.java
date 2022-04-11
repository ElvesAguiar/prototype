package entities;

public class Rectangle extends Shape {
	// Atributos da classe

	public int width;
	public int height;

	// construtores

	public Rectangle() {
	}

	public Rectangle(Rectangle target) {
		super(target);
		if (target != null) {
			this.width = target.width;
			this.height = target.height;
		}
	}

	// metodo clone herdado da classe pai

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

	// metodo equals herdado da classe pai

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Rectangle) || !super.equals(object))
			return false;
		Rectangle shape = (Rectangle) object;
		return shape.width == width && shape.height == height;
	}
}