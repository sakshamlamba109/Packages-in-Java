package Balance;
import java.util.Scanner;
public class Account {
public void display_Balance()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the basic amount");
int bal=sc.nextInt();
System.out.println("Your account has balance of ="+(2*bal));
}
}
import Balance.*;
public class AccessInfo {
public static void main(String[] args) {
// TODO Auto-generated method stub
Account obj=new Account();
obj.display_Balance();
}
}