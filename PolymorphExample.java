abstract class Shape{
    abstract void numberOfSides();
}

class Rectangle extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides in Rectangle : 4");
    }
}

class Triangle extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides in Triangle : 3");
    }
}

class Hexagon extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides in Hexagon : 6");
    }
}
public class PolymorphExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.numberOfSides();
        Triangle triangle = new Triangle();
        triangle.numberOfSides();
        Hexagon hexagon = new Hexagon();
        hexagon.numberOfSides();
    }
}
