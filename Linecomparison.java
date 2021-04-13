import java.util.*;

class Linecomparison
{
public static void main(String args[])
{
double x1,x2,y1,y2,result;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the co-ordinates value");

x1=scan.nextDouble();
x2=scan.nextDouble();
y1=scan.nextDouble();
y2=scan.nextDouble();

result=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
System.out.println("Length of line:"+result);
}
}

