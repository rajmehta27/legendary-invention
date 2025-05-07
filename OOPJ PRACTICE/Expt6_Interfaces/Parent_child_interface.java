public class Parent_child_interface {
    public static void main(String[] args) {
        // Create objects of Shape1 and Shape2
        Shape1 shape1 = new Shape1();
        Shape2 shape2 = new Shape2();
        // Test Shape1 methods
        System.out.println("Testing Shape1:");
        shape1.drawLine();
        shape1.drawRectangle();
        shape1.drawTriangle();

        // Test Shape2 methods
        System.out.println("\nTesting Shape2:");
        shape2.drawLine();
        shape2.drawRectangle();
        shape2.drawTriangle();
    }
}

// Parent interface
interface Line {
    void drawLine();
}

// Child interface Rectangle
interface Rectangle extends Line {
    void drawRectangle();
}

// Child interface Triangle

interface Triangle extends Line {
    void drawTriangle();
}

// Class Shape1 implements interfaces Rectangle, Triangle
class Shape1 implements Rectangle, Triangle {
    @Override
    public void drawLine() {
        System.out.println("Line drawn for shape1");
    }

    @Override
    public void drawRectangle() {
        System.out.println("Rectangle drawn for shape1");
    }

    @Override
    public void drawTriangle() {
        System.out.println("Triangle drawn for shape1");
    }
}

// Class Shape2 implements interfaces Rectangle, Triangle
class Shape2 implements Rectangle, Triangle {
    @Override
    public void drawLine() {

        System.out.println("Line drawn for shape2");
    }

    @Override
    public void drawRectangle() {
        System.out.println("Rectangle drawn for shape2");
    }

    @Override
    public void drawTriangle() {
        System.out.println("Triangle drawn for shape2");
    }
}