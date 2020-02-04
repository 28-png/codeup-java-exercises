package shapes;

public class Square extends Rectangle {

     Square(int side) {
        super(side, side);
        }
        public int getArea() {
            return (int) Math.pow(this.length, 2);

     }

     public int getPerimeter() {
         return 4 * this.length;
     }

}