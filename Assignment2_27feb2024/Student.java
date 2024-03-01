class Student{
String name;
int marks1;
int marks2;
int marks3;

Student(String i,int j,int k,int x){
name=i;
marks1=j;
marks2=k;
marks3=x;
}
void getAvg(){
int avg=(marks1+marks2+marks3)/3;
System.out.println("total average of nikhil is:" +avg);
}
void getInfo(){
int sum=(marks1+marks2+marks3);
System.out.println("Name:"+name);
System.out.println("Total Marks:"+sum);

}
public static void main(String arg[]){
Student s1=new Student("Nikhil",66,85,97);

s1.getAvg();
s1.getInfo();
}
}