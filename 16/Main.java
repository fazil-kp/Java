import java.util.Scanner;

interface Volume {
    double pi = 3.14159;
    void readData();
    void dispVolume();
}

class Sphere implements Volume {
    private double radius;
    private double volume;

    public void readData() {
        System.out.println("Enter the radius of the sphere: ");
        Scanner scanner = new Scanner(System.in);
        this.radius = scanner.nextDouble();
    }

    public void dispVolume() {
        this.volume = (4.0 / 3.0) * pi * Math.pow(this.radius, 3);
        System.out.println("The volume of the sphere is: " + volume);
    }
}

class Cylinder implements Volume {
    private double radius;
    private double height;
    private double volume;

    public void readData() {
        System.out.println("Enter the radius of the cylinder: ");
        Scanner scanner = new Scanner(System.in);
        this.radius = scanner.nextDouble();

        System.out.println("Enter the height of the cylinder: ");
        this.height = scanner.nextDouble();
    }

    public void dispVolume() {
        this.volume = pi * Math.pow(this.radius, 2) * this.height;
        System.out.println("The volume of the cylinder is: " + volume);
    }
}

public class Main {
    public static void main(String[] args) {
        Volume sphere = new Sphere();
        sphere.readData();
        sphere.dispVolume();

        Volume cylinder = new Cylinder();
        cylinder.readData();
        cylinder.dispVolume();
    }
}
