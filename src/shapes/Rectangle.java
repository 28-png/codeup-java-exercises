package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int setLength(double length) {
        return this.length;
    }

    @Override
    public int setWidth(double width) {
        return this.width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }



    //protected int length;
//protected int width;
//
//public Rectangle(int length, int width) {
//    this.length = length;
//    this.width = width;
//}
//
//public int getPerimeter() {
//    return (2 * length) + (2 * width);
//}
//
//public int getArea() {
//    return length * width;
//}




}
