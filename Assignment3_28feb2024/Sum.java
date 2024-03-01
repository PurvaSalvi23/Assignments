import java.util.Scanner;
class Sum{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,digit,sum=0;

System.out.println("enter the number:" );
n=s.nextInt();
do{
digit=n%10;
sum+=digit;
n=n/10;
}while(n!=0);
System.out.println("sum of the digits is:"+sum);
}
}
