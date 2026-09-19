package OOPS;

 class animal{
String type;
void food(){
    System.out.println("eat");
}
void swim(){
    System.out.println("swim");
}
}
class Fish extends animal{
void run(){
    System.out.println("run");
}
}

public class inheritece {
    public static void main(String arg[]){
Fish f1=new Fish();
f1.swim();
    }
}
