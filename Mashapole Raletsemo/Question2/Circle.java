package Question2;

import java.text.DecimalFormat;
public class Circle extends Shape
{

    private double radius;
    
    
    public Circle()
    {
        
    }
    public Circle(String shapeName,double radius)
    {
        this.shapeName = shapeName;
        this.radius = radius;  
    }

    public double getRadius() 
    {
        return radius;
    }

    public String getTypeFigure()
    {
        return typeFigure;
    }
    public String getShapeName() 
    {
        return shapeName;
    }
    
    @Override
    public double Area() 
    {
        return 3.142*(getRadius())*(getRadius());
    }
    @Override
    public double Perimeter() 
    {
        return 2*3.142*getRadius();
    }
    @Override
    public String toString() 
    {
      DecimalFormat format=new DecimalFormat("#.##");
      return "Type OF Figure:\t\t"+getTypeFigure()+"\n"+"Shape Name:\t\t"+getShapeName()+"\nRadius:\t\t\t"+getRadius()+"\n"+"Area:\t\t\t"+format.format(Area())+"\n"+"Perimeter:\t\t"+format.format(Perimeter());
    }
    
}
