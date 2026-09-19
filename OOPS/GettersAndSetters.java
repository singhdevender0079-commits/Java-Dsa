package OOPS;

class PEN{
    private String color;
    private int tip;
    String getColor(){
       return this.color;
    }
int getTip(){
    return this.tip;
}
String setColor(String color){
    this.color=color;
    return color;
}
int setTip(int tip){
this.tip=tip;
return tip;
}
}

public class GettersAndSetters {
    public static void main(String[] args) {
        PEN p1=new PEN();
         
        System.out.println(  p1.setTip(5));
        
      System.out.println( p1.setColor("red"));
    }
}
