class Person{
int age;
float height;
int weight;

Person(int i, float j, int k){
age=i;
height=j;
weight=k;
}
Person(){
age=25;
height=5.9f;
weight=68;
}
void display(){
System.out.println("Presons age is:" +age);
System.out.println("person height is:"+height);
System.out.println("person weight is:"+weight);
}

public static void main(String arg[]){
Person p1=new Person(35,5.6f,75);
Person p2=new Person();

p1.display();
p2.display();
}
}