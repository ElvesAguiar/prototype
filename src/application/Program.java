package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
	public static void main(String[] args) {
		// Criando listas para armazenar formas
		List<Shape> shapes = new ArrayList<>();
		List<Shape> shapesCopy = new ArrayList<>();
		// instanciando um objeto do tipo circle
		Circle circle = new Circle();
		circle.x = 10;
		circle.y = 20;
		circle.radius = 15;
		circle.color = "red";
		shapes.add(circle);
		// instanciando copia do circle
		Circle anotherCircle = (Circle) circle.clone();
		shapes.add(anotherCircle);
		
		// instanciando Rectangle
		Rectangle rectangle = new Rectangle();
		rectangle.width = 10;
		rectangle.height = 20;
		rectangle.color = "blue";
		shapes.add(rectangle);
		
		// instanciando copia Rectangle
		
		Rectangle anotherRectangle = (Rectangle) rectangle.clone();
		shapes.add(anotherRectangle);
		cloneAndCompare(shapes, shapesCopy);
	}
	// função para acessar a lista de formas e verificar se os objetos são clones
	private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
		for (Shape shape : shapes) {
			shapesCopy.add(shape.clone());
		}

		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) != shapesCopy.get(i)) {
				System.out.println(i + ": Tem referencias diferentes!!");
				if (shapes.get(i).equals(shapesCopy.get(i))) {
					System.out.println(i + ": Objetos identicos!!!");
				} else {
					System.out.println(i + ": Não são objetos identicos");
				}
			} else {
				System.out.println(i + ": Tem a mesma referencia!!");
			}
		}
	}
}
