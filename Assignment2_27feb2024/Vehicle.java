class Vehicle{
int price;
String color;
String model;

Vehicle(int i, String j, String k){
price=i;
color=j;
model=k;
}
void display(){
System.out.println("MODAL NAME :"+model);
System.out.println("COLOR :"+color);
System.out.println("PRICE :"+price);
}
public static void main(String arg[]){
Vehicle v1=new Vehicle(60000,"RED","Maruti");
Vehicle v2=new Vehicle(80000,"GREEN","Hundai");

v1.display();
v2.display();
}
}