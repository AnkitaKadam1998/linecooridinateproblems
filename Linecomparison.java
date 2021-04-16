import java.util.Scanner;

class Linecomparison
{
static double UserInput()
{
Scanner scan=new Scanner(System.in);
return scan.nextInt();
}

static double calLine (double x1,double x2,double y1,double y2 )
{
double calculate;
calculate = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
return calculate;
}

public static void main(String args[])
{
System.out.println("Welcome to line comparsion problem");
System.out.println("Enter points of 1stline: ");
double x1=UserInput();
double x2=UserInput();
double y1=UserInput();
double y2=UserInput();

System.out.println("Enter points of 2ndline: ");

double a1=UserInput();
double a2=UserInput();
double b1=UserInput();
double b2=UserInput();

double line1=calLine(x1,x2,y1,y2);
double line2=calLine(a1,a2,b1,b2);

System.out.println("Length of line1:"+line1);
System.out.println("Length of line2:"+line2);

Double First, Second;

First = new Double (line1);
Second = new Double (line2);
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




