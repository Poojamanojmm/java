class Box
{
double width;
double height;
double depth;
double volume()
{
return width*height*depth;
}
}
class BoxDemo2
{
public static void main(String args[])
{
Box boxobj=new Box();
double vol;
boxobj.width=10;
boxobj.height=20;
boxobj.depth=15;
vol=boxobj.volume();
System.out.println("volume:"+vol);
}
}
