class Box {
    double length, breadth, height;

    // No-argument constructor
    Box() {
        length = 1;
        breadth = 1;
        height = 1;
    }

    // One-argument constructor (cube)
    Box(double side) {
        length = breadth = height = side;
    }

    // Parameterized constructor
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Box b1 = new Box();           
        Box b2 = new Box(5);          
        Box b3 = new Box(1,2,3);    

        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());
    }
}
