package shapes;

public class Rectangle extends Quadrilateral implements Measurable  {
    public Rectangle(int length, int width){
            super(length, width);
        }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }
    @Override
    public double getPerimeter() {
        return 2 * this.getLength() + 2 * this.getWidth();
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }
}


//public class Rectangle {
//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea () {
//        return (2 * length) + (2 * width);
//    }
//
//    public int getPerimeter() {
//        return length * width;
//    }
//
//
//
//
//}
