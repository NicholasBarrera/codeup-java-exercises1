package shapes;

public class Square extends Quadrilateral{


    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;

    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}


//public class Square extends Rectangle {
//
//    public Square(int side) {
//        super(side, side);
//
//    }
//
//public double getArea() {
//        return (int)(Math.pow(length, 2));
//}
//
//public double getPerimeter() {
//        return (int)(length * 4);
//}
//
//
//}
