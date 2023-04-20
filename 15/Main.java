abstract class Shape {
    public abstract double getArea();
}

class TwoDim extends Shape {
	public double getArea() {
        return 0.0;
    }
}

class ThreeDim extends Shape {
	public double getArea() {
        return 0.0;
    }
}

class Square extends TwoDim {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }
}

class Triangle extends TwoDim {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * this.base * this.height;
    }
}

class Sphere extends ThreeDim {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 4 * Math.PI * this.radius * this.radius;
    }
}

class Cube extends ThreeDim {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getArea() {
        return 6 * this.side * this.side;
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(4.0, 6.0);
        Sphere sphere = new Sphere(3.0);
        Cube cube = new Cube(4.0);

        System.out.println("Area of square: " + square.getArea());
        System.out.println("Area of triangle: " + triangle.getArea());
        System.out.println("Area of sphere: " + sphere.getArea());
        System.out.println("Area of cube: " + cube.getArea());
    }
}
