
package Question2;

import java.util.ArrayList;
import java.util.List;


public class Test_Class 
{
    public static void main(String[] args)
    {
        //colelctions for circle, triangle,square,rectangle,parallelogram class
        List<Circle> circle= new ArrayList<>();
        List<Triangle> triangle= new ArrayList<>();
        List<Square> square= new ArrayList<>();
        List<Rectangle> rectangle= new ArrayList<>();
        List<Parallelogram> para= new ArrayList<>();
        
        //adding parameters to collections 
        circle.add(new Circle("Circle",10));// adding name and radius
        triangle.add(new Triangle("Triangle",10,6));// adding name, height and base
        square.add(new Square("Square",10));// adding name, length of all size(all side are equall)
        rectangle.add(new Rectangle("Rectangle",10,6));//adding name, height and width
        para.add(new Parallelogram("Parallelogram", 7,5));// adding name, base and height
        
        
        System.out.println("***************************************************");
        System.out.println("--------------------DISPLAY------------------------");
        //displaying 
        for(Circle cir: circle)
        {
         System.out.println(cir.toString());
        }
        System.out.println("***************************************************");
        for(Triangle a: triangle)
        {
         System.out.println(a.toString());
        }
        System.out.println("***************************************************");
        for(Square sq: square)
        {
         System.out.println(sq.toString());
        }
        System.out.println("***************************************************");
        for(Rectangle rec: rectangle)
        {
         System.out.println(rec.toString());
        }
        System.out.println("***************************************************");
        for(Parallelogram par: para)
        {
         System.out.println(par.toString());
        }
        System.out.println("***************************************************");
        System.out.println("------------------------END------------------------");
        System.out.println("***************************************************");
    }
    
}
