class Room{
float height;
float width;
float breadth;

Room(){
height=2.6f;
width=3.1f;
breadth=6.2f;
}
void volume(){
System.out.println("volume of the box is :"+ (height*width*breadth));
}
public static void main(String arg[]){
Room r=new Room();

r.volume();
}
}