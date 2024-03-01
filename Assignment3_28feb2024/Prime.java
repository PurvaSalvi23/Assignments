import java.util.Scanner;
class Prime{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int number=sc.nextInt();
int i=2;
if(number%i==0 && number!=2){
System.out.print(number + " is not a prime number");
}
else if(number==i){
System.out.print(number + " is a prime number");
}
else{
System.out.print(number + " is a prime number");
}
}
}


