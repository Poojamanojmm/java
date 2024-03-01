class Matrix
{
int m,i,n,j;
int[][]a=new int[5][5];
int[][]b=new int[5][5];
int[][]c=new int[5][5];
Scanner sc=new Scanner(System.in);
void get()
{
System.out.println("enter no:of rows");
m=sc.nextInt();
System.out.println("enter no:of columns");
n=sc.nextInt();
System.out.println("enter elements of matrix A");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=sc.nextInt();
System.out.println("enter elements of matrixB");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
b[i][j]=sc.nextInt();
}
void display()
{
system.out.println("Matrix A");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println(a[i][j]+" ");
}
system.out.println();
}
System.out.println("Matrix B");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println(b[i][j]+" ");
}
System.out.println();
}
System.out.println("Matrix c");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println(c[i][j]+" ");
}
System.out.println();
}
}
}
public class AddMatrix2
{
public static void main(String[]args)
{
Matrix ob=new Matrix();
ob.get();
ob.add();
ob.display();
}
}
