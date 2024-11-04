//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Shape shape = new Shape("Black",true);
        Shape shape2 = new Shape("Red",false);
        Shape shape3 = new Shape();

        System.out.println("---------------Test Shape--------------");
        System.out.println(shape);
        System.out.println(shape2);
        System.out.println(shape3);
        System.out.println("---------------End Test Shape--------------");

        Circle circle = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7,"Grey",true);

        System.out.println("---------------Test Circle--------------");
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println("-------------------------------");
        System.out.println(circle2);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
        System.out.println("-------------------------------");
        System.out.println(circle3);
        System.out.println(circle3.getArea());
        System.out.println(circle3.getPerimeter());
        System.out.println("---------------End Test Circle--------------");

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle(250,200);
        Rectangle rectangle3 = new Rectangle(100,50,"Red",true);

        System.out.println("---------------Test Rectangle--------------");
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println("-------------------------------");
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());
        System.out.println("-------------------------------");
        System.out.println(rectangle3);
        System.out.println(rectangle3.getArea());
        System.out.println(rectangle3.getPerimeter());
        System.out.println("---------------End Test Rectangle--------------");

        Square square = new Square();
        Square square2 = new Square(5);
        Square square3 = new Square(7,"Grey",true);
        Square square4 = new Square();
        
        System.out.println("---------------Test Square--------------");
        System.out.println(square);
        System.out.println(square.getSide());
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println("------------------------------");
        System.out.println(square2);
        System.out.println(square2.getSide());
        System.out.println(square2.getArea());
        System.out.println(square2.getPerimeter());
        System.out.println("------------------------------");
        System.out.println(square3);
        System.out.println(square3.getSide());
        System.out.println(square3.getArea());
        System.out.println(square3.getPerimeter());
        System.out.println("-------------------------------");
        square4.setSide(10);
        System.out.println(square4);
        System.out.println(square4.getSide());
        System.out.println(square4.getArea());
        System.out.println(square4.getPerimeter());
        System.out.println("---------------End Test Square--------------");


    }
}