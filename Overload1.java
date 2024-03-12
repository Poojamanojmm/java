import java.util.Scanner;
public class Overload1
{
void area(int r)
{
double Ar=3.14*r*r;
System.out.println("area of circle="+Ar);
}
void area(float a)
{
System.out.println("area of square="+a*a);
}
void area(int len,int br)
{
int Ar=len*br;
System.out.println("area of rectangle="+Ar);
}
void area(int l,int b,int h)
{
int Ar=l*b*h;
System.out.println("area of cuboid="+Ar);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Overload1 obj1=new Overload1();
System.out.println("enter the radius");
int r=sc.nextInt();
obj1.area(r);
System.out.println("enter the side");
int a=sc.nextInt();
obj1.area(a);
System.out.println("enter the length &breadth");
int len=sc.nextInt();
int br=sc.nextInt();
obj1.area(len,br);
System.out.println("enter the length,breadth & height");
int l=sc.nextInt();
int b=sc.nextInt();
int h=sc.nextInt();
obj1.area(l,b,h);
}
}
