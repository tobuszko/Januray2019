public class AbstractTester {

    public static void main(String[] args) {
        Shape s = new Rectangle();
                ((Rectangle) s).setLength(40);
                ((Rectangle) s).setWidth(30);
                System.out.println(s.getArea());
    }


}



abstract class Shape {
    private String color;
    abstract double getArea();
}

class Rectangle extends Shape {
    private int width;
    private int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width*length;
    }
}