package OOPS;
class free{
    public String name;
 private int password;
    void display(){
System.out.println(name);
System.out.println(password);
    }
}
public class AccesModifier {
    public static void main(String arg[]){
        free show=new free();
        show.name="gabber singh";

show.display();
// show.password=123;
    }
}
