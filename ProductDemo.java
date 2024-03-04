class Product
{
int p_code;
String p_name;
int p_price;
Product(int code,String name,int price)
{
p_code=code;
p_name=name;
p_price=price;
}
void display()
{
System.out.println("Product Code:"+p_code);
System.out.println("Product name:"+p_name);
System.out.println("Product price:"+p_price);
}
}
class ProductDemo
{
public static void main(String args[])
{
Product ob1=new Product(234,"pencil",10);
Product ob2=new Product(345,"eraser",5);
Product ob3=new Product(342,"book",40);
System.out.println("Product with lowest price");
if(ob1.p_price<ob2.p_price)
if(ob1.p_price<ob3.p_price)
ob1.display();
else
ob3.display();
else if(ob3.p_price<ob2.p_price)
ob3.display();
else
ob2.display();
}
}
