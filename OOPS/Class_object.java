package OOPS;

class pen{
    String color;
    int tip;

    void display() {
        System.out.println("color - "  + color);
        System.out.println("Tip - "+ tip);
    }
}
class Class_object{
        public static void main(String arg[]) {
         pen p1 =new pen();
p1.color="red";
p1.tip=5;
p1.display();
    }
}


