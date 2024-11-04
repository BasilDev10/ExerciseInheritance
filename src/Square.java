public class Square extends Rectangle {

    public Square() {

    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color,boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public double getArea() {
        return super.getLength() * super.getLength();
    }
    @Override
    public double getPerimeter() {
        return 4 * super.getLength();
    }
    @Override
    public String toString() {
        return "Square with side = "+getSide()+"\n"+ super.toString();
    }
}
