public class Main{
    public static void main(String[] args){
        Rectangle rect=new Rectangle("Orange",13,15);
        System.out.println("The area of "+rect.color+" rectangle is "+rect.calculateArea());
        System.out.println("The perimeter of "+rect.color+" rectangle is "+rect.calculatePerimeter());
        rect.renderer.draw();
        rect.renderer.draw("rectangle");
        Square sqr=new Square("blue", 10);
        System.out.println("The area of "+sqr.color+" square is "+sqr.calculateArea());
        System.out.println("The perimeter of "+sqr.color+" square is "+sqr.calculatePerimeter());
        sqr.renderer.draw();
        sqr.renderer.draw("square");
        Triangle tri=new Triangle("red",13,10);
        System.out.println("The area of "+tri.color+" triangle is "+tri.calculateArea());
        System.out.println("The perimeter of "+tri.color+" triangle is "+tri.calculatePerimeter());
        tri.renderer.draw();
        tri.renderer.draw("triangle");
        Circle cir=new Circle("yellow",10.5);
        System.out.println("The area of "+cir.color+" circle is "+cir.calculateArea());
        System.out.println("The perimeter of "+cir.color+" circle is "+cir.calculatePerimeter());
        cir.renderer.draw();
        cir.renderer.draw("circle");
    }
}