package entities;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    // metodo clone herdado da classe pai
    
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    // metodo clone herdado da classe pai
    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle) || !super.equals(object)) return false;
        Circle shape = (Circle) object;
        return shape.radius == radius;
    }
}