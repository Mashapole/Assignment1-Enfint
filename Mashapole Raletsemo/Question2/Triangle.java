
package Question2;
import java.lang.*;
import java.text.DecimalFormat;
public class Triangle extends Shape
{
    private double height;
    private double base;
    
    public Triangle()
    {
        
    }

    public Triangle(String shapeName, double height, double base) 
    {
        this.shapeName = shapeName;
        this.height = height;
        this.base = base;
    }
    
    public String getTypeFigure() 
    {
        return typeFigure;
    }

    public double getHeight() 
    {
        return height;
    }

    public double getBase() 
    {
        return base;
    }

    public String getShapeName() 
    {
        return shapeName;
    }
    
    public double Hypotenuse()
    {
        double hypotenuse;
        hypotenuse=(getHeight()*getHeight())+(getBase()*getBase());
             
        return Math.sqrt(hypotenuse);
    }
    @Override
    public double Area() 
    {
        return (getHeight()*getBase())/2;    
    }
    @Override
    public double Perimeter() 
    {
        return getHeight()+getBase()+Hypotenuse();
    }

    @Override
    public String toString() 
    {
        DecimalFormat format= new DecimalFormat("#.##");
        return "Type Of Figure:\t\t" + getTypeFigure() + "\nShape Name:\t\t" + getShapeName() + "\nHeight:\t\t\t" + getHeight() + "\nBase\t\t\t" + getBase() +"\nHypotenuse:\t\t"+format.format(Hypotenuse())+"\nArea:\t\t\t"+Area()+"\nPerimeter:\t\t"+format.format(Perimeter());
    }
    
    
}
