
package Question2;

import java.text.DecimalFormat;


public class Square extends Shape
{

    private double sideLength;

    public Square() 
    {
        
    }

    public Square(String shapeName,double sideLength) 
    {
        this.shapeName = shapeName;
        this.sideLength = sideLength;
    }

    public double getSideLength() 
    {
        return sideLength;
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
        return getSideLength()*getSideLength();
    }

    @Override
    public double Perimeter() 
    {
      return getSideLength()*4;
    }
    @Override
    public String toString()
    {
      DecimalFormat format=new DecimalFormat("#.##");
      return "Type OF Figure:\t\t"+getTypeFigure()+"\n"+"Shape Name:\t\t"+getShapeName()+"\nSide Length:\t\t"+getSideLength()+"\n"+"Area:\t\t\t"+format.format(Area())+"\n"+"Perimeter:\t\t"+format.format(Perimeter());
    }
}
