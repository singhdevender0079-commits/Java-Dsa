package OOPS;

class animal{
    void wild(){
System.out.println("wild");
    }
    void domestic() {
         System.out.println("Domestic");
    }
}
class dog extends  animal {
    void food(){
        System.out.println("eat chapati and meat");
    }
    void legs() {
        System.out.println("four");
    }
}
class Lion extends  dog{
    void pasion(){
        System.out.println("king of the jungle");
    }
}
public class MultilevelInheritence {
    public static void main(String[] args) {
        Lion s1=new Lion();
        dog s2= new dog();
        s1.legs();
s1.wild();
s1.domestic();
s2.domestic();
    }
}
