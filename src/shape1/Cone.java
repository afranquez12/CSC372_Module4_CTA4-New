package shape1;

/*
 * Program Name: Cone.java
 * Description: This program defines a "Cone" class that extends the abstract class "Shape."
 *              The class implements methods to calculate the surface area and volume of a cone.
 *              It uses a parameterized constructor to initialize the radius and height of the cone,
 *              and provides a custom toString method to display the details of the cone including 
 *              its radius, height, surface area, and volume. The surface area calculation uses the 
 *              slant height derived from the Pythagorean theorem.
 */

public class Cone extends Shape {
    // Attributes for storing the radius and height of the cone
    private double radius;
    private double height;

    // Parameterized constructor to initialize the radius and height of the cone
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the surface area of the cone
    // Formula: π * r * (r + slant height)
    // Slant height is calculated using the Pythagorean theorem: √(r^2 + h^2)
    @Override
    public double surface_area() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    // Method to calculate the volume of the cone
    // Formula: (1/3) * π * r^2 * h
    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    // Override the toString method to provide a formatted string
    // Displaying the radius, height, surface area, and volume of the cone
    @Override
    public String toString() {
        return String.format("Cone - Radius: %.2f, Height: %.2f, Surface Area: %.2f, Volume: %.2f", 
                radius, height, surface_area(), volume());
    }
}
