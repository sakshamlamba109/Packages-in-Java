package P;
public class Test {
public void info(int n)
{
for(int i=0;i<=12;i++)
{
System.out.println(+(n*i));
}
}
}
import P.Test;
import java.util.Scanner;
public class TestInfo {
public static void main(String[] args)
{
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number you want to find the table of ");
int num=sc.nextInt();
Test obj=new Test();
obj.info(num);
}
}