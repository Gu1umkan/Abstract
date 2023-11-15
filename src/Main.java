
public class Main {
    public static void main(String[] args) {
        Triangle triangle =new Triangle(1,4,3);
        Rectangle rectangle=new Rectangle(4,5,7,8);
        Pentagon pentagon =new Pentagon(1,5,8,5,3);
        Hexagon hexagon =new Hexagon(4,2,3,2,7,7);
        Heptagon heptagon = new Heptagon(2,5,7,3,7,12,23);
        System.out.println("Triangle perimeter: "+triangle.getPerimeter());
        System.out.println("Rectangle perimeter: "+ rectangle.getPerimeter());
        System.out.println("Pentagon perimeter: "+ pentagon.getPerimeter());
        System.out.println("Hexagon perimeter: "+ hexagon.getPerimeter());
        System.out.println("Heptagon perimeter: "+heptagon.getPerimeter());
    }
}
