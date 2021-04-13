import java.util.Scanner;
class Linecomparison
{
public static void main(String args[])
{
double x1,x2,y1,y2,result,result2;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the first co-ordinates value:");
x1=scan.nextDouble();
x2=scan.nextDouble();
y1=scan.nextDouble();
y2=scan.nextDouble();
result=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
System.out.println("Length of first line:"+result);

System.out.println("Enter the Second co-ordinates value:");
x1=scan.nextDouble();
x2=scan.nextDouble();
y1=scan.nextDouble();
y2=scan.nextDouble();
result2=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
System.out.println("Length of second line:"+result2);

Double First, Second;

First = new Double (result);
Second = new Double (result2);
int res = First.compareTo(Second);
if(res > 0)
{
System.out.println("Line1 is greater than Line2");
}
else if(res < 0)
{
System.out.println("Line1 is less than Line2");
}
else
{
System.out.println("Line1 is equal to Line2");
}
}
}




