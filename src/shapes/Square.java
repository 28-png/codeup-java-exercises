package shapes;

public class Square extends Quadrilateral {


    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(this.length, 2);
    }

    @Override
    public int setLength(double length) {
        return this.length;
    }

    @Override
    public int setWidth(double width) {
        return this.width;
    }



//     Square(int side) {
//        super(side, side);
//        }
//        public int getArea() {
//            return (int) Math.pow(this.length, 2);
//
//     }
//
//     public int getPerimeter() {
//         return 4 * this.length;
//     }




}