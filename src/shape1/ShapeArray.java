package shape1;

/*
 * Program Name: ShapeArray.java
 * Description: This program serves as the driver class that demonstrates polymorphism with 
 *              an array of different shapes. It creates instances of Sphere, Cylinder, and Cone,
 *              stores them in an array of type Shape, and then loops through the array to print
 *              the surface area and volume of each shape. This program utilizes inheritance and 
 *              abstract classes to calculate these properties for different 3D shapes.
 */

public class ShapeArray {
    public static void main(String[] args) {
        // Create instances of each shape with specified dimensions
        Sphere sphere = new Sphere(5.0);   // Sphere with radius 5.0
        Cylinder cylinder = new Cylinder(3.0, 7.0);  // Cylinder with radius 3.0 and height 7.0
        Cone cone = new Cone(3.0, 5.0);    // Cone with radius 3.0 and height 5.0

        // Store the shapes in an array of type Shape
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Loop through the array and print the details of each shape
        // Each shape's toString method will be called to display its surface area and volume
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
