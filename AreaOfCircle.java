public class AreaOfCircle
{
    double x,y,r;
    double area(double r)
    {
        //Using this keyword for scope resolution
        this.r=r;
        double ar=Math.PI*r*r;
        return ar;
        
    }

    public static void main(String[] args) 
    {
        //Creating object of "areaofcircle" class
        AreaOfCircle a=new AreaOfCircle();
        a.r=20.0;
        System.out.println("Area ="+a.area(a.r));

        
    }
}