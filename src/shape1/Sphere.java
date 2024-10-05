package shape1;

/*
 * Program Name: Sphere.java
 * Description: This program defines a "Sphere" class that extends the abstract class "Shape."
 *              The class implements the methods to calculate the surface area and volume of a sphere.
 *              It uses a parameterized constructor to initialize the radius and provides a custom
 *              toString method to display the details of the sphere, including its radius, surface area,
 *              and volume.
 */

public class Sphere extends Shape {
    // Attribute for storing the radius of the sphere
    private double radius;

    // Parameterized constructor to initialize the radius of the sphere
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to calculate the surface area of the sphere
    // Formula: 4 * π * r^2
    @Override
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the volume of the sphere
    // Formula: (4/3) * π * r^3
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Override the toString method to provide a formatted string
    // Displaying the radius, surface area, and volume of the sphere
    @Override
    public String toString() {
        return String.format("Sphere - Radius: %.2f, Surface Area: %.2f, Volume: %.2f", radius, surface_area(), volume());
    }
}
