package Question2;

import java.text.DecimalFormat;

public class Rectangle extends Shape
{
    private double height;
    private double width;

    public Rectangle() 
    {
    }
    public Rectangle(String shapeName, double height, double width) 
    {
        this.shapeName = shapeName;
        this.height = height;
        this.width = width;
    }

    public double getHeight() 
    {
        return height;
    }

    public double getWidth() 
    {
        return width;
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
        return getHeight()*getWidth();
    }

    @Override
    public double Perimeter() 
    {
       return 2*(getHeight()+getWidth());
    }
    @Override
    public String toString() 
    {
        DecimalFormat format= new DecimalFormat("#.##");
        return "Type Of Figure:\t\t" + getTypeFigure() + "\nShape Name:\t\t" + getShapeName() + "\nHeight:\t\t\t" + getHeight() + "\nWidth\t\t\t" + getWidth() +"\nArea:\t\t\t"+Area()+"\nPerimeter:\t\t"+format.format(Perimeter());
    }
    
}
