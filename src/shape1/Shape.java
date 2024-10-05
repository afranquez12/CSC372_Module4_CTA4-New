package shape1;
/*
 * Program Name: Shape.java
 * Description: This program defines an abstract class "Shape" which provides a 
 *              template for calculating the surface area and volume of various 3D shapes.
 *              It includes abstract methods that will be implemented by subclasses such 
 *              as Sphere, Cylinder, and Cone. Each subclass will define its own method for 
 *              calculating the surface area and volume based on the specific shape's geometry.
 */

public abstract class Shape {
    
    // Abstract method to calculate the surface area of a shape
    // This method will be implemented in the subclasses
    public abstract double surface_area();
    
    // Abstract method to calculate the volume of a shape
    // This method will be implemented in the subclasses
    public abstract double volume();
}

