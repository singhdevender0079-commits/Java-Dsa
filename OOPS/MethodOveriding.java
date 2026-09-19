// in tis type of overiding the the class are diffrant but the functions are same but ther definition are diffrant
package OOPS;

class animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class deer extends animal{
    void eat(){
System.out.println("eats grass");
    }
}
    public class MethodOveriding {
    public static void main(String[] args) {
        deer d1= new deer();
        d1.eat();
    }
}
