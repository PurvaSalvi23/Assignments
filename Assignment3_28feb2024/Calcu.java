import java.util.Scanner;
class Calcu{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the operator:+,-,*,/");
char operator=sc.next().charAt(0);
System.out.print("enter the first number:");
float n1=sc.nextFloat();
System.out.print("enter the second number:");
float n2=sc.nextFloat();
float result;
switch(operator){
case '+':
result=n1+n2;
System.out.print(result);
break;
case '-':
result=n1-n2;
System.out.print(result);
break;
case '*':
result=n1*n2;
System.out.print(result);
break;
case '/':
result=n1/n2;
System.out.print(result);
break;
default:
System.out.print("ERROR");
break;
}
}
}