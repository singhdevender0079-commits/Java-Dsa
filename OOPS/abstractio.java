package OOPS;

 abstract class  animal{
    String color;

     animal() {
       System.out.println("The common color = brown");
    }
    
void food(){
    System.out.println("eat food");
}
abstract void walk();
}

class Lion extends animal{
  void  changecolor(){
        color="orange";
    }
    void walk(){
        System.out.println("Walk on four legs");
    }
}
class chiken extends animal{
      void  changecolor(){
        color="red";
    }
    void walk(){
        System.out.println("walk on two legs");
    }
}

public class abstractio {
    public static void main(String arg[]){
chiken c=new chiken();
c.walk();
c.changecolor();
    }
}
