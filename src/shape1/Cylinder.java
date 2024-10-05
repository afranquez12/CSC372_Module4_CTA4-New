package shape1;

/*
 * Program Name: Cylinder.java
 * Description: This program defines a "Cylinder" class that extends the abstract class "Shape."
 *              The class implements methods to calculate the surface area and volume of a cylinder.
 *              It uses a parameterized constructor to initialize the radius and height of the cylinder,
 *              and provides a custom toString method to display the details of the cylinder including 
 *              its radius, height, surface area, and volume.
 */

public class Cylinder extends Shape {
    // Attributes for storing the radius and height of the cylinder
    private double radius;
    private double height;

    // Parameterized constructor to initialize the radius and height of the cylinder
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the surface area of the cylinder
    // Formula: 2 * π * r * (r + h)
    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate the volume of the cylinder
    // Formula: π * r^2 * h
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Override the toString method to provide a formatted string
    // Displaying the radius, height, surface area, and volume of the cylinder
    @Override
    public String toString() {
        return String.format("Cylinder - Radius: %.2f, Height: %.2f, Surface Area: %.2f, Volume: %.2f", 
                radius, height, surface_area(), volume());
    }
}
