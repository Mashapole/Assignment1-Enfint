package Question2;

import java.text.DecimalFormat;


public class Parallelogram extends Shape
{

    private double height;
    private double base;
    
    public Parallelogram() 
    {
    }
    public Parallelogram(String shapeName, double height, double base) 
    {
        this.shapeName = shapeName;
        this.height = height;
        this.base = base;
    }
     public double getHeight() 
    {
        return height;
    }

    public double getBase() 
    {
        return base;
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
        return getHeight()*getBase();
    }

    @Override
    public double Perimeter() 
    {
       return 2*(getHeight()+getBase());
    }
    @Override
    public String toString() 
    {
        DecimalFormat format= new DecimalFormat("#.##");
        return "Type Of Figure:\t\t" + getTypeFigure() + "\nShape Name:\t\t" + getShapeName() + "\nHeight:\t\t\t" + getHeight() + "\nBase\t\t\t" + getBase() +"\nArea:\t\t\t"+Area()+"\nPerimeter:\t\t"+format.format(Perimeter());
    }
    
}
