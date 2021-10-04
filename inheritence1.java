class box
{
    double width;
    double height;
    double depth;
// default constructor
    box()
    {
        width=0.0;
        height=0.0;
        depth=0.0;

    }
    //parameterized constructor

    box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
// compute and return volume
    double volume()
    {
        return width*height*depth;
    }
}
//making subclass boxweight of superclass box

class boxweight extends box
{
    double weight;

    // constructor for box weight
    boxweight(double w,double h,double d,double m)
    {
        width=w;
        height=h;
        depth=d;
        weight=m;

    }
}

class inheritence1
{
    public static void main(String args[])
    {
        //object of superclass
        box mybox1=new box();
        //object of subclass
        boxweight mybox2=new boxweight(2,3,4,0.07);
        double vol;
        vol=mybox1.volume();
        System.out.println("Volume of mybox1 is "+vol);
        System.out.println();

        vol=mybox2.volume();
        System.out.println("Volume of mybox2 is "+vol);
        System.out.println("Weight of my box is "+mybox2.weight);

    }
}