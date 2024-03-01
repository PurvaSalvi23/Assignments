import java.util.Scanner;
class Fact{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
int i=1;
for(i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("factorial of a number is:"+fact);
}
}
