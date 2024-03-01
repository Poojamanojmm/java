class Box
{
double width;
double height;
double depth;
double volume()
{
return width*height*depth;
}
void setDim(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
}
class BoxDemo4
{
public static void main(String args[])
{
Box boxobj=new Box();
boxobj.setDim(10,20.15);
double vol=boxobj.volume();
System.out.println("volume:"+vol);
}
}
